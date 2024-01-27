package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdsj {
    private final ConcurrentHashMap zza;
    private final zzcag zzb;
    private final zzfdn zzc;
    private final String zzd;
    private final String zze;

    public zzdsj(zzdst zzdst, zzcag zzcag, zzfdn zzfdn, String str, String str2) {
        ConcurrentHashMap zzc2 = zzdst.zzc();
        this.zza = zzc2;
        this.zzb = zzcag;
        this.zzc = zzfdn;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            int zze2 = zzf.zze(zzfdn);
            int i10 = zze2 - 1;
            if (i10 != 0) {
                if (i10 == 1) {
                    zzc2.put("se", "query_g");
                } else if (i10 == 2) {
                    zzc2.put("se", "r_adinfo");
                } else if (i10 != 3) {
                    zzc2.put("se", "r_both");
                } else {
                    zzc2.put("se", "r_adstring");
                }
                zzc2.put("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                if (((Boolean) zzba.zzc().zzb(zzbci.zzhw)).booleanValue()) {
                    zzc2.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
                }
                if (zze2 == 2) {
                    zzc2.put("rid", str);
                }
                zzd("ragent", zzfdn.zzd.zzp);
                zzd("rtype", zzf.zza(zzf.zzb(zzfdn.zzd)));
                return;
            }
            zzc2.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfde zzfde) {
        if (!zzfde.zzb.zza.isEmpty()) {
            switch (((zzfcr) zzfde.zzb.zza.get(0)).zzb) {
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
                    this.zza.put("as", true != this.zzb.zzm() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        zzd("gqi", zzfde.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
