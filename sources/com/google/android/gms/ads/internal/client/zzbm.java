package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbm extends zzaun implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzauo.zzc(parcel);
            zzg((zzl) zzauo.zza(parcel, zzl.CREATOR));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else if (i10 == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            int i12 = zzauo.zza;
            parcel2.writeInt(zzi ? 1 : 0);
        } else if (i10 == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
        } else if (i10 != 5) {
            return false;
        } else {
            int readInt = parcel.readInt();
            zzauo.zzc(parcel);
            zzh((zzl) zzauo.zza(parcel, zzl.CREATOR), readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
