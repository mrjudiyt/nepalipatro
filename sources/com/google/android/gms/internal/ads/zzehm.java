package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzehm implements zzfza {
    public final /* synthetic */ zzeho zza;
    public final /* synthetic */ zzfde zzb;
    public final /* synthetic */ zzfcr zzc;

    public /* synthetic */ zzehm(zzeho zzeho, zzfde zzfde, zzfcr zzfcr) {
        this.zza = zzeho;
        this.zzb = zzfde;
        this.zzc = zzfcr;
    }

    public final e zza(Object obj) {
        return this.zza.zzf(this.zzb, this.zzc, (JSONArray) obj);
    }
}
