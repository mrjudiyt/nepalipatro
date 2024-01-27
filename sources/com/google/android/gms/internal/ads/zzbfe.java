package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbfe extends zzaum implements zzbfg {
    zzbfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String zzg() {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzh() {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzauo.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }
}
