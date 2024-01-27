package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcue {
    private final zzdxu zza;
    private final zzfdn zzb;
    private final zzfhr zzc;
    private final zzcnj zzd;
    private final zzeiu zze;
    /* access modifiers changed from: private */
    public final zzdcq zzf;
    private zzfde zzg;
    private final zzdyz zzh;
    private final zzcwp zzi;
    private final Executor zzj;
    private final zzdyl zzk;
    private final zzeez zzl;
    private final zzdzp zzm;
    private final zzdzw zzn;

    zzcue(zzdxu zzdxu, zzfdn zzfdn, zzfhr zzfhr, zzcnj zzcnj, zzeiu zzeiu, zzdcq zzdcq, zzfde zzfde, zzdyz zzdyz, zzcwp zzcwp, Executor executor, zzdyl zzdyl, zzeez zzeez, zzdzp zzdzp, zzdzw zzdzw) {
        this.zza = zzdxu;
        this.zzb = zzfdn;
        this.zzc = zzfhr;
        this.zzd = zzcnj;
        this.zze = zzeiu;
        this.zzf = zzdcq;
        this.zzg = zzfde;
        this.zzh = zzdyz;
        this.zzi = zzcwp;
        this.zzj = executor;
        this.zzk = zzdyl;
        this.zzl = zzeez;
        this.zzm = zzdzp;
        this.zzn = zzdzw;
    }

    public final zze zza(Throwable th) {
        return zzfeo.zzb(th, this.zzl);
    }

    public final zzdcq zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfde zzd(zzfde zzfde) {
        this.zzd.zza(zzfde);
        return zzfde;
    }

    public final e zze(zzffh zzffh) {
        zzfgw zza2 = this.zzc.zzb(zzfhl.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcua(this, zzffh)).zza();
        zzfzt.zzr(zza2, new zzcuc(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzf(zzffh zzffh, zzbvg zzbvg) {
        zzbvg.zzi = zzffh;
        return this.zzh.zza(zzbvg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzg(e eVar, e eVar2, e eVar3) {
        return this.zzn.zzc((zzbvg) eVar.get(), (JSONObject) eVar2.get(), (zzbvj) eVar3.get());
    }

    public final e zzh(zzbvg zzbvg) {
        zzfgw zza2 = this.zzc.zzb(zzfhl.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvg)).zza();
        zzfzt.zzr(zza2, new zzcud(this), this.zzj);
        return zza2;
    }

    public final e zzi(e eVar) {
        zzfhi zzf2 = this.zzc.zzb(zzfhl.RENDERER, eVar).zze(new zzctv(this)).zzf(this.zze);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzfs)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzba.zzc().zzb(zzbci.zzfu)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final e zzj() {
        zzl zzl2 = this.zzb.zzd;
        if (zzl2.zzx == null && zzl2.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfhr zzfhr = this.zzc;
        zzdxu zzdxu = this.zza;
        return zzfhb.zzc(zzdxu.zza(), zzfhl.PRELOADED_LOADER, zzfhr).zza();
    }

    public final e zzk(e eVar) {
        zzfde zzfde = this.zzg;
        if (zzfde != null) {
            zzfhr zzfhr = this.zzc;
            return zzfhb.zzc(zzfzt.zzh(zzfde), zzfhl.SERVER_TRANSACTION, zzfhr).zza();
        }
        zzt.zzc().zzj();
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkz)).booleanValue() || ((Boolean) zzbeh.zzc.zze()).booleanValue()) {
            return this.zzc.zzb(zzfhl.SERVER_TRANSACTION, eVar).zzf(new zzcub(this.zzk)).zza();
        }
        e zzn2 = zzfzt.zzn(eVar, new zzctw(this.zzm), this.zzj);
        zzfgw zza2 = this.zzc.zzb(zzfhl.BUILD_URL, zzn2).zzf(new zzctx(this.zzh)).zza();
        return this.zzc.zza(zzfhl.SERVER_TRANSACTION, eVar, zzn2, zza2).zza(new zzcty(this, eVar, zzn2, zza2)).zzf(zzctz.zza).zza();
    }

    public final void zzl(zzfde zzfde) {
        this.zzg = zzfde;
    }
}
