package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbzg extends zzaun implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            zzauo.zzc(parcel);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zzb(readString);
        } else if (i10 != 3) {
            return false;
        } else {
            zzauo.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzauo.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
