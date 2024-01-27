package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzevm implements Callable {
    public final /* synthetic */ zzevn zza;

    public /* synthetic */ zzevm(zzevn zzevn) {
        this.zza = zzevn;
    }

    public final Object call() {
        return new zzevo(new JSONObject());
    }
}
