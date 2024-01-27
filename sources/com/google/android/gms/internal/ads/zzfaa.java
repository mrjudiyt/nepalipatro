package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfaa implements zzfsk {
    final /* synthetic */ zzfae zza;

    zzfaa(zzfae zzfae) {
        this.zza = zzfae;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcat.zzh("", (zzdyo) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfae zzfae = this.zza;
        zzfae.zzd = new zzfad((zzbvg) null, zzfae.zze(), (zzfac) null);
        return this.zza.zzd;
    }
}
