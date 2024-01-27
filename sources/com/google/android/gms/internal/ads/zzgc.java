package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzgc implements zzgi {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgn zzd;

    protected zzgc(boolean z10) {
        this.zza = z10;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzhk zzhk) {
        Objects.requireNonNull(zzhk);
        if (!this.zzb.contains(zzhk)) {
            this.zzb.add(zzhk);
            this.zzc++;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzgn zzgn = this.zzd;
        int i11 = zzfk.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzhk) this.zzb.get(i12)).zza(this, zzgn, this.zza, i10);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzgn zzgn = this.zzd;
        int i10 = zzfk.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhk) this.zzb.get(i11)).zzb(this, zzgn, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzgn zzgn) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhk) this.zzb.get(i10)).zzc(this, zzgn, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzgn zzgn) {
        this.zzd = zzgn;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhk) this.zzb.get(i10)).zzd(this, zzgn, this.zza);
        }
    }
}
