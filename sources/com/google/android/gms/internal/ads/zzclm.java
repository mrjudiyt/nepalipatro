package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzclm implements zzfck {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzclm(zzcjs zzcjs, zzcll zzcll) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzfck zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfck zzb(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzfcl zzc() {
        zzhbk.zzc(this.zzb, Context.class);
        return new zzclo(this.zza, this.zzb, this.zzc, (zzcln) null);
    }
}
