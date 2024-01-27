package i9;

import com.facebook.internal.AnalyticsEvents;
import i9.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import n9.c0;
import n9.i0;
import n9.t;
import n9.u;
import o8.q;
import r8.g;
import y8.l;
import y8.p;

/* compiled from: JobSupport.kt */
public class a2 implements u1, t, i2 {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14901h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14902i;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* compiled from: JobSupport.kt */
    private static final class a<T> extends m<T> {

        /* renamed from: p  reason: collision with root package name */
        private final a2 f14903p;

        public a(r8.d<? super T> dVar, a2 a2Var) {
            super(dVar, 1);
            this.f14903p = a2Var;
        }

        /* access modifiers changed from: protected */
        public String G() {
            return "AwaitContinuation";
        }

        public Throwable u(u1 u1Var) {
            Throwable f10;
            Object X = this.f14903p.X();
            if ((X instanceof c) && (f10 = ((c) X).f()) != null) {
                return f10;
            }
            if (X instanceof z) {
                return ((z) X).f15006a;
            }
            return u1Var.L();
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class b extends z1 {

        /* renamed from: l  reason: collision with root package name */
        private final a2 f14904l;

        /* renamed from: m  reason: collision with root package name */
        private final c f14905m;

        /* renamed from: n  reason: collision with root package name */
        private final s f14906n;

        /* renamed from: o  reason: collision with root package name */
        private final Object f14907o;

        public b(a2 a2Var, c cVar, s sVar, Object obj) {
            this.f14904l = a2Var;
            this.f14905m = cVar;
            this.f14906n = sVar;
            this.f14907o = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((Throwable) obj);
            return q.f16189a;
        }

        public void t(Throwable th) {
            this.f14904l.K(this.f14905m, this.f14906n, this.f14907o);
        }
    }

    /* compiled from: JobSupport.kt */
    private static final class c implements p1 {

        /* renamed from: i  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f14908i;

        /* renamed from: j  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f14909j;

        /* renamed from: k  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f14910k;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: h  reason: collision with root package name */
        private final f2 f14911h;

        static {
            Class<Object> cls = Object.class;
            Class<c> cls2 = c.class;
            f14908i = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleting");
            f14909j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_rootCause");
            f14910k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_exceptionsHolder");
        }

        public c(f2 f2Var, boolean z10, Throwable th) {
            this.f14911h = f2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f14910k.get(this);
        }

        private final void l(Object obj) {
            f14910k.set(this, obj);
        }

        public boolean a() {
            return f() == null;
        }

        public final void b(Throwable th) {
            Throwable f10 = f();
            if (f10 == null) {
                m(th);
            } else if (th != f10) {
                Object e10 = e();
                if (e10 == null) {
                    l(th);
                } else if (e10 instanceof Throwable) {
                    if (th != e10) {
                        ArrayList<Throwable> d10 = d();
                        d10.add(e10);
                        d10.add(th);
                        l(d10);
                    }
                } else if (e10 instanceof ArrayList) {
                    ((ArrayList) e10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
            }
        }

        public f2 c() {
            return this.f14911h;
        }

        public final Throwable f() {
            return (Throwable) f14909j.get(this);
        }

        public final boolean g() {
            return f() != null;
        }

        public final boolean h() {
            return f14908i.get(this) != 0;
        }

        public final boolean i() {
            return e() == b2.f14918e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e10 = e();
            if (e10 == null) {
                arrayList = d();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> d10 = d();
                d10.add(e10);
                arrayList = d10;
            } else if (e10 instanceof ArrayList) {
                arrayList = (ArrayList) e10;
            } else {
                throw new IllegalStateException(("State is " + e10).toString());
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th != null && !m.a(th, f10)) {
                arrayList.add(th);
            }
            l(b2.f14918e);
            return arrayList;
        }

        public final void k(boolean z10) {
            f14908i.set(this, z10 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f14909j.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + c() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class d extends u.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a2 f14912d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f14913e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(u uVar, a2 a2Var, Object obj) {
            super(uVar);
            this.f14912d = a2Var;
            this.f14913e = obj;
        }

        /* renamed from: f */
        public Object d(u uVar) {
            if (this.f14912d.X() == this.f14913e) {
                return null;
            }
            return t.a();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<a2> cls2 = a2.class;
        f14901h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f14902i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_parentHandle");
    }

    public a2(boolean z10) {
        this._state = z10 ? b2.f14920g : b2.f14919f;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [i9.o1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0(i9.d1 r3) {
        /*
            r2 = this;
            i9.f2 r0 = new i9.f2
            r0.<init>()
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            i9.o1 r1 = new i9.o1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14901h
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a2.A0(i9.d1):void");
    }

    private final void B0(z1 z1Var) {
        z1Var.h(new f2());
        androidx.concurrent.futures.b.a(f14901h, this, z1Var, z1Var.m());
    }

    private final Object D(Object obj) {
        Object M0;
        do {
            Object X = X();
            if (!(X instanceof p1) || ((X instanceof c) && ((c) X).h())) {
                return b2.f14914a;
            }
            M0 = M0(X, new z(M(obj), false, 2, (g) null));
        } while (M0 == b2.f14916c);
        return M0;
    }

    private final int E0(Object obj) {
        if (obj instanceof d1) {
            if (((d1) obj).a()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f14901h, this, obj, b2.f14920g)) {
                return -1;
            }
            z0();
            return 1;
        } else if (!(obj instanceof o1)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f14901h, this, obj, ((o1) obj).c())) {
                return -1;
            }
            z0();
            return 1;
        }
    }

    private final boolean F(Throwable th) {
        if (e0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        r V = V();
        if (V == null || V == g2.f14945h) {
            return z10;
        }
        if (V.d(th) || z10) {
            return true;
        }
        return false;
    }

    private final String F0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.g()) {
                return "Cancelling";
            }
            if (cVar.h()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof p1)) {
            return obj instanceof z ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        } else {
            if (((p1) obj).a()) {
                return "Active";
            }
            return "New";
        }
    }

    public static /* synthetic */ CancellationException H0(a2 a2Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return a2Var.G0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final void I(p1 p1Var, Object obj) {
        r V = V();
        if (V != null) {
            V.dispose();
            D0(g2.f14945h);
        }
        Throwable th = null;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            th = zVar.f15006a;
        }
        if (p1Var instanceof z1) {
            try {
                ((z1) p1Var).t(th);
            } catch (Throwable th2) {
                a0(new CompletionHandlerException("Exception in completion handler " + p1Var + " for " + this, th2));
            }
        } else {
            f2 c10 = p1Var.c();
            if (c10 != null) {
                t0(c10, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void K(c cVar, s sVar, Object obj) {
        if (p0.a()) {
            if (!(X() == cVar)) {
                throw new AssertionError();
            }
        }
        s p02 = p0(sVar);
        if (p02 == null || !O0(cVar, p02, obj)) {
            x(N(cVar, obj));
        }
    }

    private final boolean K0(p1 p1Var, Object obj) {
        if (p0.a()) {
            if (!((p1Var instanceof d1) || (p1Var instanceof z1))) {
                throw new AssertionError();
            }
        }
        if (p0.a() && !(!(obj instanceof z))) {
            throw new AssertionError();
        } else if (!androidx.concurrent.futures.b.a(f14901h, this, p1Var, b2.g(obj))) {
            return false;
        } else {
            u0((Throwable) null);
            x0(obj);
            I(p1Var, obj);
            return true;
        }
    }

    private final boolean L0(p1 p1Var, Throwable th) {
        if (p0.a() && !(!(p1Var instanceof c))) {
            throw new AssertionError();
        } else if (!p0.a() || p1Var.a()) {
            f2 U = U(p1Var);
            if (U == null) {
                return false;
            }
            if (!androidx.concurrent.futures.b.a(f14901h, this, p1Var, new c(U, false, th))) {
                return false;
            }
            q0(U, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final Throwable M(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(G(), (Throwable) null, this);
            }
            return th;
        }
        m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((i2) obj).s0();
    }

    private final Object M0(Object obj, Object obj2) {
        if (!(obj instanceof p1)) {
            return b2.f14914a;
        }
        if ((!(obj instanceof d1) && !(obj instanceof z1)) || (obj instanceof s) || (obj2 instanceof z)) {
            return N0((p1) obj, obj2);
        }
        if (K0((p1) obj, obj2)) {
            return obj2;
        }
        return b2.f14916c;
    }

    private final Object N(c cVar, Object obj) {
        boolean g10;
        Throwable R;
        boolean z10 = true;
        if (p0.a()) {
            if (!(X() == cVar)) {
                throw new AssertionError();
            }
        }
        if (p0.a() && !(!cVar.i())) {
            throw new AssertionError();
        } else if (!p0.a() || cVar.h()) {
            z zVar = obj instanceof z ? (z) obj : null;
            Throwable th = zVar != null ? zVar.f15006a : null;
            synchronized (cVar) {
                g10 = cVar.g();
                List<Throwable> j10 = cVar.j(th);
                R = R(cVar, j10);
                if (R != null) {
                    v(R, j10);
                }
            }
            if (!(R == null || R == th)) {
                obj = new z(R, false, 2, (g) null);
            }
            if (R != null) {
                if (!F(R) && !Z(R)) {
                    z10 = false;
                }
                if (z10) {
                    m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((z) obj).b();
                }
            }
            if (!g10) {
                u0(R);
            }
            x0(obj);
            boolean a10 = androidx.concurrent.futures.b.a(f14901h, this, cVar, b2.g(obj));
            if (!p0.a() || a10) {
                I(cVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0082, code lost:
        r3 = (java.lang.Throwable) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0085, code lost:
        if (r2 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0087, code lost:
        q0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008a, code lost:
        r9 = O(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008e, code lost:
        if (r9 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0094, code lost:
        if (O0(r1, r9, r10) == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0098, code lost:
        return i9.b2.f14915b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        return N(r1, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object N0(i9.p1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            i9.f2 r0 = r8.U(r9)
            if (r0 != 0) goto L_0x000b
            n9.j0 r9 = i9.b2.f14916c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof i9.a2.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            i9.a2$c r1 = (i9.a2.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            i9.a2$c r1 = new i9.a2$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.y r4 = new kotlin.jvm.internal.y
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.h()     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x002f
            n9.j0 r9 = i9.b2.f14914a     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.k(r5)     // Catch:{ all -> 0x009e }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f14901h     // Catch:{ all -> 0x009e }
            boolean r6 = androidx.concurrent.futures.b.a(r6, r8, r9, r1)     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0043
            n9.j0 r9 = i9.b2.f14916c     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = i9.p0.a()     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0057
            boolean r6 = r1.i()     // Catch:{ all -> 0x009e }
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x009e }
            r9.<init>()     // Catch:{ all -> 0x009e }
            throw r9     // Catch:{ all -> 0x009e }
        L_0x0057:
            boolean r6 = r1.g()     // Catch:{ all -> 0x009e }
            boolean r7 = r10 instanceof i9.z     // Catch:{ all -> 0x009e }
            if (r7 == 0) goto L_0x0063
            r7 = r10
            i9.z r7 = (i9.z) r7     // Catch:{ all -> 0x009e }
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            if (r7 == 0) goto L_0x006b
            java.lang.Throwable r7 = r7.f15006a     // Catch:{ all -> 0x009e }
            r1.b(r7)     // Catch:{ all -> 0x009e }
        L_0x006b:
            java.lang.Throwable r7 = r1.f()     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0072
            r3 = 1
        L_0x0072:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x009e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x009e }
            if (r3 == 0) goto L_0x007d
            r2 = r7
        L_0x007d:
            r4.f15575h = r2     // Catch:{ all -> 0x009e }
            o8.q r3 = o8.q.f16189a     // Catch:{ all -> 0x009e }
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L_0x008a
            r8.q0(r0, r2)
        L_0x008a:
            i9.s r9 = r8.O(r9)
            if (r9 == 0) goto L_0x0099
            boolean r9 = r8.O0(r1, r9, r10)
            if (r9 == 0) goto L_0x0099
            n9.j0 r9 = i9.b2.f14915b
            return r9
        L_0x0099:
            java.lang.Object r9 = r8.N(r1, r10)
            return r9
        L_0x009e:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a2.N0(i9.p1, java.lang.Object):java.lang.Object");
    }

    private final s O(p1 p1Var) {
        s sVar = p1Var instanceof s ? (s) p1Var : null;
        if (sVar != null) {
            return sVar;
        }
        f2 c10 = p1Var.c();
        if (c10 != null) {
            return p0(c10);
        }
        return null;
    }

    private final boolean O0(c cVar, s sVar, Object obj) {
        while (u1.a.d(sVar.f14987l, false, false, new b(this, cVar, sVar, obj), 1, (Object) null) == g2.f14945h) {
            sVar = p0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable Q(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f15006a;
        }
        return null;
    }

    private final Throwable R(c cVar, List<? extends Throwable> list) {
        T t10;
        boolean z10;
        T t11 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (!(((Throwable) t10) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t10;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (z10) {
                        t11 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t11;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.g()) {
            return new JobCancellationException(G(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final f2 U(p1 p1Var) {
        f2 c10 = p1Var.c();
        if (c10 != null) {
            return c10;
        }
        if (p1Var instanceof d1) {
            return new f2();
        }
        if (p1Var instanceof z1) {
            B0((z1) p1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + p1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        q0(((i9.a2.c) r2).c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return i9.b2.f14914a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object f0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.X()
            boolean r3 = r2 instanceof i9.a2.c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            i9.a2$c r3 = (i9.a2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.i()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            n9.j0 r7 = i9.b2.f14917d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            i9.a2$c r3 = (i9.a2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.g()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.M(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            i9.a2$c r7 = (i9.a2.c) r7     // Catch:{ all -> 0x004e }
            r7.b(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            i9.a2$c r7 = (i9.a2.c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.f()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            i9.a2$c r2 = (i9.a2.c) r2
            i9.f2 r7 = r2.c()
            r6.q0(r7, r0)
        L_0x0049:
            n9.j0 r7 = i9.b2.f14914a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof i9.p1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.M(r7)
        L_0x005b:
            r3 = r2
            i9.p1 r3 = (i9.p1) r3
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.L0(r3, r1)
            if (r2 == 0) goto L_0x0002
            n9.j0 r7 = i9.b2.f14914a
            return r7
        L_0x006f:
            i9.z r3 = new i9.z
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.M0(r2, r3)
            n9.j0 r4 = i9.b2.f14914a
            if (r3 == r4) goto L_0x0087
            n9.j0 r2 = i9.b2.f14916c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            n9.j0 r7 = i9.b2.f14917d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a2.f0(java.lang.Object):java.lang.Object");
    }

    private final z1 m0(l<? super Throwable, q> lVar, boolean z10) {
        z1 z1Var = null;
        if (z10) {
            if (lVar instanceof v1) {
                z1Var = (v1) lVar;
            }
            if (z1Var == null) {
                z1Var = new s1(lVar);
            }
        } else {
            if (lVar instanceof z1) {
                z1Var = (z1) lVar;
            }
            if (z1Var == null) {
                z1Var = new t1(lVar);
            } else if (p0.a() && !(!(z1Var instanceof v1))) {
                throw new AssertionError();
            }
        }
        z1Var.v(this);
        return z1Var;
    }

    private final s p0(u uVar) {
        while (uVar.o()) {
            uVar = uVar.n();
        }
        while (true) {
            uVar = uVar.m();
            if (!uVar.o()) {
                if (uVar instanceof s) {
                    return (s) uVar;
                }
                if (uVar instanceof f2) {
                    return null;
                }
            }
        }
    }

    private final void q0(f2 f2Var, Throwable th) {
        u0(th);
        Object l10 = f2Var.l();
        m.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (u uVar = (u) l10; !m.a(uVar, f2Var); uVar = uVar.m()) {
            if (uVar instanceof v1) {
                z1 z1Var = (z1) uVar;
                try {
                    z1Var.t(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        b.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + z1Var + " for " + this, th2);
                        q qVar = q.f16189a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            a0(completionHandlerException);
        }
        F(th);
    }

    private final boolean t(Object obj, f2 f2Var, z1 z1Var) {
        int s10;
        d dVar = new d(z1Var, this, obj);
        do {
            s10 = f2Var.n().s(z1Var, f2Var, dVar);
            if (s10 == 1) {
                return true;
            }
        } while (s10 != 2);
        return false;
    }

    private final void t0(f2 f2Var, Throwable th) {
        Object l10 = f2Var.l();
        m.d(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (u uVar = (u) l10; !m.a(uVar, f2Var); uVar = uVar.m()) {
            if (uVar instanceof z1) {
                z1 z1Var = (z1) uVar;
                try {
                    z1Var.t(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        b.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + z1Var + " for " + this, th2);
                        q qVar = q.f16189a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            a0(completionHandlerException);
        }
    }

    private final void v(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable l10 = !p0.d() ? th : i0.l(th);
            for (Throwable th2 : list) {
                if (p0.d()) {
                    th2 = i0.l(th2);
                }
                if (th2 != th && th2 != l10 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    private final Object z(r8.d<Object> dVar) {
        a aVar = new a(c.b(dVar), this);
        aVar.z();
        o.a(aVar, y0(new j2(aVar)));
        Object w10 = aVar.w();
        if (w10 == d.c()) {
            h.c(dVar);
        }
        return w10;
    }

    public final boolean A(Throwable th) {
        return B(th);
    }

    public final boolean B(Object obj) {
        Object a10 = b2.f14914a;
        if (T() && (a10 = D(obj)) == b2.f14915b) {
            return true;
        }
        if (a10 == b2.f14914a) {
            a10 = f0(obj);
        }
        if (a10 == b2.f14914a || a10 == b2.f14915b) {
            return true;
        }
        if (a10 == b2.f14917d) {
            return false;
        }
        x(a10);
        return true;
    }

    public void C(Throwable th) {
        B(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C0(i9.z1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.X()
            boolean r1 = r0 instanceof i9.z1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14901h
            i9.d1 r2 = i9.b2.f14920g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof i9.p1
            if (r1 == 0) goto L_0x0027
            i9.p1 r0 = (i9.p1) r0
            i9.f2 r0 = r0.c()
            if (r0 == 0) goto L_0x0027
            r4.p()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a2.C0(i9.z1):void");
    }

    public final void D0(r rVar) {
        f14902i.set(this, rVar);
    }

    /* access modifiers changed from: protected */
    public String G() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    public final CancellationException G0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = G();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public boolean H(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!B(th) || !S()) {
            return false;
        }
        return true;
    }

    public final void J(i2 i2Var) {
        B(i2Var);
    }

    public final String J0() {
        return n0() + '{' + F0(X()) + '}';
    }

    public final CancellationException L() {
        Object X = X();
        if (X instanceof c) {
            Throwable f10 = ((c) X).f();
            if (f10 != null) {
                CancellationException G0 = G0(f10, q0.a(this) + " is cancelling");
                if (G0 != null) {
                    return G0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (X instanceof p1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (X instanceof z) {
            return H0(this, ((z) X).f15006a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(q0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public final Object P() {
        Object X = X();
        if (!(!(X instanceof p1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(X instanceof z)) {
            return b2.h(X);
        } else {
            throw ((z) X).f15006a;
        }
    }

    public boolean S() {
        return true;
    }

    public boolean T() {
        return false;
    }

    public final r V() {
        return (r) f14902i.get(this);
    }

    public r8.g W(g.c<?> cVar) {
        return u1.a.e(this, cVar);
    }

    public final Object X() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14901h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof c0)) {
                return obj;
            }
            ((c0) obj).a(this);
        }
    }

    public r8.g Y(r8.g gVar) {
        return u1.a.f(this, gVar);
    }

    /* access modifiers changed from: protected */
    public boolean Z(Throwable th) {
        return false;
    }

    public boolean a() {
        Object X = X();
        return (X instanceof p1) && ((p1) X).a();
    }

    public void a0(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void b0(u1 u1Var) {
        if (p0.a()) {
            if (!(V() == null)) {
                throw new AssertionError();
            }
        }
        if (u1Var == null) {
            D0(g2.f14945h);
            return;
        }
        u1Var.start();
        r w02 = u1Var.w0(this);
        D0(w02);
        if (d0()) {
            w02.dispose();
            D0(g2.f14945h);
        }
    }

    public final b1 c0(boolean z10, boolean z11, l<? super Throwable, q> lVar) {
        z1 m02 = m0(lVar, z10);
        while (true) {
            Object X = X();
            if (X instanceof d1) {
                d1 d1Var = (d1) X;
                if (!d1Var.a()) {
                    A0(d1Var);
                } else if (androidx.concurrent.futures.b.a(f14901h, this, X, m02)) {
                    return m02;
                }
            } else {
                Throwable th = null;
                if (X instanceof p1) {
                    f2 c10 = ((p1) X).c();
                    if (c10 == null) {
                        m.d(X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        B0((z1) X);
                    } else {
                        b1 b1Var = g2.f14945h;
                        if (z10 && (X instanceof c)) {
                            synchronized (X) {
                                th = ((c) X).f();
                                if (th == null || ((lVar instanceof s) && !((c) X).h())) {
                                    if (t(X, c10, m02)) {
                                        if (th == null) {
                                            return m02;
                                        }
                                        b1Var = m02;
                                    }
                                }
                                q qVar = q.f16189a;
                            }
                        }
                        if (th != null) {
                            if (z11) {
                                lVar.invoke(th);
                            }
                            return b1Var;
                        } else if (t(X, c10, m02)) {
                            return m02;
                        }
                    }
                } else {
                    if (z11) {
                        z zVar = X instanceof z ? (z) X : null;
                        if (zVar != null) {
                            th = zVar.f15006a;
                        }
                        lVar.invoke(th);
                    }
                    return g2.f14945h;
                }
            }
        }
    }

    public final boolean d0() {
        return !(X() instanceof p1);
    }

    /* access modifiers changed from: protected */
    public boolean e0() {
        return false;
    }

    public final g.c<?> getKey() {
        return u1.f14995d;
    }

    public u1 getParent() {
        r V = V();
        if (V != null) {
            return V.getParent();
        }
        return null;
    }

    public <E extends g.b> E h(g.c<E> cVar) {
        return u1.a.c(this, cVar);
    }

    public final boolean i0(Object obj) {
        Object M0;
        do {
            M0 = M0(X(), obj);
            if (M0 == b2.f14914a) {
                return false;
            }
            if (M0 == b2.f14915b) {
                return true;
            }
        } while (M0 == b2.f14916c);
        x(M0);
        return true;
    }

    public final boolean isCancelled() {
        Object X = X();
        return (X instanceof z) || ((X instanceof c) && ((c) X).g());
    }

    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(G(), (Throwable) null, this);
        }
        C(cancellationException);
    }

    public final Object j0(Object obj) {
        Object M0;
        do {
            M0 = M0(X(), obj);
            if (M0 == b2.f14914a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Q(obj));
            }
        } while (M0 == b2.f14916c);
        return M0;
    }

    public String n0() {
        return q0.a(this);
    }

    public CancellationException s0() {
        Throwable th;
        Object X = X();
        CancellationException cancellationException = null;
        if (X instanceof c) {
            th = ((c) X).f();
        } else if (X instanceof z) {
            th = ((z) X).f15006a;
        } else if (!(X instanceof p1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + X).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + F0(X), th, this);
    }

    public final boolean start() {
        int E0;
        do {
            E0 = E0(X());
            if (E0 == 0) {
                return false;
            }
        } while (E0 != 1);
        return true;
    }

    public String toString() {
        return J0() + '@' + q0.b(this);
    }

    /* access modifiers changed from: protected */
    public void u0(Throwable th) {
    }

    public <R> R w(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return u1.a.b(this, r10, pVar);
    }

    public final r w0(t tVar) {
        b1 d10 = u1.a.d(this, true, false, new s(tVar), 2, (Object) null);
        m.d(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d10;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void x0(Object obj) {
    }

    /* access modifiers changed from: protected */
    public final Object y(r8.d<Object> dVar) {
        Object X;
        do {
            X = X();
            if (!(X instanceof p1)) {
                if (!(X instanceof z)) {
                    return b2.h(X);
                }
                Throwable th = ((z) X).f15006a;
                if (!p0.d()) {
                    throw th;
                } else if (!(dVar instanceof e)) {
                    throw th;
                } else {
                    throw i0.i(th, (e) dVar);
                }
            }
        } while (E0(X) < 0);
        return z(dVar);
    }

    public final b1 y0(l<? super Throwable, q> lVar) {
        return c0(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    public void z0() {
    }
}
