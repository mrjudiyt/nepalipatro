package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfqx extends zzfrj {
    final /* synthetic */ zzfqy zza;
    private final zzfrd zzb;

    zzfqx(zzfqy zzfqy, zzfrd zzfrd) {
        this.zza = zzfqy;
        this.zzb = zzfrd;
    }

    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrb zzc = zzfrc.zzc();
        zzc.zzb(i10);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i10 == 8157) {
            this.zza.zzc();
        }
    }
}
