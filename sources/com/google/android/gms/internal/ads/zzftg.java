package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzftg implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzftj zzb;

    zzftg(zzftj zzftj, CharSequence charSequence) {
        this.zzb = zzftj;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfsl.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
