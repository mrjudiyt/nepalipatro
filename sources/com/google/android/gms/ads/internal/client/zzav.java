package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbxb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzav extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbox zzc;
    final /* synthetic */ zzaw zzd;

    zzav(zzaw zzaw, Context context, String str, zzbox zzbox) {
        this.zzd = zzaw;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbox;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "rewarded");
        return new zzfc();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzo(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        return zzbxb.zza(this.zza, this.zzb, this.zzc);
    }
}
