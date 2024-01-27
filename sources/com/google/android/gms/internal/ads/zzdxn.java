package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdxn implements zzfza {
    public static final /* synthetic */ zzdxn zza = new zzdxn();

    private /* synthetic */ zzdxn() {
    }

    public final e zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzfzt.zzg(new zzdwm(5));
    }
}
