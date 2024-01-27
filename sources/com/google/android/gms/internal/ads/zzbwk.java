package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbwk extends zzaum implements zzbwm {
    zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final int zze() {
        Parcel zzbg = zzbg(2, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    public final String zzf() {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }
}
