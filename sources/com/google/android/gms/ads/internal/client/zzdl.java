package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzauo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzdl extends zzaum implements zzdn {
    zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final Bundle zze() {
        Parcel zzbg = zzbg(5, zza());
        Bundle bundle = (Bundle) zzauo.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final zzu zzf() {
        Parcel zzbg = zzbg(4, zza());
        zzu zzu = (zzu) zzauo.zza(zzbg, zzu.CREATOR);
        zzbg.recycle();
        return zzu;
    }

    public final String zzg() {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzh() {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzi() {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzj() {
        Parcel zzbg = zzbg(3, zza());
        ArrayList<zzu> createTypedArrayList = zzbg.createTypedArrayList(zzu.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }
}
