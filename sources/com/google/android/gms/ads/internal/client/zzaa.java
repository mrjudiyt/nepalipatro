package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    zzaa(zzaw zzaw, Activity activity) {
        this.zzb = zzaw;
        this.zza = activity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzm(ObjectWrapper.wrap(this.zza));
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                return zzbsu.zzI(((zzbsy) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzz.zza)).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                this.zzb.zzh = zzbty.zza(this.zza.getApplicationContext());
                this.zzb.zzh.zzf(e10, "ClientApiBroker.createAdOverlay");
                return null;
            }
        } else {
            zzaw zzaw = this.zzb;
            return zzaw.zzf.zza(this.zza);
        }
    }
}
