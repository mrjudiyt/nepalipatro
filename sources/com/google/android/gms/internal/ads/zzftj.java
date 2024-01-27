package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzftj {
    /* access modifiers changed from: private */
    public final zzfsh zza;
    private final zzfti zzb;

    private zzftj(zzfti zzfti) {
        zzfsg zzfsg = zzfsg.zza;
        this.zzb = zzfti;
        this.zza = zzfsg;
    }

    public static zzftj zzb(int i10) {
        return new zzftj(new zzftf(4000));
    }

    public static zzftj zzc(zzfsh zzfsh) {
        return new zzftj(new zzftd(zzfsh));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzftg(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
