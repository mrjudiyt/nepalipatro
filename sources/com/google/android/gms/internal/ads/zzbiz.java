package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbiz implements zzbjj {
    zzbiz() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcgb.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                edit.remove(jSONArray.getString(i10));
            }
            edit.apply();
        } catch (JSONException e10) {
            zzt.zzo().zzu(e10, "GMSG clear local storage keys handler");
        }
    }
}
