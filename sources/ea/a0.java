package ea;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Timeout.kt */
public class a0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f14345d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f14346e = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f14347a;

    /* renamed from: b  reason: collision with root package name */
    private long f14348b;

    /* renamed from: c  reason: collision with root package name */
    private long f14349c;

    /* compiled from: Timeout.kt */
    public static final class a extends a0 {
        a() {
        }

        public a0 d(long j10) {
            return this;
        }

        public void f() {
        }

        public a0 g(long j10, TimeUnit timeUnit) {
            m.g(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public a0 a() {
        this.f14347a = false;
        return this;
    }

    public a0 b() {
        this.f14349c = 0;
        return this;
    }

    public long c() {
        if (this.f14347a) {
            return this.f14348b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public a0 d(long j10) {
        this.f14347a = true;
        this.f14348b = j10;
        return this;
    }

    public boolean e() {
        return this.f14347a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f14347a && this.f14348b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public a0 g(long j10, TimeUnit timeUnit) {
        m.g(timeUnit, "unit");
        if (j10 >= 0) {
            this.f14349c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f14349c;
    }
}
