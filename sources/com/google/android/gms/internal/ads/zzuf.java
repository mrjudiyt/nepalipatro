package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzuf {
    public final int zza;
    public final zztw zzb;
    private final CopyOnWriteArrayList zzc;

    public zzuf() {
        this(new CopyOnWriteArrayList(), 0, (zztw) null);
    }

    private zzuf(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zztw zztw) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztw;
    }

    public final zzuf zza(int i10, zztw zztw) {
        return new zzuf(this.zzc, 0, zztw);
    }

    public final void zzb(Handler handler, zzug zzug) {
        this.zzc.add(new zzue(handler, zzug));
    }

    public final void zzc(zzts zzts) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            zzfk.zzI(zzue.zza, new zztz(this, zzue.zzb, zzts));
        }
    }

    public final void zzd(zztn zztn, zzts zzts) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            zzfk.zzI(zzue.zza, new zzud(this, zzue.zzb, zztn, zzts));
        }
    }

    public final void zze(zztn zztn, zzts zzts) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            zzfk.zzI(zzue.zza, new zzub(this, zzue.zzb, zztn, zzts));
        }
    }

    public final void zzf(zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            zzfk.zzI(zzue.zza, new zzuc(this, zzue.zzb, zztn, zzts, iOException, z10));
        }
    }

    public final void zzg(zztn zztn, zzts zzts) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            zzfk.zzI(zzue.zza, new zzua(this, zzue.zzb, zztn, zzts));
        }
    }

    public final void zzh(zzug zzug) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzue zzue = (zzue) it.next();
            if (zzue.zzb == zzug) {
                this.zzc.remove(zzue);
            }
        }
    }
}
