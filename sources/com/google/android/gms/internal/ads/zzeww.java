package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeww {
    private final zzbvg zza;
    private final int zzb;

    public zzeww(zzbvg zzbvg, int i10) {
        this.zza = zzbvg;
        this.zzb = i10;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzftl.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.zzl;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzi() {
        return this.zza.zzk;
    }
}
