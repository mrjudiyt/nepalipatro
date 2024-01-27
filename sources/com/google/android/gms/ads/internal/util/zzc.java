package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzc extends zzb {
    private final Context zza;

    zzc(Context context) {
        this.zza = context;
    }

    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            zzcat.zzh("Fail to get isAdIdFakeForDebugLogging", e10);
            z10 = false;
        }
        zzcas.zzj(z10);
        zzcat.zzj("Update ad debug logging enablement as " + z10);
    }
}
