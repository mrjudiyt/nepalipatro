package h8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;

/* compiled from: ConnectivityBroadcastReceiver */
public class d extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: h  reason: collision with root package name */
    private final Context f14830h;

    /* renamed from: i  reason: collision with root package name */
    private final a f14831i;

    /* renamed from: j  reason: collision with root package name */
    private EventChannel.EventSink f14832j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f14833k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f14834l;

    /* compiled from: ConnectivityBroadcastReceiver */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        public void onAvailable(Network network) {
            d.this.g();
        }

        public void onLost(Network network) {
            d.this.h("none");
        }
    }

    public d(Context context, a aVar) {
        this.f14830h = context;
        this.f14831i = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f14832j.success(this.f14831i.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        this.f14832j.success(str);
    }

    /* access modifiers changed from: private */
    public void g() {
        this.f14833k.post(new b(this));
    }

    /* access modifiers changed from: private */
    public void h(String str) {
        this.f14833k.post(new c(this, str));
    }

    public void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f14830h.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f14834l != null) {
            this.f14831i.a().unregisterNetworkCallback(this.f14834l);
            this.f14834l = null;
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f14832j = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14834l = new a();
            this.f14831i.a().registerDefaultNetworkCallback(this.f14834l);
            return;
        }
        this.f14830h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f14832j;
        if (eventSink != null) {
            eventSink.success(this.f14831i.b());
        }
    }
}
