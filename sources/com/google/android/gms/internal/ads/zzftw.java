package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzftw extends zzfwj {
    final /* synthetic */ zzfty zza;

    zzftw(zzfty zzfty) {
        this.zza = zzfty;
    }

    public final boolean contains(Object obj) {
        return zzfur.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzftx(this.zza);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfty zzfty = this.zza;
        zzful.zzo(zzfty.zzb, entry.getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
