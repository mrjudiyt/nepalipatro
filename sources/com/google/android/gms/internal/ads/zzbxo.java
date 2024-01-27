package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbxo implements zzfzp {
    final /* synthetic */ e zza;

    zzbxo(zzbxp zzbxp, e eVar) {
        this.zza = eVar;
    }

    public final void zza(Throwable th) {
        zzbxp.zzc.remove(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        zzbxp.zzc.remove(this.zza);
    }
}
