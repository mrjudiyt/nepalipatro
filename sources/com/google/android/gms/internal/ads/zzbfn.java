package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbfn extends zzaun implements zzbfo {
    public zzbfn() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbfo zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbfo ? (zzbfo) queryLocalInterface : new zzbfm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzauo.zzf(parcel2, zzf);
        } else if (i10 == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzauo.zze(parcel2, zze);
        } else if (i10 == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
        } else if (i10 == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
        } else if (i10 != 5) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
