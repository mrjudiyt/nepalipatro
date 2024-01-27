package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzij implements zzkt {
    private final zzly zza;
    private final zzii zzb;
    private zzlr zzc;
    private zzkt zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzij(zzii zzii, zzdy zzdy) {
        this.zzb = zzii;
        this.zza = new zzly(zzdy);
    }

    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z10) {
        zzlr zzlr = this.zzc;
        if (zzlr == null || zzlr.zzT() || (!this.zzc.zzU() && (z10 || this.zzc.zzN()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkt zzkt = this.zzd;
            Objects.requireNonNull(zzkt);
            long zza2 = zzkt.zza();
            if (this.zze) {
                if (zza2 < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza2);
            zzcg zzc2 = zzkt.zzc();
            if (!zzc2.equals(this.zza.zzc())) {
                this.zza.zzg(zzc2);
                this.zzb.zza(zzc2);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkt zzkt2 = this.zzd;
        Objects.requireNonNull(zzkt2);
        return zzkt2.zza();
    }

    public final zzcg zzc() {
        zzkt zzkt = this.zzd;
        return zzkt != null ? zzkt.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlr zzlr) {
        if (zzlr == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlr zzlr) {
        zzkt zzkt;
        zzkt zzk = zzlr.zzk();
        if (zzk != null && zzk != (zzkt = this.zzd)) {
            if (zzkt == null) {
                this.zzd = zzk;
                this.zzc = zzlr;
                zzk.zzg(this.zza.zzc());
                return;
            }
            throw zzil.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    public final void zzg(zzcg zzcg) {
        zzkt zzkt = this.zzd;
        if (zzkt != null) {
            zzkt.zzg(zzcg);
            zzcg = this.zzd.zzc();
        }
        this.zza.zzg(zzcg);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
