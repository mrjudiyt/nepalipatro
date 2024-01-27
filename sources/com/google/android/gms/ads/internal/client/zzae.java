package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbox zzb;

    zzae(zzaw zzaw, Context context, zzbox zzbox) {
        this.zza = context;
        this.zzb = zzbox;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzp(ObjectWrapper.wrap(this.zza), this.zzb, 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        try {
            return ((zzbzn) zzcax.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzad.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 233702000);
        } catch (RemoteException | zzcaw | NullPointerException unused) {
            return null;
        }
    }
}
