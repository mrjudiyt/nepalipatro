package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbvq extends zzbvr {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbnq zzd;

    public zzbvq(Context context, zzbnq zzbnq) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzbnq;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcaz.zza().zza);
            jSONObject.put("mf", zzbeb.zza.zze());
            jSONObject.put("cl", "575948185");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final e zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.zzB().currentTimeMillis() - this.zzc.getLong("js_last_update", 0) < ((Long) zzbeb.zzb.zze()).longValue()) {
            return zzfzt.zzh((Object) null);
        }
        return zzfzt.zzm(this.zzd.zzb(zzc(this.zzb)), new zzbvp(this), zzcbg.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbca zzbca = zzbci.zza;
        zzba.zzb();
        SharedPreferences.Editor edit = zzbcc.zza(this.zzb).edit();
        zzba.zza();
        zzbdn zzbdn = zzbds.zza;
        zzba.zza().zze(edit, 1, jSONObject);
        zzba.zzb();
        edit.commit();
        this.zzc.edit().putLong("js_last_update", zzt.zzB().currentTimeMillis()).apply();
        return null;
    }
}
