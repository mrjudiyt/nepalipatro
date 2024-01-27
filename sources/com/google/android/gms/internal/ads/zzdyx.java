package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdyx implements zzfza {
    public static final /* synthetic */ zzdyx zza = new zzdyx();

    private /* synthetic */ zzdyx() {
    }

    public final e zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        Throwable th = executionException;
        if (cause != null) {
            th = executionException.getCause();
        }
        return zzfzt.zzg(th);
    }
}
