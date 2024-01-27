package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbzj extends zzaun implements zzbzk {
    public zzbzj() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbzk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbzk ? (zzbzk) queryLocalInterface : new zzbzi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbzh zzbzh = null;
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzo zzbzo = (zzbzo) zzauo.zza(parcel, zzbzo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbzh = queryLocalInterface instanceof zzbzh ? (zzbzh) queryLocalInterface : new zzbzf(readStrongBinder);
                }
                zzauo.zzc(parcel);
                zze(asInterface, zzbzo, zzbzh);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzj(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, (IInterface) null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                parcel2.writeNoException();
                zzauo.zzf(parcel2, (IInterface) null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtk zzb = zzbtj.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzl(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtk zzb2 = zzbtj.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzk(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzauo.zzc(parcel);
                zzf((zzbtt) zzauo.zza(parcel, zzbtt.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzi(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtk zzb3 = zzbtj.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzh(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtk zzb4 = zzbtj.zzb(parcel.readStrongBinder());
                zzauo.zzc(parcel);
                zzg(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
