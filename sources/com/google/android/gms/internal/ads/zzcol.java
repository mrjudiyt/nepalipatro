package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcol implements zzcyg {
    private final zzfej zza;

    public zzcol(zzfej zzfej) {
        this.zza = zzfej;
    }

    public final void zzbn(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfds e10) {
            zzcat.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    public final void zzbp(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfds e10) {
            zzcat.zzk("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    public final void zzbq(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfds e10) {
            zzcat.zzk("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
