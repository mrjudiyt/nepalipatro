package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzccx implements Runnable {
    zzccx(zzccz zzccz) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
