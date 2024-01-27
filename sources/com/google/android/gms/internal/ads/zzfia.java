package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfia {
    private final HashMap zza;
    private final zzfig zzb = new zzfig(zzt.zzB());

    private zzfia() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put("new_csi", AppEventsConstants.EVENT_PARAM_VALUE_YES);
    }

    public static zzfia zzb(String str) {
        zzfia zzfia = new zzfia();
        zzfia.zza.put(NativeProtocol.WEB_DIALOG_ACTION, str);
        return zzfia;
    }

    public static zzfia zzc(String str) {
        zzfia zzfia = new zzfia();
        zzfia.zza.put("request_id", str);
        return zzfia;
    }

    public final zzfia zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfia zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfia zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfia zzf(zzfcr zzfcr) {
        this.zza.put("aai", zzfcr.zzy);
        return this;
    }

    public final zzfia zzg(zzfcv zzfcv) {
        if (!TextUtils.isEmpty(zzfcv.zzb)) {
            this.zza.put("gqi", zzfcv.zzb);
        }
        return this;
    }

    public final zzfia zzh(zzfde zzfde, zzcag zzcag) {
        zzfdd zzfdd = zzfde.zzb;
        zzg(zzfdd.zzb);
        if (!zzfdd.zza.isEmpty()) {
            switch (((zzfcr) zzfdd.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzcag != null) {
                        this.zza.put("as", true != zzcag.zzm() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                        break;
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfia zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfif zzfif : this.zzb.zza()) {
            hashMap.put(zzfif.zza, zzfif.zzb);
        }
        return hashMap;
    }
}
