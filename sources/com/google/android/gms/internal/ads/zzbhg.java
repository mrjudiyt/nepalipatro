package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhg extends zzaum implements zzbhi {
    zzbhg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void zze() {
        zzbh(2, zza());
    }

    public final void zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }
}
