package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzlf implements zzug, zzqy {
    final /* synthetic */ zzlj zza;
    private final zzlh zzb;

    public zzlf(zzlj zzlj, zzlh zzlh) {
        this.zza = zzlj;
        this.zzb = zzlh;
    }

    private final Pair zzf(int i10, zztw zztw) {
        zztw zztw2;
        zztw zztw3 = null;
        if (zztw != null) {
            zzlh zzlh = this.zzb;
            int i11 = 0;
            while (true) {
                if (i11 >= zzlh.zzc.size()) {
                    zztw2 = null;
                    break;
                } else if (((zztw) zzlh.zzc.get(i11)).zzd == zztw.zzd) {
                    zztw2 = zztw.zza(Pair.create(zzlh.zzb, zztw.zza));
                    break;
                } else {
                    i11++;
                }
            }
            if (zztw2 == null) {
                return null;
            }
            zztw3 = zztw2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zztw3);
    }

    public final void zzac(int i10, zztw zztw, zzts zzts) {
        Pair zzf = zzf(0, zztw);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzld(this, zzf, zzts));
        }
    }

    public final void zzad(int i10, zztw zztw, zztn zztn, zzts zzts) {
        Pair zzf = zzf(0, zztw);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzlb(this, zzf, zztn, zzts));
        }
    }

    public final void zzae(int i10, zztw zztw, zztn zztn, zzts zzts) {
        Pair zzf = zzf(0, zztw);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzle(this, zzf, zztn, zzts));
        }
    }

    public final void zzaf(int i10, zztw zztw, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        Pair zzf = zzf(0, zztw);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzla(this, zzf, zztn, zzts, iOException, z10));
        }
    }

    public final void zzag(int i10, zztw zztw, zztn zztn, zzts zzts) {
        Pair zzf = zzf(0, zztw);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzlc(this, zzf, zztn, zzts));
        }
    }
}
