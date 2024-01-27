package r7;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: AudioSessionPlugin */
public class c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: j  reason: collision with root package name */
    private static Map<?, ?> f16393j;

    /* renamed from: k  reason: collision with root package name */
    private static List<c> f16394k = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f16395h;

    /* renamed from: i  reason: collision with root package name */
    private b f16396i;

    private void a(String str, Object... objArr) {
        for (c cVar : f16394k) {
            cVar.f16395h.invokeMethod(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.audio_session");
        this.f16395h = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f16396i = new b(flutterPluginBinding.getApplicationContext(), binaryMessenger);
        f16394k.add(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16395h.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f16395h = null;
        this.f16396i.c();
        this.f16396i = null;
        f16394k.remove(this);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List list = (List) methodCall.arguments;
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("setConfiguration")) {
            f16393j = (Map) list.get(0);
            result.success((Object) null);
            a("onConfigurationChanged", f16393j);
        } else if (!str.equals("getConfiguration")) {
            result.notImplemented();
        } else {
            result.success(f16393j);
        }
    }
}
