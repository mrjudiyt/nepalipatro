package f8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f14630h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodCall f14631i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f14632j;

    public /* synthetic */ e(h hVar, MethodCall methodCall, MethodChannel.Result result) {
        this.f14630h = hVar;
        this.f14631i = methodCall;
        this.f14632j = result;
    }

    public final void run() {
        h.J(this.f14630h, this.f14631i, this.f14632j);
    }
}
