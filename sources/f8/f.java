package f8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f14633h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodCall f14634i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f14635j;

    public /* synthetic */ f(h hVar, MethodCall methodCall, MethodChannel.Result result) {
        this.f14633h = hVar;
        this.f14634i = methodCall;
        this.f14635j = result;
    }

    public final void run() {
        h.K(this.f14633h, this.f14634i, this.f14635j);
    }
}
