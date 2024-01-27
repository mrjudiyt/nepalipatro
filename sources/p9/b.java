package p9;

import i9.g0;
import i9.k1;
import java.util.concurrent.Executor;
import n9.k0;
import r8.g;
import r8.h;

/* compiled from: Dispatcher.kt */
public final class b extends k1 implements Executor {

    /* renamed from: k  reason: collision with root package name */
    public static final b f16246k = new b();

    /* renamed from: l  reason: collision with root package name */
    private static final g0 f16247l = m.f16267j.M0(m0.e("kotlinx.coroutines.io.parallelism", l.a(64, k0.a()), 0, 0, 12, (Object) null));

    private b() {
    }

    public void K0(g gVar, Runnable runnable) {
        f16247l.K0(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        K0(h.f16410h, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
