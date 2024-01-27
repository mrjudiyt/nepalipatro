package n9;

import androidx.concurrent.futures.b;
import i9.a0;
import i9.c0;
import i9.e1;
import i9.g0;
import i9.m;
import i9.o2;
import i9.p0;
import i9.q0;
import i9.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import o8.q;
import r8.d;
import r8.g;
import y8.l;

/* compiled from: DispatchedContinuation.kt */
public final class k<T> extends x0<T> implements e, d<T> {

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15809o = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: k  reason: collision with root package name */
    public final g0 f15810k;

    /* renamed from: l  reason: collision with root package name */
    public final d<T> f15811l;

    /* renamed from: m  reason: collision with root package name */
    public Object f15812m = l.f15814a;

    /* renamed from: n  reason: collision with root package name */
    public final Object f15813n = n0.b(getContext());

    public k(g0 g0Var, d<? super T> dVar) {
        super(-1);
        this.f15810k = g0Var;
        this.f15811l = dVar;
    }

    private final m<?> n() {
        Object obj = f15809o.get(this);
        if (obj instanceof m) {
            return (m) obj;
        }
        return null;
    }

    public void b(Object obj, Throwable th) {
        if (obj instanceof a0) {
            ((a0) obj).f14896b.invoke(th);
        }
    }

    public d<T> c() {
        return this;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f15811l;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f15811l.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object h() {
        Object obj = this.f15812m;
        if (p0.a()) {
            if (!(obj != l.f15814a)) {
                throw new AssertionError();
            }
        }
        this.f15812m = l.f15814a;
        return obj;
    }

    public final void i() {
        do {
        } while (f15809o.get(this) == l.f15815b);
    }

    public final m<T> j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15809o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f15809o.set(this, l.f15815b);
                return null;
            } else if (obj instanceof m) {
                if (b.a(f15809o, this, obj, l.f15815b)) {
                    return (m) obj;
                }
            } else if (obj != l.f15815b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean o() {
        return f15809o.get(this) != null;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15809o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            j0 j0Var = l.f15815b;
            if (kotlin.jvm.internal.m.a(obj, j0Var)) {
                if (b.a(f15809o, this, j0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f15809o, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        i();
        m<?> n10 = n();
        if (n10 != null) {
            n10.r();
        }
    }

    public void resumeWith(Object obj) {
        g context;
        Object c10;
        g context2 = this.f15811l.getContext();
        Object d10 = c0.d(obj, (l) null, 1, (Object) null);
        if (this.f15810k.L0(context2)) {
            this.f15812m = d10;
            this.f14999j = 0;
            this.f15810k.K0(context2, this);
            return;
        }
        boolean a10 = p0.a();
        e1 b10 = o2.f14972a.b();
        if (b10.U0()) {
            this.f15812m = d10;
            this.f14999j = 0;
            b10.Q0(this);
            return;
        }
        b10.S0(true);
        try {
            context = getContext();
            c10 = n0.c(context, this.f15813n);
            this.f15811l.resumeWith(obj);
            q qVar = q.f16189a;
            n0.a(context, c10);
            do {
            } while (b10.X0());
        } catch (Throwable th) {
            try {
                g(th, (Throwable) null);
            } catch (Throwable th2) {
                b10.N0(true);
                throw th2;
            }
        }
        b10.N0(true);
    }

    public final Throwable s(i9.l<?> lVar) {
        j0 j0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15809o;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            j0Var = l.f15815b;
            if (obj != j0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f15809o, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!b.a(f15809o, this, j0Var, lVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f15810k + ", " + q0.c(this.f15811l) + ']';
    }
}
