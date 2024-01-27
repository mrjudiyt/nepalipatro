package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbtq extends zzbtj {
    final /* synthetic */ List zza;

    zzbtq(zzbts zzbts, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzcat.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzcat.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
