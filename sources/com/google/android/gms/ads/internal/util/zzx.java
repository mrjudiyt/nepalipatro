package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzx implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ zzy zza;
    public final /* synthetic */ Activity zzb;

    public /* synthetic */ zzx(zzy zzy, Activity activity) {
        this.zza = zzy;
        this.zzb = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzy.zzm(this.zzb, view, windowInsets);
    }
}
