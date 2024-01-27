package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxf extends zzfvx {
    private final transient zzfvv zza;
    private final transient zzfvs zzb;

    zzfxf(zzfvv zzfvv, zzfvs zzfvs) {
        this.zza = zzfvv;
        this.zzb = zzfvs;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    public final zzfvs zzd() {
        return this.zzb;
    }

    public final zzfxs zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
