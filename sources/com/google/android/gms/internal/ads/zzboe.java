package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzboe implements zzbnq {
    /* access modifiers changed from: private */
    public final zzbns zza;
    private final zzbnt zzb;
    private final zzbnm zzc;
    private final String zzd;

    zzboe(zzbnm zzbnm, String str, zzbnt zzbnt, zzbns zzbns) {
        this.zzc = zzbnm;
        this.zzd = str;
        this.zzb = zzbnt;
        this.zza = zzbns;
    }

    static /* bridge */ /* synthetic */ void zzd(zzboe zzboe, zzbng zzbng, zzbnn zzbnn, Object obj, zzcbl zzcbl) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbji.zzo.zzc(uuid, new zzbod(zzboe, zzbng, zzcbl));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzboe.zzb.zzb(obj));
            zzbnn.zzl(zzboe.zzd, jSONObject);
        } catch (Exception e10) {
            zzcbl.zzd(e10);
            zzcat.zzh("Unable to invokeJavascript", e10);
            zzbng.zzb();
        } catch (Throwable th) {
            zzbng.zzb();
            throw th;
        }
    }

    public final e zza(Object obj) {
        return zzb(obj);
    }

    public final e zzb(Object obj) {
        zzcbl zzcbl = new zzcbl();
        zzbng zzb2 = this.zzc.zzb((zzaro) null);
        zzb2.zzi(new zzbob(this, zzb2, obj, zzcbl), new zzboc(this, zzcbl, zzb2));
        return zzcbl;
    }
}
