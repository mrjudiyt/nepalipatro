package com.google.android.exoplayer2;

import a6.p;
import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: WifiLockManager */
final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f6452a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f6453b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6454c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6455d;

    public c1(Context context) {
        this.f6452a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f6453b;
        if (wifiLock != null) {
            if (!this.f6454c || !this.f6455d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f6453b == null) {
            WifiManager wifiManager = this.f6452a;
            if (wifiManager == null) {
                p.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f6453b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f6454c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f6455d = z10;
        c();
    }
}
