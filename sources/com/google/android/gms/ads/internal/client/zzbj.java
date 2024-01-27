package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbj extends zzaun implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else if (i10 != 2) {
            return false;
        } else {
            zzauo.zzc(parcel);
            zzb((zze) zzauo.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
