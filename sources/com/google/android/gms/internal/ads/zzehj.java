package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzehj implements Callable {
    public final /* synthetic */ zzeho zza;
    public final /* synthetic */ e zzb;
    public final /* synthetic */ e zzc;
    public final /* synthetic */ zzfde zzd;
    public final /* synthetic */ zzfcr zze;
    public final /* synthetic */ JSONObject zzf;

    public /* synthetic */ zzehj(zzeho zzeho, e eVar, e eVar2, zzfde zzfde, zzfcr zzfcr, JSONObject jSONObject) {
        this.zza = zzeho;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = zzfde;
        this.zze = zzfcr;
        this.zzf = jSONObject;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
