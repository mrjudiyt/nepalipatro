package w1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class g implements Executor {

    /* renamed from: h  reason: collision with root package name */
    private final ArrayDeque<a> f12612h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    private final Executor f12613i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f12614j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private volatile Runnable f12615k;

    /* compiled from: SerialExecutor */
    static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final g f12616h;

        /* renamed from: i  reason: collision with root package name */
        final Runnable f12617i;

        a(g gVar, Runnable runnable) {
            this.f12616h = gVar;
            this.f12617i = runnable;
        }

        public void run() {
            try {
                this.f12617i.run();
            } finally {
                this.f12616h.b();
            }
        }
    }

    public g(Executor executor) {
        this.f12613i = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f12614j) {
            z10 = !this.f12612h.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f12614j) {
            Runnable poll = this.f12612h.poll();
            this.f12615k = poll;
            if (poll != null) {
                this.f12613i.execute(this.f12615k);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f12614j) {
            this.f12612h.add(new a(this, runnable));
            if (this.f12615k == null) {
                b();
            }
        }
    }
}
