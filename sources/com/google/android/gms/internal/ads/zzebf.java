package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.e;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebf extends zzbuv {
    private final Context zza;
    private final zzevk zzb;
    private final zzevi zzc;
    private final zzebn zzd;
    private final zzgad zze;
    private final zzebk zzf;
    private final zzbvs zzg;

    zzebf(Context context, zzevk zzevk, zzevi zzevi, zzebk zzebk, zzebn zzebn, zzgad zzgad, zzbvs zzbvs) {
        this.zza = context;
        this.zzb = zzevk;
        this.zzc = zzevi;
        this.zzf = zzebk;
        this.zzd = zzebn;
        this.zze = zzgad;
        this.zzg = zzbvs;
    }

    private final void zzc(e eVar, zzbuz zzbuz) {
        zzfzt.zzr(zzfzt.zzn(zzfzk.zzu(eVar), new zzebc(this), zzcbg.zza), new zzebe(this, zzbuz), zzcbg.zzf);
    }

    public final e zzb(zzbuo zzbuo, int i10) {
        e eVar;
        HashMap hashMap = new HashMap();
        Bundle bundle = zzbuo.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        zzebh zzebh = new zzebh(zzbuo.zza, zzbuo.zzb, hashMap, zzbuo.zzd, "", zzbuo.zze);
        zzevi zzevi = this.zzc;
        zzevi.zza(new zzewp(zzbuo));
        boolean z10 = zzebh.zzf;
        zzevj zzb2 = zzevi.zzb();
        if (z10) {
            String str2 = zzbuo.zza;
            String str3 = (String) zzbei.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzftj.zzc(zzfsh.zzc(';')).zzd(str3).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (host.endsWith((String) it.next())) {
                                eVar = zzfzt.zzm(zzb2.zza().zza(new JSONObject()), new zzeax(zzebh), this.zze);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        eVar = zzfzt.zzh(zzebh);
        zzfhr zzb3 = zzb2.zzb();
        return zzfzt.zzn(zzb3.zzb(zzfhl.HTTP, eVar).zze(new zzebj(this.zza, "", this.zzg, i10)).zza(), zzeay.zza, this.zze);
    }

    public final void zze(zzbuo zzbuo, zzbuz zzbuz) {
        zzc(zzb(zzbuo, Binder.getCallingUid()), zzbuz);
    }

    public final void zzf(zzbuk zzbuk, zzbuz zzbuz) {
        zzeuz zzeuz = new zzeuz(zzbuk, Binder.getCallingUid());
        zzevk zzevk = this.zzb;
        zzevk.zza(zzeuz);
        zzevl zzb2 = zzevk.zzb();
        zzfhr zzb3 = zzb2.zzb();
        zzfgw zza2 = zzb3.zzb(zzfhl.GMS_SIGNALS, zzfzt.zzi()).zzf(new zzebb(zzb2)).zze(zzeba.zza).zzf(zzeaz.zza).zza();
        zzc(zza2, zzbuz);
        if (((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzebn zzebn = this.zzd;
            zzebn.getClass();
            zza2.addListener(new zzebd(zzebn), this.zze);
        }
    }
}
