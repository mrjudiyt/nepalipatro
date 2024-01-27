package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbme {
    public static void zza(zzbmf zzbmf, String str, Map map) {
        try {
            zzbmf.zze(str, zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcat.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmf zzbmf, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzcat.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbmf.zza(sb.toString());
    }

    public static void zzc(zzbmf zzbmf, String str, String str2) {
        zzbmf.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmf zzbmf, String str, JSONObject jSONObject) {
        zzbmf.zzb(str, jSONObject.toString());
    }
}
