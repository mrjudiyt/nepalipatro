package t1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.m;

/* compiled from: NetworkStateTracker */
public class e extends d<r1.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f11585j = m.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f11586g = ((ConnectivityManager) this.f11579b.getSystemService("connectivity"));

    /* renamed from: h  reason: collision with root package name */
    private b f11587h;

    /* renamed from: i  reason: collision with root package name */
    private a f11588i;

    /* compiled from: NetworkStateTracker */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                m.c().a(e.f11585j, "Network broadcast received", new Throwable[0]);
                e eVar = e.this;
                eVar.d(eVar.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            m.c().a(e.f11585j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }

        public void onLost(Network network) {
            m.c().a(e.f11585j, "Network connection lost", new Throwable[0]);
            e eVar = e.this;
            eVar.d(eVar.g());
        }
    }

    public e(Context context, x1.a aVar) {
        super(context, aVar);
        if (j()) {
            this.f11587h = new b();
        } else {
            this.f11588i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void e() {
        if (j()) {
            try {
                m.c().a(f11585j, "Registering network callback", new Throwable[0]);
                this.f11586g.registerDefaultNetworkCallback(this.f11587h);
            } catch (IllegalArgumentException | SecurityException e10) {
                m.c().b(f11585j, "Received exception while registering network callback", e10);
            }
        } else {
            m.c().a(f11585j, "Registering broadcast receiver", new Throwable[0]);
            this.f11579b.registerReceiver(this.f11588i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void f() {
        if (j()) {
            try {
                m.c().a(f11585j, "Unregistering network callback", new Throwable[0]);
                this.f11586g.unregisterNetworkCallback(this.f11587h);
            } catch (IllegalArgumentException | SecurityException e10) {
                m.c().b(f11585j, "Received exception while unregistering network callback", e10);
            }
        } else {
            m.c().a(f11585j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f11579b.unregisterReceiver(this.f11588i);
        }
    }

    /* access modifiers changed from: package-private */
    public r1.b g() {
        NetworkInfo activeNetworkInfo = this.f11586g.getActiveNetworkInfo();
        boolean z10 = true;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f11586g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z10 = false;
        }
        return new r1.b(z11, i10, a10, z10);
    }

    /* renamed from: h */
    public r1.b b() {
        return g();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f11586g.getNetworkCapabilities(this.f11586g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e10) {
            m.c().b(f11585j, "Unable to validate active network", e10);
            return false;
        }
    }
}
