package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbtd extends zzaun implements zzbte {
    public static zzbte zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzbte ? (zzbte) queryLocalInterface : new zzbtc(iBinder);
    }
}
