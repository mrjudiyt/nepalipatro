package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbjy implements zzbjj {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    public final void zza(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            str = "\n".concat(String.valueOf(str5));
        }
        synchronized (this.zza) {
            zzbjx zzbjx = (zzbjx) this.zzb.remove(str2);
            if (zzbjx == null) {
                zzcat.zzj("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                zzbjx.zza(str4 + str);
            } else if (str6 == null) {
                zzbjx.zzb((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zze.zzc()) {
                        String jSONObject2 = jSONObject.toString(2);
                        zze.zza("Result GMSG: " + jSONObject2);
                    }
                    zzbjx.zzb(jSONObject);
                } catch (JSONException e10) {
                    zzbjx.zza(e10.getMessage());
                }
            }
        }
    }

    public final e zzb(zzbmq zzbmq, String str, JSONObject jSONObject) {
        zzcbl zzcbl = new zzcbl();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjw(this, zzcbl));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbmq.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzcbl.zzd(e10);
        }
        return zzcbl;
    }

    public final void zzc(String str, zzbjx zzbjx) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjx);
        }
    }
}
