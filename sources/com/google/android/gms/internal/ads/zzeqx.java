package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeqx implements zzetw {
    private final zzgad zza;
    private final zzfdn zzb;

    zzeqx(zzgad zzgad, zzfdn zzfdn) {
        this.zza = zzgad;
        this.zzb = zzfdn;
    }

    public final int zza() {
        return 21;
    }

    public final e zzb() {
        return this.zza.zzb(new zzeqw(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqy zzc() {
        return new zzeqy("requester_type_2".equals(zzf.zzb(this.zzb.zzd)));
    }
}
