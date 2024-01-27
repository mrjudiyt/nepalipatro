package io.flutter.plugins.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;

    private static Bundle createBundleFromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            String str = (String) next.getKey();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, (long) ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, (String) null);
            } else if (value instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object next2 : (Iterable) value) {
                    if (next2 instanceof Map) {
                        arrayList.add(createBundleFromMap((Map) next2));
                    } else {
                        throw new IllegalArgumentException("Unsupported value type: " + next2.getClass().getCanonicalName() + " in list at key " + str);
                    }
                }
                bundle.putParcelableArrayList(str, arrayList);
            } else if (value instanceof Map) {
                bundle.putParcelable(str, createBundleFromMap((Map) value));
            } else {
                throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
            }
        }
        return bundle;
    }

    private Task<String> handleGetAppInstanceId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Long> handleGetSessionId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleLogEvent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleResetAnalyticsData() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetAnalyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetSessionTimeoutDuration(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetUserId(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetUserProperty(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger, Context context) {
        this.analytics = FirebaseAnalytics.getInstance(context);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_analytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>() {
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGetAppInstanceId$10(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((String) Tasks.await(this.analytics.getAppInstanceId()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleGetSessionId$1(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult((Long) Tasks.await(this.analytics.getSessionId()));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleLogEvent$2(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.EVENT_NAME);
            Objects.requireNonNull(obj);
            Bundle createBundleFromMap = createBundleFromMap((Map) map.get("parameters"));
            this.analytics.logEvent((String) obj, createBundleFromMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResetAnalyticsData$7(TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.resetAnalyticsData();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSetAnalyticsCollectionEnabled$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.analytics.setAnalyticsCollectionEnabled(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSetSessionTimeoutDuration$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.MILLISECONDS);
            Objects.requireNonNull(obj);
            this.analytics.setSessionTimeoutDuration((long) ((Integer) obj).intValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSetUserId$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.setUserId((String) map.get(Constants.USER_ID));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSetUserProperty$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            this.analytics.setUserProperty((String) obj, (String) map.get("value"));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$0(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
            return;
        }
        Exception exception = task.getException();
        result.error("firebase_analytics", exception != null ? exception.getMessage() : "An unknown error occurred", (Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setConsent$8(Map map, TaskCompletionSource taskCompletionSource) {
        FirebaseAnalytics.ConsentStatus consentStatus;
        FirebaseAnalytics.ConsentStatus consentStatus2;
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            HashMap hashMap = new HashMap();
            if (bool != null) {
                FirebaseAnalytics.ConsentType consentType = FirebaseAnalytics.ConsentType.AD_STORAGE;
                if (bool.booleanValue()) {
                    consentStatus2 = FirebaseAnalytics.ConsentStatus.GRANTED;
                } else {
                    consentStatus2 = FirebaseAnalytics.ConsentStatus.DENIED;
                }
                hashMap.put(consentType, consentStatus2);
            }
            if (bool2 != null) {
                FirebaseAnalytics.ConsentType consentType2 = FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE;
                if (bool2.booleanValue()) {
                    consentStatus = FirebaseAnalytics.ConsentStatus.GRANTED;
                } else {
                    consentStatus = FirebaseAnalytics.ConsentStatus.DENIED;
                }
                hashMap.put(consentType2, consentStatus);
            }
            this.analytics.setConsent(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaultEventParameters$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.setDefaultEventParameters(createBundleFromMap(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> setConsent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setDefaultEventParameters(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, map, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(FirebaseApp firebaseApp) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.channel = null;
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task task;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2090892968:
                if (str.equals("Analytics#getAppInstanceId")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1931910274:
                if (str.equals("Analytics#resetAnalyticsData")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1572470123:
                if (str.equals("Analytics#setConsent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -273201790:
                if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
                    c10 = 3;
                    break;
                }
                break;
            case -99047480:
                if (str.equals("Analytics#setDefaultEventParameters")) {
                    c10 = 4;
                    break;
                }
                break;
            case -45011405:
                if (str.equals("Analytics#logEvent")) {
                    c10 = 5;
                    break;
                }
                break;
            case 179244440:
                if (str.equals("Analytics#getSessionId")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1083589925:
                if (str.equals("Analytics#setUserProperty")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1751063748:
                if (str.equals("Analytics#setSessionTimeoutDuration")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1992044651:
                if (str.equals("Analytics#setUserId")) {
                    c10 = 9;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                task = handleGetAppInstanceId();
                break;
            case 1:
                task = handleResetAnalyticsData();
                break;
            case 2:
                task = setConsent((Map) methodCall.arguments());
                break;
            case 3:
                task = handleSetAnalyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case 4:
                task = setDefaultEventParameters((Map) methodCall.arguments());
                break;
            case 5:
                task = handleLogEvent((Map) methodCall.arguments());
                break;
            case 6:
                task = handleGetSessionId();
                break;
            case 7:
                task = handleSetUserProperty((Map) methodCall.arguments());
                break;
            case 8:
                task = handleSetSessionTimeoutDuration((Map) methodCall.arguments());
                break;
            case 9:
                task = handleSetUserId((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        task.addOnCompleteListener(new a(result));
    }
}
