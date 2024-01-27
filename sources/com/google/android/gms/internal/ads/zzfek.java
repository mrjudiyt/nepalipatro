package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfek {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgad zzc;

    public zzfek(Callable callable, zzgad zzgad) {
        this.zzb = callable;
        this.zzc = zzgad;
    }

    public final synchronized e zza() {
        zzc(1);
        return (e) this.zza.poll();
    }

    public final synchronized void zzb(e eVar) {
        this.zza.addFirst(eVar);
    }

    public final synchronized void zzc(int i10) {
        int size = i10 - this.zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}
