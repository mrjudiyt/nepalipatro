package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaac {
    private final Handler zza;
    private final zzaad zzb;

    public zzaac(Handler handler, zzaad zzaad) {
        this.zza = zzaad == null ? null : handler;
        this.zzb = zzaad;
    }

    public final void zza(String str, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzs(this, str, j10, j11));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaab(this, str));
        }
    }

    public final void zzc(zzid zzid) {
        zzid.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzaaa(this, zzid));
        }
    }

    public final void zzd(int i10, long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzu(this, i10, j10));
        }
    }

    public final void zze(zzid zzid) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzy(this, zzid));
        }
    }

    public final void zzf(zzam zzam, zzie zzie) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzz(this, zzam, zzie));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        int i10 = zzfk.zza;
        this.zzb.zzo(str, j10, j11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        int i10 = zzfk.zza;
        this.zzb.zzp(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzid zzid) {
        zzid.zza();
        int i10 = zzfk.zza;
        this.zzb.zzq(zzid);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, long j10) {
        int i11 = zzfk.zza;
        this.zzb.zzk(i10, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzid zzid) {
        int i10 = zzfk.zza;
        this.zzb.zzr(zzid);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzam zzam, zzie zzie) {
        int i10 = zzfk.zza;
        this.zzb.zzt(zzam, zzie);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j10) {
        int i10 = zzfk.zza;
        this.zzb.zzl(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j10, int i10) {
        int i11 = zzfk.zza;
        this.zzb.zzs(j10, i10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        int i10 = zzfk.zza;
        this.zzb.zzn(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzdm zzdm) {
        int i10 = zzfk.zza;
        this.zzb.zzu(zzdm);
    }

    public final void zzq(Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzv(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j10, int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzw(this, j10, i10));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzx(this, exc));
        }
    }

    public final void zzt(zzdm zzdm) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzzt(this, zzdm));
        }
    }
}
