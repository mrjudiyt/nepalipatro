package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzfkw implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfkv zzc;

    private final void zza(boolean z10) {
        if (this.zza != z10) {
            this.zza = z10;
            if (this.zzb) {
                zzb(z10);
                zzfkv zzfkv = this.zzc;
                if (zzfkv != null) {
                    zzfkv.zzc(z10);
                }
            }
        }
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzc();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zza(true);
    }

    public final void onActivityStopped(Activity activity) {
        zza(zzh());
    }

    /* access modifiers changed from: protected */
    public void zzb(boolean z10) {
    }

    /* access modifiers changed from: protected */
    public boolean zzc() {
        return false;
    }

    public final void zzd(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(zzfkv zzfkv) {
        this.zzc = zzfkv;
    }

    public final void zzf() {
        this.zzb = true;
        boolean zzh = zzh();
        this.zza = zzh;
        zzb(zzh);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }
}
