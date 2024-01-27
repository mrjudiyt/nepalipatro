package c8;

import e8.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5328h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5329i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f5330j;

    public /* synthetic */ z(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        this.f5328h = methodCall;
        this.f5329i = result;
        this.f5330j = iVar;
    }

    public final void run() {
        this.f5330j.v(new d(this.f5328h, this.f5329i));
    }
}
