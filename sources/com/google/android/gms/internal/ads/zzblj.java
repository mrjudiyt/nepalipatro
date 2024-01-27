package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzblj extends zzaun implements zzblk {
    public zzblj() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzblk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzblk ? (zzblk) queryLocalInterface : new zzbli(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            zzf();
        } else if (i10 != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
