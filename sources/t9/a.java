package t9;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import np.com.nepalipatro.MainActivity;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MainActivity f16600h;

    public /* synthetic */ a(MainActivity mainActivity) {
        this.f16600h = mainActivity;
    }

    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MainActivity.s(this.f16600h, methodCall, result);
    }
}
