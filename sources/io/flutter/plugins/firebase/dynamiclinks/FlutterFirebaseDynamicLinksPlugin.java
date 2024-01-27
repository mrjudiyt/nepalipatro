package io.flutter.plugins.firebase.dynamiclinks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class FlutterFirebaseDynamicLinksPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_dynamic_links";
    private static final String TAG = "FLTFirebaseDynamicLinks";
    private final AtomicReference<Activity> activity = new AtomicReference<>((Object) null);
    private Map<String, Object> cachedDynamicLinkData;
    private Map<String, Object> cachedDynamicLinkException;
    private MethodChannel channel;

    private String buildLink(Map<String, Object> map) {
        return setupParameters(map).buildDynamicLink().getUri().toString();
    }

    private Task<Map<String, Object>> buildShortLink(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void checkForCachedData() {
        Map<String, Object> map = this.cachedDynamicLinkData;
        if (map != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", map);
            this.cachedDynamicLinkData = null;
        }
        Map<String, Object> map2 = this.cachedDynamicLinkException;
        if (map2 != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkError", map2);
            this.cachedDynamicLinkException = null;
        }
    }

    private void detachToActivity() {
        this.activity.set((Object) null);
    }

    private Task<Map<String, Object>> getDynamicLink(FirebaseDynamicLinks firebaseDynamicLinks, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, str, firebaseDynamicLinks, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    static FirebaseDynamicLinks getDynamicLinkInstance(Map<String, Object> map) {
        String str;
        if (map == null || (str = (String) map.get(Constants.APP_NAME)) == null) {
            return FirebaseDynamicLinks.getInstance();
        }
        return FirebaseDynamicLinks.getInstance(FirebaseApp.getInstance(str));
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        checkForCachedData();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$buildShortLink$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            DynamicLink.Builder builder = setupParameters(map);
            String str = (String) map.get("longDynamicLink");
            if (str != null) {
                builder.setLongLink(Uri.parse(str));
            }
            Integer num = 1;
            Integer num2 = (Integer) map.get("shortLinkType");
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    num = 1;
                } else if (intValue == 1) {
                    num = 2;
                }
            }
            HashMap hashMap = new HashMap();
            ShortDynamicLink shortDynamicLink = (ShortDynamicLink) Tasks.await(builder.buildShortDynamicLink(num.intValue()));
            ArrayList arrayList = new ArrayList();
            for (ShortDynamicLink.Warning message : shortDynamicLink.getWarnings()) {
                arrayList.add(message.getMessage());
            }
            hashMap.put("url", shortDynamicLink.getShortLink().toString());
            hashMap.put("warnings", arrayList);
            hashMap.put("previewLink", shortDynamicLink.getPreviewLink().toString());
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getDynamicLink$4(String str, FirebaseDynamicLinks firebaseDynamicLinks, TaskCompletionSource taskCompletionSource) {
        PendingDynamicLinkData pendingDynamicLinkData;
        if (str != null) {
            try {
                pendingDynamicLinkData = (PendingDynamicLinkData) Tasks.await(firebaseDynamicLinks.getDynamicLink(Uri.parse(str)));
            } catch (Exception e10) {
                taskCompletionSource.setException(e10);
                return;
            }
        } else {
            if (!(this.activity.get() == null || this.activity.get().getIntent() == null)) {
                if (!this.activity.get().getIntent().getBooleanExtra("flutterfire-used-link", false)) {
                    this.activity.get().getIntent().putExtra("flutterfire-used-link", true);
                    pendingDynamicLinkData = (PendingDynamicLinkData) Tasks.await(firebaseDynamicLinks.getDynamicLink(this.activity.get().getIntent()));
                }
            }
            taskCompletionSource.setResult(null);
            return;
        }
        taskCompletionSource.setResult(Utils.getMapFromPendingDynamicLinkData(pendingDynamicLinkData));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$2(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        result.error(Constants.DEFAULT_ERROR_CODE, exception != null ? exception.getMessage() : null, Utils.getExceptionDetails(exception));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$0(PendingDynamicLinkData pendingDynamicLinkData) {
        Map<String, Object> mapFromPendingDynamicLinkData = Utils.getMapFromPendingDynamicLinkData(pendingDynamicLinkData);
        if (mapFromPendingDynamicLinkData != null) {
            MethodChannel methodChannel = this.channel;
            if (methodChannel != null) {
                methodChannel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", mapFromPendingDynamicLinkData);
            } else {
                this.cachedDynamicLinkData = mapFromPendingDynamicLinkData;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$1(Exception exc) {
        Map<String, Object> exceptionDetails = Utils.getExceptionDetails(exc);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("FirebaseDynamicLink#onLinkError", exceptionDetails);
        } else {
            this.cachedDynamicLinkException = exceptionDetails;
        }
    }

    private DynamicLink.Builder setupParameters(Map<String, Object> map) {
        DynamicLink.Builder createDynamicLink = getDynamicLinkInstance(map).createDynamicLink();
        Object obj = map.get("uriPrefix");
        Objects.requireNonNull(obj);
        createDynamicLink.setDomainUriPrefix((String) obj);
        createDynamicLink.setLink(Uri.parse((String) map.get("link")));
        Map map2 = (Map) map.get("androidParameters");
        if (map2 != null) {
            String str = (String) valueFor("fallbackUrl", map2);
            Integer num = (Integer) valueFor("minimumVersion", map2);
            DynamicLink.AndroidParameters.Builder builder = new DynamicLink.AndroidParameters.Builder((String) valueFor(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, map2));
            if (str != null) {
                builder.setFallbackUrl(Uri.parse(str));
            }
            if (num != null) {
                builder.setMinimumVersion(num.intValue());
            }
            createDynamicLink.setAndroidParameters(builder.build());
        }
        Map map3 = (Map) map.get("googleAnalyticsParameters");
        if (map3 != null) {
            String str2 = (String) valueFor("campaign", map3);
            String str3 = (String) valueFor(FirebaseAnalytics.Param.CONTENT, map3);
            String str4 = (String) valueFor("medium", map3);
            String str5 = (String) valueFor("source", map3);
            String str6 = (String) valueFor(FirebaseAnalytics.Param.TERM, map3);
            DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder();
            if (str2 != null) {
                builder2.setCampaign(str2);
            }
            if (str3 != null) {
                builder2.setContent(str3);
            }
            if (str4 != null) {
                builder2.setMedium(str4);
            }
            if (str5 != null) {
                builder2.setSource(str5);
            }
            if (str6 != null) {
                builder2.setTerm(str6);
            }
            createDynamicLink.setGoogleAnalyticsParameters(builder2.build());
        }
        Map map4 = (Map) map.get("iosParameters");
        if (map4 != null) {
            String str7 = (String) valueFor("appStoreId", map4);
            String str8 = (String) valueFor("customScheme", map4);
            String str9 = (String) valueFor("fallbackUrl", map4);
            String str10 = (String) valueFor("ipadBundleId", map4);
            String str11 = (String) valueFor("ipadFallbackUrl", map4);
            String str12 = (String) valueFor("minimumVersion", map4);
            DynamicLink.IosParameters.Builder builder3 = new DynamicLink.IosParameters.Builder((String) valueFor("bundleId", map4));
            if (str7 != null) {
                builder3.setAppStoreId(str7);
            }
            if (str8 != null) {
                builder3.setCustomScheme(str8);
            }
            if (str9 != null) {
                builder3.setFallbackUrl(Uri.parse(str9));
            }
            if (str10 != null) {
                builder3.setIpadBundleId(str10);
            }
            if (str11 != null) {
                builder3.setIpadFallbackUrl(Uri.parse(str11));
            }
            if (str12 != null) {
                builder3.setMinimumVersion(str12);
            }
            createDynamicLink.setIosParameters(builder3.build());
        }
        Map map5 = (Map) map.get("itunesConnectAnalyticsParameters");
        if (map5 != null) {
            String str13 = (String) valueFor("affiliateToken", map5);
            String str14 = (String) valueFor("campaignToken", map5);
            String str15 = (String) valueFor("providerToken", map5);
            DynamicLink.ItunesConnectAnalyticsParameters.Builder builder4 = new DynamicLink.ItunesConnectAnalyticsParameters.Builder();
            if (str13 != null) {
                builder4.setAffiliateToken(str13);
            }
            if (str14 != null) {
                builder4.setCampaignToken(str14);
            }
            if (str15 != null) {
                builder4.setProviderToken(str15);
            }
            createDynamicLink.setItunesConnectAnalyticsParameters(builder4.build());
        }
        Map map6 = (Map) map.get("navigationInfoParameters");
        if (map6 != null) {
            Boolean bool = (Boolean) valueFor("forcedRedirectEnabled", map6);
            DynamicLink.NavigationInfoParameters.Builder builder5 = new DynamicLink.NavigationInfoParameters.Builder();
            if (bool != null) {
                builder5.setForcedRedirectEnabled(bool.booleanValue());
            }
            createDynamicLink.setNavigationInfoParameters(builder5.build());
        }
        Map map7 = (Map) map.get("socialMetaTagParameters");
        if (map7 != null) {
            String str16 = (String) valueFor("description", map7);
            String str17 = (String) valueFor("imageUrl", map7);
            String str18 = (String) valueFor(ShareConstants.WEB_DIALOG_PARAM_TITLE, map7);
            DynamicLink.SocialMetaTagParameters.Builder builder6 = new DynamicLink.SocialMetaTagParameters.Builder();
            if (str16 != null) {
                builder6.setDescription(str16);
            }
            if (str17 != null) {
                builder6.setImageUrl(Uri.parse(str17));
            }
            if (str18 != null) {
                builder6.setTitle(str18);
            }
            createDynamicLink.setSocialMetaTagParameters(builder6.build());
        }
        return createDynamicLink;
    }

    private static <T> T valueFor(String str, Map<String, Object> map) {
        return map.get(str);
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(FirebaseApp firebaseApp) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        detachToActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        detachToActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task<Map<String, Object>> task;
        FirebaseDynamicLinks dynamicLinkInstance = getDynamicLinkInstance((Map) methodCall.arguments());
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2071055899:
                if (str.equals("FirebaseDynamicLinks#getDynamicLink")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1769644534:
                if (str.equals("FirebaseDynamicLinks#buildShortLink")) {
                    c10 = 1;
                    break;
                }
                break;
            case -579002774:
                if (str.equals("FirebaseDynamicLinks#getInitialLink")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1658258438:
                if (str.equals("FirebaseDynamicLinks#buildLink")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                task = getDynamicLink(dynamicLinkInstance, (String) methodCall.argument("url"));
                break;
            case 1:
                Map map = (Map) methodCall.arguments();
                Objects.requireNonNull(map);
                task = buildShortLink(map);
                break;
            case 3:
                result.success(buildLink((Map) methodCall.arguments()));
                return;
            default:
                result.notImplemented();
                return;
        }
        task.addOnCompleteListener(new a(result));
    }

    public boolean onNewIntent(Intent intent) {
        getDynamicLinkInstance((Map<String, Object>) null).getDynamicLink(intent).addOnSuccessListener(new c(this)).addOnFailureListener(new b(this));
        return false;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
