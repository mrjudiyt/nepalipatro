package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzbkx extends zzaun implements zzbky {
    public zzbkx() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzauo.zzc(parcel);
        zzb((ParcelFileDescriptor) zzauo.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
