package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
public class AppMeasurementDynamiteService extends zzct {
    zzhf zza = null;
    private final Map<Integer, zzil> zzb = new a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
    class zza implements zzim {
        private zzda zza;

        zza(zzda zzda) {
            this.zza = zzda;
        }

        public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
            try {
                this.zza.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                zzhf zzhf = AppMeasurementDynamiteService.this.zza;
                if (zzhf != null) {
                    zzhf.zzj().zzu().zza("Event interceptor threw exception", e10);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.0 */
    class zzb implements zzil {
        private zzda zza;

        zzb(zzda zzda) {
            this.zza = zzda;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j10) {
            try {
                this.zza.zza(str, str2, bundle, j10);
            } catch (RemoteException e10) {
                zzhf zzhf = AppMeasurementDynamiteService.this.zza;
                if (zzhf != null) {
                    zzhf.zzj().zzu().zza("Event listener threw exception", e10);
                }
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) {
        zza();
        this.zza.zze().zza(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza();
        this.zza.zzp().zza(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        zza();
        this.zza.zzp().zza((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) {
        zza();
        this.zza.zze().zzb(str, j10);
    }

    public void generateEventId(zzcv zzcv) {
        zza();
        long zzm = this.zza.zzt().zzm();
        zza();
        this.zza.zzt().zza(zzcv, zzm);
    }

    public void getAppInstanceId(zzcv zzcv) {
        zza();
        this.zza.zzl().zzb((Runnable) new zzi(this, zzcv));
    }

    public void getCachedAppInstanceId(zzcv zzcv) {
        zza();
        zza(zzcv, this.zza.zzp().zzae());
    }

    public void getConditionalUserProperties(String str, String str2, zzcv zzcv) {
        zza();
        this.zza.zzl().zzb((Runnable) new zzl(this, zzcv, str, str2));
    }

    public void getCurrentScreenClass(zzcv zzcv) {
        zza();
        zza(zzcv, this.zza.zzp().zzaf());
    }

    public void getCurrentScreenName(zzcv zzcv) {
        zza();
        zza(zzcv, this.zza.zzp().zzag());
    }

    public void getGmpAppId(zzcv zzcv) {
        zza();
        zza(zzcv, this.zza.zzp().zzah());
    }

    public void getMaxUserProperties(String str, zzcv zzcv) {
        zza();
        this.zza.zzp();
        Preconditions.checkNotEmpty(str);
        zza();
        this.zza.zzt().zza(zzcv, 25);
    }

    public void getSessionId(zzcv zzcv) {
        zza();
        zziq zzp = this.zza.zzp();
        zzp.zzl().zzb((Runnable) new zzjq(zzp, zzcv));
    }

    public void getTestFlag(zzcv zzcv, int i10) {
        zza();
        if (i10 == 0) {
            this.zza.zzt().zza(zzcv, this.zza.zzp().zzai());
        } else if (i10 == 1) {
            this.zza.zzt().zza(zzcv, this.zza.zzp().zzad().longValue());
        } else if (i10 == 2) {
            zznd zzt = this.zza.zzt();
            double doubleValue = this.zza.zzp().zzab().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcv.zza(bundle);
            } catch (RemoteException e10) {
                zzt.zzu.zzj().zzu().zza("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.zza.zzt().zza(zzcv, this.zza.zzp().zzac().intValue());
        } else if (i10 == 4) {
            this.zza.zzt().zza(zzcv, this.zza.zzp().zzaa().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, zzcv zzcv) {
        zza();
        this.zza.zzl().zzb((Runnable) new zzj(this, zzcv, str, str2, z10));
    }

    public void initForTests(Map map) {
        zza();
    }

    public void initialize(IObjectWrapper iObjectWrapper, zzdd zzdd, long j10) {
        zzhf zzhf = this.zza;
        if (zzhf == null) {
            this.zza = zzhf.zza((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzdd, Long.valueOf(j10));
        } else {
            zzhf.zzj().zzu().zza("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcv zzcv) {
        zza();
        this.zza.zzl().zzb((Runnable) new zzn(this, zzcv));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zza();
        this.zza.zzp().zza(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10) {
        Bundle bundle2;
        zza();
        Preconditions.checkNotEmpty(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.zza.zzl().zzb((Runnable) new zzk(this, zzcv, new zzbg(str2, new zzbb(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Object obj;
        Object obj2;
        zza();
        Object obj3 = null;
        if (iObjectWrapper == null) {
            obj = null;
        } else {
            obj = ObjectWrapper.unwrap(iObjectWrapper);
        }
        if (iObjectWrapper2 == null) {
            obj2 = null;
        } else {
            obj2 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        if (iObjectWrapper3 != null) {
            obj3 = ObjectWrapper.unwrap(iObjectWrapper3);
        }
        this.zza.zzj().zza(i10, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcv zzcv, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        Bundle bundle = new Bundle();
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcv.zza(bundle);
        } catch (RemoteException e10) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityStarted((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) {
        zza();
        zzjx zzjx = this.zza.zzp().zza;
        if (zzjx != null) {
            this.zza.zzp().zzak();
            zzjx.onActivityStopped((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public void performAction(Bundle bundle, zzcv zzcv, long j10) {
        zza();
        zzcv.zza((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzda zzda) {
        zzil zzil;
        zza();
        synchronized (this.zzb) {
            zzil = this.zzb.get(Integer.valueOf(zzda.zza()));
            if (zzil == null) {
                zzil = new zzb(zzda);
                this.zzb.put(Integer.valueOf(zzda.zza()), zzil);
            }
        }
        this.zza.zzp().zza(zzil);
    }

    public void resetAnalyticsData(long j10) {
        zza();
        zziq zzp = this.zza.zzp();
        zzp.zza((String) null);
        zzp.zzl().zzb((Runnable) new zzjk(zzp, j10));
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zza();
        if (bundle == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
        } else {
            this.zza.zzp().zza(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        zza();
        zziq zzp = this.zza.zzp();
        zzp.zzl().zzc((Runnable) new zziw(zzp, bundle, j10));
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        zza();
        this.zza.zzp().zza(bundle, -20, j10);
    }

    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) {
        zza();
        this.zza.zzq().zza((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    public void setDataCollectionEnabled(boolean z10) {
        zza();
        zziq zzp = this.zza.zzp();
        zzp.zzu();
        zzp.zzl().zzb((Runnable) new zzjb(zzp, z10));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        zza();
        zziq zzp = this.zza.zzp();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        zzp.zzl().zzb((Runnable) new zzit(zzp, bundle2));
    }

    public void setEventInterceptor(zzda zzda) {
        zza();
        zza zza2 = new zza(zzda);
        if (this.zza.zzl().zzg()) {
            this.zza.zzp().zza((zzim) zza2);
        } else {
            this.zza.zzl().zzb((Runnable) new zzm(this, zza2));
        }
    }

    public void setInstanceIdProvider(zzdb zzdb) {
        zza();
    }

    public void setMeasurementEnabled(boolean z10, long j10) {
        zza();
        this.zza.zzp().zza(Boolean.valueOf(z10));
    }

    public void setMinimumSessionDuration(long j10) {
        zza();
    }

    public void setSessionTimeoutDuration(long j10) {
        zza();
        zziq zzp = this.zza.zzp();
        zzp.zzl().zzb((Runnable) new zzjd(zzp, j10));
    }

    public void setUserId(String str, long j10) {
        zza();
        zziq zzp = this.zza.zzp();
        if (str == null || !TextUtils.isEmpty(str)) {
            zzp.zzl().zzb((Runnable) new zziy(zzp, str));
            zzp.zza((String) null, "_id", (Object) str, true, j10);
            return;
        }
        zzp.zzu.zzj().zzu().zza("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        zza();
        this.zza.zzp().zza(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(zzda zzda) {
        zzil remove;
        zza();
        synchronized (this.zzb) {
            remove = this.zzb.remove(Integer.valueOf(zzda.zza()));
        }
        if (remove == null) {
            remove = new zzb(zzda);
        }
        this.zza.zzp().zzb(remove);
    }

    private final void zza(zzcv zzcv, String str) {
        zza();
        this.zza.zzt().zza(zzcv, str);
    }
}
