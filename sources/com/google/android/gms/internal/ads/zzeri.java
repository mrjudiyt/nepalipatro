package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeri implements Callable {
    public static final /* synthetic */ zzeri zza = new zzeri();

    private /* synthetic */ zzeri() {
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", zzt.zzo().zza());
        return new zzerk(bundle);
    }
}
