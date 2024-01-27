package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewo implements zzetv {
    private final List zza;

    public zzewo(List list) {
        this.zza = list;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}
