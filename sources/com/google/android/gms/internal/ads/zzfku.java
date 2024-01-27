package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfku {
    private static final zzfku zza = new zzfku();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfku() {
    }

    public static zzfku zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfkg zzfkg) {
        this.zzb.add(zzfkg);
    }

    public final void zze(zzfkg zzfkg) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfkg);
        this.zzc.remove(zzfkg);
        if (zzg && !zzg()) {
            zzflb.zzb().zzg();
        }
    }

    public final void zzf(zzfkg zzfkg) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfkg);
        if (!zzg) {
            zzflb.zzb().zzf();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
