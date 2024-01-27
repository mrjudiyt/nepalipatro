package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzedk implements Callable {
    public final /* synthetic */ zzedo zza;

    public /* synthetic */ zzedk(zzedo zzedo) {
        this.zza = zzedo;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
