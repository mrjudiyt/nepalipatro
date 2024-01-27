package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zztd implements zzug, zzqy {
    final /* synthetic */ zztf zza;
    private final Object zzb;
    private zzuf zzc;
    private zzqx zzd;

    public zztd(zztf zztf, Object obj) {
        this.zza = zztf;
        this.zzc = zztf.zze((zztw) null);
        this.zzd = zztf.zzc((zztw) null);
        this.zzb = obj;
    }

    private final zzts zzf(zzts zzts) {
        zztf zztf = this.zza;
        Object obj = this.zzb;
        long j10 = zzts.zzc;
        zztf.zzx(obj, j10);
        zztf zztf2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zzts.zzd;
        zztf2.zzx(obj2, j11);
        return (j10 == zzts.zzc && j11 == zzts.zzd) ? zzts : new zzts(1, zzts.zza, zzts.zzb, 0, (Object) null, j10, j11);
    }

    private final boolean zzg(int i10, zztw zztw) {
        zztw zztw2;
        if (zztw != null) {
            zztw2 = this.zza.zzy(this.zzb, zztw);
            if (zztw2 == null) {
                return false;
            }
        } else {
            zztw2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzuf zzuf = this.zzc;
        int i11 = zzuf.zza;
        if (!zzfk.zzE(zzuf.zzb, zztw2)) {
            this.zzc = this.zza.zzf(0, zztw2);
        }
        zzqx zzqx = this.zzd;
        int i12 = zzqx.zza;
        if (zzfk.zzE(zzqx.zzb, zztw2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zztw2);
        return true;
    }

    public final void zzac(int i10, zztw zztw, zzts zzts) {
        if (zzg(0, zztw)) {
            this.zzc.zzc(zzf(zzts));
        }
    }

    public final void zzad(int i10, zztw zztw, zztn zztn, zzts zzts) {
        if (zzg(0, zztw)) {
            this.zzc.zzd(zztn, zzf(zzts));
        }
    }

    public final void zzae(int i10, zztw zztw, zztn zztn, zzts zzts) {
        if (zzg(0, zztw)) {
            this.zzc.zze(zztn, zzf(zzts));
        }
    }

    public final void zzaf(int i10, zztw zztw, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        if (zzg(0, zztw)) {
            this.zzc.zzf(zztn, zzf(zzts), iOException, z10);
        }
    }

    public final void zzag(int i10, zztw zztw, zztn zztn, zzts zzts) {
        if (zzg(0, zztw)) {
            this.zzc.zzg(zztn, zzf(zzts));
        }
    }
}
