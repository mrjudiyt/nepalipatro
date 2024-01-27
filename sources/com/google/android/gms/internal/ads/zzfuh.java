package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzfuh implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfui zzc;

    zzfuh(zzfui zzfui) {
        Iterator it;
        this.zzc = zzfui;
        Collection collection = zzfui.zzb;
        this.zzb = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    zzfuh(zzfui zzfui, Iterator it) {
        this.zzc = zzfui;
        this.zzb = zzfui.zzb;
        this.zza = it;
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzful zzful = this.zzc.zze;
        zzful.zzb = zzful.zzb - 1;
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
