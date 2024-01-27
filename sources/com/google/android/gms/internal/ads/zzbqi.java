package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbqi extends zzaun implements zzbqj {
    public zzbqi() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzg(asInterface);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zze(readString);
        } else if (i10 == 3) {
            zzauo.zzc(parcel);
            zzf((zze) zzauo.zza(parcel, zze.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            zzbpg zzb = zzbpf.zzb(parcel.readStrongBinder());
            zzauo.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
