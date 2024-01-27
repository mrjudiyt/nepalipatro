package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfje implements Runnable {
    private final List zza = new ArrayList();
    private final zzfjh zzb;
    private String zzc;
    private String zzd;
    private zzfdd zze;
    private zze zzf;
    private Future zzg;
    private int zzh = 2;

    zzfje(zzfjh zzfjh) {
        this.zzb = zzfjh;
    }

    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfje zza(zzfit zzfit) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfit.zzi();
            list.add(zzfit);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcbg.zzd.schedule(this, (long) ((Integer) zzba.zzc().zzb(zzbci.zziy)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfje zzb(String str) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue() && zzfjd.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfje zzc(zze zze2) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzf = zze2;
        }
        return this;
    }

    public final synchronized zzfje zzd(ArrayList arrayList) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE)) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzh = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.zzh = 6;
                                            }
                                        }
                                    }
                                    this.zzh = 5;
                                }
                            }
                            this.zzh = 8;
                        }
                    }
                    this.zzh = 4;
                }
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfje zze(String str) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfje zzf(zzfdd zzfdd) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zze = zzfdd;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfit zzfit : this.zza) {
                int i10 = this.zzh;
                if (i10 != 2) {
                    zzfit.zzm(i10);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfit.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfit.zzk()) {
                    zzfit.zzd(this.zzd);
                }
                zzfdd zzfdd = this.zze;
                if (zzfdd != null) {
                    zzfit.zzb(zzfdd);
                } else {
                    zze zze2 = this.zzf;
                    if (zze2 != null) {
                        zzfit.zza(zze2);
                    }
                }
                this.zzb.zzb(zzfit.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfje zzh(int i10) {
        if (((Boolean) zzbdu.zzc.zze()).booleanValue()) {
            this.zzh = i10;
        }
        return this;
    }
}
