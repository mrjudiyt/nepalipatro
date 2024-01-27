package n9;

import i9.h0;
import java.util.Collection;
import java.util.ServiceLoader;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection<h0> f15804a;

    static {
        Class<h0> cls = h0.class;
        f15804a = i.g(g.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection<h0> a() {
        return f15804a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
