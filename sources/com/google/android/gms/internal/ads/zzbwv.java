package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbwv extends zzaun implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int readInt = parcel.readInt();
            zzauo.zzc(parcel);
            zze(readInt);
        } else if (i10 != 3) {
            return false;
        } else {
            zzauo.zzc(parcel);
            zzf((zze) zzauo.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
