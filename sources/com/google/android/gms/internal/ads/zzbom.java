package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbom implements zzfza {
    private final zzbns zza;
    private final zzbnt zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final e zzd;

    zzbom(e eVar, String str, zzbnt zzbnt, zzbns zzbns) {
        this.zzd = eVar;
        this.zzb = zzbnt;
        this.zza = zzbns;
    }

    public final e zza(Object obj) {
        return zzb(obj);
    }

    public final e zzb(Object obj) {
        return zzfzt.zzn(this.zzd, new zzbok(this, obj), zzcbg.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(Object obj, zzbnn zzbnn) {
        zzcbl zzcbl = new zzcbl();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbji.zzo.zzc(uuid, new zzbol(this, zzcbl));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbnn.zzl(this.zzc, jSONObject);
        return zzcbl;
    }
}
