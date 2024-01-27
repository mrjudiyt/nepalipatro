package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqc implements zzhbc {
    private final zzhbp zza;

    public zzcqc(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzctn) this.zza).zza().zzB);
        } catch (JSONException unused) {
            return null;
        }
    }
}
