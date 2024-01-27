package androidx.core.os;

import android.os.Handler;
import androidx.core.util.h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat */
public final class i {

    /* compiled from: ExecutorCompat */
    private static class a implements Executor {

        /* renamed from: h  reason: collision with root package name */
        private final Handler f2391h;

        a(Handler handler) {
            this.f2391h = (Handler) h.b(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f2391h.post((Runnable) h.b(runnable))) {
                throw new RejectedExecutionException(this.f2391h + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
