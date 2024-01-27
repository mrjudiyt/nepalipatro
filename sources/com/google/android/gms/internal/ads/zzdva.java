package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdva implements zzcxo, zzdag, zzczd {
    private final zzdvm zza;
    private final String zzb;
    private final String zzc;
    private int zzd;
    private zzduz zze;
    private zzcxe zzf;
    private zze zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private JSONObject zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;

    zzdva(zzdvm zzdvm, zzfdn zzfdn, String str) {
        this.zza = zzdvm;
        this.zzc = str;
        this.zzb = zzfdn.zzf;
        this.zzd = 0;
        this.zze = zzduz.AD_REQUESTED;
    }

    private static JSONObject zzh(zze zze2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze2.zzc);
        jSONObject.put("errorCode", zze2.zza);
        jSONObject.put("errorDescription", zze2.zzb);
        zze zze3 = zze2.zzd;
        jSONObject.put("underlyingError", zze3 == null ? null : zzh(zze3));
        return jSONObject;
    }

    private final JSONObject zzi(zzcxe zzcxe) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzcxe.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzcxe.zzc());
        jSONObject2.put("responseId", zzcxe.zzi());
        if (((Boolean) zzba.zzc().zzb(zzbci.zziW)).booleanValue()) {
            String zzd2 = zzcxe.zzd();
            if (!TextUtils.isEmpty(zzd2)) {
                zzcat.zze("Bidding data: ".concat(String.valueOf(zzd2)));
                jSONObject2.put("biddingData", new JSONObject(zzd2));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject2.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject2.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject2.put("adResponseBody", this.zzj);
        }
        JSONObject jSONObject3 = this.zzk;
        if (jSONObject3 != null) {
            jSONObject2.put("adResponseHeaders", jSONObject3);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zziZ)).booleanValue()) {
            jSONObject2.put("hasExceededMemoryLimit", this.zzn);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzu : zzcxe.zzj()) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adapterClassName", zzu.zza);
            jSONObject4.put("latencyMillis", zzu.zzb);
            if (((Boolean) zzba.zzc().zzb(zzbci.zziX)).booleanValue()) {
                jSONObject4.put("credentials", zzay.zzb().zzh(zzu.zzd));
            }
            zze zze2 = zzu.zzc;
            if (zze2 == null) {
                jSONObject = null;
            } else {
                jSONObject = zzh(zze2);
            }
            jSONObject4.put("error", jSONObject);
            jSONArray.put(jSONObject4);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(zzcsx zzcsx) {
        if (this.zza.zzp()) {
            this.zzf = zzcsx.zzl();
            this.zze = zzduz.AD_LOADED;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjd)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zzbF(zze zze2) {
        if (this.zza.zzp()) {
            this.zze = zzduz.AD_LOAD_FAILED;
            this.zzg = zze2;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzjd)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zzbr(zzbvg zzbvg) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzjd)).booleanValue() && this.zza.zzp()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    public final void zzbs(zzfde zzfde) {
        if (this.zza.zzp()) {
            int i10 = 0;
            if (!zzfde.zzb.zza.isEmpty()) {
                this.zzd = ((zzfcr) zzfde.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfde.zzb.zzb.zzk)) {
                this.zzh = zzfde.zzb.zzb.zzk;
            }
            if (!TextUtils.isEmpty(zzfde.zzb.zzb.zzl)) {
                this.zzi = zzfde.zzb.zzb.zzl;
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zziZ)).booleanValue()) {
                if (!this.zza.zzr()) {
                    this.zzn = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfde.zzb.zzb.zzm)) {
                    this.zzj = zzfde.zzb.zzb.zzm;
                }
                if (zzfde.zzb.zzb.zzn.length() > 0) {
                    this.zzk = zzfde.zzb.zzb.zzn;
                }
                zzdvm zzdvm = this.zza;
                JSONObject jSONObject = this.zzk;
                if (jSONObject != null) {
                    i10 = jSONObject.toString().length();
                }
                if (!TextUtils.isEmpty(this.zzj)) {
                    i10 += this.zzj.length();
                }
                zzdvm.zzj((long) i10);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfcr.zza(this.zzd));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjd)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzl);
            if (this.zzl) {
                jSONObject.put("shown", this.zzm);
            }
        }
        zzcxe zzcxe = this.zzf;
        JSONObject jSONObject2 = null;
        if (zzcxe != null) {
            jSONObject2 = zzi(zzcxe);
        } else {
            zze zze2 = this.zzg;
            if (!(zze2 == null || (iBinder = zze2.zze) == null)) {
                zzcxe zzcxe2 = (zzcxe) iBinder;
                jSONObject2 = zzi(zzcxe2);
                if (zzcxe2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final void zze() {
        this.zzl = true;
    }

    public final void zzf() {
        this.zzm = true;
    }

    public final boolean zzg() {
        return this.zze != zzduz.AD_REQUESTED;
    }
}
