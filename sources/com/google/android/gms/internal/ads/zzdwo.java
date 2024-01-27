package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdwo implements zzfza {
    public static final /* synthetic */ zzdwo zza = new zzdwo();

    private /* synthetic */ zzdwo() {
    }

    public final e zza(Object obj) {
        return zzfzt.zzg(((ExecutionException) obj).getCause());
    }
}
