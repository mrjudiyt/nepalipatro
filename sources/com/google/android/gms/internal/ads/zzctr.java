package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzctr implements zzo {
    private final zzcys zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzctr(zzcys zzcys) {
        this.zza = zzcys;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    public final void zzbL() {
    }

    public final void zzbo() {
    }

    public final void zzbu() {
        zzh();
    }

    public final void zzbv() {
        this.zza.zzc();
    }

    public final void zzbx() {
    }

    public final void zzby(int i10) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
