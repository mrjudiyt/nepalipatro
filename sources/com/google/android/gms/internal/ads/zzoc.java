package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzoc implements zzmb {
    private final zzdy zza;
    private final zzcs zzb;
    private final zzcu zzc = new zzcu();
    private final zzob zzd;
    private final SparseArray zze;
    private zzeo zzf;
    private zzco zzg;
    private zzei zzh;
    private boolean zzi;

    public zzoc(zzdy zzdy) {
        Objects.requireNonNull(zzdy);
        this.zza = zzdy;
        this.zzf = new zzeo(zzfk.zzw(), zzdy, zznf.zza);
        zzcs zzcs = new zzcs();
        this.zzb = zzcs;
        this.zzd = new zzob(zzcs);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzT(zzoc zzoc) {
        zzmc zzR = zzoc.zzR();
        zzoc.zzW(zzR, 1028, new zzmg(zzR));
        zzoc.zzf.zze();
    }

    private final zzmc zzX(zztw zztw) {
        zzcv zzcv;
        Objects.requireNonNull(this.zzg);
        if (zztw == null) {
            zzcv = null;
        } else {
            zzcv = this.zzd.zza(zztw);
        }
        if (zztw == null || zzcv == null) {
            int zzd2 = this.zzg.zzd();
            zzcv zzn = this.zzg.zzn();
            if (zzd2 >= zzn.zzc()) {
                zzn = zzcv.zza;
            }
            return zzS(zzn, zzd2, (zztw) null);
        }
        return zzS(zzcv, zzcv.zzn(zztw.zza, this.zzb).zzd, zztw);
    }

    private final zzmc zzY(int i10, zztw zztw) {
        zzco zzco = this.zzg;
        Objects.requireNonNull(zzco);
        if (zztw == null) {
            zzcv zzn = zzco.zzn();
            if (i10 >= zzn.zzc()) {
                zzn = zzcv.zza;
            }
            return zzS(zzn, i10, (zztw) null);
        } else if (this.zzd.zza(zztw) != null) {
            return zzX(zztw);
        } else {
            return zzS(zzcv.zza, i10, zztw);
        }
    }

    private final zzmc zzZ() {
        return zzX(this.zzd.zzd());
    }

    private final zzmc zzaa() {
        return zzX(this.zzd.zze());
    }

    private final zzmc zzab(zzce zzce) {
        zztw zztw;
        if (!(zzce instanceof zzil) || (zztw = ((zzil) zzce).zzj) == null) {
            return zzR();
        }
        return zzX(zztw);
    }

    public final void zzA(zzam zzam, zzie zzie) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1009, new zznr(zzaa, zzam, zzie));
    }

    public final void zzB(long j10) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1010, new zzmw(zzaa, j10));
    }

    public final void zzC(Exception exc) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1014, new zzny(zzaa, exc));
    }

    public final void zzD(int i10, long j10, long j11) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1011, new zzms(zzaa, i10, j10, j11));
    }

    public final void zzE(int i10, long j10) {
        zzmc zzZ = zzZ();
        zzW(zzZ, 1018, new zznc(zzZ, i10, j10));
    }

    public final void zzF(Object obj, long j10) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 26, new zznv(zzaa, obj, j10));
    }

    public final void zzG(Exception exc) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1030, new zzmr(zzaa, exc));
    }

    public final void zzH(String str, long j10, long j11) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1016, new zznx(zzaa, str, j11, j10));
    }

    public final void zzI(String str) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1019, new zznb(zzaa, str));
    }

    public final void zzJ(zzid zzid) {
        zzmc zzZ = zzZ();
        zzW(zzZ, 1020, new zzno(zzZ, zzid));
    }

    public final void zzK(zzid zzid) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1015, new zznt(zzaa, zzid));
    }

    public final void zzL(long j10, int i10) {
        zzmc zzZ = zzZ();
        zzW(zzZ, 1021, new zzng(zzZ, j10, i10));
    }

    public final void zzM(zzam zzam, zzie zzie) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1017, new zznn(zzaa, zzam, zzie));
    }

    public final void zzN() {
        zzei zzei = this.zzh;
        zzdx.zzb(zzei);
        zzei.zzh(new zznu(this));
    }

    public final void zzO(zzme zzme) {
        this.zzf.zzf(zzme);
    }

    public final void zzP(zzco zzco, Looper looper) {
        boolean z10 = true;
        if (this.zzg != null && !this.zzd.zzb.isEmpty()) {
            z10 = false;
        }
        zzdx.zzf(z10);
        Objects.requireNonNull(zzco);
        this.zzg = zzco;
        this.zzh = this.zza.zzb(looper, (Handler.Callback) null);
        this.zzf = this.zzf.zza(looper, new zzmu(this, zzco));
    }

    public final void zzQ(List list, zztw zztw) {
        zzco zzco = this.zzg;
        Objects.requireNonNull(zzco);
        this.zzd.zzh(list, zztw, zzco);
    }

    /* access modifiers changed from: protected */
    public final zzmc zzR() {
        return zzX(this.zzd.zzb());
    }

    /* access modifiers changed from: protected */
    public final zzmc zzS(zzcv zzcv, int i10, zztw zztw) {
        zzcv zzcv2 = zzcv;
        int i11 = i10;
        boolean z10 = true;
        zztw zztw2 = true == zzcv.zzo() ? null : zztw;
        long zza2 = this.zza.zza();
        if (!zzcv2.equals(this.zzg.zzn()) || i11 != this.zzg.zzd()) {
            z10 = false;
        }
        long j10 = 0;
        if (zztw2 == null || !zztw2.zzb()) {
            if (z10) {
                j10 = this.zzg.zzj();
            } else if (!zzcv.zzo()) {
                long j11 = zzcv2.zze(i11, this.zzc, 0).zzn;
                j10 = zzfk.zzs(0);
            }
        } else if (z10 && this.zzg.zzb() == zztw2.zzb && this.zzg.zzc() == zztw2.zzc) {
            j10 = this.zzg.zzk();
        }
        return new zzmc(zza2, zzcv, i10, zztw2, j10, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzU(zzco zzco, zzme zzme, zzah zzah) {
        zzme.zzi(zzco, new zzmd(zzah, this.zze));
    }

    public final void zzV(int i10, long j10, long j11) {
        zzmc zzX = zzX(this.zzd.zzc());
        zzW(zzX, 1006, new zzmp(zzX, i10, j10, j11));
    }

    /* access modifiers changed from: protected */
    public final void zzW(zzmc zzmc, int i10, zzel zzel) {
        this.zze.put(i10, zzmc);
        zzeo zzeo = this.zzf;
        zzeo.zzd(i10, zzel);
        zzeo.zzc();
    }

    public final void zza(zzck zzck) {
        zzmc zzR = zzR();
        zzW(zzR, 13, new zzml(zzR, zzck));
    }

    public final void zzac(int i10, zztw zztw, zzts zzts) {
        zzmc zzY = zzY(i10, zztw);
        zzW(zzY, 1004, new zznh(zzY, zzts));
    }

    public final void zzad(int i10, zztw zztw, zztn zztn, zzts zzts) {
        zzmc zzY = zzY(i10, zztw);
        zzW(zzY, 1002, new zzni(zzY, zztn, zzts));
    }

    public final void zzae(int i10, zztw zztw, zztn zztn, zzts zzts) {
        zzmc zzY = zzY(i10, zztw);
        zzW(zzY, 1001, new zznm(zzY, zztn, zzts));
    }

    public final void zzaf(int i10, zztw zztw, zztn zztn, zzts zzts, IOException iOException, boolean z10) {
        zzmc zzY = zzY(i10, zztw);
        zzW(zzY, 1003, new zzmt(zzY, zztn, zzts, iOException, z10));
    }

    public final void zzag(int i10, zztw zztw, zztn zztn, zzts zzts) {
        zzmc zzY = zzY(i10, zztw);
        zzW(zzY, 1000, new zzmk(zzY, zztn, zzts));
    }

    public final void zzb(boolean z10) {
        zzmc zzR = zzR();
        zzW(zzR, 3, new zzmi(zzR, z10));
    }

    public final void zzc(boolean z10) {
        zzmc zzR = zzR();
        zzW(zzR, 7, new zzmx(zzR, z10));
    }

    public final void zzd(zzbp zzbp, int i10) {
        zzmc zzR = zzR();
        zzW(zzR, 1, new zzmn(zzR, zzbp, i10));
    }

    public final void zze(zzbv zzbv) {
        zzmc zzR = zzR();
        zzW(zzR, 14, new zzoa(zzR, zzbv));
    }

    public final void zzf(boolean z10, int i10) {
        zzmc zzR = zzR();
        zzW(zzR, 5, new zzne(zzR, z10, i10));
    }

    public final void zzg(zzcg zzcg) {
        zzmc zzR = zzR();
        zzW(zzR, 12, new zzmf(zzR, zzcg));
    }

    public final void zzh(int i10) {
        zzmc zzR = zzR();
        zzW(zzR, 4, new zznl(zzR, i10));
    }

    public final void zzi(int i10) {
        zzmc zzR = zzR();
        zzW(zzR, 6, new zzna(zzR, i10));
    }

    public final void zzj(zzce zzce) {
        zzmc zzab = zzab(zzce);
        zzW(zzab, 10, new zznj(zzab, zzce));
    }

    public final void zzk(zzce zzce) {
        zzmc zzab = zzab(zzce);
        zzW(zzab, 10, new zznd(zzab, zzce));
    }

    public final void zzl(boolean z10, int i10) {
        zzmc zzR = zzR();
        zzW(zzR, -1, new zzmv(zzR, z10, i10));
    }

    public final void zzm(zzcn zzcn, zzcn zzcn2, int i10) {
        if (i10 == 1) {
            this.zzi = false;
            i10 = 1;
        }
        zzob zzob = this.zzd;
        zzco zzco = this.zzg;
        Objects.requireNonNull(zzco);
        zzob.zzg(zzco);
        zzmc zzR = zzR();
        zzW(zzR, 11, new zzns(zzR, i10, zzcn, zzcn2));
    }

    public final void zzn(boolean z10) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 23, new zzmo(zzaa, z10));
    }

    public final void zzo(int i10, int i11) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 24, new zznz(zzaa, i10, i11));
    }

    public final void zzp(zzcv zzcv, int i10) {
        zzco zzco = this.zzg;
        Objects.requireNonNull(zzco);
        this.zzd.zzi(zzco);
        zzmc zzR = zzR();
        zzW(zzR, 0, new zzmm(zzR, i10));
    }

    public final void zzq(zzdg zzdg) {
        zzmc zzR = zzR();
        zzW(zzR, 2, new zzmy(zzR, zzdg));
    }

    public final void zzr(zzdm zzdm) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 25, new zznp(zzaa, zzdm));
    }

    public final void zzs(float f10) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 22, new zzmq(zzaa, f10));
    }

    public final void zzt(zzme zzme) {
        this.zzf.zzb(zzme);
    }

    public final void zzu() {
        if (!this.zzi) {
            zzmc zzR = zzR();
            this.zzi = true;
            zzW(zzR, -1, new zznq(zzR));
        }
    }

    public final void zzv(Exception exc) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1029, new zznw(zzaa, exc));
    }

    public final void zzw(String str, long j10, long j11) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1008, new zzmz(zzaa, str, j11, j10));
    }

    public final void zzx(String str) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1012, new zzmj(zzaa, str));
    }

    public final void zzy(zzid zzid) {
        zzmc zzZ = zzZ();
        zzW(zzZ, 1013, new zznk(zzZ, zzid));
    }

    public final void zzz(zzid zzid) {
        zzmc zzaa = zzaa();
        zzW(zzaa, 1007, new zzmh(zzaa, zzid));
    }
}
