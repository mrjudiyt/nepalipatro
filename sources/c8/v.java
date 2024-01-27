package c8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5316h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i f5317i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5318j;

    public /* synthetic */ v(MethodCall methodCall, i iVar, MethodChannel.Result result) {
        this.f5316h = methodCall;
        this.f5317i = iVar;
        this.f5318j = result;
    }

    public final void run() {
        c0.v(this.f5316h, this.f5317i, this.f5318j);
    }
}
