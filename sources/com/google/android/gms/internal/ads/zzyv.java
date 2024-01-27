package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzyv {
    private final Context zza;
    private final zzdi zzb;
    private final zzaaf zzc;
    private zzyu zzd;
    private List zze;
    private zzzj zzf;
    private boolean zzg;

    public zzyv(Context context, zzdi zzdi, zzaaf zzaaf) {
        this.zza = context;
        this.zzb = zzdi;
        this.zzc = zzaaf;
    }

    public final zzaah zza() {
        zzyu zzyu = this.zzd;
        zzdx.zzb(zzyu);
        return zzyu;
    }

    public final void zzb() {
        zzdx.zzb(this.zzd);
        throw null;
    }

    public final void zzc(zzam zzam) {
        boolean z10 = false;
        if (!this.zzg && this.zzd == null) {
            z10 = true;
        }
        zzdx.zzf(z10);
        zzdx.zzb(this.zze);
        try {
            zzyu zzyu = new zzyu(this.zza, this.zzb, this.zzc, zzam);
            this.zzd = zzyu;
            zzzj zzzj = this.zzf;
            if (zzzj != null) {
                zzyu.zze(zzzj);
            }
        } catch (zzdh e10) {
            throw new zzaag(e10, zzam);
        }
    }

    public final void zzd() {
        if (!this.zzg) {
            if (this.zzd == null) {
                this.zzg = true;
                return;
            }
            throw null;
        }
    }

    public final void zze(Surface surface, zzfc zzfc) {
        zzyu zzyu = this.zzd;
        zzdx.zzb(zzyu);
        zzyu.zzc(surface, zzfc);
    }

    public final void zzf(long j10) {
        zzdx.zzb(this.zzd);
    }

    public final void zzg(List list) {
        this.zze = list;
        if (zzi()) {
            zzyu zzyu = this.zzd;
            zzdx.zzb(zzyu);
            zzyu.zzd(list);
        }
    }

    public final void zzh(zzzj zzzj) {
        this.zzf = zzzj;
        if (zzi()) {
            zzyu zzyu = this.zzd;
            zzdx.zzb(zzyu);
            zzyu.zze(zzzj);
        }
    }

    public final boolean zzi() {
        return this.zzd != null;
    }
}
