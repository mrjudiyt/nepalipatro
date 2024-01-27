package c8;

import e8.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5325h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5326i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f5327j;

    public /* synthetic */ y(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        this.f5325h = methodCall;
        this.f5326i = result;
        this.f5327j = iVar;
    }

    public final void run() {
        this.f5327j.R(new d(this.f5325h, this.f5326i));
    }
}
