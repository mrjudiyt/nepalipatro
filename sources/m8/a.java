package m8;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.m;

/* compiled from: FlutterToastPlugin.kt */
public final class a implements FlutterPlugin {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f15737h;

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        this.f15737h = new MethodChannel(binaryMessenger, "PonnamKarthik/fluttertoast");
        c cVar = new c(context);
        MethodChannel methodChannel = this.f15737h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(cVar);
        }
    }

    private final void b() {
        MethodChannel methodChannel = this.f15737h;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f15737h = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        m.e(binaryMessenger, "binding.binaryMessenger");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        m.e(applicationContext, "binding.applicationContext");
        a(binaryMessenger, applicationContext);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "p0");
        b();
    }
}
