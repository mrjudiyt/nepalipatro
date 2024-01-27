package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcjg extends zzeuu {
    private final zzhbp zzA;
    private final zzhbp zzB;
    private final zzeww zza;
    private final zzcjs zzb;
    private final zzcjg zzc = this;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;
    private final zzhbp zzl;
    private final zzhbp zzm;
    private final zzhbp zzn;
    private final zzhbp zzo;
    private final zzhbp zzp;
    private final zzhbp zzq;
    private final zzhbp zzr;
    private final zzhbp zzs;
    private final zzhbp zzt;
    private final zzhbp zzu;
    private final zzhbp zzv;
    private final zzhbp zzw;
    private final zzhbp zzx;
    private final zzhbp zzy;
    private final zzhbp zzz;

    /* synthetic */ zzcjg(zzcjs zzcjs, zzeww zzeww, zzcjf zzcjf) {
        zzeww zzeww2 = zzeww;
        this.zzb = zzcjs;
        this.zza = zzeww2;
        this.zzd = zzhbb.zzc(new zzfjf(zzcjs.zzG));
        zzewy zzewy = new zzewy(zzeww2);
        this.zze = zzewy;
        zzewz zzewz = new zzewz(zzeww2);
        this.zzf = zzewz;
        zzexb zzexb = new zzexb(zzeww2);
        this.zzg = zzexb;
        this.zzh = new zzeut(zzcnd.zza, zzcjs.zzg, zzcjs.zzm, zzfgm.zza(), zzewy, zzewz, zzexb);
        zzewx zzewx = new zzewx(zzeww2);
        this.zzi = zzewx;
        this.zzj = new zzevp(zzcir.zza, zzcjs.zzg, zzewx, zzfgm.zza());
        this.zzk = new zzewa(zzcnd.zza, zzewy, zzcjs.zzg, zzcjs.zzah, zzcjs.zzm, zzfgm.zza(), zzewx);
        this.zzl = new zzewe(zzcmx.zza, zzfgm.zza(), zzcjs.zzg);
        this.zzm = new zzewl(zzcmz.zza, zzfgm.zza(), zzewx);
        this.zzn = new zzewv(zzcnb.zza, zzcjs.zzm, zzcjs.zzg);
        this.zzo = new zzexq(zzfgm.zza());
        zzexa zzexa = new zzexa(zzeww2);
        this.zzp = zzexa;
        zzewx zzewx2 = zzewx;
        this.zzq = new zzexm(zzcjs.zzah, zzexa, zzexb, zzcnf.zza, zzfgm.zza(), zzewx2, zzcjs.zzm);
        this.zzr = new zzevu(zzewx2, zzcmv.zza, zzcjs.zzah, zzcjs.zzm, zzfgm.zza());
        zzexc zzexc = new zzexc(zzeww2);
        this.zzs = zzexc;
        zzhbp zzc2 = zzhbb.zzc(zzdrn.zza());
        this.zzt = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrl.zza());
        this.zzu = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrp.zza());
        this.zzv = zzc4;
        zzhbp zzc5 = zzhbb.zzc(zzdrr.zza());
        this.zzw = zzc5;
        zzhbf zzc6 = zzhbg.zzc(4);
        zzc6.zzb(zzfhl.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfhl.BUILD_URL, zzc3);
        zzc6.zzb(zzfhl.HTTP, zzc4);
        zzc6.zzb(zzfhl.PRE_PROCESS, zzc5);
        zzhbg zzc7 = zzc6.zzc();
        this.zzx = zzc7;
        zzhbp zzc8 = zzhbb.zzc(new zzdrs(zzexc, zzcjs.zzg, zzfgm.zza(), zzc7));
        this.zzy = zzc8;
        zzhbm zza2 = zzhbn.zza(0, 1);
        zza2.zza(zzc8);
        zzhbn zzc9 = zza2.zzc();
        this.zzz = zzc9;
        zzfhu zzfhu = new zzfhu(zzc9);
        this.zzA = zzfhu;
        this.zzB = zzhbb.zzc(new zzfht(zzfgm.zza(), zzcjs.zzm, zzfhu));
    }

    private final zzeux zze() {
        zzbzt zzbzt = new zzbzt();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        zzeww zzeww = this.zza;
        return new zzeux(zzbzt, zzgad, zzeww.zzd(), zzeww.zzb(), zzeww.zza());
    }

    private final zzewn zzf() {
        zzbbt zzbbt = new zzbbt();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        List zzf2 = this.zza.zzf();
        zzhbk.zzb(zzf2);
        return new zzewn(zzbbt, zzgad, zzf2);
    }

    public final zzetz zza() {
        Context zza2 = this.zzb.zza.zza();
        Context context = zza2;
        zzhbk.zzb(zza2);
        zzbzq zzbzq = r1;
        zzbzq zzbzq2 = new zzbzq();
        zzbzr zzbzr = r1;
        zzbzr zzbzr2 = new zzbzr();
        Object zzb2 = this.zzb.zzaK.zzb();
        zzhbp zzhbp = this.zzr;
        zzhbp zzhbp2 = this.zzq;
        zzhbp zzhbp3 = this.zzo;
        zzhbp zzhbp4 = this.zzn;
        zzhbp zzhbp5 = this.zzm;
        zzhbp zzhbp6 = this.zzl;
        zzhbp zzhbp7 = this.zzk;
        zzhbp zzhbp8 = this.zzj;
        zzhbp zzhbp9 = this.zzh;
        zzeux zze2 = zze();
        zzewn zzf2 = zzf();
        zzhaw zza3 = zzhbb.zza(zzhbp9);
        zzhaw zza4 = zzhbb.zza(zzhbp8);
        zzhaw zza5 = zzhbb.zza(zzhbp7);
        zzhaw zza6 = zzhbb.zza(zzhbp6);
        zzhaw zza7 = zzhbb.zza(zzhbp5);
        zzhaw zza8 = zzhbb.zza(zzhbp4);
        zzhaw zza9 = zzhbb.zza(zzhbp3);
        zzhaw zza10 = zzhbb.zza(zzhbp2);
        zzhaw zza11 = zzhbb.zza(zzhbp);
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return zzexh.zza(context, zzbzq, zzbzr, zzb2, zze2, zzf2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zza11, zzgad, (zzfje) this.zzd.zzb(), (zzdso) this.zzb.zzZ.zzb());
    }

    public final zzetz zzb() {
        Context zza2 = this.zzb.zza.zza();
        zzhbk.zzb(zza2);
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        zzbzq zzbzq = new zzbzq();
        zzhbk.zzb(zzgad);
        String zzc2 = this.zza.zzc();
        zzhbk.zzb(zzc2);
        zzetw zza3 = zzexf.zza(new zzewj(zzbzq, zzgad, zzc2), zzery.zza(), (ScheduledExecutorService) this.zzb.zzm.zzb(), -1);
        Context zza4 = this.zzb.zza.zza();
        zzhbk.zzb(zza4);
        zzetw zzb2 = zzexf.zzb(new zzewt(new zzbsz(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zza4), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzbzt zzbzt = new zzbzt();
        Context zza5 = this.zzb.zza.zza();
        zzhbk.zzb(zza5);
        zzhbk.zzb(zzgad);
        zzeww zzeww = this.zza;
        zzetw zza6 = zzexg.zza(zzeut.zza(zzbzt, zza5, (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad, zzeww.zza(), zzewz.zzc(zzeww), zzexb.zzc(zzeww)), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzhbk.zzb(zzgad);
        zzetw zzc3 = zzexf.zzc(new zzexo(zzgad), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzexd zzexd = zzexd.zza;
        Context zza7 = this.zzb.zza.zza();
        zzhbk.zzb(zza7);
        String zzc4 = this.zza.zzc();
        zzhbk.zzb(zzc4);
        zzhbk.zzb(zzgad);
        zzevn zzevn = new zzevn((zzbvi) null, zza7, zzc4, zzgad);
        zzetw[] zzetwArr = new zzetw[6];
        zzaxk zzaxk = new zzaxk();
        zzhbk.zzb(zzgad);
        Context zza8 = this.zzb.zza.zza();
        zzhbk.zzb(zza8);
        zzetwArr[0] = new zzewc(zzaxk, zzgad, zza8);
        zzetwArr[1] = zzf();
        zzetwArr[2] = zze();
        zzbzt zzbzt2 = new zzbzt();
        zzeww zzeww2 = this.zza;
        zzcjs zzcjs = this.zzb;
        int zza9 = zzeww2.zza();
        Context zza10 = zzcjs.zza.zza();
        zzhbk.zzb(zza10);
        zzhbk.zzb(zzgad);
        String zzc5 = this.zza.zzc();
        zzhbk.zzb(zzc5);
        zzetw[] zzetwArr2 = zzetwArr;
        zzevn zzevn2 = zzevn;
        zzetwArr2[3] = new zzevy(zzbzt2, zza9, zza10, (zzcac) this.zzb.zzah.zzb(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad, zzc5);
        zzetwArr2[4] = (zzetw) this.zzb.zzaK.zzb();
        String zzc6 = this.zza.zzc();
        zzhbk.zzb(zzc6);
        zzhbk.zzb(zzgad);
        zzetwArr2[5] = zzevu.zza(zzc6, new zzawy(), (zzcac) this.zzb.zzah.zzb(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad);
        return new zzetz(zza2, zzgad, zzfvx.zzp(zza3, zzb2, zza6, zzc3, zzexd, zzevn2, zzetwArr2), (zzfje) this.zzd.zzb(), (zzdso) this.zzb.zzZ.zzb());
    }

    public final zzfhr zzc() {
        return (zzfhr) this.zzB.zzb();
    }

    public final zzfje zzd() {
        return (zzfje) this.zzd.zzb();
    }
}
