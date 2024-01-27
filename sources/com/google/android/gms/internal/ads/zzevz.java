package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzevz implements zzetv {
    private final String zza;

    public zzevz(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = zzbw.zzf((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zza)) {
                zzf.put("attok", this.zza);
            }
        } catch (JSONException e10) {
            zze.zzb("Failed putting attestation token.", e10);
        }
    }
}
