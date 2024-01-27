package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaqc implements Runnable {
    private zzaqc() {
    }

    /* synthetic */ zzaqc(zzaqb zzaqb) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaqd.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaqd.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaqd.zzb;
        } catch (Throwable th) {
            zzaqd.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
