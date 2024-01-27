package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchx {
    /* access modifiers changed from: private */
    public zzcaz zza;
    /* access modifiers changed from: private */
    public Context zzb;
    /* access modifiers changed from: private */
    public WeakReference zzc;

    public final zzchx zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzchx zzd(zzcaz zzcaz) {
        this.zza = zzcaz;
        return this;
    }
}
