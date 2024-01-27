package t2;

import a3.j;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import t2.c;

/* compiled from: DefaultConnectivityMonitor */
final class e implements c {

    /* renamed from: h  reason: collision with root package name */
    private final Context f11600h;

    /* renamed from: i  reason: collision with root package name */
    final c.a f11601i;

    /* renamed from: j  reason: collision with root package name */
    boolean f11602j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11603k;

    /* renamed from: l  reason: collision with root package name */
    private final BroadcastReceiver f11604l = new a();

    /* compiled from: DefaultConnectivityMonitor */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.f11602j;
            eVar.f11602j = eVar.d(context);
            if (z10 != e.this.f11602j) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(e.this.f11602j);
                }
                e eVar2 = e.this;
                eVar2.f11601i.a(eVar2.f11602j);
            }
        }
    }

    e(Context context, c.a aVar) {
        this.f11600h = context.getApplicationContext();
        this.f11601i = aVar;
    }

    private void e() {
        if (!this.f11603k) {
            this.f11602j = d(this.f11600h);
            try {
                this.f11600h.registerReceiver(this.f11604l, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f11603k = true;
            } catch (SecurityException unused) {
            }
        }
    }

    private void k() {
        if (this.f11603k) {
            this.f11600h.unregisterReceiver(this.f11604l);
            this.f11603k = false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public boolean d(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        e();
    }

    public void onStop() {
        k();
    }
}
