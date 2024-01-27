package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfrj extends zzaun implements zzfrk {
    public zzfrj() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzauo.zzc(parcel);
        zzb((Bundle) zzauo.zza(parcel, Bundle.CREATOR));
        return true;
    }
}
