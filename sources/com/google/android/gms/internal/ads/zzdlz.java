package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdlz {
    private final zzgad zza;
    private final zzdmm zzb;
    private final zzdmr zzc;

    public zzdlz(zzgad zzgad, zzdmm zzdmm, zzdmr zzdmr) {
        this.zza = zzgad;
        this.zzb = zzdmm;
        this.zzc = zzdmr;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr, JSONObject jSONObject) {
        e zzn;
        zzfde zzfde2 = zzfde;
        zzfcr zzfcr2 = zzfcr;
        JSONObject jSONObject2 = jSONObject;
        e zzb2 = this.zza.zzb(new zzdlx(this, zzfde2, zzfcr2, jSONObject2));
        e zzf = this.zzb.zzf(jSONObject2, "images");
        zzfcv zzfcv = zzfde2.zzb.zzb;
        zzdmm zzdmm = this.zzb;
        e zzg = zzdmm.zzg(jSONObject2, "images", zzfcr2, zzfcv);
        e zze = zzdmm.zze(jSONObject2, "secondary_image");
        e zze2 = zzdmm.zze(jSONObject2, "app_icon");
        e zzd = zzdmm.zzd(jSONObject2, "attribution");
        e zzh = this.zzb.zzh(jSONObject2, zzfcr2, zzfde2.zzb.zzb);
        e zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzn = zzfzt.zzh((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfzt.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfzt.zzh((Object) null);
                } else {
                    zzn = zzfzt.zzn(zzfzt.zzh((Object) null), new zzdmb(this.zzb, optString), zzcbg.zze);
                }
            }
        }
        e eVar = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb2);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza2);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeY)).booleanValue()) {
            arrayList.add(eVar);
        }
        return zzfzt.zza(arrayList).zza(new zzdly(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzg, eVar, zza2), this.zza);
    }
}
