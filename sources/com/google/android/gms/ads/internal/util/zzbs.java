package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbs extends zzaun implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzauo.zzc(parcel);
            boolean zzf = zzf(asInterface, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i10 != 2) {
            return false;
        } else {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
        }
        return true;
    }
}
