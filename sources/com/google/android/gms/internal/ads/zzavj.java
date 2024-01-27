package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavj implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzavj(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzavb(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzavh(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzave(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzavd(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzavg(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzavc(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzavf(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzavi zzavi) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzavi.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e10) {
            zzcat.zzh("Error while dispatching lifecycle callback.", e10);
        }
    }
}
