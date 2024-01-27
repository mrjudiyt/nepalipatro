package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsCAPIManager.kt */
public final class AppEventsCAPIManager {
    public static final AppEventsCAPIManager INSTANCE = new AppEventsCAPIManager();
    private static final String SETTINGS_PATH = "/cloudbridge_settings";
    private static final String TAG = AppEventsCAPIManager.class.getCanonicalName();
    private static boolean isEnabled;

    private AppEventsCAPIManager() {
    }

    public static final void enable() {
        try {
            a aVar = a.f5951a;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            GraphRequest graphRequest = new GraphRequest((AccessToken) null, m.o(FacebookSdk.getApplicationId(), SETTINGS_PATH), (Bundle) null, HttpMethod.GET, aVar, (String) null, 32, (g) null);
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            if (str != null) {
                companion.log(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
                graphRequest.executeAsync();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException e10) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = TAG;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            companion2.log(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b.b(e10));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: enable$lambda-0  reason: not valid java name */
    public static final void m44enable$lambda0(GraphResponse graphResponse) {
        m.f(graphResponse, "response");
        INSTANCE.getCAPIGSettingsFromGraphResponse$facebook_core_release(graphResponse);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.Object> getSavedCloudBridgeCredentials$facebook_core_release() {
        /*
            java.lang.Class<com.facebook.appevents.cloudbridge.AppEventsCAPIManager> r0 = com.facebook.appevents.cloudbridge.AppEventsCAPIManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE     // Catch:{ all -> 0x0099 }
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "com.facebook.sdk.CloudBridgeSavedCredentials"
            r4 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r4)     // Catch:{ all -> 0x0099 }
            if (r1 != 0) goto L_0x001a
            return r2
        L_0x001a:
            com.facebook.appevents.cloudbridge.SettingsAPIFields r3 = com.facebook.appevents.cloudbridge.SettingsAPIFields.DATASETID     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r3.getRawValue()     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = r1.getString(r5, r2)     // Catch:{ all -> 0x0099 }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r6 = com.facebook.appevents.cloudbridge.SettingsAPIFields.URL     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r6.getRawValue()     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r1.getString(r7, r2)     // Catch:{ all -> 0x0099 }
            com.facebook.appevents.cloudbridge.SettingsAPIFields r8 = com.facebook.appevents.cloudbridge.SettingsAPIFields.ACCESSKEY     // Catch:{ all -> 0x0099 }
            java.lang.String r9 = r8.getRawValue()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r1.getString(r9, r2)     // Catch:{ all -> 0x0099 }
            r9 = 1
            if (r5 == 0) goto L_0x0044
            boolean r10 = g9.p.o(r5)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r10 = 0
            goto L_0x0045
        L_0x0044:
            r10 = 1
        L_0x0045:
            if (r10 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x0052
            boolean r10 = g9.p.o(r7)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r10 = 0
            goto L_0x0053
        L_0x0052:
            r10 = 1
        L_0x0053:
            if (r10 != 0) goto L_0x0098
            if (r1 == 0) goto L_0x0060
            boolean r10 = g9.p.o(r1)     // Catch:{ all -> 0x0099 }
            if (r10 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = 1
        L_0x0061:
            if (r10 == 0) goto L_0x0064
            goto L_0x0098
        L_0x0064:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0099 }
            r10.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = r6.getRawValue()     // Catch:{ all -> 0x0099 }
            r10.put(r6, r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r3.getRawValue()     // Catch:{ all -> 0x0099 }
            r10.put(r3, r5)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = r8.getRawValue()     // Catch:{ all -> 0x0099 }
            r10.put(r3, r1)     // Catch:{ all -> 0x0099 }
            com.facebook.internal.Logger$Companion r3 = com.facebook.internal.Logger.Companion     // Catch:{ all -> 0x0099 }
            com.facebook.LoggingBehavior r6 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = TAG     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n "
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0099 }
            r12[r4] = r5     // Catch:{ all -> 0x0099 }
            r12[r9] = r7     // Catch:{ all -> 0x0099 }
            r4 = 2
            r12[r4] = r1     // Catch:{ all -> 0x0099 }
            r3.log((com.facebook.LoggingBehavior) r6, (java.lang.String) r8, (java.lang.String) r11, (java.lang.Object[]) r12)     // Catch:{ all -> 0x0099 }
            return r10
        L_0x0098:
            return r2
        L_0x0099:
            r1 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.AppEventsCAPIManager.getSavedCloudBridgeCredentials$facebook_core_release():java.util.Map");
    }

    public final void getCAPIGSettingsFromGraphResponse$facebook_core_release(GraphResponse graphResponse) {
        m.f(graphResponse, "response");
        boolean z10 = false;
        if (graphResponse.getError() != null) {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            companion.log(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", graphResponse.getError().toString(), String.valueOf(graphResponse.getError().getException()));
            Map<String, Object> savedCloudBridgeCredentials$facebook_core_release = getSavedCloudBridgeCredentials$facebook_core_release();
            if (savedCloudBridgeCredentials$facebook_core_release != null) {
                URL url = new URL(String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                String valueOf = String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.DATASETID.getRawValue()));
                AppEventsConversionsAPITransformerWebRequests.configure(valueOf, url.getProtocol() + "://" + url.getHost(), String.valueOf(savedCloudBridgeCredentials$facebook_core_release.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        Logger.Companion companion2 = Logger.Companion;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String str2 = TAG;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
        companion2.log(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", graphResponse);
        JSONObject jSONObject = graphResponse.getJSONObject();
        try {
            Utility utility = Utility.INSTANCE;
            Object obj = jSONObject == null ? null : jSONObject.get("data");
            if (obj != null) {
                Map<String, Object> convertJSONObjectToHashMap = Utility.convertJSONObjectToHashMap(new JSONObject((String) x.y(Utility.convertJSONArrayToList((JSONArray) obj))));
                String str3 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.URL.getRawValue());
                String str4 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.DATASETID.getRawValue());
                String str5 = (String) convertJSONObjectToHashMap.get(SettingsAPIFields.ACCESSKEY.getRawValue());
                if (str3 == null || str4 == null || str5 == null) {
                    m.e(str2, "TAG");
                    companion2.log(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
                    return;
                }
                try {
                    AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests2 = AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                    AppEventsConversionsAPITransformerWebRequests.configure(str4, str3, str5);
                    setSavedCloudBridgeCredentials$facebook_core_release(convertJSONObjectToHashMap);
                    SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
                    if (convertJSONObjectToHashMap.get(settingsAPIFields.getRawValue()) != null) {
                        Object obj2 = convertJSONObjectToHashMap.get(settingsAPIFields.getRawValue());
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                        z10 = ((Boolean) obj2).booleanValue();
                    }
                    isEnabled = z10;
                } catch (MalformedURLException e10) {
                    Logger.Companion companion3 = Logger.Companion;
                    LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                    String str6 = TAG;
                    m.e(str6, "TAG");
                    companion3.log(loggingBehavior3, str6, "CloudBridge Settings API response doesn't have valid url\n %s ", b.b(e10));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
        } catch (JSONException e11) {
            Logger.Companion companion4 = Logger.Companion;
            LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
            String str7 = TAG;
            m.e(str7, "TAG");
            companion4.log(loggingBehavior4, str7, "CloudBridge Settings API response is not a valid json: \n%s ", b.b(e11));
        } catch (NullPointerException e12) {
            Logger.Companion companion5 = Logger.Companion;
            LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
            String str8 = TAG;
            m.e(str8, "TAG");
            companion5.log(loggingBehavior5, str8, "CloudBridge Settings API response is not a valid json: \n%s ", b.b(e12));
        }
    }

    public final boolean isEnabled$facebook_core_release() {
        return isEnabled;
    }

    public final void setEnabled$facebook_core_release(boolean z10) {
        isEnabled = z10;
    }

    public final void setSavedCloudBridgeCredentials$facebook_core_release(Map<String, ? extends Object> map) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.CLOUDBRIDGE_SAVED_CREDENTIALS, 0);
        if (sharedPreferences != null) {
            if (map == null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
                return;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            Object obj = map.get(settingsAPIFields.getRawValue());
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            Object obj2 = map.get(settingsAPIFields2.getRawValue());
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            Object obj3 = map.get(settingsAPIFields3.getRawValue());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putString(settingsAPIFields.getRawValue(), obj.toString());
                edit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
                edit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
                edit2.apply();
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
