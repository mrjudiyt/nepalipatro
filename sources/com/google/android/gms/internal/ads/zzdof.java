package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdof implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final zzcgn zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public final zzdso zzd;
    /* access modifiers changed from: private */
    public final zzfib zze;
    /* access modifiers changed from: private */
    public final zzedo zzf;
    /* access modifiers changed from: private */
    public final Executor zzg;
    /* access modifiers changed from: private */
    public final zzaro zzh;
    /* access modifiers changed from: private */
    public final zzcaz zzi;
    /* access modifiers changed from: private */
    public final zzfjx zzj;
    /* access modifiers changed from: private */
    public final zzedz zzk;

    public zzdof(Context context, Executor executor, zzaro zzaro, zzcaz zzcaz, zza zza2, zzcgn zzcgn, zzedo zzedo, zzfjx zzfjx, zzdso zzdso, zzfib zzfib, zzedz zzedz) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaro;
        this.zzi = zzcaz;
        this.zza = zza2;
        this.zzb = zzcgn;
        this.zzf = zzedo;
        this.zzj = zzfjx;
        this.zzd = zzdso;
        this.zze = zzfib;
        this.zzk = zzedz;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        zzdoi zzdoi = new zzdoi(this);
        zzdoi.zzh();
        return zzdoi;
    }
}
