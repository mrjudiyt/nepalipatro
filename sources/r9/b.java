package r9;

import i9.m;
import i9.o;
import i9.p0;
import i9.q0;
import i9.s2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import n9.g0;
import n9.j0;
import r8.d;
import r8.g;
import y8.l;
import y8.q;

/* compiled from: Mutex.kt */
public class b extends d implements a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16411i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    private final q<q9.b<?>, Object, Object, l<Throwable, o8.q>> f16412h;
    private volatile Object owner;

    /* compiled from: Mutex.kt */
    private final class a implements i9.l<o8.q>, s2 {

        /* renamed from: h  reason: collision with root package name */
        public final m<o8.q> f16413h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f16414i;

        /* renamed from: r9.b$a$a  reason: collision with other inner class name */
        /* compiled from: Mutex.kt */
        static final class C0278a extends n implements l<Throwable, o8.q> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f16416h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ a f16417i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0278a(b bVar, a aVar) {
                super(1);
                this.f16416h = bVar;
                this.f16417i = aVar;
            }

            public final void a(Throwable th) {
                this.f16416h.c(this.f16417i.f16414i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return o8.q.f16189a;
            }
        }

        /* renamed from: r9.b$a$b  reason: collision with other inner class name */
        /* compiled from: Mutex.kt */
        static final class C0279b extends n implements l<Throwable, o8.q> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f16418h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ a f16419i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0279b(b bVar, a aVar) {
                super(1);
                this.f16418h = bVar;
                this.f16419i = aVar;
            }

            public final void a(Throwable th) {
                b bVar = this.f16418h;
                a aVar = this.f16419i;
                if (p0.a()) {
                    Object obj = b.f16411i.get(bVar);
                    if (!(obj == c.f16423a || obj == aVar.f16414i)) {
                        throw new AssertionError();
                    }
                }
                b.f16411i.set(this.f16418h, this.f16419i.f16414i);
                this.f16418h.c(this.f16419i.f16414i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return o8.q.f16189a;
            }
        }

        public a(m<? super o8.q> mVar, Object obj) {
            this.f16413h = mVar;
            this.f16414i = obj;
        }

        public void a(g0<?> g0Var, int i10) {
            this.f16413h.a(g0Var, i10);
        }

        /* renamed from: b */
        public void d(o8.q qVar, l<? super Throwable, o8.q> lVar) {
            b bVar = b.this;
            if (p0.a()) {
                if (!(b.f16411i.get(bVar) == c.f16423a)) {
                    throw new AssertionError();
                }
            }
            b.f16411i.set(b.this, this.f16414i);
            this.f16413h.d(qVar, new C0278a(b.this, this));
        }

        /* renamed from: c */
        public Object m(o8.q qVar, Object obj, l<? super Throwable, o8.q> lVar) {
            b bVar = b.this;
            boolean z10 = true;
            if (p0.a()) {
                if (!(b.f16411i.get(bVar) == c.f16423a)) {
                    throw new AssertionError();
                }
            }
            Object m10 = this.f16413h.m(qVar, obj, new C0279b(b.this, this));
            if (m10 != null) {
                b bVar2 = b.this;
                if (p0.a()) {
                    if (b.f16411i.get(bVar2) != c.f16423a) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                b.f16411i.set(b.this, this.f16414i);
            }
            return m10;
        }

        public g getContext() {
            return this.f16413h.getContext();
        }

        public void k(l<? super Throwable, o8.q> lVar) {
            this.f16413h.k(lVar);
        }

        public boolean l(Throwable th) {
            return this.f16413h.l(th);
        }

        public void p(Object obj) {
            this.f16413h.p(obj);
        }

        public void resumeWith(Object obj) {
            this.f16413h.resumeWith(obj);
        }
    }

    /* renamed from: r9.b$b  reason: collision with other inner class name */
    /* compiled from: Mutex.kt */
    static final class C0280b extends n implements q<q9.b<?>, Object, Object, l<? super Throwable, ? extends o8.q>> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f16420h;

        /* renamed from: r9.b$b$a */
        /* compiled from: Mutex.kt */
        static final class a extends n implements l<Throwable, o8.q> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ b f16421h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Object f16422i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f16421h = bVar;
                this.f16422i = obj;
            }

            public final void a(Throwable th) {
                this.f16421h.c(this.f16422i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return o8.q.f16189a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0280b(b bVar) {
            super(3);
            this.f16420h = bVar;
        }

        /* renamed from: a */
        public final l<Throwable, o8.q> invoke(q9.b<?> bVar, Object obj, Object obj2) {
            return new a(this.f16420h, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        j0 j0Var;
        if (z10) {
            j0Var = null;
        } else {
            j0Var = c.f16423a;
        }
        this.owner = j0Var;
        this.f16412h = new C0280b(this);
    }

    static /* synthetic */ Object o(b bVar, Object obj, d<? super o8.q> dVar) {
        if (bVar.q(obj)) {
            return o8.q.f16189a;
        }
        Object p10 = bVar.p(obj, dVar);
        return p10 == d.c() ? p10 : o8.q.f16189a;
    }

    private final Object p(Object obj, d<? super o8.q> dVar) {
        m b10 = o.b(c.b(dVar));
        try {
            d(new a(b10, obj));
            Object w10 = b10.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            if (w10 == d.c()) {
                return w10;
            }
            return o8.q.f16189a;
        } catch (Throwable th) {
            b10.I();
            throw th;
        }
    }

    private final int r(Object obj) {
        do {
            boolean z10 = true;
            if (j()) {
                if (p0.a()) {
                    if (f16411i.get(this) != c.f16423a) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                f16411i.set(this, obj);
                return 0;
            } else if (obj == null) {
                break;
            } else if (n(obj)) {
                return 2;
            }
        } while (!a());
        return 1;
    }

    public boolean a() {
        return h() == 0;
    }

    public Object b(Object obj, d<? super o8.q> dVar) {
        return o(this, obj, dVar);
    }

    public void c(Object obj) {
        while (a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16411i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f16423a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, c.f16423a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public boolean n(Object obj) {
        while (a()) {
            Object obj2 = f16411i.get(this);
            if (obj2 != c.f16423a) {
                if (obj2 == obj) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean q(Object obj) {
        int r10 = r(obj);
        if (r10 == 0) {
            return true;
        }
        if (r10 == 1) {
            return false;
        }
        if (r10 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + q0.b(this) + "[isLocked=" + a() + ",owner=" + f16411i.get(this) + ']';
    }
}
