package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzbur extends zzaun implements zzbus {
    public zzbur() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        zzbvc zzbvc = null;
        if (i10 == 1) {
            zzbuh zzbuh = (zzbuh) zzauo.zza(parcel, zzbuh.CREATOR);
            zzauo.zzc(parcel);
            parcel2.writeNoException();
            zzauo.zze(parcel2, (Parcelable) null);
        } else if (i10 == 2) {
            zzbuh zzbuh2 = (zzbuh) zzauo.zza(parcel, zzbuh.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbut) {
                    zzbut zzbut = (zzbut) queryLocalInterface;
                }
            }
            zzauo.zzc(parcel);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zzbvg zzbvg = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvc = queryLocalInterface2 instanceof zzbvc ? (zzbvc) queryLocalInterface2 : new zzbva(readStrongBinder2);
            }
            zzauo.zzc(parcel);
            zzg(zzbvg, zzbvc);
            parcel2.writeNoException();
        } else if (i10 == 5) {
            zzbvg zzbvg2 = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvc = queryLocalInterface3 instanceof zzbvc ? (zzbvc) queryLocalInterface3 : new zzbva(readStrongBinder3);
            }
            zzauo.zzc(parcel);
            zzf(zzbvg2, zzbvc);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            zzbvg zzbvg3 = (zzbvg) zzauo.zza(parcel, zzbvg.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvc = queryLocalInterface4 instanceof zzbvc ? (zzbvc) queryLocalInterface4 : new zzbva(readStrongBinder4);
            }
            zzauo.zzc(parcel);
            zze(zzbvg3, zzbvc);
            parcel2.writeNoException();
        } else if (i10 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbvc = queryLocalInterface5 instanceof zzbvc ? (zzbvc) queryLocalInterface5 : new zzbva(readStrongBinder5);
            }
            zzauo.zzc(parcel);
            zzh(readString, zzbvc);
            parcel2.writeNoException();
        }
        return true;
    }
}
