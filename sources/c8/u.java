package c8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f5313h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5314i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5315j;

    public /* synthetic */ u(i iVar, MethodCall methodCall, MethodChannel.Result result) {
        this.f5313h = iVar;
        this.f5314i = methodCall;
        this.f5315j = result;
    }

    public final void run() {
        this.f5313h.h(this.f5314i, this.f5315j);
    }
}
