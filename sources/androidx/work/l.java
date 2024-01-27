package androidx.work;

import androidx.work.impl.utils.futures.c;
import com.google.common.util.concurrent.e;
import i9.u1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;

/* compiled from: ListenableFuture.kt */
public final class l<R> implements e<R> {

    /* renamed from: h  reason: collision with root package name */
    private final u1 f4910h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c<R> f4911i;

    /* compiled from: ListenableFuture.kt */
    static final class a extends n implements y8.l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l<R> f4912h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<R> lVar) {
            super(1);
            this.f4912h = lVar;
        }

        public final void a(Throwable th) {
            if (th == null) {
                if (!this.f4912h.f4911i.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th instanceof CancellationException) {
                this.f4912h.f4911i.cancel(true);
            } else {
                c a10 = this.f4912h.f4911i;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                a10.p(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    public l(u1 u1Var, c<R> cVar) {
        m.f(u1Var, "job");
        m.f(cVar, "underlying");
        this.f4910h = u1Var;
        this.f4911i = cVar;
        u1Var.y0(new a(this));
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.f4911i.addListener(runnable, executor);
    }

    public final void b(R r10) {
        this.f4911i.o(r10);
    }

    public boolean cancel(boolean z10) {
        return this.f4911i.cancel(z10);
    }

    public R get() {
        return this.f4911i.get();
    }

    public R get(long j10, TimeUnit timeUnit) {
        return this.f4911i.get(j10, timeUnit);
    }

    public boolean isCancelled() {
        return this.f4911i.isCancelled();
    }

    public boolean isDone() {
        return this.f4911i.isDone();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(i9.u1 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.s()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.m.e(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.l.<init>(i9.u1, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.g):void");
    }
}
