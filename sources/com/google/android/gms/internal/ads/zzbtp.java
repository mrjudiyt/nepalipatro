package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbtp extends zzbtj {
    final /* synthetic */ List zza;

    zzbtp(zzbts zzbts, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcat.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcat.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
