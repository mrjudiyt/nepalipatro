package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfky {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfky zza = new zzfky();
    private Context zzb;

    private zzfky() {
    }

    public static zzfky zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
