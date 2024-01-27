package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeak implements Callable {
    public final /* synthetic */ e zza;
    public final /* synthetic */ e zzb;

    public /* synthetic */ zzeak(e eVar, e eVar2) {
        this.zza = eVar;
        this.zzb = eVar2;
    }

    public final Object call() {
        return new zzebl((JSONObject) this.zza.get(), (zzbvj) this.zzb.get());
    }
}
