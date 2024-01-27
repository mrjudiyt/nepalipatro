package t7;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: JustAudioPlugin */
public class f implements FlutterPlugin {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f16590h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public g f16591i;

    /* compiled from: JustAudioPlugin */
    class a implements FlutterEngine.EngineLifecycleListener {
        a() {
        }

        public void onEngineWillDestroy() {
        }

        public void onPreEngineRestart() {
            f.this.f16591i.a();
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f16591i = new g(applicationContext, binaryMessenger);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.just_audio.methods");
        this.f16590h = methodChannel;
        methodChannel.setMethodCallHandler(this.f16591i);
        flutterPluginBinding.getFlutterEngine().addEngineLifecycleListener(new a());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16591i.a();
        this.f16591i = null;
        this.f16590h.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }
}
