package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfjh;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.common.util.concurrent.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzd implements zzfza {
    public final /* synthetic */ zzfjh zza;
    public final /* synthetic */ zzfit zzb;

    public /* synthetic */ zzd(zzfjh zzfjh, zzfit zzfit) {
        this.zza = zzfjh;
        this.zzb = zzfit;
    }

    public final e zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzo().zzh().zzu(jSONObject.getString("appSettingsJson"));
        }
        zzfit zzfit = this.zzb;
        zzfjh zzfjh = this.zza;
        zzfit.zzf(optBoolean);
        zzfjh.zzb(zzfit.zzl());
        return zzfzt.zzh((Object) null);
    }
}
