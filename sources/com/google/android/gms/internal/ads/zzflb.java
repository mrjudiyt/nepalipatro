package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflb implements zzfkv {
    private static zzflb zza;
    private float zzb = 0.0f;
    private final zzfkr zzc;
    private final zzfkp zzd;
    private zzfkq zze;
    private zzfku zzf;

    public zzflb(zzfkr zzfkr, zzfkp zzfkp) {
        this.zzc = zzfkr;
        this.zzd = zzfkp;
    }

    public static zzflb zzb() {
        if (zza == null) {
            zza = new zzflb(new zzfkr(), new zzfkp());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(boolean z10) {
        if (z10) {
            zzfmc.zzd().zzi();
        } else {
            zzfmc.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzfkq(new Handler(), context, new zzfko(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzf == null) {
            this.zzf = zzfku.zza();
        }
        for (zzfkg zzg : this.zzf.zzb()) {
            zzg.zzg().zzi(f10);
        }
    }

    public final void zzf() {
        zzfkt.zza().zze(this);
        zzfkt.zza().zzf();
        zzfmc.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfmc.zzd().zzj();
        zzfkt.zza().zzg();
        this.zze.zzb();
    }
}
