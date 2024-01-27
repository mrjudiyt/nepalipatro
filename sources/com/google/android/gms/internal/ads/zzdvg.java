package com.google.android.gms.internal.ads;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdvg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdvg(String str, String str2, String str3, int i10, String str4, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i10;
        this.zze = str4;
        this.zzf = i11;
        this.zzg = z10;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjb)).booleanValue()) {
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzb);
        }
        jSONObject.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjc)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
