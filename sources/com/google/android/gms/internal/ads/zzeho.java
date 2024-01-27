package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeho implements zzehi {
    private final zzdht zza;
    private final zzgad zzb;
    private final zzdlz zzc;
    private final zzfek zzd;
    private final zzdoo zze;

    public zzeho(zzdht zzdht, zzgad zzgad, zzdlz zzdlz, zzfek zzfek, zzdoo zzdoo) {
        this.zza = zzdht;
        this.zzb = zzgad;
        this.zzc = zzdlz;
        this.zzd = zzfek;
        this.zze = zzdoo;
    }

    private final e zzg(zzfde zzfde, zzfcr zzfcr, JSONObject jSONObject) {
        zzdlz zzdlz = this.zzc;
        e zza2 = this.zzd.zza();
        e zza3 = zzdlz.zza(zzfde, zzfcr, jSONObject);
        return zzfzt.zzc(zza2, zza3).zza(new zzehj(this, zza3, zza2, zzfde, zzfcr, jSONObject), this.zzb);
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        return zzfzt.zzn(zzfzt.zzn(this.zzd.zza(), new zzehl(this, zzfcr), this.zzb), new zzehm(this, zzfde, zzfcr), this.zzb);
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        zzfcx zzfcx = zzfcr.zzu;
        return (zzfcx == null || zzfcx.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdje zzc(e eVar, e eVar2, zzfde zzfde, zzfcr zzfcr, JSONObject jSONObject) {
        zzdjj zzdjj = (zzdjj) eVar.get();
        zzdoi zzdoi = (zzdoi) eVar2.get();
        zzdjk zzd2 = this.zza.zzd(new zzctm(zzfde, zzfcr, (String) null), new zzdjv(zzdjj), new zzdii(jSONObject, zzdoi));
        zzd2.zzh().zzb();
        zzd2.zzk().zza(zzdoi);
        zzd2.zzg().zza(zzdjj.zzs());
        zzd2.zzl().zza(this.zze);
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzd(zzdoi zzdoi, JSONObject jSONObject) {
        this.zzd.zzb(zzfzt.zzh(zzdoi));
        if (jSONObject.optBoolean("success")) {
            return zzfzt.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbnp("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zze(zzfcr zzfcr, zzdoi zzdoi) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzio)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfcr.zzu.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfzt.zzn(zzdoi.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzehk(this, zzdoi), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzf(zzfde zzfde, zzfcr zzfcr, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzfzt.zzg(new zzdwm(3));
        }
        if (zzfde.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfde.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfde.zza.zza.zzk);
            for (int i10 = 0; i10 < zzfde.zza.zza.zzk; i10++) {
                if (i10 < length) {
                    arrayList.add(zzg(zzfde, zzfcr, jSONArray.getJSONObject(i10)));
                } else {
                    arrayList.add(zzfzt.zzg(new zzdwm(3)));
                }
            }
            return zzfzt.zzh(arrayList);
        }
        return zzfzt.zzm(zzg(zzfde, zzfcr, jSONArray.getJSONObject(0)), zzehn.zza, this.zzb);
    }
}
