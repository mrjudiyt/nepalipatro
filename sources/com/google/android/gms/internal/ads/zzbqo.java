package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbqo extends zzaun implements zzbqp {
    public zzbqo() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzbpm zzb = zzbpl.zzb(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzg(zzb);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString);
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
