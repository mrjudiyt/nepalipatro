package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.appevents.AppEventsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdlb implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzcgb zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ WindowManager.LayoutParams zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdlb(View view, zzcgb zzcgb, String str, WindowManager.LayoutParams layoutParams, int i10, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzcgb;
        this.zzc = str;
        this.zzd = layoutParams;
        this.zze = i10;
        this.zzf = windowManager;
    }

    public final void onScrollChanged() {
        Rect rect = new Rect();
        if (this.zza.getGlobalVisibleRect(rect)) {
            zzcgb zzcgb = this.zzb;
            if (zzcgb.zzF().getWindowToken() != null) {
                int i10 = this.zze;
                WindowManager.LayoutParams layoutParams = this.zzd;
                String str = this.zzc;
                if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(str) || "2".equals(str)) {
                    layoutParams.y = rect.bottom - i10;
                } else {
                    layoutParams.y = rect.top - i10;
                }
                this.zzf.updateViewLayout(zzcgb.zzF(), layoutParams);
            }
        }
    }
}
