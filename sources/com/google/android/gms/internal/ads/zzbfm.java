package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfm extends zzaum implements zzbfo {
    zzbfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double zzb() {
        Parcel zzbg = zzbg(3, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final int zzc() {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    public final int zzd() {
        Parcel zzbg = zzbg(4, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    public final Uri zze() {
        Parcel zzbg = zzbg(2, zza());
        Uri uri = (Uri) zzauo.zza(zzbg, Uri.CREATOR);
        zzbg.recycle();
        return uri;
    }

    public final IObjectWrapper zzf() {
        Parcel zzbg = zzbg(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbg.readStrongBinder());
        zzbg.recycle();
        return asInterface;
    }
}
