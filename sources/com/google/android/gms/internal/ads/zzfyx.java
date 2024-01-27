package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfyx extends zzfyu {
    private zzfyx() {
        super((zzfyt) null);
    }

    /* synthetic */ zzfyx(zzfyw zzfyw) {
        super((zzfyt) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzfyy zzfyy) {
        int zzz;
        synchronized (zzfyy) {
            zzz = zzfyy.remaining - 1;
            zzfyy.remaining = zzz;
        }
        return zzz;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzfyy zzfyy, Set set, Set set2) {
        synchronized (zzfyy) {
            if (zzfyy.seenExceptions == null) {
                zzfyy.seenExceptions = set2;
            }
        }
    }
}
