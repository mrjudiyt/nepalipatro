package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbol implements zzbjx {
    final /* synthetic */ zzbom zza;
    private final zzcbl zzb;

    public zzbol(zzbom zzbom, zzcbl zzcbl) {
        this.zza = zzbom;
        this.zzb = zzcbl;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzb.zzd(new zzbnp());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.zzb.zzd(new zzbnp(str));
        }
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e10) {
            this.zzb.zzd(e10);
        }
    }
}
