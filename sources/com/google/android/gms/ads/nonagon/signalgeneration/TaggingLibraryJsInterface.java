package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.share.internal.ShareConstants;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzarp;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzgad;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class TaggingLibraryJsInterface {
    private final Context zza;
    /* access modifiers changed from: private */
    public final WebView zzb;
    private final zzaro zzc;
    private final int zzd;
    private final zzdst zze;
    private final boolean zzf;
    private final zzgad zzg = zzcbg.zze;
    private final zzfjx zzh;

    TaggingLibraryJsInterface(WebView webView, zzaro zzaro, zzdst zzdst, zzfjx zzfjx) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaro;
        this.zze = zzdst;
        zzbci.zza(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbci.zzji)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbci.zzjj)).booleanValue();
        this.zzh = zzfjx;
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = zzt.zzB().currentTimeMillis();
            String zze2 = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzB().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdsj) null, "csg", new Pair("clat", String.valueOf(currentTimeMillis2)));
            }
            return zze2;
        } catch (RuntimeException e10) {
            zzcat.zzh("Exception getting click signals. ", e10);
            zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getClickSignalsWithTimeout(String str, int i10) {
        if (i10 <= 0) {
            zzcat.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        int min = Math.min(i10, this.zzd);
        try {
            return (String) zzcbg.zza.zzb(new zzap(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcat.zzh("Exception getting click signals with timeout. ", e10);
            zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e10 instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getQueryInfo() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        zzar zzar = new zzar(this, uuid);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjl)).booleanValue()) {
            this.zzg.execute(new zzaq(this, bundle, zzar));
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzar);
        }
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getViewSignals() {
        try {
            long currentTimeMillis = zzt.zzB().currentTimeMillis();
            String zzh2 = this.zzc.zzc().zzh(this.zza, this.zzb, (Activity) null);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzB().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdsj) null, "vsg", new Pair("vlat", String.valueOf(currentTimeMillis2)));
            }
            return zzh2;
        } catch (RuntimeException e10) {
            zzcat.zzh("Exception getting view signals. ", e10);
            zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzcat.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        int min = Math.min(i10, this.zzd);
        try {
            return (String) zzcbg.zza.zzb(new zzan(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzcat.zzh("Exception getting view signals with timeout. ", e10);
            zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e10 instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public void recordClick(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjn)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzcbg.zza.execute(new zzao(this, str));
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    @KeepForSdk
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("x");
            int i11 = jSONObject.getInt("y");
            int i12 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt(ShareConstants.MEDIA_TYPE);
            try {
                this.zzc.zzd(MotionEvent.obtain(0, (long) i12, i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i10, (float) i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e10) {
                e = e10;
                zzcat.zzh("Failed to parse the touch string. ", e);
                zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
            zzcat.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb2 = zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb2 != null ? zzb2.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzc.zza(parse, this.zza, this.zzb, (Activity) null);
        } catch (zzarp e10) {
            zzcat.zzf("Failed to append the click signal to URL: ", e10);
            zzt.zzo().zzu(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(parse.toString(), (zzfje) null);
    }
}
