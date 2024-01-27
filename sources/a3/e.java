package a3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: Executors */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f27a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f28b = new b();

    /* compiled from: Executors */
    class a implements Executor {

        /* renamed from: h  reason: collision with root package name */
        private final Handler f29h = new Handler(Looper.getMainLooper());

        a() {
        }

        public void execute(Runnable runnable) {
            this.f29h.post(runnable);
        }
    }

    /* compiled from: Executors */
    class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f28b;
    }

    public static Executor b() {
        return f27a;
    }
}
