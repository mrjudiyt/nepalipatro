package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class zzh {
    private final zzhf zza;
    private long zzaa;
    private long zzab;
    private long zzac;
    private long zzad;
    private long zzae;
    private long zzaf;
    private long zzag;
    private String zzah;
    private boolean zzai;
    private long zzaj;
    private long zzak;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List<String> zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private int zzy;
    private boolean zzz;

    zzh(zzhf zzhf, String str) {
        Preconditions.checkNotNull(zzhf);
        Preconditions.checkNotEmpty(str);
        this.zza = zzhf;
        this.zzb = str;
        zzhf.zzl().zzt();
    }

    public final int zza() {
        this.zza.zzl().zzt();
        return this.zzy;
    }

    public final String zzaa() {
        this.zza.zzl().zzt();
        return this.zzj;
    }

    public final String zzab() {
        this.zza.zzl().zzt();
        return this.zzf;
    }

    public final String zzac() {
        this.zza.zzl().zzt();
        return this.zzd;
    }

    public final String zzad() {
        this.zza.zzl().zzt();
        return this.zzah;
    }

    public final String zzae() {
        this.zza.zzl().zzt();
        return this.zze;
    }

    public final String zzaf() {
        this.zza.zzl().zzt();
        return this.zzu;
    }

    public final List<String> zzag() {
        this.zza.zzl().zzt();
        return this.zzt;
    }

    public final void zzah() {
        this.zza.zzl().zzt();
        this.zzai = false;
    }

    public final void zzai() {
        this.zza.zzl().zzt();
        long j10 = this.zzg + 1;
        if (j10 > 2147483647L) {
            this.zza.zzj().zzu().zza("Bundle index overflow. appId", zzfr.zza(this.zzb));
            j10 = 0;
        }
        this.zzai = true;
        this.zzg = j10;
    }

    public final boolean zzaj() {
        this.zza.zzl().zzt();
        return this.zzp;
    }

    public final boolean zzak() {
        this.zza.zzl().zzt();
        return this.zzo;
    }

    public final boolean zzal() {
        this.zza.zzl().zzt();
        return this.zzai;
    }

    public final boolean zzam() {
        this.zza.zzl().zzt();
        return this.zzv;
    }

    public final boolean zzan() {
        this.zza.zzl().zzt();
        return this.zzz;
    }

    public final long zzb() {
        this.zza.zzl().zzt();
        return 0;
    }

    public final long zzc() {
        this.zza.zzl().zzt();
        return this.zzk;
    }

    public final long zzd() {
        this.zza.zzl().zzt();
        return this.zzaa;
    }

    public final long zze() {
        this.zza.zzl().zzt();
        return this.zzaj;
    }

    public final long zzf() {
        this.zza.zzl().zzt();
        return this.zzae;
    }

    public final long zzg() {
        this.zza.zzl().zzt();
        return this.zzaf;
    }

    public final long zzh() {
        this.zza.zzl().zzt();
        return this.zzad;
    }

    public final long zzi() {
        this.zza.zzl().zzt();
        return this.zzac;
    }

    public final long zzj() {
        this.zza.zzl().zzt();
        return this.zzag;
    }

    public final long zzk() {
        this.zza.zzl().zzt();
        return this.zzab;
    }

    public final long zzl() {
        this.zza.zzl().zzt();
        return this.zzn;
    }

    public final long zzm() {
        this.zza.zzl().zzt();
        return this.zzs;
    }

    public final long zzn() {
        this.zza.zzl().zzt();
        return this.zzak;
    }

    public final long zzo() {
        this.zza.zzl().zzt();
        return this.zzm;
    }

    public final long zzp() {
        this.zza.zzl().zzt();
        return this.zzi;
    }

    public final long zzq() {
        this.zza.zzl().zzt();
        return this.zzg;
    }

    public final long zzr() {
        this.zza.zzl().zzt();
        return this.zzh;
    }

    public final long zzs() {
        this.zza.zzl().zzt();
        return this.zzx;
    }

    public final long zzt() {
        this.zza.zzl().zzt();
        return this.zzw;
    }

    public final Boolean zzu() {
        this.zza.zzl().zzt();
        return this.zzr;
    }

    public final String zzv() {
        this.zza.zzl().zzt();
        return this.zzq;
    }

    public final String zzw() {
        this.zza.zzl().zzt();
        String str = this.zzah;
        zzg((String) null);
        return str;
    }

    public final String zzx() {
        this.zza.zzl().zzt();
        return this.zzb;
    }

    public final String zzy() {
        this.zza.zzl().zzt();
        return this.zzc;
    }

    public final String zzz() {
        this.zza.zzl().zzt();
        return this.zzl;
    }

    public final void zzb(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    public final void zza(String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzai |= !zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    public final void zzc(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    public final void zzd(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    public final void zze(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaf != j10;
        this.zzaf = j10;
    }

    public final void zzf(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzad != j10;
        this.zzad = j10;
    }

    public final void zzg(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzac != j10;
        this.zzac = j10;
    }

    public final void zzh(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzag != j10;
        this.zzag = j10;
    }

    public final void zzi(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzab != j10;
        this.zzab = j10;
    }

    public final void zzj(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzn != j10;
        this.zzn = j10;
    }

    public final void zzk(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzs != j10;
        this.zzs = j10;
    }

    public final void zzl(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzak != j10;
        this.zzak = j10;
    }

    public final void zzm(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzm != j10;
        this.zzm = j10;
    }

    public final void zzn(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzi != j10;
        this.zzi = j10;
    }

    public final void zzo(long j10) {
        boolean z10 = true;
        Preconditions.checkArgument(j10 >= 0);
        this.zza.zzl().zzt();
        boolean z11 = this.zzai;
        if (this.zzg == j10) {
            z10 = false;
        }
        this.zzai = z10 | z11;
        this.zzg = j10;
    }

    public final void zzp(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzh != j10;
        this.zzh = j10;
    }

    public final void zzq(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzx != j10;
        this.zzx = j10;
    }

    public final void zzr(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzw != j10;
        this.zzw = j10;
    }

    public final void zzb(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaa != j10;
        this.zzaa = j10;
    }

    public final void zzc(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzaj != j10;
        this.zzaj = j10;
    }

    public final void zzd(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzae != j10;
        this.zzae = j10;
    }

    public final void zze(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    public final void zzf(String str) {
        this.zza.zzl().zzt();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzai |= !zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    public final void zzg(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzah, str);
        this.zzah = str;
    }

    public final void zzh(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    public final void zza(int i10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzy != i10;
        this.zzy = i10;
    }

    public final void zzb(boolean z10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzo != z10;
        this.zzo = z10;
    }

    public final void zzc(boolean z10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzv != z10;
        this.zzv = z10;
    }

    public final void zzd(boolean z10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzz != z10;
        this.zzz = z10;
    }

    public final void zza(boolean z10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzp != z10;
        this.zzp = z10;
    }

    public final void zza(long j10) {
        this.zza.zzl().zzt();
        this.zzai |= this.zzk != j10;
        this.zzk = j10;
    }

    public final void zza(Boolean bool) {
        this.zza.zzl().zzt();
        this.zzai |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zza(List<String> list) {
        this.zza.zzl().zzt();
        if (!zzg.zza(this.zzt, list)) {
            this.zzai = true;
            this.zzt = list != null ? new ArrayList(list) : null;
        }
    }
}
