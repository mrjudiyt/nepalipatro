package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkt extends zzfkw {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfkt zzb = new zzfkt();

    private zzfkt() {
    }

    public static zzfkt zza() {
        return zzb;
    }

    public final void zzb(boolean z10) {
        for (zzfkg zzg : zzfku.zza().zzc()) {
            zzflh zzg2 = zzg.zzg();
            if (zzg2.zzl()) {
                zzfla.zza().zzb(zzg2.zza(), "setState", true != z10 ? "backgrounded" : "foregrounded");
            }
        }
    }

    public final boolean zzc() {
        for (zzfkg zzf : zzfku.zza().zzb()) {
            View zzf2 = zzf.zzf();
            if (zzf2 != null && zzf2.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
