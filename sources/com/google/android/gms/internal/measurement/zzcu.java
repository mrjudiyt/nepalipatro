package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcv zzcv);

    void getAppInstanceId(zzcv zzcv);

    void getCachedAppInstanceId(zzcv zzcv);

    void getConditionalUserProperties(String str, String str2, zzcv zzcv);

    void getCurrentScreenClass(zzcv zzcv);

    void getCurrentScreenName(zzcv zzcv);

    void getGmpAppId(zzcv zzcv);

    void getMaxUserProperties(String str, zzcv zzcv);

    void getSessionId(zzcv zzcv);

    void getTestFlag(zzcv zzcv, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcv zzcv);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdd zzdd, long j10);

    void isDataCollectionEnabled(zzcv zzcv);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10);

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcv zzcv, long j10);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10);

    void performAction(Bundle bundle, zzcv zzcv, long j10);

    void registerOnMeasurementEventListener(zzda zzda);

    void resetAnalyticsData(long j10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzda);

    void setInstanceIdProvider(zzdb zzdb);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzda zzda);
}
