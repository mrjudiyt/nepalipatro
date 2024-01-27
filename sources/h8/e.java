package h8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: ConnectivityMethodChannelHandler */
class e implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final a f14836h;

    e(a aVar) {
        this.f14836h = aVar;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f14836h.b());
        } else {
            result.notImplemented();
        }
    }
}
