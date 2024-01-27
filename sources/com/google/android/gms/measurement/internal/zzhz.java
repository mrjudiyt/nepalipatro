package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzhz implements Callable<byte[]> {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhj zzc;

    zzhz(zzhj zzhj, zzbg zzbg, String str) {
        this.zzc = zzhj;
        this.zza = zzbg;
        this.zzb = str;
    }

    public final /* synthetic */ Object call() {
        this.zzc.zza.zzr();
        return this.zzc.zza.zzm().zza(this.zza, this.zzb);
    }
}
