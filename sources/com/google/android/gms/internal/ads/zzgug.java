package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgug extends AbstractList {
    private final List zza;
    private final zzguf zzb;

    public zzgug(List list, zzguf zzguf) {
        this.zza = list;
        this.zzb = zzguf;
    }

    public final Object get(int i10) {
        zzayt zzb2 = zzayt.zzb(((Integer) this.zza.get(i10)).intValue());
        return zzb2 == null ? zzayt.AD_FORMAT_TYPE_UNSPECIFIED : zzb2;
    }

    public final int size() {
        return this.zza.size();
    }
}
