package s3;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor */
class n implements Executor {

    /* renamed from: h  reason: collision with root package name */
    private final Executor f11398h;

    /* compiled from: SafeLoggingExecutor */
    static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final Runnable f11399h;

        a(Runnable runnable) {
            this.f11399h = runnable;
        }

        public void run() {
            try {
                this.f11399h.run();
            } catch (Exception e10) {
                w3.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f11398h = executor;
    }

    public void execute(Runnable runnable) {
        this.f11398h.execute(new a(runnable));
    }
}
