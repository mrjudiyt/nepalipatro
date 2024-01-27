package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzbue extends zzaun implements zzbuf {
    public zzbue() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
