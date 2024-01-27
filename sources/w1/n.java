package w1;

import androidx.work.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class n {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12654f = m.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f12655a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f12656b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, c> f12657c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f12658d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Object f12659e = new Object();

    /* compiled from: WorkTimer */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private int f12660a = 0;

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f12660a);
            this.f12660a = this.f12660a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final n f12662h;

        /* renamed from: i  reason: collision with root package name */
        private final String f12663i;

        c(n nVar, String str) {
            this.f12662h = nVar;
            this.f12663i = str;
        }

        public void run() {
            synchronized (this.f12662h.f12659e) {
                if (this.f12662h.f12657c.remove(this.f12663i) != null) {
                    b remove = this.f12662h.f12658d.remove(this.f12663i);
                    if (remove != null) {
                        remove.a(this.f12663i);
                    }
                } else {
                    m.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f12663i}), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f12655a = aVar;
        this.f12656b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (!this.f12656b.isShutdown()) {
            this.f12656b.shutdownNow();
        }
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f12659e) {
            m.c().a(f12654f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f12657c.put(str, cVar);
            this.f12658d.put(str, bVar);
            this.f12656b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f12659e) {
            if (this.f12657c.remove(str) != null) {
                m.c().a(f12654f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f12658d.remove(str);
            }
        }
    }
}
