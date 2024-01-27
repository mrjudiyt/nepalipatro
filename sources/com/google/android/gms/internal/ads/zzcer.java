package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcer extends zzcen {
    public zzcer(zzcdc zzcdc) {
        super(zzcdc);
    }

    public final void zzf() {
    }

    public final boolean zzt(String str) {
        String zze = zzcam.zze(str);
        zzcdc zzcdc = (zzcdc) this.zzc.get();
        if (!(zzcdc == null || zze == null)) {
            zzcdc.zzt(zze, this);
        }
        zzcat.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
