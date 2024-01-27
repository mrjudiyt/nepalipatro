package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzfqo;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfrd;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrz;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzw {
    private String zza = null;
    private String zzb = null;
    private zzcgb zzc = null;
    private zzfqq zzd = null;
    private boolean zze = false;
    private zzfrd zzf;

    private final zzfrf zzl() {
        zzfre zzc2 = zzfrf.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        return zzc2.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcgb zzcgb, Context context) {
        this.zzc = zzcgb;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfqq zzfqq;
        if (!this.zze || (zzfqq = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfqq.zza(zzl(), this.zzf);
        zzd("onLMDOverlayCollapse");
    }

    public final void zzc() {
        zzfqq zzfqq;
        if (!this.zze || (zzfqq = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfqo zzc2 = zzfqp.zzc();
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc2.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc2.zza(this.zzb);
        }
        zzfqq.zzb(zzc2.zzc(), this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    public final void zze(String str, Map map) {
        zzcbg.zze.execute(new zzu(this, str, map));
    }

    /* access modifiers changed from: package-private */
    public final void zzf(String str, String str2) {
        zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put(NativeProtocol.WEB_DIALOG_ACTION, str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfqq zzfqq;
        if (!this.zze || (zzfqq = this.zzd) == null) {
            zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfqq.zzc(zzl(), this.zzf);
        zzd("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str, Map map) {
        zzcgb zzcgb = this.zzc;
        if (zzcgb != null) {
            zzcgb.zzd(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzfrc zzfrc) {
        if (!TextUtils.isEmpty(zzfrc.zzb())) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue()) {
                this.zza = zzfrc.zzb();
            }
        }
        switch (zzfrc.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfrc.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    public final void zzj(zzcgb zzcgb, zzfra zzfra) {
        if (zzcgb == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcgb;
        if (this.zze || zzk(zzcgb.getContext())) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkv)).booleanValue()) {
                this.zzb = zzfra.zzg();
            }
            zzm();
            zzfqq zzfqq = this.zzd;
            if (zzfqq != null) {
                zzfqq.zzd(zzfra, this.zzf);
                return;
            }
            return;
        }
        zzf("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfrz.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfqr.zza(context);
        } catch (NullPointerException e10) {
            zze.zza("Error connecting LMD Overlay service");
            zzt.zzo().zzu(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
