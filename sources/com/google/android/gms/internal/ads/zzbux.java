package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbux extends zzaum implements zzbuz {
    zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    public final void zze(zzbb zzbb) {
        Parcel zza = zza();
        zzauo.zzd(zza, zzbb);
        zzbh(2, zza);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel zza = zza();
        zzauo.zzd(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
