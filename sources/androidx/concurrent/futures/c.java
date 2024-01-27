package androidx.concurrent.futures;

import com.google.common.util.concurrent.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: CallbackToFutureAdapter */
public final class c {

    /* compiled from: CallbackToFutureAdapter */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f1489a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f1490b;

        /* renamed from: c  reason: collision with root package name */
        private e<Void> f1491c = e.a();

        /* renamed from: d  reason: collision with root package name */
        private boolean f1492d;

        a() {
        }

        private void d() {
            this.f1489a = null;
            this.f1490b = null;
            this.f1491c = null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1489a = null;
            this.f1490b = null;
            this.f1491c.set(null);
        }

        public boolean b(T t10) {
            boolean z10 = true;
            this.f1492d = true;
            d<T> dVar = this.f1490b;
            if (dVar == null || !dVar.b(t10)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            boolean z10 = true;
            this.f1492d = true;
            d<T> dVar = this.f1490b;
            if (dVar == null || !dVar.a(true)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            boolean z10 = true;
            this.f1492d = true;
            d<T> dVar = this.f1490b;
            if (dVar == null || !dVar.c(th)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f1490b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1489a));
            }
            if (!this.f1492d && (eVar = this.f1491c) != null) {
                eVar.set(null);
            }
        }
    }

    /* compiled from: CallbackToFutureAdapter */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    /* compiled from: CallbackToFutureAdapter */
    public interface C0019c<T> {
        Object a(a<T> aVar);
    }

    /* compiled from: CallbackToFutureAdapter */
    private static final class d<T> implements e<T> {

        /* renamed from: h  reason: collision with root package name */
        final WeakReference<a<T>> f1493h;

        /* renamed from: i  reason: collision with root package name */
        private final a<T> f1494i = new a();

        /* compiled from: CallbackToFutureAdapter */
        class a extends a<T> {
            a() {
            }

            /* access modifiers changed from: protected */
            public String pendingToString() {
                a aVar = (a) d.this.f1493h.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1489a + "]";
            }
        }

        d(a<T> aVar) {
            this.f1493h = new WeakReference<>(aVar);
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z10) {
            return this.f1494i.cancel(z10);
        }

        public void addListener(Runnable runnable, Executor executor) {
            this.f1494i.addListener(runnable, executor);
        }

        /* access modifiers changed from: package-private */
        public boolean b(T t10) {
            return this.f1494i.set(t10);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Throwable th) {
            return this.f1494i.setException(th);
        }

        public boolean cancel(boolean z10) {
            a aVar = (a) this.f1493h.get();
            boolean cancel = this.f1494i.cancel(z10);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        public T get() {
            return this.f1494i.get();
        }

        public boolean isCancelled() {
            return this.f1494i.isCancelled();
        }

        public boolean isDone() {
            return this.f1494i.isDone();
        }

        public String toString() {
            return this.f1494i.toString();
        }

        public T get(long j10, TimeUnit timeUnit) {
            return this.f1494i.get(j10, timeUnit);
        }
    }

    public static <T> e<T> a(C0019c<T> cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f1490b = dVar;
        aVar.f1489a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f1489a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
