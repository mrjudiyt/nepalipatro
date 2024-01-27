package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcjk extends zzevj {
    private final zzewp zza;
    private final zzcjs zzb;
    private final zzcjk zzc = this;
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

    /* synthetic */ zzcjk(zzcjs zzcjs, zzewp zzewp, zzcjj zzcjj) {
        this.zzb = zzcjs;
        this.zza = zzewp;
        zzewr zzewr = new zzewr(zzewp);
        this.zzd = zzewr;
        zzhbp zzc2 = zzhbb.zzc(zzdrn.zza());
        this.zze = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzdrl.zza());
        this.zzf = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdrp.zza());
        this.zzg = zzc4;
        zzhbp zzc5 = zzhbb.zzc(zzdrr.zza());
        this.zzh = zzc5;
        zzhbf zzc6 = zzhbg.zzc(4);
        zzc6.zzb(zzfhl.GMS_SIGNALS, zzc2);
        zzc6.zzb(zzfhl.BUILD_URL, zzc3);
        zzc6.zzb(zzfhl.HTTP, zzc4);
        zzc6.zzb(zzfhl.PRE_PROCESS, zzc5);
        zzhbg zzc7 = zzc6.zzc();
        this.zzi = zzc7;
        zzhbp zzc8 = zzhbb.zzc(new zzdrs(zzewr, zzcjs.zzg, zzfgm.zza(), zzc7));
        this.zzj = zzc8;
        zzhbm zza2 = zzhbn.zza(0, 1);
        zza2.zza(zzc8);
        zzhbn zzc9 = zza2.zzc();
        this.zzk = zzc9;
        zzfhu zzfhu = new zzfhu(zzc9);
        this.zzl = zzfhu;
        this.zzm = zzhbb.zzc(new zzfht(zzfgm.zza(), zzcjs.zzm, zzfhu));
        this.zzn = zzhbb.zzc(new zzfjf(zzcjs.zzG));
    }

    public final zzetz zza() {
        Context zza2 = this.zzb.zza.zza();
        zzhbk.zzb(zza2);
        zzbzq zzbzq = new zzbzq();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        zzewj zzewj = new zzewj(zzbzq, zzgad, zzewq.zza(this.zza));
        zzhbk.zzb(zzgad);
        HashSet hashSet = new HashSet();
        hashSet.add(new zzese(zzewj, 0, (ScheduledExecutorService) this.zzb.zzm.zzb()));
        return new zzetz(zza2, zzgad, hashSet, (zzfje) this.zzn.zzb(), (zzdso) this.zzb.zzZ.zzb());
    }

    public final zzfhr zzb() {
        return (zzfhr) this.zzm.zzb();
    }
}
