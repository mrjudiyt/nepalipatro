package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhat extends AbstractList {
    private static final zzhau zzc = zzhau.zzb(zzhat.class);
    final List zza;
    final Iterator zzb;

    public zzhat(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    public final Object get(int i10) {
        if (this.zza.size() > i10) {
            return this.zza.get(i10);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new zzhas(this);
    }

    public final int size() {
        zzhau zzhau = zzc;
        zzhau.zza("potentially expensive size() call");
        zzhau.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
