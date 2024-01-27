package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzbuy extends zzaun implements zzbuz {
    public zzbuy() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzauo.zzc(parcel);
            zzf((ParcelFileDescriptor) zzauo.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zzauo.zzc(parcel);
            zze((zzbb) zzauo.zza(parcel, zzbb.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
