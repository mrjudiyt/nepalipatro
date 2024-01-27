package b2;

import b2.n;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f4973a;

    public /* synthetic */ h(MethodChannel.Result result) {
        this.f4973a = result;
    }

    public final void onSuccess(int i10) {
        this.f4973a.success(Integer.valueOf(i10));
    }
}
