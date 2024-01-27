package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdpn implements View.OnTouchListener {
    public final /* synthetic */ zzdps zza;

    public /* synthetic */ zzdpn(zzdps zzdps) {
        this.zza = zzdps;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}
