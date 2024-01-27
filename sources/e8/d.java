package e8;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: MethodCallOperation */
public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final a f14332a;

    /* renamed from: b  reason: collision with root package name */
    final MethodCall f14333b;

    /* compiled from: MethodCallOperation */
    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final MethodChannel.Result f14334a;

        a(MethodChannel.Result result) {
            this.f14334a = result;
        }

        public void error(String str, String str2, Object obj) {
            this.f14334a.error(str, str2, obj);
        }

        public void success(Object obj) {
            this.f14334a.success(obj);
        }
    }

    public d(MethodCall methodCall, MethodChannel.Result result) {
        this.f14333b = methodCall;
        this.f14332a = new a(result);
    }

    public <T> T a(String str) {
        return this.f14333b.argument(str);
    }

    public String f() {
        return this.f14333b.method;
    }

    public boolean g(String str) {
        return this.f14333b.hasArgument(str);
    }

    public f m() {
        return this.f14332a;
    }
}
