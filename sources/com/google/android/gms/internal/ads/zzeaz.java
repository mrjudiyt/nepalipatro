package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeaz implements zzfza {
    public static final /* synthetic */ zzeaz zza = new zzeaz();

    private /* synthetic */ zzeaz() {
    }

    public final e zza(Object obj) {
        return zzfzt.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
    }
}
