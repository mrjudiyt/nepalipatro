package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgg {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzgd zze;

    public zzgg(zzgd zzgd, String str, boolean z10) {
        this.zze = zzgd;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z10;
    }

    public final void zza(boolean z10) {
        SharedPreferences.Editor edit = this.zze.zzc().edit();
        edit.putBoolean(this.zza, z10);
        edit.apply();
        this.zzd = z10;
    }

    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzc().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}
