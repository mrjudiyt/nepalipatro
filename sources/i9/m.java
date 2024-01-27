package i9;

import androidx.concurrent.futures.b;
import com.facebook.internal.AnalyticsEvents;
import i9.u1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.CompletionHandlerException;
import n9.g0;
import n9.i0;
import n9.j0;
import n9.k;
import o8.q;
import r8.d;
import r8.g;
import y8.l;

/* compiled from: CancellableContinuationImpl.kt */
public class m<T> extends x0<T> implements l<T>, e, s2 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14958m = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14959n;

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14960o;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: k  reason: collision with root package name */
    private final d<T> f14961k;

    /* renamed from: l  reason: collision with root package name */
    private final g f14962l;

    static {
        Class<Object> cls = Object.class;
        f14959n = AtomicReferenceFieldUpdater.newUpdater(m.class, cls, "_state");
        f14960o = AtomicReferenceFieldUpdater.newUpdater(m.class, cls, "_parentHandle");
    }

    public m(d<? super T> dVar, int i10) {
        super(i10);
        this.f14961k = dVar;
        if (p0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        this.f14962l = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = d.f14924h;
    }

    private final b1 A() {
        u1 u1Var = (u1) getContext().h(u1.f14995d);
        if (u1Var == null) {
            return null;
        }
        b1 d10 = u1.a.d(u1Var, true, false, new q(this), 2, (Object) null);
        b.a(f14960o, this, (Object) null, d10);
        return d10;
    }

    private final void B(Object obj) {
        Object obj2 = obj;
        if (p0.a()) {
            if (!((obj2 instanceof j) || (obj2 instanceof g0))) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof d)) {
                if (obj3 instanceof j ? true : obj3 instanceof g0) {
                    F(obj2, obj3);
                } else {
                    boolean z10 = obj3 instanceof z;
                    if (z10) {
                        z zVar = (z) obj3;
                        if (!zVar.b()) {
                            F(obj2, obj3);
                        }
                        if (obj3 instanceof p) {
                            Throwable th = null;
                            if (!z10) {
                                zVar = null;
                            }
                            if (zVar != null) {
                                th = zVar.f15006a;
                            }
                            if (obj2 instanceof j) {
                                j((j) obj2, th);
                                return;
                            }
                            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((g0) obj2, th);
                            return;
                        }
                        return;
                    } else if (obj3 instanceof y) {
                        y yVar = (y) obj3;
                        if (yVar.f15001b != null) {
                            F(obj2, obj3);
                        }
                        if (!(obj2 instanceof g0)) {
                            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            j jVar = (j) obj2;
                            if (yVar.c()) {
                                j(jVar, yVar.f15004e);
                                return;
                            } else {
                                if (b.a(f14959n, this, obj3, y.b(yVar, (Object) null, jVar, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj2 instanceof g0)) {
                        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (b.a(f14959n, this, obj3, new y(obj3, (j) obj2, (l) null, (Object) null, (Throwable) null, 28, (kotlin.jvm.internal.g) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (b.a(f14959n, this, obj3, obj2)) {
                return;
            }
        }
    }

    private final boolean D() {
        if (y0.c(this.f14999j)) {
            d<T> dVar = this.f14961k;
            kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((k) dVar).o()) {
                return true;
            }
        }
        return false;
    }

    private final j E(l<? super Throwable, q> lVar) {
        return lVar instanceof j ? (j) lVar : new r1(lVar);
    }

    private final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void K(Object obj, int i10, l<? super Throwable, q> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h2) {
            } else {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar != null) {
                            n(lVar, pVar.f15006a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!b.a(f14959n, this, obj2, M((h2) obj2, obj, i10, lVar, (Object) null)));
        s();
        t(i10);
    }

    static /* synthetic */ void L(m mVar, Object obj, int i10, l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            mVar.K(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object M(h2 h2Var, Object obj, int i10, l<? super Throwable, q> lVar, Object obj2) {
        if (obj instanceof z) {
            boolean z10 = true;
            if (p0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!p0.a()) {
                return obj;
            }
            if (lVar != null) {
                z10 = false;
            }
            if (z10) {
                return obj;
            }
            throw new AssertionError();
        } else if (!y0.b(i10) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && !(h2Var instanceof j) && obj2 == null) {
                return obj;
            }
            return new y(obj, h2Var instanceof j ? (j) h2Var : null, lVar, obj2, (Throwable) null, 16, (kotlin.jvm.internal.g) null);
        }
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14958m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f14958m.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final j0 O(Object obj, Object obj2, l<? super Throwable, q> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof h2) {
            } else if (!(obj3 instanceof y) || obj2 == null) {
                return null;
            } else {
                y yVar = (y) obj3;
                if (yVar.f15003d != obj2) {
                    return null;
                }
                if (!p0.a() || kotlin.jvm.internal.m.a(yVar.f15000a, obj)) {
                    return n.f14963a;
                }
                throw new AssertionError();
            }
        } while (!b.a(f14959n, this, obj3, M((h2) obj3, obj, this.f14999j, lVar, obj2)));
        s();
        return n.f14963a;
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14958m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f14958m.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(g0<?> g0Var, Throwable th) {
        int i10 = f14958m.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                g0Var.o(i10, th, getContext());
            } catch (Throwable th2) {
                g context = getContext();
                i0.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    private final boolean q(Throwable th) {
        if (!D()) {
            return false;
        }
        d<T> dVar = this.f14961k;
        kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((k) dVar).q(th);
    }

    private final void s() {
        if (!D()) {
            r();
        }
    }

    private final void t(int i10) {
        if (!N()) {
            y0.a(this, i10);
        }
    }

    private final b1 v() {
        return (b1) f14960o.get(this);
    }

    private final String y() {
        Object x10 = x();
        if (x10 instanceof h2) {
            return "Active";
        }
        return x10 instanceof p ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
    }

    public boolean C() {
        return !(x() instanceof h2);
    }

    /* access modifiers changed from: protected */
    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (!q(th)) {
            l(th);
            s();
        }
    }

    public final void I() {
        Throwable s10;
        d<T> dVar = this.f14961k;
        k kVar = dVar instanceof k ? (k) dVar : null;
        if (kVar != null && (s10 = kVar.s(this)) != null) {
            r();
            l(s10);
        }
    }

    public final boolean J() {
        if (p0.a()) {
            if (!(this.f14999j == 2)) {
                throw new AssertionError();
            }
        }
        if (p0.a()) {
            if (!(v() != g2.f14945h)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (p0.a() && !(!(obj instanceof h2))) {
            throw new AssertionError();
        } else if (!(obj instanceof y) || ((y) obj).f15003d == null) {
            f14958m.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, d.f14924h);
            return true;
        } else {
            r();
            return false;
        }
    }

    public void a(g0<?> g0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14958m;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        B(g0Var);
    }

    public void b(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof z)) {
                if (obj2 instanceof y) {
                    y yVar = (y) obj2;
                    if (!yVar.c()) {
                        Throwable th2 = th;
                        if (b.a(f14959n, this, obj2, y.b(yVar, (Object) null, (j) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            yVar.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th3 = th;
                    if (b.a(f14959n, this, obj2, new y(obj2, (j) null, (l) null, (Object) null, th, 14, (kotlin.jvm.internal.g) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final d<T> c() {
        return this.f14961k;
    }

    public void d(T t10, l<? super Throwable, q> lVar) {
        K(t10, this.f14999j, lVar);
    }

    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 == null) {
            return null;
        }
        d<T> dVar = this.f14961k;
        return (!p0.d() || !(dVar instanceof e)) ? e10 : i0.i(e10, (e) dVar);
    }

    public <T> T f(Object obj) {
        return obj instanceof y ? ((y) obj).f15000a : obj;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f14961k;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f14962l;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object h() {
        return x();
    }

    public final void j(j jVar, Throwable th) {
        try {
            jVar.f(th);
        } catch (Throwable th2) {
            g context = getContext();
            i0.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public void k(l<? super Throwable, q> lVar) {
        B(E(lVar));
    }

    public boolean l(Throwable th) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14959n;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (!(obj instanceof h2)) {
                return false;
            }
            if ((obj instanceof j) || (obj instanceof g0)) {
                z10 = true;
            }
        } while (!b.a(f14959n, this, obj, new p(this, th, z10)));
        h2 h2Var = (h2) obj;
        if (h2Var instanceof j) {
            j((j) obj, th);
        } else if (h2Var instanceof g0) {
            o((g0) obj, th);
        }
        s();
        t(this.f14999j);
        return true;
    }

    public Object m(T t10, Object obj, l<? super Throwable, q> lVar) {
        return O(t10, obj, lVar);
    }

    public final void n(l<? super Throwable, q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            g context = getContext();
            i0.a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public void p(Object obj) {
        if (p0.a()) {
            if (!(obj == n.f14963a)) {
                throw new AssertionError();
            }
        }
        t(this.f14999j);
    }

    public final void r() {
        b1 v10 = v();
        if (v10 != null) {
            v10.dispose();
            f14960o.set(this, g2.f14945h);
        }
    }

    public void resumeWith(Object obj) {
        L(this, c0.b(obj, this), this.f14999j, (l) null, 4, (Object) null);
    }

    public String toString() {
        return G() + '(' + q0.c(this.f14961k) + "){" + y() + "}@" + q0.b(this);
    }

    public Throwable u(u1 u1Var) {
        return u1Var.L();
    }

    public final Object w() {
        u1 u1Var;
        boolean D = D();
        if (P()) {
            if (v() == null) {
                A();
            }
            if (D) {
                I();
            }
            return d.c();
        }
        if (D) {
            I();
        }
        Object x10 = x();
        if (x10 instanceof z) {
            Throwable th = ((z) x10).f15006a;
            if (p0.d()) {
                th = i0.i(th, this);
            }
            throw th;
        } else if (!y0.b(this.f14999j) || (u1Var = (u1) getContext().h(u1.f14995d)) == null || u1Var.a()) {
            return f(x10);
        } else {
            Throwable L = u1Var.L();
            b(x10, L);
            if (p0.d()) {
                L = i0.i(L, this);
            }
            throw L;
        }
    }

    public final Object x() {
        return f14959n.get(this);
    }

    public void z() {
        b1 A = A();
        if (A != null && C()) {
            A.dispose();
            f14960o.set(this, g2.f14945h);
        }
    }
}
