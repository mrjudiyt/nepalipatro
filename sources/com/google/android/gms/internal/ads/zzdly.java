package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdly implements Callable {
    public final /* synthetic */ zzdlz zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ e zzc;
    public final /* synthetic */ e zzd;
    public final /* synthetic */ e zze;
    public final /* synthetic */ e zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ e zzh;
    public final /* synthetic */ e zzi;
    public final /* synthetic */ e zzj;
    public final /* synthetic */ e zzk;

    public /* synthetic */ zzdly(zzdlz zzdlz, e eVar, e eVar2, e eVar3, e eVar4, e eVar5, JSONObject jSONObject, e eVar6, e eVar7, e eVar8, e eVar9) {
        this.zza = zzdlz;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = eVar3;
        this.zze = eVar4;
        this.zzf = eVar5;
        this.zzg = jSONObject;
        this.zzh = eVar6;
        this.zzi = eVar7;
        this.zzj = eVar8;
        this.zzk = eVar9;
    }

    public final Object call() {
        zzdjj zzdjj = (zzdjj) this.zzb.get();
        zzdjj.zzP((List) this.zzc.get());
        zzdjj.zzM((zzbfo) this.zzd.get());
        zzdjj.zzQ((zzbfo) this.zze.get());
        zzdjj.zzJ((zzbfg) this.zzf.get());
        JSONObject jSONObject = this.zzg;
        zzdjj.zzS(zzdmm.zzj(jSONObject));
        zzdjj.zzL(zzdmm.zzi(jSONObject));
        zzcgb zzcgb = (zzcgb) this.zzh.get();
        if (zzcgb != null) {
            zzdjj.zzad(zzcgb);
            zzdjj.zzac(zzcgb.zzF());
            zzdjj.zzab(zzcgb.zzq());
        }
        zzcgb zzcgb2 = (zzcgb) this.zzi.get();
        if (zzcgb2 != null) {
            zzdjj.zzO(zzcgb2);
            zzdjj.zzae(zzcgb2.zzF());
        }
        e eVar = this.zzj;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            zzdjj.zzU(eVar);
            zzdjj.zzX(new zzcbl());
        } else {
            zzcgb zzcgb3 = (zzcgb) eVar.get();
            if (zzcgb3 != null) {
                zzdjj.zzT(zzcgb3);
            }
        }
        for (zzdmq zzdmq : (List) this.zzk.get()) {
            if (zzdmq.zza != 1) {
                zzdjj.zzN(zzdmq.zzb, zzdmq.zzd);
            } else {
                zzdjj.zzZ(zzdmq.zzb, zzdmq.zzc);
            }
        }
        return zzdjj;
    }
}
