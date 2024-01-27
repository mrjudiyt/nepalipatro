package n;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f10240c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f10241d = b.f15774h;

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f10242e = a.f15773h;

    /* renamed from: a  reason: collision with root package name */
    private e f10243a;

    /* renamed from: b  reason: collision with root package name */
    private final e f10244b;

    private c() {
        d dVar = new d();
        this.f10244b = dVar;
        this.f10243a = dVar;
    }

    public static Executor f() {
        return f10242e;
    }

    public static c g() {
        if (f10240c != null) {
            return f10240c;
        }
        synchronized (c.class) {
            if (f10240c == null) {
                f10240c = new c();
            }
        }
        return f10240c;
    }

    public void a(Runnable runnable) {
        this.f10243a.a(runnable);
    }

    public boolean b() {
        return this.f10243a.b();
    }

    public void c(Runnable runnable) {
        this.f10243a.c(runnable);
    }
}
