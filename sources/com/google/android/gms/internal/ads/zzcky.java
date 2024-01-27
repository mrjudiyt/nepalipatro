package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcky implements zzdtx {
    private final zzcjs zza;
    private Context zzb;
    private zzbkh zzc;

    /* synthetic */ zzcky(zzcjs zzcjs, zzckx zzckx) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzdtx zza(zzbkh zzbkh) {
        Objects.requireNonNull(zzbkh);
        this.zzc = zzbkh;
        return this;
    }

    public final /* synthetic */ zzdtx zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzdty zzc() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, zzbkh.class);
        return new zzcla(this.zza, this.zzb, this.zzc, (zzckz) null);
    }
}
