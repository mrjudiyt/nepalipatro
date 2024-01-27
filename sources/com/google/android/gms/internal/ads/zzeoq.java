package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeoq implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;
    private final zzcaz zzc;
    private final zzcag zzd;

    public zzeoq(zzgad zzgad, zzfdn zzfdn, zzcaz zzcaz, zzcag zzcag) {
        this.zza = zzgad;
        this.zzb = zzfdn;
        this.zzc = zzcaz;
        this.zzd = zzcag;
    }

    public final int zza() {
        return 9;
    }

    public final e zzb() {
        return this.zza.zzb(new zzeop(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeor zzc() {
        return new zzeor(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
