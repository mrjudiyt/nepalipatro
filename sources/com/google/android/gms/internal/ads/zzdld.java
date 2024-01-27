package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdld {
    private final zzdpt zza;
    private final zzdoi zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdld(zzdpt zzdpt, zzdoi zzdoi) {
        this.zza = zzdpt;
        this.zzb = zzdoi;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return zzcam.zzx(context, i10);
    }

    public final View zza(View view, WindowManager windowManager) {
        zzcgb zza2 = this.zza.zza(zzq.zzc(), (zzfcr) null, (zzfcv) null);
        View view2 = (View) zza2;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza2.zzad("/sendMessageToSdk", new zzdkx(this));
        zza2.zzad("/hideValidatorOverlay", new zzdky(this, windowManager, view));
        zza2.zzad("/open", new zzbju((zzb) null, (zzbrs) null, (zzedo) null, (zzdso) null, (zzfib) null, (zzcou) null));
        this.zzb.zzj(new WeakReference(zza2), "/loadNativeAdPolicyViolations", new zzdkz(this, view, windowManager));
        this.zzb.zzj(new WeakReference(zza2), "/showValidatorOverlay", zzdla.zza);
        return (View) zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcgb zzcgb, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcgb zzcgb, Map map) {
        zzcat.zze("Hide native ad policy validator overlay.");
        zzcgb.zzF().setVisibility(8);
        if (zzcgb.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcgb.zzF());
        }
        zzcgb.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(View view, WindowManager windowManager, zzcgb zzcgb, Map map) {
        int i10;
        zzcgb.zzN().zzA(new zzdlc(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzba.zzc().zzb(zzbci.zzhQ)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzba.zzc().zzb(zzbci.zzhR)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcgb.zzag(zzchq.zzb(zzf, zzf2));
            try {
                zzcgb.zzG().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().zzb(zzbci.zzhS)).booleanValue());
                zzcgb.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().zzb(zzbci.zzhT)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb2 = zzbz.zzb();
            zzb2.x = zzf3;
            zzb2.y = zzf4;
            windowManager.updateViewLayout(zzcgb.zzF(), zzb2);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str) || "2".equals(str)) {
                    i10 = rect.bottom;
                } else {
                    i10 = rect.top;
                }
                this.zzc = new zzdlb(view, zzcgb, str, zzb2, i10 - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcgb.loadUrl(str2);
            }
        }
    }
}
