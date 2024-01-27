package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzasx implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzasy zza;

    zzasx(zzasy zzasy) {
        this.zza = zzasy;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzasy zzasy = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        if (zzasy.zzc > 0) {
            zzasy zzasy2 = this.zza;
            if (currentTimeMillis >= zzasy2.zzc) {
                zzasy2.zzd = currentTimeMillis - zzasy2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
