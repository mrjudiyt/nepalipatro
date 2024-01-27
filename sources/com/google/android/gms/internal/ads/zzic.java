package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzic implements zzlr, zzlt {
    private final Object zza = new Object();
    private final int zzb;
    private final zzkn zzc;
    private zzlu zzd;
    private int zze;
    private zzol zzf;
    private zzdy zzg;
    private int zzh;
    private zzvo zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzls zzp;

    public zzic(int i10) {
        this.zzb = i10;
        this.zzc = new zzkn();
        this.zzm = Long.MIN_VALUE;
    }

    private final void zzW(long j10, boolean z10) {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        zzy(j10, z10);
    }

    /* access modifiers changed from: protected */
    public void zzA() {
    }

    /* access modifiers changed from: protected */
    public void zzB() {
    }

    /* access modifiers changed from: protected */
    public void zzC() {
    }

    /* access modifiers changed from: protected */
    public void zzD(zzam[] zzamArr, long j10, long j11) {
        throw null;
    }

    public final void zzE() {
        zzdx.zzf(this.zzh == 0);
        zzz();
    }

    public final void zzF(zzam[] zzamArr, zzvo zzvo, long j10, long j11) {
        zzdx.zzf(!this.zzn);
        this.zzi = zzvo;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzamArr;
        this.zzk = j11;
        zzD(zzamArr, j10, j11);
    }

    public final void zzG() {
        zzdx.zzf(this.zzh == 0);
        zzkn zzkn = this.zzc;
        zzkn.zzb = null;
        zzkn.zza = null;
        zzA();
    }

    public final void zzH(long j10) {
        zzW(j10, false);
    }

    public final void zzI() {
        this.zzn = true;
    }

    public final void zzJ(zzls zzls) {
        synchronized (this.zza) {
            this.zzp = zzls;
        }
    }

    public /* synthetic */ void zzK(float f10, float f11) {
    }

    public final void zzL() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdx.zzf(z10);
        this.zzh = 2;
        zzB();
    }

    public final void zzM() {
        zzdx.zzf(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    public final boolean zzN() {
        return this.zzm == Long.MIN_VALUE;
    }

    public final boolean zzO() {
        return this.zzn;
    }

    /* access modifiers changed from: protected */
    public final boolean zzP() {
        if (zzN()) {
            return this.zzn;
        }
        zzvo zzvo = this.zzi;
        Objects.requireNonNull(zzvo);
        return zzvo.zze();
    }

    /* access modifiers changed from: protected */
    public final zzam[] zzQ() {
        zzam[] zzamArr = this.zzj;
        Objects.requireNonNull(zzamArr);
        return zzamArr;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzbc() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final int zzbd(zzkn zzkn, zzht zzht, int i10) {
        zzvo zzvo = this.zzi;
        Objects.requireNonNull(zzvo);
        int zza2 = zzvo.zza(zzkn, zzht, i10);
        if (zza2 == -4) {
            if (zzht.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j10 = zzht.zze + this.zzk;
            zzht.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
        } else if (zza2 == -5) {
            zzam zzam = zzkn.zza;
            Objects.requireNonNull(zzam);
            long j11 = zzam.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzak zzb2 = zzam.zzb();
                zzb2.zzY(j11 + this.zzk);
                zzkn.zza = zzb2.zzac();
                return -5;
            }
        }
        return zza2;
    }

    public final long zzbe() {
        return this.zzm;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j10) {
        zzvo zzvo = this.zzi;
        Objects.requireNonNull(zzvo);
        return zzvo.zzb(j10 - this.zzk);
    }

    public int zze() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzf() {
        return this.zzl;
    }

    /* access modifiers changed from: protected */
    public final zzdy zzh() {
        zzdy zzdy = this.zzg;
        Objects.requireNonNull(zzdy);
        return zzdy;
    }

    /* access modifiers changed from: protected */
    public final zzil zzi(Throwable th, zzam zzam, boolean z10, int i10) {
        int i11;
        if (zzam != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzV = zzV(zzam) & 7;
                this.zzo = false;
                i11 = zzV;
            } catch (zzil unused) {
                this.zzo = false;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return zzil.zzb(th, zzR(), this.zze, zzam, i11, z10, i10);
        }
        i11 = 4;
        return zzil.zzb(th, zzR(), this.zze, zzam, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final zzkn zzj() {
        zzkn zzkn = this.zzc;
        zzkn.zzb = null;
        zzkn.zza = null;
        return zzkn;
    }

    public zzkt zzk() {
        return null;
    }

    public final zzlt zzl() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzlu zzm() {
        zzlu zzlu = this.zzd;
        Objects.requireNonNull(zzlu);
        return zzlu;
    }

    /* access modifiers changed from: protected */
    public final zzol zzn() {
        zzol zzol = this.zzf;
        Objects.requireNonNull(zzol);
        return zzol;
    }

    public final zzvo zzo() {
        return this.zzi;
    }

    public final void zzp() {
        synchronized (this.zza) {
            this.zzp = null;
        }
    }

    public final void zzq() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdx.zzf(z10);
        zzkn zzkn = this.zzc;
        zzkn.zzb = null;
        zzkn.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    public final void zzr(zzlu zzlu, zzam[] zzamArr, zzvo zzvo, long j10, boolean z10, boolean z11, long j11, long j12) {
        boolean z12 = z10;
        zzdx.zzf(this.zzh == 0);
        this.zzd = zzlu;
        this.zzh = 1;
        zzx(z10, z11);
        zzF(zzamArr, zzvo, j11, j12);
        zzW(j11, z10);
    }

    public /* synthetic */ void zzs() {
    }

    public void zzt(int i10, Object obj) {
    }

    public final void zzu(int i10, zzol zzol, zzdy zzdy) {
        this.zze = i10;
        this.zzf = zzol;
        this.zzg = zzdy;
    }

    public final void zzv() {
        zzvo zzvo = this.zzi;
        Objects.requireNonNull(zzvo);
        zzvo.zzd();
    }

    /* access modifiers changed from: protected */
    public void zzw() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzx(boolean z10, boolean z11) {
    }

    /* access modifiers changed from: protected */
    public void zzy(long j10, boolean z10) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzz() {
    }
}
