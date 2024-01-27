package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzp extends AnimatorListenerAdapter {
    final /* synthetic */ zzr zza;

    zzp(zzr zzr) {
        this.zza = zzr;
    }

    private final void zza(boolean z10) {
        this.zza.setEnabled(z10);
        this.zza.zza.setEnabled(z10);
    }

    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
