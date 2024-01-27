package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzclw implements zzg {
    private final zzcjs zza;
    private zzcwv zzb;
    private zzae zzc;

    /* synthetic */ zzclw(zzcjs zzcjs, zzclv zzclv) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzg zza(zzcwv zzcwv) {
        this.zzb = zzcwv;
        return this;
    }

    public final /* synthetic */ zzg zzb(zzae zzae) {
        this.zzc = zzae;
        return this;
    }

    public final zzh zzc() {
        zzhbk.zzc(this.zzb, zzcwv.class);
        zzhbk.zzc(this.zzc, zzae.class);
        return new zzcly(this.zza, this.zzc, new zzcug(), new zzdtc(), this.zzb, (zzfam) null, (zzezp) null, (zzclx) null);
    }
}
