package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsb implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbgi zza;

    public zzbsb(zzbgi zzbgi) {
        this.zza = zzbgi;
        try {
            zzbgi.zzm();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
            return false;
        }
    }
}
