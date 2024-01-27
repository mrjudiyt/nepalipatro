package x1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import w1.g;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g f12762a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f12763b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12764c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f12762a = new g(executor);
    }

    public Executor a() {
        return this.f12764c;
    }

    public void b(Runnable runnable) {
        this.f12762a.execute(runnable);
    }

    public g c() {
        return this.f12762a;
    }

    public void d(Runnable runnable) {
        this.f12763b.post(runnable);
    }
}
