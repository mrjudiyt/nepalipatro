package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcka implements zzexr {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcka(zzcjs zzcjs, zzcjz zzcjz) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzexr zza(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzexr zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzexs zzc() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        return new zzckc(this.zza, this.zzb, this.zzc, (zzckb) null);
    }
}
