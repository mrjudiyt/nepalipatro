package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.bolts.AppLinks;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.common.util.concurrent.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzw implements zzfzp {
    final /* synthetic */ e zza;
    final /* synthetic */ zzbzo zzb;
    final /* synthetic */ zzbzh zzc;
    final /* synthetic */ zzfit zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    zzw(zzaa zzaa, e eVar, zzbzo zzbzo, zzbzh zzbzh, zzfit zzfit, long j10) {
        this.zzf = zzaa;
        this.zza = eVar;
        this.zzb = zzbzo;
        this.zzc = zzbzh;
        this.zzd = zzfit;
        this.zze = j10;
    }

    public final void zza(Throwable th) {
        long currentTimeMillis = zzt.zzB().currentTimeMillis() - this.zze;
        String message = th.getMessage();
        zzt.zzo().zzu(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaa = this.zzf;
        zzf.zzc(zzaa.zzr, zzaa.zzj, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis)));
        zzfje zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
            zzfit zzfit = this.zzd;
            zzfit.zzg(th);
            zzfit.zzf(false);
            zzr.zza(zzfit);
            zzr.zzg();
        }
        try {
            zzbzh zzbzh = this.zzc;
            zzbzh.zzb("Internal error. " + message);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzam zzam = (zzam) obj;
        zzfje zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzhz)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                zzcat.zzg("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                zzfit zzfit = this.zzd;
                zzfit.zzc("QueryInfo generation has been disabled.");
                zzfit.zzf(false);
                zzr.zza(zzfit);
                zzr.zzg();
                return;
            }
            return;
        }
        long currentTimeMillis = zzt.zzB().currentTimeMillis() - this.zze;
        if (zzam == null) {
            try {
                this.zzc.zzc((String) null, (String) null, (Bundle) null);
                zzaa zzaa = this.zzf;
                zzf.zzc(zzaa.zzr, zzaa.zzj, "sgs", new Pair("rid", "-1"));
                this.zzd.zzf(true);
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (RemoteException e11) {
                zzfit zzfit2 = this.zzd;
                zzfit2.zzg(e11);
                zzfit2.zzf(false);
                zzcat.zzh("", e11);
                zzt.zzo().zzu(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (Throwable th) {
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
                throw th;
            }
        } else {
            try {
                JSONObject jSONObject = new JSONObject(zzam.zzb);
                String optString = jSONObject.optString("request_id", "");
                if (TextUtils.isEmpty(optString)) {
                    zzcat.zzj("The request ID is empty in request JSON.");
                    this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                    zzaa zzaa2 = this.zzf;
                    zzf.zzc(zzaa2.zzr, zzaa2.zzj, "sgf", new Pair("sgf_reason", "rid_missing"));
                    zzfit zzfit3 = this.zzd;
                    zzfit3.zzc("Request ID empty");
                    zzfit3.zzf(false);
                    if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    return;
                }
                zzaa zzaa3 = this.zzf;
                zzaa.zzG(zzaa3, optString, zzam.zzb, zzaa3.zzj);
                Bundle bundle = zzam.zzc;
                zzaa zzaa4 = this.zzf;
                if (zzaa4.zzw && bundle != null && bundle.getInt(zzaa4.zzy, -1) == -1) {
                    zzaa zzaa5 = this.zzf;
                    bundle.putInt(zzaa5.zzy, zzaa5.zzz.get());
                }
                zzaa zzaa6 = this.zzf;
                if (zzaa6.zzv && bundle != null && TextUtils.isEmpty(bundle.getString(zzaa6.zzx))) {
                    if (TextUtils.isEmpty(this.zzf.zzB)) {
                        zzaa zzaa7 = this.zzf;
                        com.google.android.gms.ads.internal.util.zzt zzp = zzt.zzp();
                        zzaa zzaa8 = this.zzf;
                        zzaa7.zzB = zzp.zzc(zzaa8.zzg, zzaa8.zzA.zza);
                    }
                    zzaa zzaa9 = this.zzf;
                    bundle.putString(zzaa9.zzx, zzaa9.zzB);
                }
                this.zzc.zzc(zzam.zza, zzam.zzb, bundle);
                zzaa zzaa10 = this.zzf;
                zzdst zzp2 = zzaa10.zzr;
                zzdsj zzo = zzaa10.zzj;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("tqgt", String.valueOf(currentTimeMillis));
                String str = "na";
                if (((Boolean) zzba.zzc().zzb(zzbci.zzjm)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject(AppLinks.KEY_NAME_EXTRAS).getBoolean("accept_3p_cookie") ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                    } catch (JSONException e12) {
                        zzcat.zzh("Error retrieving JSONObject from the requestJson, ", e12);
                    }
                }
                pairArr[1] = new Pair("tpc", str);
                zzf.zzc(zzp2, zzo, "sgs", pairArr);
                this.zzd.zzf(true);
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (JSONException e13) {
                zzcat.zzj("Failed to create JSON object from the request string.");
                zzbzh zzbzh = this.zzc;
                String obj2 = e13.toString();
                zzbzh.zzb("Internal error for request JSON: " + obj2);
                zzaa zzaa11 = this.zzf;
                zzf.zzc(zzaa11.zzr, zzaa11.zzj, "sgf", new Pair("sgf_reason", "request_invalid"));
                zzfit zzfit4 = this.zzd;
                zzfit4.zzg(e13);
                zzfit4.zzf(false);
                zzt.zzo().zzu(e13, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbdu.zze.zze()).booleanValue() && zzr != null) {
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            }
        }
    }
}
