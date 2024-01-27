package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbzs implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbl zzb;

    zzbzs(zzbzt zzbzt, Context context, zzcbl zzcbl) {
        this.zza = context;
        this.zzb = zzcbl;
    }

    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            zzcat.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
