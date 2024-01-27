package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdvu implements zzo, zzchm {
    private final Context zza;
    private final zzcaz zzb;
    private zzdvm zzc;
    private zzcgb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzda zzh;
    private boolean zzi;

    zzdvu(Context context, zzcaz zzcaz) {
        this.zza = context;
        this.zzb = zzcaz;
    }

    private final synchronized boolean zzl(zzda zzda) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zziF)).booleanValue()) {
            zzcat.zzj("Ad inspector had an internal error.");
            try {
                zzda.zze(zzfeo.zzd(16, (String) null, (zze) null));
            } catch (RemoteException unused) {
            }
        } else if (this.zzc == null) {
            zzcat.zzj("Ad inspector had an internal error.");
            try {
                zzt.zzo().zzu(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzda.zze(zzfeo.zzd(16, (String) null, (zze) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.zze && !this.zzf) {
                if (zzt.zzB().currentTimeMillis() >= this.zzg + ((long) ((Integer) zzba.zzc().zzb(zzbci.zziI)).intValue())) {
                    return true;
                }
            }
            zzcat.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzda.zze(zzfeo.zzd(19, (String) null, (zze) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzcat.zzj("Ad inspector failed to load.");
        try {
            zzcac zzo = zzt.zzo();
            zzo.zzu(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            zzda zzda = this.zzh;
            if (zzda != null) {
                zzda.zze(zzfeo.zzd(17, (String) null, (zze) null));
            }
        } catch (RemoteException e10) {
            zzt.zzo().zzu(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    public final void zzbL() {
    }

    public final void zzbo() {
    }

    public final void zzbu() {
    }

    public final synchronized void zzbv() {
        this.zzf = true;
        zzk("");
    }

    public final void zzbx() {
    }

    public final synchronized void zzby(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            zzda zzda = this.zzh;
            if (zzda != null) {
                try {
                    zzda.zze((zze) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcgb zzcgb = this.zzd;
        if (zzcgb == null || zzcgb.zzaz()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdvm zzdvm) {
        this.zzc = zzdvm;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str) {
        JSONObject zze2 = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze2.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze2.toString());
    }

    public final synchronized void zzj(zzda zzda, zzbkc zzbkc, zzbjv zzbjv) {
        zzda zzda2 = zzda;
        synchronized (this) {
            if (zzl(zzda)) {
                try {
                    zzt.zzz();
                    zzcgb zza2 = zzcgn.zza(this.zza, zzchq.zza(), "", false, false, (zzaro) null, (zzbdk) null, this.zzb, (zzbda) null, (zzl) null, (zza) null, zzaxv.zza(), (zzfcr) null, (zzfcv) null, (zzedz) null);
                    this.zzd = zza2;
                    zzcho zzN = zza2.zzN();
                    if (zzN == null) {
                        zzcat.zzj("Failed to obtain a web view for the ad inspector");
                        try {
                            zzt.zzo().zzu(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                            zzda2.zze(zzfeo.zzd(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                        } catch (RemoteException e10) {
                            zzt.zzo().zzu(e10, "InspectorUi.openInspector 3");
                        }
                    } else {
                        this.zzh = zzda2;
                        zzN.zzM((com.google.android.gms.ads.internal.client.zza) null, (zzbhz) null, (zzo) null, (zzbib) null, (zzz) null, false, (zzbjl) null, (zzb) null, (zzbrz) null, (zzbxu) null, (zzedo) null, (zzfjx) null, (zzdso) null, (zzfib) null, zzbkc, (zzdfd) null, new zzbkb(this.zza), zzbjv, (zzcou) null);
                        zzN.zzA(this);
                        this.zzd.loadUrl((String) zzba.zzc().zzb(zzbci.zziG));
                        zzt.zzi();
                        zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                        this.zzg = zzt.zzB().currentTimeMillis();
                    }
                } catch (zzcgm e11) {
                    zzcat.zzk("Failed to obtain a web view for the ad inspector", e11);
                    try {
                        zzt.zzo().zzu(e11, "InspectorUi.openInspector 0");
                        zzda2.zze(zzfeo.zzd(17, "Failed to obtain a web view for the ad inspector", (zze) null));
                    } catch (RemoteException e12) {
                        zzt.zzo().zzu(e12, "InspectorUi.openInspector 1");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzk(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zze     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.zzf     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.zzgad r0 = com.google.android.gms.internal.ads.zzcbg.zze     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.zzdvt r1 = new com.google.android.gms.internal.ads.zzdvt     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvu.zzk(java.lang.String):void");
    }
}
