package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavo implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public boolean zzd = true;
    /* access modifiers changed from: private */
    public boolean zze = false;
    /* access modifiers changed from: private */
    public final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private Runnable zzh;
    private boolean zzi = false;
    private long zzj;

    zzavo() {
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzawd) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        zzt.zzo().zzu(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcat.zzh("", e10);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzawd zzb2 : this.zzg) {
                try {
                    zzb2.zzb();
                } catch (Exception e10) {
                    zzt.zzo().zzu(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcat.zzh("", e10);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        zzfps zzfps = com.google.android.gms.ads.internal.util.zzt.zza;
        zzavn zzavn = new zzavn(this);
        this.zzh = zzavn;
        zzfps.postDelayed(zzavn, this.zzj);
    }

    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z10 = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzawd zzc2 : this.zzg) {
                try {
                    zzc2.zzc();
                } catch (Exception e10) {
                    zzt.zzo().zzu(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcat.zzh("", e10);
                }
            }
            if (z10) {
                for (zzavp zza2 : this.zzf) {
                    try {
                        zza2.zza(true);
                    } catch (Exception e11) {
                        zzcat.zzh("", e11);
                    }
                }
            } else {
                zzcat.zze("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzavp zzavp) {
        synchronized (this.zzc) {
            this.zzf.add(zzavp);
        }
    }

    public final void zzg(Application application, Context context) {
        if (!this.zzi) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                zzk((Activity) context);
            }
            this.zzb = application;
            this.zzj = ((Long) zzba.zzc().zzb(zzbci.zzaR)).longValue();
            this.zzi = true;
        }
    }

    public final void zzh(zzavp zzavp) {
        synchronized (this.zzc) {
            this.zzf.remove(zzavp);
        }
    }
}
