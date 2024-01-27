package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.e;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzess implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzess(List list, Bundle bundle) {
        this.zza = list;
        this.zzb = bundle;
    }

    public final Object call() {
        JSONArray jSONArray = new JSONArray();
        for (e eVar : this.zza) {
            if (((JSONObject) eVar.get()) != null) {
                jSONArray.put(eVar.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzesy(jSONArray.toString(), this.zzb);
    }
}
