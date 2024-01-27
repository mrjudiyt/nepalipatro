package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcli implements zzfaw {
    private final zzcjs zza;
    private Context zzb;
    private String zzc;
    private zzq zzd;

    /* synthetic */ zzcli(zzcjs zzcjs, zzclh zzclh) {
        this.zza = zzcjs;
    }

    public final /* synthetic */ zzfaw zza(zzq zzq) {
        Objects.requireNonNull(zzq);
        this.zzd = zzq;
        return this;
    }

    public final /* synthetic */ zzfaw zzb(String str) {
        Objects.requireNonNull(str);
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfaw zzc(Context context) {
        Objects.requireNonNull(context);
        this.zzb = context;
        return this;
    }

    public final zzfax zzd() {
        zzhbk.zzc(this.zzb, Context.class);
        zzhbk.zzc(this.zzc, String.class);
        zzhbk.zzc(this.zzd, zzq.class);
        return new zzclk(this.zza, this.zzb, this.zzc, this.zzd, (zzclj) null);
    }
}
