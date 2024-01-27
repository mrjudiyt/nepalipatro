package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzca extends zzaun implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcb zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof zzcb ? (zzcb) queryLocalInterface : new zzbz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzauo.zzc(parcel);
        zzc(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
