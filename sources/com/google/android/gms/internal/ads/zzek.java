package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzek implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzel zzc;

    public /* synthetic */ zzek(CopyOnWriteArraySet copyOnWriteArraySet, int i10, zzel zzel) {
        this.zza = copyOnWriteArraySet;
        this.zzb = i10;
        this.zzc = zzel;
    }

    public final void run() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzel zzel = this.zzc;
            ((zzen) it.next()).zza(this.zzb, zzel);
        }
    }
}
