package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzflw {
    private JSONObject zza;
    private final zzfmf zzb;

    public zzflw(zzfmf zzfmf) {
        this.zzb = zzfmf;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfmg(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfmh(this, hashSet, jSONObject, j10));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfmi(this, hashSet, jSONObject, j10));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
