package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcez implements zzko {
    private final zzxz zzb = new zzxz(true, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    zzcez() {
    }

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        zzj(false);
    }

    public final void zzc() {
        zzj(true);
    }

    public final void zzd() {
        zzj(true);
    }

    public final /* synthetic */ void zze(zzcv zzcv, zztw zztw, zzlr[] zzlrArr, zzvx zzvx, zzxk[] zzxkArr) {
        int i10 = 0;
        this.zzg = 0;
        while (true) {
            int length = zzlrArr.length;
            if (i10 < 2) {
                if (zzxkArr[i10] != null) {
                    this.zzg += zzlrArr[i10].zzb() != 1 ? 131072000 : 13107200;
                }
                i10++;
            } else {
                this.zzb.zzf(this.zzg);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j10, long j11, float f10) {
        boolean z10 = true;
        char c10 = j11 > this.zzd ? 0 : j11 < this.zzc ? (char) 2 : 1;
        int zza = this.zzb.zza();
        int i10 = this.zzg;
        if (c10 != 2 && (c10 != 1 || !this.zzh || zza >= i10)) {
            z10 = false;
        }
        this.zzh = z10;
        return z10;
    }

    public final /* synthetic */ boolean zzh(zzcv zzcv, zztw zztw, long j10, float f10, boolean z10, long j11) {
        long j12 = z10 ? this.zzf : this.zze;
        return j12 <= 0 || j10 >= j12;
    }

    public final zzxz zzi() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(boolean z10) {
        this.zzg = 0;
        this.zzh = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i10) {
        this.zze = ((long) i10) * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzf = ((long) i10) * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = ((long) i10) * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzc = ((long) i10) * 1000;
    }
}
