package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbrh extends zzbqu {
    private final RtbAdapter zza;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzb;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzc;
    /* access modifiers changed from: private */
    public MediationAppOpenAd zzd;
    private String zze = "";

    public zzbrh(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(zzl zzl) {
        Bundle bundle;
        Bundle bundle2 = zzl.zzm;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private static final Bundle zzw(String str) {
        zzcat.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            zzcat.zzh("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(zzl zzl) {
        if (zzl.zzf) {
            return true;
        }
        zzay.zzb();
        return zzcam.zzr();
    }

    private static final String zzy(String str, zzl zzl) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzl.zzu;
        }
    }

    public final zzdq zze() {
        RtbAdapter rtbAdapter = this.zza;
        if (rtbAdapter instanceof zza) {
            try {
                return ((zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzcat.zzh("", th);
            }
        }
        return null;
    }

    public final zzbrj zzf() {
        return zzbrj.zza(this.zza.getVersionInfo());
    }

    public final zzbrj zzg() {
        return zzbrj.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
        r1 = new com.google.android.gms.ads.mediation.MediationConfiguration(r5, r7);
        r5 = new java.util.ArrayList();
        r5.add(r1);
        r9.collectSignals(new com.google.android.gms.ads.mediation.rtb.RtbSignalData((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4), r5, r6, com.google.android.gms.ads.zzb.zzc(r8.zze, r8.zzb, r8.zza)), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        throw new java.lang.IllegalArgumentException("Internal Error");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper r4, java.lang.String r5, android.os.Bundle r6, android.os.Bundle r7, com.google.android.gms.ads.internal.client.zzq r8, com.google.android.gms.internal.ads.zzbqy r9) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbrf r0 = new com.google.android.gms.internal.ads.zzbrf     // Catch:{ all -> 0x00ae }
            r0.<init>(r3, r9)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r9 = r3.zza     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch:{ all -> 0x00ae }
            int r2 = r5.hashCode()     // Catch:{ all -> 0x00ae }
            switch(r2) {
                case -1396342996: goto L_0x004d;
                case -1052618729: goto L_0x0043;
                case -239580146: goto L_0x0039;
                case 604727084: goto L_0x002f;
                case 1167692200: goto L_0x0025;
                case 1778294298: goto L_0x001b;
                case 1911491517: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0057
        L_0x0011:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 3
            goto L_0x0058
        L_0x001b:
            java.lang.String r2 = "app_open_ad"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 6
            goto L_0x0058
        L_0x0025:
            java.lang.String r2 = "app_open"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 5
            goto L_0x0058
        L_0x002f:
            java.lang.String r2 = "interstitial"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0039:
            java.lang.String r2 = "rewarded"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 2
            goto L_0x0058
        L_0x0043:
            java.lang.String r2 = "native"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 4
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "banner"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0057
            r5 = 0
            goto L_0x0058
        L_0x0057:
            r5 = -1
        L_0x0058:
            switch(r5) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007d;
                case 2: goto L_0x007a;
                case 3: goto L_0x0077;
                case 4: goto L_0x0074;
                case 5: goto L_0x0071;
                case 6: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x00a6
        L_0x005c:
            com.google.android.gms.internal.ads.zzbca r5 = com.google.android.gms.internal.ads.zzbci.zzkM     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.ads.zzbcg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00ae }
            java.lang.Object r5 = r2.zzb(r5)     // Catch:{ all -> 0x00ae }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00ae }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x00a6
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x0071:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x0074:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x0077:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x007a:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x007d:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch:{ all -> 0x00ae }
            goto L_0x0082
        L_0x0080:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.BANNER     // Catch:{ all -> 0x00ae }
        L_0x0082:
            r1.<init>(r5, r7)     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            r5.<init>()     // Catch:{ all -> 0x00ae }
            r5.add(r1)     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r7 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch:{ all -> 0x00ae }
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch:{ all -> 0x00ae }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x00ae }
            int r1 = r8.zze     // Catch:{ all -> 0x00ae }
            int r2 = r8.zzb     // Catch:{ all -> 0x00ae }
            java.lang.String r8 = r8.zza     // Catch:{ all -> 0x00ae }
            com.google.android.gms.ads.AdSize r8 = com.google.android.gms.ads.zzb.zzc(r1, r2, r8)     // Catch:{ all -> 0x00ae }
            r7.<init>(r4, r5, r6, r8)     // Catch:{ all -> 0x00ae }
            r9.collectSignals(r7, r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00a6:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = "Internal Error"
            r4.<init>(r5)     // Catch:{ all -> 0x00ae }
            throw r4     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r4 = move-exception
            java.lang.String r5 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.zzcat.zzh(r5, r4)
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrh.zzh(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.internal.ads.zzbqy):void");
    }

    public final void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqg zzbqg, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzl2), zzx(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzy(str2, zzl), this.zze), new zzbre(this, zzbqg, zzbpd));
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqj zzbqj, zzbpd zzbpd, zzq zzq) {
        zzl zzl2 = zzl;
        zzq zzq2 = zzq;
        try {
            zzbra zzbra = new zzbra(this, zzbqj, zzbpd);
            RtbAdapter rtbAdapter = this.zza;
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzl2);
            boolean zzx = zzx(zzl);
            Location location = zzl2.zzk;
            int i10 = zzl2.zzg;
            int i11 = zzl2.zzt;
            String zzy = zzy(str2, zzl);
            AdSize zzc2 = zzb.zzc(zzq2.zze, zzq2.zzb, zzq2.zza);
            String str3 = this.zze;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw, zzv, zzx, location, i10, i11, zzy, zzc2, str3);
            rtbAdapter.loadRtbBannerAd(mediationBannerAdConfiguration, zzbra);
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqj zzbqj, zzbpd zzbpd, zzq zzq) {
        zzl zzl2 = zzl;
        zzq zzq2 = zzq;
        try {
            zzbrb zzbrb = new zzbrb(this, zzbqj, zzbpd);
            RtbAdapter rtbAdapter = this.zza;
            Bundle zzw = zzw(str2);
            Bundle zzv = zzv(zzl2);
            boolean zzx = zzx(zzl);
            Location location = zzl2.zzk;
            int i10 = zzl2.zzg;
            int i11 = zzl2.zzt;
            String zzy = zzy(str2, zzl);
            AdSize zzc2 = zzb.zzc(zzq2.zze, zzq2.zzb, zzq2.zza);
            String str3 = this.zze;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw, zzv, zzx, location, i10, i11, zzy, zzc2, str3);
            rtbAdapter.loadRtbInterscrollerAd(mediationBannerAdConfiguration, zzbrb);
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqm zzbqm, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzl2), zzx(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzy(str2, zzl), this.zze), new zzbrc(this, zzbqm, zzbpd));
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqp zzbqp, zzbpd zzbpd) {
        zzn(str, str2, zzl, iObjectWrapper, zzbqp, zzbpd, (zzbfc) null);
    }

    public final void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqp zzbqp, zzbpd zzbpd, zzbfc zzbfc) {
        zzl zzl2 = zzl;
        try {
            zzbrd zzbrd = new zzbrd(this, zzbqp, zzbpd);
            RtbAdapter rtbAdapter = this.zza;
            MediationNativeAdConfiguration mediationNativeAdConfiguration = r4;
            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzl2), zzx(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzy(str2, zzl), this.zze, zzbfc);
            rtbAdapter.loadRtbNativeAd(mediationNativeAdConfiguration, zzbrd);
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqs zzbqs, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzl2), zzx(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzy(str2, zzl), this.zze), new zzbrg(this, zzbqs, zzbpd));
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzp(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbqs zzbqs, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzl2), zzx(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzy(str2, zzl), this.zze), new zzbrg(this, zzbqs, zzbpd));
        } catch (Throwable th) {
            zzcat.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    public final void zzq(String str) {
        this.zze = str;
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcat.zzh("", th);
            return true;
        }
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcat.zzh("", th);
            return true;
        }
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcat.zzh("", th);
            return true;
        }
    }
}
