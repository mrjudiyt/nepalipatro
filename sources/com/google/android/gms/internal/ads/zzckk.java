package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzckk implements zzezf {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzckk(zzcjs zzcjs, zzckj zzckj) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzezf zza(zzq zzq) {
        Objects.requireNonNull(zzq);
        this.zzd = zzq;
        return this;
    }

    public final /* synthetic */ zzezf zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzezf zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzezg zzd() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        zzhbk.zzc(this.zzd, zzq.class);
        return new zzckm(this.zza, this.zzb, this.zzc, this.zzd, (zzckl) null);
    }
}
