package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzao extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbox zzc;
    final /* synthetic */ zzaw zzd;

    zzao(zzaw zzaw, Context context, String str, zzbox zzbox) {
        this.zzd = zzaw;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbox;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "native_ad");
        return new zzeu();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzbr) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzan.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 233702000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                this.zzd.zzh = zzbty.zza(this.zza);
                this.zzd.zzh.zzf(e10, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        } else {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
