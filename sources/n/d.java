package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class d extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10245a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f10246b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f10247c;

    /* compiled from: DefaultTaskExecutor */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f10248a = new AtomicInteger(0);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f10248a.getAndIncrement());
            return thread;
        }
    }

    /* compiled from: DefaultTaskExecutor */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler d(Looper looper) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return b.a(looper);
        }
        if (i10 >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public void a(Runnable runnable) {
        this.f10246b.execute(runnable);
    }

    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void c(Runnable runnable) {
        if (this.f10247c == null) {
            synchronized (this.f10245a) {
                if (this.f10247c == null) {
                    this.f10247c = d(Looper.getMainLooper());
                }
            }
        }
        this.f10247c.post(runnable);
    }
}
