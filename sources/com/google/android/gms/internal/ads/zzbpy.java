package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbpy extends zzboz {
    /* access modifiers changed from: private */
    public final Object zza;
    private zzbqa zzb;
    private zzbwh zzc;
    private IObjectWrapper zzd;
    /* access modifiers changed from: private */
    public View zze;
    /* access modifiers changed from: private */
    public MediationInterstitialAd zzf;
    /* access modifiers changed from: private */
    public UnifiedNativeAdMapper zzg;
    /* access modifiers changed from: private */
    public MediationRewardedAd zzh;
    /* access modifiers changed from: private */
    public MediationInterscrollerAd zzi;
    /* access modifiers changed from: private */
    public MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzbpy(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(zzl zzl) {
        Bundle bundle;
        Bundle bundle2 = zzl.zzm;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    private final Bundle zzV(String str, zzl zzl, String str2) {
        zzcat.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzl != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzl.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcat.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(zzl zzl) {
        if (zzl.zzf) {
            return true;
        }
        zzay.zzb();
        return zzcam.zzr();
    }

    private static final String zzX(String str, zzl zzl) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzl.zzu;
        }
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting rewarded ad from adapter.");
            try {
                zzbpw zzbpw = new zzbpw(this, zzbpd);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i10 = zzl2.zzg;
                int i11 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i10, i11, zzX, "");
                ((Adapter) this.zza).loadRewardedAd(mediationRewardedAdConfiguration, zzbpw);
            } catch (Exception e10) {
                zzcat.zzh("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzB(zzl zzl, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzl, str, new zzbqb((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbpw zzbpw = new zzbpw(this, zzbpd);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i10 = zzl2.zzg;
                int i11 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i10, i11, zzX, "");
                ((Adapter) this.zza).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, zzbpw);
            } catch (Exception e10) {
                zzcat.zzh("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzD(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final void zzE() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzcat.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzF() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzcat.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzG(boolean z10) {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z10);
            } catch (Throwable th) {
                zzcat.zzh("", th);
            }
        } else {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    public final void zzH(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzj;
            if (mediationAppOpenAd != null) {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcat.zzg("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzI() {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            zzcat.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
            } catch (Throwable th) {
                zzcat.zzh("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            zzI();
        } else {
            zzcat.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcat.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    public final void zzK(IObjectWrapper iObjectWrapper) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            } else {
                zzcat.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzL() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzh;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
            } else {
                zzcat.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final boolean zzM() {
        return false;
    }

    public final boolean zzN() {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || zzbpq.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        Object obj2 = this.zza;
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    public final zzbpi zzO() {
        return null;
    }

    public final zzbpj zzP() {
        return null;
    }

    public final Bundle zze() {
        return new Bundle();
    }

    public final Bundle zzf() {
        return new Bundle();
    }

    public final Bundle zzg() {
        return new Bundle();
    }

    public final zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof zza) {
            try {
                return ((zza) obj).getVideoController();
            } catch (Throwable th) {
                zzcat.zzh("", th);
            }
        }
        return null;
    }

    public final zzbgi zzi() {
        zzbqa zzbqa = this.zzb;
        if (zzbqa == null) {
            return null;
        }
        NativeCustomTemplateAd zza2 = zzbqa.zza();
        if (zza2 instanceof zzbgj) {
            return ((zzbgj) zza2).zza();
        }
        return null;
    }

    public final zzbpg zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbpz(mediationInterscrollerAd);
        }
        return null;
    }

    public final zzbpm zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb2;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbqa zzbqa = this.zzb;
            if (zzbqa == null || (zzb2 = zzbqa.zzb()) == null) {
                return null;
            }
            return new zzbqd(zzb2);
        } else if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
            return null;
        } else {
            return new zzbqd(unifiedNativeAdMapper);
        }
    }

    public final zzbrj zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrj.zza(((Adapter) obj).getVersionInfo());
    }

    public final zzbrj zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbrj.zza(((Adapter) obj).getSDKVersionInfo());
    }

    public final IObjectWrapper zzn() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzcat.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzo() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzcat.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbwh zzbwh, String str2) {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || zzbpq.zza(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = iObjectWrapper;
            this.zzc = zzbwh;
            zzbwh.zzl(ObjectWrapper.wrap(this.zza));
            return;
        }
        Object obj2 = this.zza;
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper r6, com.google.android.gms.internal.ads.zzblk r7, java.util.List r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zza
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.zzbps r0 = new com.google.android.gms.internal.ads.zzbps
            r0.<init>(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0014:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.zzblq r1 = (com.google.android.gms.internal.ads.zzblq) r1
            java.lang.String r2 = r1.zza
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L_0x0066;
                case -1052618729: goto L_0x005c;
                case -239580146: goto L_0x0052;
                case 604727084: goto L_0x0048;
                case 1167692200: goto L_0x003e;
                case 1778294298: goto L_0x0034;
                case 1911491517: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0070
        L_0x002a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 3
            goto L_0x0071
        L_0x0034:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 6
            goto L_0x0071
        L_0x003e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 5
            goto L_0x0071
        L_0x0048:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x0052:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x005c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 4
            goto L_0x0071
        L_0x0066:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0071
        L_0x0070:
            r2 = -1
        L_0x0071:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0097;
                case 2: goto L_0x0094;
                case 3: goto L_0x0091;
                case 4: goto L_0x008e;
                case 5: goto L_0x008b;
                case 6: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x009c
        L_0x0076:
            com.google.android.gms.internal.ads.zzbca r2 = com.google.android.gms.internal.ads.zzbci.zzkM
            com.google.android.gms.internal.ads.zzbcg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r4.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x009c
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L_0x009c
        L_0x008b:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            goto L_0x009c
        L_0x008e:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L_0x009c
        L_0x0091:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L_0x009c
        L_0x0094:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L_0x009c
        L_0x0097:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L_0x009c
        L_0x009a:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.BANNER
        L_0x009c:
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.MediationConfiguration r2 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r1 = r1.zzb
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L_0x0014
        L_0x00aa:
            java.lang.Object r8 = r5.zza
            com.google.android.gms.ads.mediation.Adapter r8 = (com.google.android.gms.ads.mediation.Adapter) r8
            java.lang.Object r6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        L_0x00b8:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpy.zzq(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzblk, java.util.List):void");
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwh, List list) {
        zzcat.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public final void zzs(zzl zzl, String str) {
        zzB(zzl, str, (String) null);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        zzl zzl2 = zzl;
        String str2 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting app open ad from adapter.");
            try {
                zzbpx zzbpx = new zzbpx(this, zzbpd);
                Bundle zzV = zzV(str2, zzl2, (String) null);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i10 = zzl2.zzg;
                int i11 = zzl2.zzt;
                String zzX = zzX(str2, zzl2);
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = r5;
                MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration2 = new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i10, i11, zzX, "");
                ((Adapter) this.zza).loadAppOpenAd(mediationAppOpenAdConfiguration, zzbpx);
            } catch (Exception e10) {
                zzcat.zzh("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbpd zzbpd) {
        zzv(iObjectWrapper, zzq, zzl, str, (String) null, zzbpd);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbpd zzbpd) {
        AdSize adSize;
        Date date;
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbpd zzbpd2 = zzbpd;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            zzcat.zze("Requesting banner ad from adapter.");
            if (zzq2.zzn) {
                adSize = zzb.zzd(zzq2.zze, zzq2.zzb);
            } else {
                adSize = zzb.zzc(zzq2.zze, zzq2.zzb, zzq2.zza);
            }
            AdSize adSize2 = adSize;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = zzl2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j10 = zzl2.zzb;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzbpp zzbpp = new zzbpp(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpd2), zzV(str3, zzl2, str4), adSize2, zzbpp, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcat.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    zzbpt zzbpt = new zzbpt(this, zzbpd2);
                    Bundle zzV = zzV(str3, zzl2, str4);
                    Bundle zzU = zzU(zzl2);
                    boolean zzW = zzW(zzl);
                    Location location = zzl2.zzk;
                    int i10 = zzl2.zzg;
                    int i11 = zzl2.zzt;
                    String zzX = zzX(str3, zzl2);
                    String str5 = this.zzk;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration = r2;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i10, i11, zzX, adSize2, str5);
                    ((Adapter) obj2).loadBannerAd(mediationBannerAdConfiguration, zzbpt);
                } catch (Throwable th2) {
                    zzcat.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            zzcat.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbpd zzbpd) {
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzcat.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                zzbpr zzbpr = new zzbpr(this, zzbpd, adapter);
                Bundle zzV = zzV(str3, zzl2, str2);
                Bundle zzU = zzU(zzl2);
                boolean zzW = zzW(zzl);
                Location location = zzl2.zzk;
                int i10 = zzl2.zzg;
                int i11 = zzl2.zzt;
                String zzX = zzX(str3, zzl2);
                AdSize zze2 = zzb.zze(zzq2.zze, zzq2.zzb);
                MediationBannerAdConfiguration mediationBannerAdConfiguration = r6;
                MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV, zzU, zzW, location, i10, i11, zzX, zze2, "");
                adapter.loadInterscrollerAd(mediationBannerAdConfiguration, zzbpr);
            } catch (Exception e10) {
                zzcat.zzh("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbpd zzbpd) {
        zzy(iObjectWrapper, zzl, str, (String) null, zzbpd);
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbpd zzbpd) {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbpd zzbpd2 = zzbpd;
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            zzcat.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = zzl2.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j10 = zzl2.zzb;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzbpp zzbpp = new zzbpp(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqa(zzbpd2), zzV(str3, zzl2, str4), zzbpp, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcat.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str3, zzl2, str4), zzU(zzl2), zzW(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzX(str3, zzl2), this.zzk), new zzbpu(this, zzbpd2));
                } catch (Throwable th2) {
                    zzcat.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbpd zzbpd, zzbfc zzbfc, List list) {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbpd zzbpd2 = zzbpd;
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            zzcat.zze("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = zzl2.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j10 = zzl2.zzb;
                    if (j10 == -1) {
                        date = null;
                    } else {
                        date = new Date(j10);
                    }
                    zzbqc zzbqc = new zzbqc(date, zzl2.zzd, hashSet, zzl2.zzk, zzW(zzl), zzl2.zzg, zzbfc, list, zzl2.zzr, zzl2.zzt, zzX(str3, zzl2));
                    Bundle bundle = zzl2.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzbqa(zzbpd2);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str3, zzl2, str4), zzbqc, bundle2);
                } catch (Throwable th) {
                    zzcat.zzh("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str3, zzl2, str4), zzU(zzl2), zzW(zzl), zzl2.zzk, zzl2.zzg, zzl2.zzt, zzX(str3, zzl2), this.zzk, zzbfc), new zzbpv(this, zzbpd2));
                } catch (Throwable th2) {
                    zzcat.zzh("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            zzcat.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public zzbpy(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
