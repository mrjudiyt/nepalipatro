package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdzj implements zzfza {
    public static final /* synthetic */ zzdzj zza = new zzdzj();

    private /* synthetic */ zzdzj() {
    }

    public final e zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        JSONObject jSONObject = new JSONObject();
        if (inputStream == null) {
            return zzfzt.zzh(jSONObject);
        }
        try {
            zzt.zzp();
            jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzt.zzM(new InputStreamReader(inputStream)));
        } catch (IOException | JSONException e10) {
            zzt.zzo().zzu(e10, "AdsServiceSignalTask.startAdsServiceSignalTask");
        }
        return zzfzt.zzh(jSONObject);
    }
}
