package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdqb implements zzcyg {
    private final zzcgb zza;

    zzdqb(zzcgb zzcgb) {
        this.zza = zzcgb;
    }

    public final void zzbn(Context context) {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.destroy();
        }
    }

    public final void zzbp(Context context) {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.onPause();
        }
    }

    public final void zzbq(Context context) {
        zzcgb zzcgb = this.zza;
        if (zzcgb != null) {
            zzcgb.onResume();
        }
    }
}
