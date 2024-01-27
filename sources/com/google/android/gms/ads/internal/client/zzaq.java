package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzaq extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaw zzb;

    zzaq(zzaw zzaw, Context context) {
        this.zzb = zzaw;
        this.zza = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "mobile_ads_settings");
        return new zzey();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzce zzce) {
        return zzce.zzg(ObjectWrapper.wrap(this.zza), 233702000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbci.zza(this.zza);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjQ)).booleanValue()) {
            try {
                IBinder zze = ((zzcp) zzcax.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(this.zza), 233702000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
            } catch (RemoteException | zzcaw | NullPointerException e10) {
                this.zzb.zzh = zzbty.zza(this.zza);
                this.zzb.zzh.zzf(e10, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        } else {
            return this.zzb.zzc.zza(this.zza);
        }
    }
}
