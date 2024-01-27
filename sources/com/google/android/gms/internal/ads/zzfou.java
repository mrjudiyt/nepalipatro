package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfou extends zzaun implements zzfov {
    public zzfou() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzauo.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzauo.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzauo.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzauo.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzauo.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzauo.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
