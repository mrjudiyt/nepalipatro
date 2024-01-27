package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfkb {
    private boolean zza;

    /* access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfls.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzflb.zzb().zzd(context);
            zzfkt.zza().zzd(context);
            zzflm.zzb(context);
            zzfln.zzd(context);
            zzflq.zza(context);
            zzfky.zzb().zzc(context);
            zzfks.zza().zzd(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
