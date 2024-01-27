package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbqf extends zzaun implements zzbqg {
    public zzbqf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString);
        } else if (i10 != 4) {
            return false;
        } else {
            zzauo.zzc(parcel);
            zzf((zze) zzauo.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
