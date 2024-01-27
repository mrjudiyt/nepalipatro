package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxp extends zzfvx {
    final transient Object zza;

    zzfxp(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzfwa(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "[" + obj + "]";
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    public final zzfvs zzd() {
        return zzfvs.zzm(this.zza);
    }

    public final zzfxs zze() {
        return new zzfwa(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
