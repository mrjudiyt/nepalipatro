package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdnd {
    private final Executor zza;
    private final zzcqb zzb;
    private final zzdex zzc;

    zzdnd(Executor executor, zzcqb zzcqb, zzdex zzdex) {
        this.zza = executor;
        this.zzc = zzdex;
        this.zzb = zzcqb;
    }

    public final void zza(zzcgb zzcgb) {
        if (zzcgb != null) {
            this.zzc.zza(zzcgb.zzF());
            this.zzc.zzo(new zzdmz(zzcgb), this.zza);
            this.zzc.zzo(new zzdna(zzcgb), this.zza);
            this.zzc.zzo(this.zzb, this.zza);
            this.zzb.zzf(zzcgb);
            zzcgb.zzad("/trackActiveViewUnit", new zzdnb(this));
            zzcgb.zzad("/untrackActiveViewUnit", new zzdnc(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcgb zzcgb, Map map) {
        this.zzb.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcgb zzcgb, Map map) {
        this.zzb.zza();
    }
}
