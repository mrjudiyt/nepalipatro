package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhbm {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhbm(int i10, int i11, zzhbl zzhbl) {
        this.zza = zzhaz.zzc(i10);
        this.zzb = zzhaz.zzc(i11);
    }

    public final zzhbm zza(zzhbp zzhbp) {
        this.zzb.add(zzhbp);
        return this;
    }

    public final zzhbm zzb(zzhbp zzhbp) {
        this.zza.add(zzhbp);
        return this;
    }

    public final zzhbn zzc() {
        return new zzhbn(this.zza, this.zzb, (zzhbl) null);
    }
}
