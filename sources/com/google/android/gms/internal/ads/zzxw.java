package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzxw {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxx zzxx) {
        zzc(zzxx);
        this.zza.add(new zzxv(handler, zzxx));
    }

    public final void zzb(int i10, long j10, long j11) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzxv zzxv = (zzxv) it.next();
            if (!zzxv.zzc) {
                zzxv.zza.post(new zzxu(zzxv, i10, j10, j11));
            }
        }
    }

    public final void zzc(zzxx zzxx) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzxv zzxv = (zzxv) it.next();
            if (zzxv.zzb == zzxx) {
                zzxv.zzc();
                this.zza.remove(zzxv);
            }
        }
    }
}
