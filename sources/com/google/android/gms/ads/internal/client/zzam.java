package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzam extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbox zzd;
    final /* synthetic */ zzaw zze;

    zzam(zzaw zzaw, Context context, zzq zzq, String str, zzbox zzbox) {
        this.zze = zzaw;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzd = zzbox;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "interstitial");
        return new zzew();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
