package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcjo extends zzevl {
    private final zzeuz zza;
    private final zzcjs zzb;
    private final zzcjo zzc = this;
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

    /* synthetic */ zzcjo(zzcjs zzcjs, zzeuz zzeuz, zzcjn zzcjn) {
        this.zzb = zzcjs;
        this.zza = zzeuz;
        this.zzd = zzhbb.zzc(new zzfjf(zzcjs.zzG));
        zzevh zzevh = new zzevh(zzeuz);
        this.zze = zzevh;
        zzhbp zzc2 = zzhbb.zzc(zzdrn.zza());
        this.zzf = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrl.zza());
        this.zzg = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrp.zza());
        this.zzh = zzc4;
        zzhbp zzc5 = zzhbb.zzc(zzdrr.zza());
        this.zzi = zzc5;
        zzhbf zzc6 = zzhbg.zzc(4);
        zzc6.zzb(zzfhl.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfhl.BUILD_URL, zzc3);
        zzc6.zzb(zzfhl.HTTP, zzc4);
        zzc6.zzb(zzfhl.PRE_PROCESS, zzc5);
        zzhbg zzc7 = zzc6.zzc();
        this.zzj = zzc7;
        zzhbp zzc8 = zzhbb.zzc(new zzdrs(zzevh, zzcjs.zzg, zzfgm.zza(), zzc7));
        this.zzk = zzc8;
        zzhbm zza2 = zzhbn.zza(0, 1);
        zza2.zza(zzc8);
        zzhbn zzc9 = zza2.zzc();
        this.zzl = zzc9;
        zzfhu zzfhu = new zzfhu(zzc9);
        this.zzm = zzfhu;
        this.zzn = zzhbb.zzc(new zzfht(zzfgm.zza(), zzcjs.zzm, zzfhu));
    }

    public final zzetz zza() {
        Context zza2 = this.zzb.zza.zza();
        zzhbk.zzb(zza2);
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        zzbzq zzbzq = new zzbzq();
        zzhbk.zzb(zzgad);
        zzetw zza3 = zzexf.zza(new zzewj(zzbzq, zzgad, zzeva.zza(this.zza)), zzery.zza(), (ScheduledExecutorService) this.zzb.zzm.zzb(), 0);
        Context zza4 = this.zzb.zza.zza();
        zzhbk.zzb(zza4);
        zzetw zzb2 = zzexf.zzb(new zzewt(new zzbsz(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zza4), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzbzt zzbzt = new zzbzt();
        Context zza5 = this.zzb.zza.zza();
        zzhbk.zzb(zza5);
        zzhbk.zzb(zzgad);
        zzeuz zzeuz = this.zza;
        zzetw zza6 = zzexg.zza(zzeut.zza(zzbzt, zza5, (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad, zzevb.zza(zzeuz), zzevd.zza(zzeuz), zzeve.zza(zzeuz)), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzhbk.zzb(zzgad);
        zzetw zzc2 = zzexf.zzc(new zzexo(zzgad), (ScheduledExecutorService) this.zzb.zzm.zzb());
        zzexd zzexd = zzexd.zza;
        Context zza7 = this.zzb.zza.zza();
        zzhbk.zzb(zza7);
        String zza8 = zzeva.zza(this.zza);
        zzhbk.zzb(zzgad);
        zzevn zzevn = new zzevn((zzbvi) null, zza7, zza8, zzgad);
        Object[] objArr = new zzetw[6];
        zzaxk zzaxk = new zzaxk();
        zzhbk.zzb(zzgad);
        Context zza9 = this.zzb.zza.zza();
        zzhbk.zzb(zza9);
        objArr[0] = new zzewc(zzaxk, zzgad, zza9);
        zzbbt zzbbt = new zzbbt();
        zzhbk.zzb(zzgad);
        objArr[1] = new zzewn(zzbbt, zzgad, zzevc.zza(this.zza));
        zzbzt zzbzt2 = new zzbzt();
        zzhbk.zzb(zzgad);
        zzeuz zzeuz2 = this.zza;
        objArr[2] = new zzeux(zzbzt2, zzgad, zzevf.zza(zzeuz2), zzevg.zza(zzeuz2), zzevb.zza(zzeuz2));
        zzbzt zzbzt3 = new zzbzt();
        zzeuz zzeuz3 = this.zza;
        zzcjs zzcjs = this.zzb;
        int zza10 = zzevb.zza(zzeuz3);
        Context zza11 = zzcjs.zza.zza();
        zzhbk.zzb(zza11);
        zzhbk.zzb(zzgad);
        Object[] objArr2 = objArr;
        zzevn zzevn2 = zzevn;
        objArr2[3] = new zzevy(zzbzt3, zza10, zza11, (zzcac) this.zzb.zzah.zzb(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad, zzeva.zza(this.zza));
        objArr2[4] = (zzetw) this.zzb.zzaK.zzb();
        zzhbk.zzb(zzgad);
        objArr2[5] = zzevu.zza(zzeva.zza(this.zza), new zzawy(), (zzcac) this.zzb.zzah.zzb(), (ScheduledExecutorService) this.zzb.zzm.zzb(), zzgad);
        return new zzetz(zza2, zzgad, zzfvx.zzp(zza3, zzb2, zza6, zzc2, zzexd, zzevn2, objArr2), (zzfje) this.zzd.zzb(), (zzdso) this.zzb.zzZ.zzb());
    }

    public final zzfhr zzb() {
        return (zzfhr) this.zzn.zzb();
    }
}
