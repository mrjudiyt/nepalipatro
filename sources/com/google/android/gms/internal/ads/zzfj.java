package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfj implements ThreadFactory {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzfj(String str) {
        this.zza = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zza);
    }
}
