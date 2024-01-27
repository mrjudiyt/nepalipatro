package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdrx implements zzdcd, zza, zzcyf, zzcxp {
    private final Context zza;
    private final zzfed zzb;
    private final zzdso zzc;
    private final zzfde zzd;
    private final zzfcr zze;
    private final zzedo zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbci.zzgN)).booleanValue();

    public zzdrx(Context context, zzfed zzfed, zzdso zzdso, zzfde zzfde, zzfcr zzfcr, zzedo zzedo) {
        this.zza = context;
        this.zzb = zzfed;
        this.zzc = zzdso;
        this.zzd = zzfde;
        this.zze = zzfcr;
        this.zzf = zzedo;
    }

    private final zzdsn zzd(String str) {
        zzdsn zza2 = this.zzc.zza();
        zza2.zze(this.zzd.zzb.zzb);
        zza2.zzd(this.zze);
        zza2.zzb(NativeProtocol.WEB_DIALOG_ACTION, str);
        boolean z10 = false;
        if (!this.zze.zzv.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzv.get(0));
        }
        if (this.zze.zzak) {
            zza2.zzb("device_connectivity", true != zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzB().currentTimeMillis()));
            zza2.zzb("offline_ad", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzgW)).booleanValue()) {
            if (zzf.zze(this.zzd.zza.zza) != 1) {
                z10 = true;
            }
            zza2.zzb("scar", String.valueOf(z10));
            if (z10) {
                zzl zzl = this.zzd.zza.zza.zzd;
                zza2.zzc("ragent", zzl.zzp);
                zza2.zzc("rtype", zzf.zza(zzf.zzb(zzl)));
            }
        }
        return zza2;
    }

    private final void zze(zzdsn zzdsn) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzedq(zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdsn.zzf(), 2));
            return;
        }
        zzdsn.zzg();
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzak) {
            zze(zzd("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzh) {
            zzdsn zzd2 = zzd("ifts");
            zzd2.zzb(Constants.REASON, "adapter");
            int i10 = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i10 = zze4.zza;
                str = zze4.zzb;
            }
            if (i10 >= 0) {
                zzd2.zzb("arec", String.valueOf(i10));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzd2.zzb("areec", zza2);
            }
            zzd2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            zzdsn zzd2 = zzd("ifts");
            zzd2.zzb(Constants.REASON, "blocked");
            zzd2.zzg();
        }
    }

    public final void zzc(zzdhe zzdhe) {
        if (this.zzh) {
            zzdsn zzd2 = zzd("ifts");
            zzd2.zzb(Constants.REASON, Constants.EXCEPTION);
            if (!TextUtils.isEmpty(zzdhe.getMessage())) {
                zzd2.zzb("msg", zzdhe.getMessage());
            }
            zzd2.zzg();
        }
    }

    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    public final void zzq() {
        if (zzf() || this.zze.zzak) {
            zze(zzd(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
