package b2;

import b2.p;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f4976a;

    public /* synthetic */ k(MethodChannel.Result result) {
        this.f4976a = result;
    }

    public final void onSuccess(int i10) {
        this.f4976a.success(Integer.valueOf(i10));
    }
}
