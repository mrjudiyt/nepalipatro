package c8;

import e8.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5286h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5287i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f5288j;

    public /* synthetic */ a0(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        this.f5286h = methodCall;
        this.f5287i = result;
        this.f5288j = iVar;
    }

    public final void run() {
        this.f5288j.P(new d(this.f5286h, this.f5287i));
    }
}
