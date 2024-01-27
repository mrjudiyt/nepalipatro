package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzai(zzaw zzaw, Context context, zzbox zzbox, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbox;
        this.zzc = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return new zzbkr();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 233702000, new zzbke(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((zzbkn) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzah.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 233702000, new zzbke(this.zzc));
        } catch (RemoteException | zzcaw | NullPointerException unused) {
            return null;
        }
    }
}
