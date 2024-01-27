package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdig implements zzdjr {
    private zzcs zzA;
    private final Context zza;
    private final zzdju zzb;
    private final JSONObject zzc;
    private final zzdoi zzd;
    private final zzdjj zze;
    private final zzaro zzf;
    /* access modifiers changed from: private */
    public final zzcyd zzg;
    /* access modifiers changed from: private */
    public final zzcxj zzh;
    /* access modifiers changed from: private */
    public final zzdfb zzi;
    private final zzfcr zzj;
    private final zzcaz zzk;
    private final zzfdn zzl;
    private final zzcpr zzm;
    private final zzdkn zzn;
    private final Clock zzo;
    private final zzdex zzp;
    private final zzfjx zzq;
    private final zzfje zzr;
    private boolean zzs = false;
    private boolean zzt;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdig(Context context, zzdju zzdju, JSONObject jSONObject, zzdoi zzdoi, zzdjj zzdjj, zzaro zzaro, zzcyd zzcyd, zzcxj zzcxj, zzdfb zzdfb, zzfcr zzfcr, zzcaz zzcaz, zzfdn zzfdn, zzcpr zzcpr, zzdkn zzdkn, Clock clock, zzdex zzdex, zzfjx zzfjx, zzfje zzfje) {
        this.zza = context;
        this.zzb = zzdju;
        this.zzc = jSONObject;
        this.zzd = zzdoi;
        this.zze = zzdjj;
        this.zzf = zzaro;
        this.zzg = zzcyd;
        this.zzh = zzcxj;
        this.zzi = zzdfb;
        this.zzj = zzfcr;
        this.zzk = zzcaz;
        this.zzl = zzfdn;
        this.zzm = zzcpr;
        this.zzn = zzdkn;
        this.zzo = clock;
        this.zzp = zzdex;
        this.zzq = zzfjx;
        this.zzr = zzfje;
    }

    private final String zzD(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdm)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzs2 = com.google.android.gms.ads.internal.util.zzt.zzs((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzay.zzb().zzb(context, zzs2.widthPixels));
                jSONObject7.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzay.zzb().zzb(context, zzs2.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzil)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdid(this, (zzdic) null));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdib(this, (zzdia) null));
            }
            this.zzd.zzi("/nativeImpression", new zzdif(this, (zzdie) null));
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzs) {
                return true;
            }
            this.zzs = zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzE.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e10) {
            zzcat.zzh("Unable to create impression JSON.", e10);
            return false;
        }
    }

    public final boolean zzA() {
        if (zza() == 0) {
            return true;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
            return true;
        }
        return this.zzl.zzi.zzj;
    }

    public final boolean zzB() {
        return zzF();
    }

    public final boolean zzC(Bundle bundle) {
        if (!zzE("impression_reporting")) {
            zzcat.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzay.zzb().zzj(bundle, (JSONObject) null), false);
    }

    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
            return 0;
        }
        return this.zzl.zzi.zzi;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd2 = zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject zzg2 = zzbz.zzg(context, view);
        JSONObject zzf2 = zzbz.zzf(view);
        JSONObject zze2 = zzbz.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzg2);
            jSONObject.put("scroll_view_signal", zzf2);
            jSONObject.put("lock_screen_signal", zze2);
            return jSONObject;
        } catch (JSONException e10) {
            zzcat.zzh("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze2 = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze2 != null) {
                jSONObject.put("nas", zze2);
            }
        } catch (JSONException e10) {
            zzcat.zzh("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    public final void zzg() {
        try {
            zzcs zzcs = this.zzA;
            if (zzcs != null) {
                zzcs.zze();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzh() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzi() {
        this.zzd.zzf();
    }

    public final void zzj(zzcw zzcw) {
        try {
            if (!this.zzu) {
                if (zzcw == null) {
                    zzdjj zzdjj = this.zze;
                    if (zzdjj.zzk() != null) {
                        this.zzu = true;
                        this.zzq.zzc(zzdjj.zzk().zzf(), this.zzr);
                        zzg();
                        return;
                    }
                }
                this.zzu = true;
                this.zzq.zzc(zzcw.zzf(), this.zzr);
                zzg();
            }
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Map map3 = map;
        Context context = this.zza;
        JSONObject zzd2 = zzbz.zzd(context, map3, map2, view2, scaleType);
        JSONObject zzg2 = zzbz.zzg(context, view2);
        JSONObject zzf2 = zzbz.zzf(view2);
        JSONObject zze2 = zzbz.zze(context, view2);
        View view4 = view;
        String zzD = zzD(view, map3);
        zzn(true == ((Boolean) zzba.zzc().zzb(zzbci.zzdt)).booleanValue() ? view3 : view4, zzg2, zzd2, zzf2, zze2, zzD, zzbz.zzc(zzD, context, this.zzx, this.zzw), (JSONObject) null, z10, false);
    }

    public final void zzl(String str) {
        zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzm(Bundle bundle) {
        if (bundle == null) {
            zzcat.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zzcat.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzn((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzay.zzb().zzj(bundle, (JSONObject) null), false, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z12 = false;
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbfc zzbfc = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbfc != null && zzbfc.zzg);
            jSONObject8.put("custom_mute_enabled", !this.zze.zzH().isEmpty() && this.zze.zzk() != null);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(Constants.TIMESTAMP, this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z12 = true;
            }
            jSONObject8.put("has_custom_click_handler", z12);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                zzcat.zzh("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzev)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zzip)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zziq)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            zzcat.zzh("Unable to create click JSON.", e11);
        }
    }

    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        View view3 = view2;
        Map map3 = map;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzky)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzv) {
                zzcat.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzcat.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd2 = zzbz.zzd(this.zza, map3, map2, view3, scaleType);
        JSONObject zzg2 = zzbz.zzg(this.zza, view3);
        JSONObject zzf2 = zzbz.zzf(view2);
        JSONObject zze2 = zzbz.zze(this.zza, view3);
        String zzD = zzD(view, map3);
        JSONObject zzc2 = zzbz.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e10) {
                        e = e10;
                        zzcat.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z10, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                    zzcat.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z10, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                zzcat.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                zzt.zzo().zzu(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg2, zzd2, zzf2, zze2, zzD, zzc2, (JSONObject) null, z10, true);
    }

    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcbj.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String str;
        Context context = this.zza;
        JSONObject zzd2 = zzbz.zzd(context, map, map2, view, scaleType);
        JSONObject zzg2 = zzbz.zzg(context, view);
        JSONObject zzf2 = zzbz.zzf(view);
        JSONObject zze2 = zzbz.zze(context, view);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdm)).booleanValue()) {
            try {
                str = this.zzf.zzc().zzh(this.zza, view, (Activity) null);
            } catch (Exception unused) {
                zzcat.zzg("Exception getting data.");
            }
            zzG(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbz.zzh(this.zza, this.zzj));
        }
        str = null;
        zzG(zzg2, zzd2, zzf2, zze2, str, (JSONObject) null, zzbz.zzh(this.zza, this.zzj));
    }

    public final void zzr() {
        zzG((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = zzbz.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation((float) point.x, (float) point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzcat.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzE("touch_reporting")) {
            zzcat.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i10 = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i10);
        }
    }

    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcat.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdkn zzdkn = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdkn);
            view.setClickable(true);
            zzdkn.zzc = new WeakReference(view);
        }
    }

    public final void zzv() {
        this.zzv = true;
    }

    public final void zzw(zzcs zzcs) {
        this.zzA = zzcs;
    }

    public final void zzx(zzbhi zzbhi) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcat.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbhi);
        }
    }

    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi2 = zzbz.zzi(this.zzk.zzc);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzi2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzi2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }
}
