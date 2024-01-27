package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzhn implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzhj zze;

    zzhn(zzhj zzhj, String str, String str2, String str3, long j10) {
        this.zze = zzhj;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
    }

    public final void run() {
        String str = this.zza;
        if (str == null) {
            this.zze.zza.zza(this.zzb, (zzki) null);
            return;
        }
        this.zze.zza.zza(this.zzb, new zzki(this.zzc, str, this.zzd));
    }
}
