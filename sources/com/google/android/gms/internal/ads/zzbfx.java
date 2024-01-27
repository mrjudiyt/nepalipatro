package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbfx extends zzaun implements zzbfy {
    public zzbfx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbfy zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbfy ? (zzbfy) queryLocalInterface : new zzbfw(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzc(asInterface);
        } else if (i10 == 2) {
            zzd();
        } else if (i10 != 3) {
            return false;
        } else {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzb(asInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
