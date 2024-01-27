package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzblm extends zzaun implements zzbln {
    public zzblm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbln zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbln ? (zzbln) queryLocalInterface : new zzbll(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ArrayList<zzblg> createTypedArrayList = parcel.createTypedArrayList(zzblg.CREATOR);
        zzauo.zzc(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
