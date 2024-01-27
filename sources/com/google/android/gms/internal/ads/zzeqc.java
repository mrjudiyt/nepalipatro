package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeqc implements zzetw {
    private final zzgad zza;
    private final zzdqo zzb;
    private final String zzc;
    private final zzfdn zzd;

    public zzeqc(zzgad zzgad, zzdqo zzdqo, zzfdn zzfdn, String str) {
        this.zza = zzgad;
        this.zzb = zzdqo;
        this.zzd = zzfdn;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final e zzb() {
        return this.zza.zzb(new zzeqb(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqd zzc() {
        zzfdn zzfdn = this.zzd;
        zzdqo zzdqo = this.zzb;
        return new zzeqd(zzdqo.zzb(zzfdn.zzf, this.zzc), zzdqo.zza());
    }
}
