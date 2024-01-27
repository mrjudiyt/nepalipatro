package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzpb {
    private final Handler zza;
    private final zzpc zzb;

    public zzpb(Handler handler, zzpc zzpc) {
        this.zza = zzpc == null ? null : handler;
        this.zzb = zzpc;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzot(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzou(this, exc));
        }
    }

    public final void zzc(String str, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzox(this, str, j10, j11));
        }
    }

    public final void zzd(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzoy(this, str));
        }
    }

    public final void zze(zzid zzid) {
        zzid.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzoz(this, zzid));
        }
    }

    public final void zzf(zzid zzid) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzor(this, zzid));
        }
    }

    public final void zzg(zzam zzam, zzie zzie) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzov(this, zzam, zzie));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        int i10 = zzfk.zza;
        this.zzb.zzb(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        int i10 = zzfk.zza;
        this.zzb.zzi(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j10, long j11) {
        int i10 = zzfk.zza;
        this.zzb.zzc(str, j10, j11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        int i10 = zzfk.zza;
        this.zzb.zzd(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzid zzid) {
        zzid.zza();
        int i10 = zzfk.zza;
        this.zzb.zze(zzid);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzid zzid) {
        int i10 = zzfk.zza;
        this.zzb.zzf(zzid);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzam zzam, zzie zzie) {
        int i10 = zzfk.zza;
        this.zzb.zzg(zzam, zzie);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j10) {
        int i10 = zzfk.zza;
        this.zzb.zzh(j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z10) {
        int i10 = zzfk.zza;
        this.zzb.zzm(z10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i10, long j10, long j11) {
        int i11 = zzfk.zza;
        this.zzb.zzj(i10, j10, j11);
    }

    public final void zzr(long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzpa(this, j10));
        }
    }

    public final void zzs(boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzow(this, z10));
        }
    }

    public final void zzt(int i10, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzos(this, i10, j10, j11));
        }
    }
}
