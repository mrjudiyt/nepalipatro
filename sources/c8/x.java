package c8;

import e8.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5322h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5323i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f5324j;

    public /* synthetic */ x(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        this.f5322h = methodCall;
        this.f5323i = result;
        this.f5324j = iVar;
    }

    public final void run() {
        this.f5324j.E(new d(this.f5322h, this.f5323i));
    }
}
