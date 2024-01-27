package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbtj extends zzaun implements zzbtk {
    public zzbtj() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzbtk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof zzbtk ? (zzbtk) queryLocalInterface : new zzbti(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            zzauo.zzc(parcel);
            zzf(createTypedArrayList);
        } else if (i10 != 2) {
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
