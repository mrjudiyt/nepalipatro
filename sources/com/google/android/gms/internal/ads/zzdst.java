package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdst extends zzdsw {
    private final zzfij zzg;

    public zzdst(Executor executor, zzcay zzcay, zzfij zzfij, zzfil zzfil, Context context) {
        super(executor, zzcay, zzfil, context);
        this.zzg = zzfij;
        zzfij.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
