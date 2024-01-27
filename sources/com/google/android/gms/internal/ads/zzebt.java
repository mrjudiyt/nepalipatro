package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebt implements zzdei {
    private boolean zza = false;
    private boolean zzb = false;
    private final String zzc;
    private final zzfib zzd;
    private final zzg zze;

    public zzebt(String str, zzfib zzfib) {
        this.zzc = str;
        this.zzd = zzfib;
        this.zze = zzt.zzo().zzh();
    }

    private final zzfia zzg(String str) {
        String str2;
        if (this.zze.zzQ()) {
            str2 = "";
        } else {
            str2 = this.zzc;
        }
        zzfia zzb2 = zzfia.zzb(str);
        zzb2.zza("tms", Long.toString(zzt.zzB().elapsedRealtime(), 10));
        zzb2.zza("tid", str2);
        return zzb2;
    }

    public final void zza(String str) {
        zzfia zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        this.zzd.zzb(zzg);
    }

    public final void zzb(String str, String str2) {
        zzfia zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        this.zzd.zzb(zzg);
    }

    public final void zzc(String str) {
        zzfia zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    public final void zzd(String str) {
        zzfia zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
