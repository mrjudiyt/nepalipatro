package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzfza;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.common.util.concurrent.e;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzaj implements zzfza {
    public final /* synthetic */ zzbvg zza;

    public /* synthetic */ zzaj(zzbvg zzbvg) {
        this.zza = zzbvg;
    }

    public final e zza(Object obj) {
        zzam zzam = new zzam(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzam.zzb = zzay.zzb().zzh(this.zza.zza).toString();
        } catch (JSONException unused) {
            zzam.zzb = "{}";
        }
        return zzfzt.zzh(zzam);
    }
}
