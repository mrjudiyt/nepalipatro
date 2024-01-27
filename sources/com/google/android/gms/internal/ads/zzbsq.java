package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbsq extends zzaun implements zzbsr {
    public static zzbsr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof zzbsr ? (zzbsr) queryLocalInterface : new zzbsp(iBinder);
    }
}
