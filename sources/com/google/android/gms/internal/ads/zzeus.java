package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeus implements zzetv {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfpt zzc;

    public zzeus(AdvertisingIdClient.Info info, String str, zzfpt zzfpt) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfpt;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = zzbw.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.zza.getId());
            zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            zzfpt zzfpt = this.zzc;
            if (zzfpt.zzc()) {
                zzf.put("paidv1_id_android_3p", zzfpt.zzb());
                zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e10) {
            zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
