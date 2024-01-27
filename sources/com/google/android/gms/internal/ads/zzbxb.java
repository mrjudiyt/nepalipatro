package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbxb {
    public static final zzbwp zza(Context context, String str, zzbox zzbox) {
        try {
            IBinder zze = ((zzbwt) zzcax.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbxa.zza)).zze(ObjectWrapper.wrap(context), str, zzbox, 233702000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbwp ? (zzbwp) queryLocalInterface : new zzbwn(zze);
        } catch (RemoteException | zzcaw e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
