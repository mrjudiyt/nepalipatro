package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzamk;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzcat;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbj implements zzamk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbn zzb;

    zzbj(zzbq zzbq, String str, zzbn zzbn) {
        this.zza = str;
        this.zzb = zzbn;
    }

    public final void zza(zzamp zzamp) {
        String exc = zzamp.toString();
        zzcat.zzj("Failed to load URL: " + this.zza + "\n" + exc);
        this.zzb.zza((Object) null);
    }
}
