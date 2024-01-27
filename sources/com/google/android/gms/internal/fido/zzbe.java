package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzbe extends zzba {
    final transient Object zza;

    zzbe(Object obj) {
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
        return new zzbb(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzbf zzd() {
        return new zzbb(this.zza);
    }
}
