package c8;

import e8.d;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ MethodCall f5319h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f5320i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f5321j;

    public /* synthetic */ w(MethodCall methodCall, MethodChannel.Result result, i iVar) {
        this.f5319h = methodCall;
        this.f5320i = result;
        this.f5321j = iVar;
    }

    public final void run() {
        this.f5321j.O(new d(this.f5319h, this.f5320i));
    }
}
