package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxd extends zzfvs {
    final /* synthetic */ zzfxe zza;

    zzfxd(zzfxe zzfxe) {
        this.zza = zzfxe;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzfsw.zza(i10, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzfxe zzfxe = this.zza;
        int i11 = i10 + i10;
        Object obj = zzfxe.zzb[i11];
        obj.getClass();
        Object obj2 = zzfxe.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
