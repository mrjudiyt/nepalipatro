package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebp implements zzdcd, zza, zzcyf, zzcxp {
    private final Context zza;
    private final zzfed zzb;
    private final zzfde zzc;
    private final zzfcr zzd;
    private final zzedo zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzba.zzc().zzb(zzbci.zzgN)).booleanValue();
    private final zzfib zzh;
    private final String zzi;

    public zzebp(Context context, zzfed zzfed, zzfde zzfde, zzfcr zzfcr, zzedo zzedo, zzfib zzfib, String str) {
        this.zza = context;
        this.zzb = zzfed;
        this.zzc = zzfde;
        this.zzd = zzfcr;
        this.zze = zzedo;
        this.zzh = zzfib;
        this.zzi = str;
    }

    private final zzfia zzd(String str) {
        zzfia zzb2 = zzfia.zzb(str);
        zzb2.zzh(this.zzc, (zzcag) null);
        zzb2.zzf(this.zzd);
        zzb2.zza("request_id", this.zzi);
        if (!this.zzd.zzv.isEmpty()) {
            zzb2.zza("ancn", (String) this.zzd.zzv.get(0));
        }
        if (this.zzd.zzak) {
            zzb2.zza("device_connectivity", true != zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzb2.zza("offline_ad", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        return zzb2;
    }

    private final void zze(zzfia zzfia) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzedq(zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfia), 2));
            return;
        }
        this.zzh.zzb(zzfia);
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) zzba.zzc().zzb(zzbci.zzbr);
                    zzt.zzp();
                    String zzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    boolean z10 = false;
                    if (!(str == null || zzp == null)) {
                        try {
                            z10 = Pattern.matches(str, zzp);
                        } catch (RuntimeException e10) {
                            zzt.zzo().zzu(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zze(zzd("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzg) {
            int i10 = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i10 = zze4.zza;
                str = zze4.zzb;
            }
            String zza2 = this.zzb.zza(str);
            zzfia zzd2 = zzd("ifts");
            zzd2.zza(Constants.REASON, "adapter");
            if (i10 >= 0) {
                zzd2.zza("arec", String.valueOf(i10));
            }
            if (zza2 != null) {
                zzd2.zza("areec", zza2);
            }
            this.zzh.zzb(zzd2);
        }
    }

    public final void zzb() {
        if (this.zzg) {
            zzfib zzfib = this.zzh;
            zzfia zzd2 = zzd("ifts");
            zzd2.zza(Constants.REASON, "blocked");
            zzfib.zzb(zzd2);
        }
    }

    public final void zzc(zzdhe zzdhe) {
        if (this.zzg) {
            zzfia zzd2 = zzd("ifts");
            zzd2.zza(Constants.REASON, Constants.EXCEPTION);
            if (!TextUtils.isEmpty(zzdhe.getMessage())) {
                zzd2.zza("msg", zzdhe.getMessage());
            }
            this.zzh.zzb(zzd2);
        }
    }

    public final void zzi() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_shown"));
        }
    }

    public final void zzj() {
        if (zzf()) {
            this.zzh.zzb(zzd("adapter_impression"));
        }
    }

    public final void zzq() {
        if (zzf() || this.zzd.zzak) {
            zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
