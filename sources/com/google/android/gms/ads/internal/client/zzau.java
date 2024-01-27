package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    zzau(zzaw zzaw, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzaw;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        HashMap hashMap = this.zzc;
        return zzce.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbci.zza(this.zza.getContext());
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                return zzbfx.zze(((zzbgb) zzcax.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzat.zza)).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                this.zzd.zzh = zzbty.zza(this.zza.getContext());
                this.zzd.zzh.zzf(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        } else {
            zzaw zzaw = this.zzd;
            return zzaw.zzg.zza(this.zza, this.zzb, this.zzc);
        }
    }
}
