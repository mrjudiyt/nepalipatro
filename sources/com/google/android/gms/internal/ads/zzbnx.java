package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbnx {
    public static final zzbnu zza = new zzbnw();
    public static final zzbns zzb = zzbnv.zza;
    private static final Charset zzc = Charset.forName("UTF-8");

    static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
