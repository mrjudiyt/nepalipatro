package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbod implements zzbjx {
    final /* synthetic */ zzboe zza;
    private final zzbng zzb;
    private final zzcbl zzc;

    public zzbod(zzboe zzboe, zzbng zzbng, zzcbl zzcbl) {
        this.zza = zzboe;
        this.zzb = zzbng;
        this.zzc = zzcbl;
    }

    public final void zza(String str) {
        zzbng zzbng;
        if (str == null) {
            try {
                this.zzc.zzd(new zzbnp());
            } catch (IllegalStateException unused) {
                zzbng = this.zzb;
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zzd(new zzbnp(str));
        }
        zzbng = this.zzb;
        zzbng.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        zzbng zzbng;
        try {
            this.zzc.zzc(this.zza.zza.zza(jSONObject));
            zzbng = this.zzb;
        } catch (IllegalStateException unused) {
            zzbng = this.zzb;
        } catch (JSONException e10) {
            this.zzc.zzd(e10);
            zzbng = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbng.zzb();
    }
}
