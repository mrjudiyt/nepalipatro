package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbox;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzal extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaw zzd;

    zzal(zzaw zzaw, Context context, zzq zzq, String str) {
        this.zzd = zzaw;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, FirebaseAnalytics.Event.SEARCH);
        return new zzew();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.zzd.zza.zza(this.zza, this.zzb, this.zzc, (zzbox) null, 3);
    }
}
