package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflu {
    private final zzfkx zza;
    private final ArrayList zzb;

    public zzflu(zzfkx zzfkx, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfkx;
        arrayList.add(str);
    }

    public final zzfkx zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
