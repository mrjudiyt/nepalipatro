package h8;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: ConnectivityPlugin */
public class f implements FlutterPlugin {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f14837h;

    /* renamed from: i  reason: collision with root package name */
    private EventChannel f14838i;

    /* renamed from: j  reason: collision with root package name */
    private d f14839j;

    private void a(BinaryMessenger binaryMessenger, Context context) {
        this.f14837h = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f14838i = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f14839j = new d(context, aVar);
        this.f14837h.setMethodCallHandler(eVar);
        this.f14838i.setStreamHandler(this.f14839j);
    }

    private void b() {
        this.f14837h.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f14838i.setStreamHandler((EventChannel.StreamHandler) null);
        this.f14839j.onCancel((Object) null);
        this.f14837h = null;
        this.f14838i = null;
        this.f14839j = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b();
    }
}
