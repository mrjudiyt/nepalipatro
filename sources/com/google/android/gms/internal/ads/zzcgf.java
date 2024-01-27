package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcgf implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxu zza;
    final /* synthetic */ zzcgi zzb;

    zzcgf(zzcgi zzcgi, zzbxu zzbxu) {
        this.zzb = zzcgi;
        this.zza = zzbxu;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
