package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzck extends zzaun implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzauo.zze(parcel2, liteSdkVersion);
        } else if (i10 != 2) {
            return false;
        } else {
            zzbox adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzauo.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
