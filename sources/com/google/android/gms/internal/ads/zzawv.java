package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzawv extends zzaun implements zzaww {
    public zzawv() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzf();
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzauo.zzc(parcel);
            zzd((zze) zzauo.zza(parcel, zze.CREATOR));
        } else if (i10 == 4) {
            zze();
        } else if (i10 != 5) {
            return false;
        } else {
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
