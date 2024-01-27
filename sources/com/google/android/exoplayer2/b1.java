package com.google.android.exoplayer2;

import a6.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockManager */
final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f6445a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f6446b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6447c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6448d;

    public b1(Context context) {
        this.f6445a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f6446b;
        if (wakeLock != null) {
            if (!this.f6447c || !this.f6448d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f6446b == null) {
            PowerManager powerManager = this.f6445a;
            if (powerManager == null) {
                p.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f6446b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f6447c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f6448d = z10;
        c();
    }
}
