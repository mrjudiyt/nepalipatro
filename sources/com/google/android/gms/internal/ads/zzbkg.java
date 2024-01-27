package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbkg extends zzaun implements zzbkh {
    public zzbkg() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbkh zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof zzbkh ? (zzbkh) queryLocalInterface : new zzbkf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        zzauo.zzc(parcel);
        zzb(readString);
        parcel2.writeNoException();
        return true;
    }
}
