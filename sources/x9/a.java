package x9;

import android.content.Context;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.helpers.k;

/* compiled from: BackgroundManager.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0294a f17284b = new C0294a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private Context f17285a;

    /* renamed from: x9.a$a  reason: collision with other inner class name */
    /* compiled from: BackgroundManager.kt */
    public static final class C0294a {
        private C0294a() {
        }

        public /* synthetic */ C0294a(g gVar) {
            this();
        }
    }

    public a(Context context) {
        m.f(context, "context");
        this.f17285a = context;
    }

    public final void a(List<?> list, MethodChannel.Result result) {
        m.f(list, "args");
        m.f(result, "result");
        System.out.println("BACKGROUNDMANAGER-- START");
        Object obj = list.get(0);
        m.d(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        Object obj2 = list.get(1);
        m.d(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj2).longValue();
        k.a aVar = k.f16077a;
        aVar.y(this.f17285a, aVar.b(), longValue, "FlutterSharedPreferences");
        aVar.y(this.f17285a, aVar.a(), longValue2, "FlutterSharedPreferences");
        result.success(Boolean.TRUE);
    }

    public final void b(List<?> list, MethodChannel.Result result) {
        m.f(list, "args");
        m.f(result, "result");
        System.out.println("BACKGROUNDMANAGER--REGISTER");
    }
}
