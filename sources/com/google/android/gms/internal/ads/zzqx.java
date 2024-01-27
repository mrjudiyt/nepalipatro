package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzqx {
    public final int zza;
    public final zztw zzb;
    private final CopyOnWriteArrayList zzc;

    public zzqx() {
        this(new CopyOnWriteArrayList(), 0, (zztw) null);
    }

    private zzqx(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zztw zztw) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztw;
    }

    public final zzqx zza(int i10, zztw zztw) {
        return new zzqx(this.zzc, 0, zztw);
    }

    public final void zzb(Handler handler, zzqy zzqy) {
        this.zzc.add(new zzqw(handler, zzqy));
    }

    public final void zzc(zzqy zzqy) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqw zzqw = (zzqw) it.next();
            if (zzqw.zzb == zzqy) {
                this.zzc.remove(zzqw);
            }
        }
    }
}
