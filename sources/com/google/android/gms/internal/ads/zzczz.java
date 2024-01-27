package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzczz implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzczz(zzdaa zzdaa, zzczy zzczy) {
        this.zza = new WeakReference(zzdaa);
    }

    public final void run() {
        zzdaa zzdaa = (zzdaa) this.zza.get();
        if (zzdaa != null) {
            zzdaa.zzt(zzczx.zza);
        }
    }
}
