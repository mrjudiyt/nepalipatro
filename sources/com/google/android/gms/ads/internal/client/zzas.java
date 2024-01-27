package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    zzas(zzaw zzaw, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzaw;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbci.zza(this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                return zzbfr.zzbE(((zzbfv) zzcax.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzar.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 233702000));
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                this.zzd.zzh = zzbty.zza(this.zzc);
                this.zzd.zzh.zzf(e10, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        } else {
            zzaw zzaw = this.zzd;
            return zzaw.zzd.zza(this.zzc, this.zza, this.zzb);
        }
    }
}
