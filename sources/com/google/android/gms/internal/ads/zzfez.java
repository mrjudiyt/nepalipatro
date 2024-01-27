package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfez {
    private final LinkedList zza = new LinkedList();
    private final int zzb;
    private final int zzc;
    private final zzffy zzd;

    public zzfez(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = new zzffy();
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && zzt.zzB().currentTimeMillis() - ((zzffj) this.zza.getFirst()).zzd >= ((long) this.zzc)) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzffj zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzffj zzffj = (zzffj) this.zza.remove();
        if (zzffj != null) {
            this.zzd.zzh();
        }
        return zzffj;
    }

    public final zzffx zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzffj zzffj) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzffj);
        return true;
    }
}
