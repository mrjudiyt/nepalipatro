package com.google.android.gms.internal.ads;

import com.facebook.share.internal.ShareConstants;
import com.google.common.util.concurrent.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdmr {
    private final Executor zza;
    private final zzdmm zzb;

    public zzdmr(Executor executor, zzdmm zzdmm) {
        this.zza = executor;
        this.zzb = zzdmm;
    }

    public final e zza(JSONObject jSONObject, String str) {
        e eVar;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfzt.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                eVar = zzfzt.zzh((Object) null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    eVar = zzfzt.zzh((Object) null);
                } else {
                    String optString2 = optJSONObject.optString(ShareConstants.MEDIA_TYPE);
                    if ("string".equals(optString2)) {
                        eVar = zzfzt.zzh(new zzdmq(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        eVar = zzfzt.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzdmo(optString), this.zza);
                    } else {
                        eVar = zzfzt.zzh((Object) null);
                    }
                }
            }
            arrayList.add(eVar);
        }
        return zzfzt.zzm(zzfzt.zzd(arrayList), zzdmp.zza, this.zza);
    }
}
