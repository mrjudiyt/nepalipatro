package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbhh extends zzaun implements zzbhi {
    public zzbhh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzauo.zzc(parcel);
            zzf(readString);
        } else if (i10 != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
