package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzmd {
    protected long zza;
    final /* synthetic */ zzlx zzb;
    private long zzc;
    private final zzaw zzd;

    public zzmd(zzlx zzlx) {
        this.zzb = zzlx;
        this.zzd = new zzmg(this, zzlx.zzu);
        long elapsedRealtime = zzlx.zzb().elapsedRealtime();
        this.zzc = elapsedRealtime;
        this.zza = elapsedRealtime;
    }

    /* access modifiers changed from: package-private */
    public final long zza(long j10) {
        long j11 = j10 - this.zza;
        this.zza = j10;
        return j11;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(long j10) {
        this.zzd.zza();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(long j10) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j10;
        this.zza = j10;
    }

    static /* synthetic */ void zza(zzmd zzmd) {
        zzmd.zzb.zzt();
        zzmd.zza(false, false, zzmd.zzb.zzb().elapsedRealtime());
        zzmd.zzb.zzc().zza(zzmd.zzb.zzb().elapsedRealtime());
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzd.zza();
        this.zzc = 0;
        this.zza = 0;
    }

    public final boolean zza(boolean z10, boolean z11, long j10) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (!zzoh.zza() || !this.zzb.zze().zza(zzbi.zzbn) || this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long j11 = j10 - this.zzc;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = zza(j10);
            }
            this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            zznd.zza(this.zzb.zzn().zza(!this.zzb.zze().zzu()), bundle, true);
            if (!z11) {
                this.zzb.zzm().zzc("auto", "_e", bundle);
            }
            this.zzc = j10;
            this.zzd.zza();
            this.zzd.zza(3600000);
            return true;
        }
        this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }
}
