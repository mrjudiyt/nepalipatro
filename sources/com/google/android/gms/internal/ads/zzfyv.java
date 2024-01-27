package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfyv extends zzfyu {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    zzfyv(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((zzfyt) null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzfyy zzfyy) {
        return this.zzb.decrementAndGet(zzfyy);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.ads.zzfyy r2, java.util.Set r3, java.util.Set r4) {
        /*
            r1 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = r1.zza
            r0 = 0
            boolean r0 = androidx.concurrent.futures.b.a(r3, r2, r0, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r3 = r3.get(r2)
            if (r3 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyv.zzb(com.google.android.gms.internal.ads.zzfyy, java.util.Set, java.util.Set):void");
    }
}
