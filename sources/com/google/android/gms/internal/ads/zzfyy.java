package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzfyy extends zzfyh.zzi {
    private static final zzfyu zzbb;
    private static final Logger zzbc = Logger.getLogger(zzfyy.class.getName());
    /* access modifiers changed from: private */
    public volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfyu zzfyu;
        try {
            zzfyu = new zzfyv(AtomicReferenceFieldUpdater.newUpdater(zzfyy.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfyy.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e10) {
            th = e10;
            zzfyu = new zzfyx((zzfyw) null);
        }
        zzbb = zzfyu;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfyy(int i10) {
        this.remaining = i10;
    }

    /* access modifiers changed from: package-private */
    public final int zzA() {
        return zzbb.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbb.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zze(Set set);
}
