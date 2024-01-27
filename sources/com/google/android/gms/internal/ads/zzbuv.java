package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzbuv extends zzaun implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbuz zzbuz = null;
        if (i10 == 1) {
            zzbuk zzbuk = (zzbuk) zzauo.zza(parcel, zzbuk.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbuz = queryLocalInterface instanceof zzbuz ? (zzbuz) queryLocalInterface : new zzbux(readStrongBinder);
            }
            zzauo.zzc(parcel);
            zzf(zzbuk, zzbuz);
        } else if (i10 == 2) {
            zzbuk zzbuk2 = (zzbuk) zzauo.zza(parcel, zzbuk.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbuz) {
                    zzbuz zzbuz2 = (zzbuz) queryLocalInterface2;
                }
            }
            zzauo.zzc(parcel);
        } else if (i10 != 3) {
            return false;
        } else {
            zzbuo zzbuo = (zzbuo) zzauo.zza(parcel, zzbuo.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbuz = queryLocalInterface3 instanceof zzbuz ? (zzbuz) queryLocalInterface3 : new zzbux(readStrongBinder3);
            }
            zzauo.zzc(parcel);
            zze(zzbuo, zzbuz);
        }
        parcel2.writeNoException();
        return true;
    }
}
