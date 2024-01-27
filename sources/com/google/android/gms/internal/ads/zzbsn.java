package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbsn extends zzaun implements zzbso {
    public zzbsn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbso zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbso ? (zzbso) queryLocalInterface : new zzbsm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzauo.zzc(parcel);
            zze((Intent) zzauo.zza(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzauo.zzc(parcel);
            zzi(asInterface, readString, readString2);
        } else if (i10 == 3) {
            zzh();
        } else if (i10 == 4) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzg(asInterface2);
        } else if (i10 != 5) {
            return false;
        } else {
            String[] createStringArray = parcel.createStringArray();
            int[] createIntArray = parcel.createIntArray();
            IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzf(createStringArray, createIntArray, asInterface3);
        }
        parcel2.writeNoException();
        return true;
    }
}
