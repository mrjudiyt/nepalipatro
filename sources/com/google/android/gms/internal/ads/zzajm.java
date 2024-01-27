package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzajm {
    private final zzacs zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzfz zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzajl zzi = new zzajl((zzajk) null);
    private final zzajl zzj = new zzajl((zzajk) null);
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;

    public zzajm(zzacs zzacs, boolean z10, boolean z11) {
        this.zza = zzacs;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzfz(bArr, 0, 0);
        this.zzk = false;
    }

    private final void zzg(int i10) {
        long j10 = this.zzm;
        if (j10 != -9223372036854775807L) {
            this.zza.zzt(j10, this.zzn ? 1 : 0, (int) (this.zzg - this.zzl), i10, (zzacr) null);
        }
    }

    public final void zza(long j10) {
        this.zzg = j10;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzfw zzfw) {
        this.zzc.append(zzfw.zza, zzfw);
    }

    public final void zzc(zzfx zzfx) {
        this.zzb.append(zzfx.zzd, zzfx);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j10, int i10, long j11) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
    }

    public final boolean zzf(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                zzg(i10 + ((int) (j10 - this.zzg)));
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z13 = this.zzn;
        int i11 = this.zzf;
        if (i11 == 5 || (z11 && i11 == 1)) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        this.zzn = z14;
        return z14;
    }
}
