package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager.kt */
public final class FetchedAppGateKeepersManager {
    private static final String APPLICATION_FIELDS = "fields";
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;
    private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
    private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
    private static final String APPLICATION_GRAPH_DATA = "data";
    private static final String APPLICATION_PLATFORM = "platform";
    private static final String APPLICATION_SDK_VERSION = "sdk_version";
    private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
    private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
    private static final String APP_PLATFORM = "android";
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();
    private static final String TAG = z.b(FetchedAppGateKeepersManager.class).a();
    private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();
    private static GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);
    private static Long timestamp;

    /* compiled from: FetchedAppGateKeepersManager.kt */
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    private final JSONObject getAppGateKeepersQueryResponse(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APPLICATION_PLATFORM, "android");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        bundle.putString(APPLICATION_SDK_VERSION, FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        GraphRequest.Companion companion = GraphRequest.Companion;
        b0 b0Var = b0.f15559a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{APPLICATION_GATEKEEPER_EDGE}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        GraphRequest newGraphPathRequest = companion.newGraphPathRequest((AccessToken) null, format, (GraphRequest.Callback) null);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r2.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean getGateKeeperForKey(java.lang.String r1, java.lang.String r2, boolean r3) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.m.f(r1, r0)
            com.facebook.internal.FetchedAppGateKeepersManager r0 = INSTANCE
            java.util.Map r2 = r0.getGateKeepersForApplication(r2)
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0012
            goto L_0x001f
        L_0x0012:
            java.lang.Object r1 = r2.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x001b
            return r3
        L_0x001b:
            boolean r3 = r1.booleanValue()
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(java.lang.String, java.lang.String, boolean):boolean");
    }

    private final boolean isTimestampValid(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < APPLICATION_GATEKEEPER_CACHE_TIMEOUT;
    }

    /* access modifiers changed from: private */
    /* renamed from: loadAppGateKeepersAsync$lambda-0  reason: not valid java name */
    public static final void m93loadAppGateKeepersAsync$lambda0(String str, Context context, String str2) {
        m.f(str, "$applicationId");
        m.f(context, "$context");
        m.f(str2, "$gateKeepersKey");
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(str);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
            context.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(str2, appGateKeepersQueryResponse.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    public static final synchronized JSONObject parseAppGateKeepersFromJSON$facebook_core_release(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (FetchedAppGateKeepersManager.class) {
            m.f(str, "applicationId");
            jSONObject2 = fetchedAppGateKeepers.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i10 = 0;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray(APPLICATION_GATEKEEPER_FIELD);
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject4.getString(Constants.KEY), jSONObject4.getBoolean("value"));
                    } catch (JSONException e10) {
                        Utility utility = Utility.INSTANCE;
                        Utility.logd(Utility.LOG_TAG, (Exception) e10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            fetchedAppGateKeepers.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    private final void pollCallbacks() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<Callback> concurrentLinkedQueue = callbacks;
            if (!concurrentLinkedQueue.isEmpty()) {
                Callback poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new e(poll));
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pollCallbacks$lambda-1  reason: not valid java name */
    public static final void m94pollCallbacks$lambda1(Callback callback) {
        callback.onCompleted();
    }

    public static final JSONObject queryAppGateKeepers(String str, boolean z10) {
        m.f(str, "applicationId");
        if (!z10) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(str);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        b0 b0Var = b0.f15559a;
        String format = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{str}, 1));
        m.e(format, "java.lang.String.format(format, *args)");
        applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(format, appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(str, appGateKeepersQueryResponse);
    }

    public static final void resetRuntimeGateKeeperCache() {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 != null) {
            GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, (String) null, 1, (Object) null);
        }
    }

    public static final void setRuntimeGateKeeper(String str, GateKeeper gateKeeper) {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2;
        m.f(str, "applicationId");
        m.f(gateKeeper, "gateKeeper");
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache3 == null ? null : gateKeeperRuntimeCache3.getGateKeeper(str, gateKeeper.getName())) != null && (gateKeeperRuntimeCache2 = gateKeeperRuntimeCache) != null) {
            gateKeeperRuntimeCache2.setGateKeeper(str, gateKeeper);
        }
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(String str, GateKeeper gateKeeper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            str = FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    public final Map<String, Boolean> getGateKeepersForApplication(String str) {
        loadAppGateKeepersAsync();
        if (str != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(str)) {
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
                List<GateKeeper> dumpGateKeepers = gateKeeperRuntimeCache2 == null ? null : gateKeeperRuntimeCache2.dumpGateKeepers(str);
                if (dumpGateKeepers != null) {
                    HashMap hashMap = new HashMap();
                    for (GateKeeper gateKeeper : dumpGateKeepers) {
                        hashMap.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m.e(next, Constants.KEY);
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
                if (gateKeeperRuntimeCache3 == null) {
                    gateKeeperRuntimeCache3 = new GateKeeperRuntimeCache();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                gateKeeperRuntimeCache3.setGateKeepers(str, arrayList);
                gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync((Callback) null);
    }

    public static final synchronized void loadAppGateKeepersAsync(Callback callback) {
        synchronized (FetchedAppGateKeepersManager.class) {
            if (callback != null) {
                callbacks.add(callback);
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            String applicationId = FacebookSdk.getApplicationId();
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
            if (!fetchedAppGateKeepersManager.isTimestampValid(timestamp) || !fetchedAppGateKeepers.containsKey(applicationId)) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                b0 b0Var = b0.f15559a;
                String format = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
                m.e(format, "java.lang.String.format(format, *args)");
                if (applicationContext != null) {
                    JSONObject jSONObject = null;
                    String string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(format, (String) null);
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e10) {
                            Utility utility2 = Utility.INSTANCE;
                            Utility.logd(Utility.LOG_TAG, (Exception) e10);
                        }
                        if (jSONObject != null) {
                            parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                        }
                    }
                    FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                    Executor executor = FacebookSdk.getExecutor();
                    if (executor != null) {
                        if (isLoading.compareAndSet(false, true)) {
                            executor.execute(new f(applicationId, applicationContext, format));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            fetchedAppGateKeepersManager.pollCallbacks();
        }
    }
}
