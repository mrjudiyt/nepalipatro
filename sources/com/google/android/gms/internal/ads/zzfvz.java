package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfvz extends zzftt {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfsx zzb;

    zzfvz(Iterator it, zzfsx zzfsx) {
        this.zza = it;
        this.zzb = zzfsx;
    }

    /* access modifiers changed from: protected */
    public final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzfsx zzfsx = this.zzb;
            Object next = it.next();
            if (zzfsx.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
