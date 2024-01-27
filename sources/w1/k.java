package w1;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.g;
import androidx.work.h;
import androidx.work.impl.utils.futures.c;
import androidx.work.m;
import com.google.common.util.concurrent.e;
import v1.p;

/* compiled from: WorkForegroundRunnable */
public class k implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    static final String f12627n = m.f("WorkForegroundRunnable");

    /* renamed from: h  reason: collision with root package name */
    final c<Void> f12628h = c.s();

    /* renamed from: i  reason: collision with root package name */
    final Context f12629i;

    /* renamed from: j  reason: collision with root package name */
    final p f12630j;

    /* renamed from: k  reason: collision with root package name */
    final ListenableWorker f12631k;

    /* renamed from: l  reason: collision with root package name */
    final h f12632l;

    /* renamed from: m  reason: collision with root package name */
    final x1.a f12633m;

    /* compiled from: WorkForegroundRunnable */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f12634h;

        a(c cVar) {
            this.f12634h = cVar;
        }

        public void run() {
            this.f12634h.q(k.this.f12631k.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f12636h;

        b(c cVar) {
            this.f12636h = cVar;
        }

        public void run() {
            try {
                g gVar = (g) this.f12636h.get();
                if (gVar != null) {
                    m.c().a(k.f12627n, String.format("Updating notification for %s", new Object[]{k.this.f12630j.f12257c}), new Throwable[0]);
                    k.this.f12631k.setRunInForeground(true);
                    k kVar = k.this;
                    kVar.f12628h.q(kVar.f12632l.a(kVar.f12629i, kVar.f12631k.getId(), gVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{k.this.f12630j.f12257c}));
            } catch (Throwable th) {
                k.this.f12628h.p(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public k(Context context, p pVar, ListenableWorker listenableWorker, h hVar, x1.a aVar) {
        this.f12629i = context;
        this.f12630j = pVar;
        this.f12631k = listenableWorker;
        this.f12632l = hVar;
        this.f12633m = aVar;
    }

    public e<Void> a() {
        return this.f12628h;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f12630j.f12271q || androidx.core.os.a.b()) {
            this.f12628h.o(null);
            return;
        }
        c s10 = c.s();
        this.f12633m.a().execute(new a(s10));
        s10.addListener(new b(s10), this.f12633m.a());
    }
}
