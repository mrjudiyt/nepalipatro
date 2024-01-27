package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: OnDeviceProcessingManager.kt */
public final class OnDeviceProcessingManager {
    private static final Set<String> ALLOWED_IMPLICIT_EVENTS = m0.f(AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_START_TRIAL, AppEventsConstants.EVENT_NAME_SUBSCRIBE);
    public static final OnDeviceProcessingManager INSTANCE = new OnDeviceProcessingManager();

    private OnDeviceProcessingManager() {
    }

    private final boolean isEventEligibleForOnDeviceProcessing(AppEvent appEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            boolean z10 = appEvent.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(appEvent.getName());
            if ((!appEvent.isImplicit()) || z10) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isOnDeviceProcessingEnabled() {
        /*
            java.lang.Class<com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager> r0 = com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.class
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.FacebookSdk r1 = com.facebook.FacebookSdk.INSTANCE     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x002e }
            boolean r1 = com.facebook.FacebookSdk.getLimitEventAndDataUsage(r1)     // Catch:{ all -> 0x002e }
            r3 = 1
            if (r1 != 0) goto L_0x0021
            com.facebook.internal.Utility r1 = com.facebook.internal.Utility.INSTANCE     // Catch:{ all -> 0x002e }
            boolean r1 = com.facebook.internal.Utility.isDataProcessingRestricted()     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x002d
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper r1 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.INSTANCE     // Catch:{ all -> 0x002e }
            boolean r0 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.isServiceAvailable()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002d
            r2 = 1
        L_0x002d:
            return r2
        L_0x002e:
            r1 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager.isOnDeviceProcessingEnabled():boolean");
    }

    public static final void sendCustomEventAsync(String str, AppEvent appEvent) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(str, "applicationId");
                m.f(appEvent, "event");
                if (INSTANCE.isEventEligibleForOnDeviceProcessing(appEvent)) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    FacebookSdk.getExecutor().execute(new b(str, appEvent));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendCustomEventAsync$lambda-1  reason: not valid java name */
    public static final void m69sendCustomEventAsync$lambda1(String str, AppEvent appEvent) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(str, "$applicationId");
                m.f(appEvent, "$event");
                RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.INSTANCE;
                RemoteServiceWrapper.sendCustomEvents(str, o.b(appEvent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void sendInstallEventAsync(String str, String str2) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Context applicationContext = FacebookSdk.getApplicationContext();
                if (applicationContext != null && str != null && str2 != null) {
                    FacebookSdk.getExecutor().execute(new a(applicationContext, str2, str));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendInstallEventAsync$lambda-0  reason: not valid java name */
    public static final void m70sendInstallEventAsync$lambda0(Context context, String str, String str2) {
        Class<OnDeviceProcessingManager> cls = OnDeviceProcessingManager.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(context, "$context");
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                String o10 = m.o(str2, "pingForOnDevice");
                if (sharedPreferences.getLong(o10, 0) == 0) {
                    RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.INSTANCE;
                    RemoteServiceWrapper.sendInstallEvent(str2);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(o10, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
