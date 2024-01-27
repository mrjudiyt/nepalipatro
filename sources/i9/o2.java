package i9;

import n9.j0;
import n9.o0;

/* compiled from: EventLoop.common.kt */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final o2 f14972a = new o2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<e1> f14973b = o0.a(new j0("ThreadLocalEventLoop"));

    private o2() {
    }

    public final e1 a() {
        return f14973b.get();
    }

    public final e1 b() {
        ThreadLocal<e1> threadLocal = f14973b;
        e1 e1Var = threadLocal.get();
        if (e1Var != null) {
            return e1Var;
        }
        e1 a10 = h1.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f14973b.set((Object) null);
    }

    public final void d(e1 e1Var) {
        f14973b.set(e1Var);
    }
}
