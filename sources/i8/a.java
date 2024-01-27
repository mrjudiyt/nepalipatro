package i8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.m;

/* compiled from: DeviceInfoPlusPlugin.kt */
public final class a implements FlutterPlugin {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f14891h;

    private final void a(BinaryMessenger binaryMessenger, Context context) {
        this.f14891h = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        m.e(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("window");
        m.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        b bVar = new b(packageManager, (WindowManager) systemService);
        MethodChannel methodChannel = this.f14891h;
        if (methodChannel == null) {
            m.x("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(bVar);
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
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f14891h;
        if (methodChannel == null) {
            m.x("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }
}
