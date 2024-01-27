package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcsj(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcsj zza(Context context, View view, zzfcr zzfcr) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcsj zzcsj = new zzcsj(context);
        if (!(zzfcr.zzw.isEmpty() || (resources = zzcsj.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfcs zzfcs = (zzfcs) zzfcr.zzw.get(0);
            float f10 = displayMetrics.density;
            zzcsj.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfcs.zza) * f10), (int) (((float) zzfcs.zzb) * f10)));
        }
        zzcsj.zzb = view;
        zzcsj.addView(view);
        zzt.zzx();
        zzcbt.zzb(zzcsj, zzcsj);
        zzt.zzx();
        zzcbt.zza(zzcsj, zzcsj);
        JSONObject jSONObject = zzfcr.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcsj.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcsj.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcsj.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcsj.addView(relativeLayout);
        return zzcsj;
    }

    private final int zzb(double d10) {
        zzay.zzb();
        return zzcam.zzx(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(ViewHierarchyConstants.TEXT_KEY, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
