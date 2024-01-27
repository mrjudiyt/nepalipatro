package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbbr implements Callable {
    public static final /* synthetic */ zzbbr zza = new zzbbr();

    private /* synthetic */ zzbbr() {
    }

    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
