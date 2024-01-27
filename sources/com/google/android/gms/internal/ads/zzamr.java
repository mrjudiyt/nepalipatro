package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzamr {
    public static final boolean zza = zzams.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzamr() {
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.zzc) {
            zzb("Request on the loose");
            zzams.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public final synchronized void zza(String str, long j10) {
        if (!this.zzc) {
            this.zzb.add(new zzamq(str, j10, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((zzamq) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j10 = ((zzamq) list.get(list.size() - 1)).zzc - j11;
        }
        if (j10 > 0) {
            long j12 = ((zzamq) this.zzb.get(0)).zzc;
            zzams.zza("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzamq zzamq : this.zzb) {
                long j13 = zzamq.zzc;
                zzams.zza("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(zzamq.zzb), zzamq.zza);
                j12 = j13;
            }
        }
    }
}
