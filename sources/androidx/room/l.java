package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor */
class l implements Executor {

    /* renamed from: h  reason: collision with root package name */
    private final Executor f4447h;

    /* renamed from: i  reason: collision with root package name */
    private final ArrayDeque<Runnable> f4448i = new ArrayDeque<>();

    /* renamed from: j  reason: collision with root package name */
    private Runnable f4449j;

    /* compiled from: TransactionExecutor */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Runnable f4450h;

        a(Runnable runnable) {
            this.f4450h = runnable;
        }

        public void run() {
            try {
                this.f4450h.run();
            } finally {
                l.this.a();
            }
        }
    }

    l(Executor executor) {
        this.f4447h = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f4448i.poll();
        this.f4449j = poll;
        if (poll != null) {
            this.f4447h.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f4448i.offer(new a(runnable));
        if (this.f4449j == null) {
            a();
        }
    }
}
