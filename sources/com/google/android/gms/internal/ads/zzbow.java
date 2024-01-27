package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbow extends zzaun implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbox zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbox ? (zzbox) queryLocalInterface : new zzbov(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zzbpa zzb = zzb(readString);
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zzb);
        } else if (i10 == 2) {
            String readString2 = parcel.readString();
            zzauo.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i10 == 3) {
            String readString3 = parcel.readString();
            zzauo.zzc(parcel);
            zzbqv zzc = zzc(readString3);
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zzc);
        } else if (i10 != 4) {
            return false;
        } else {
            String readString4 = parcel.readString();
            zzauo.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}
