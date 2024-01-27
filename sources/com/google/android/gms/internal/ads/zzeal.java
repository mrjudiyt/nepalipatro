package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeal implements Callable {
    public final /* synthetic */ e zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ e zzc;

    public /* synthetic */ zzeal(e eVar, e eVar2, e eVar3) {
        this.zza = eVar;
        this.zzb = eVar2;
        this.zzc = eVar3;
    }

    public final Object call() {
        return new zzeau((zzebi) this.zza.get(), (JSONObject) this.zzb.get(), (zzbvj) this.zzc.get());
    }
}
