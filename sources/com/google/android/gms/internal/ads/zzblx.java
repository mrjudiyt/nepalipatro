package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzblx extends zzaun implements zzbly {
    public zzblx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel.readInt();
            zzauo.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
