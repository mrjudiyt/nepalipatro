package q9;

import androidx.concurrent.futures.b;
import i9.b1;
import i9.j;
import i9.s2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import n9.g0;
import r8.g;
import y8.l;
import y8.q;

/* compiled from: Select.kt */
public class a<R> extends j implements b, s2 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16287m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: h  reason: collision with root package name */
    private final g f16288h;

    /* renamed from: i  reason: collision with root package name */
    private List<a<R>.a> f16289i;

    /* renamed from: j  reason: collision with root package name */
    private Object f16290j;

    /* renamed from: k  reason: collision with root package name */
    private int f16291k;

    /* renamed from: l  reason: collision with root package name */
    private Object f16292l;
    private volatile Object state;

    /* renamed from: q9.a$a  reason: collision with other inner class name */
    /* compiled from: Select.kt */
    public final class C0269a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16293a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f16294b;

        /* renamed from: c  reason: collision with root package name */
        public final q<b<?>, Object, Object, l<Throwable, o8.q>> f16295c;

        /* renamed from: d  reason: collision with root package name */
        public Object f16296d;

        /* renamed from: e  reason: collision with root package name */
        public int f16297e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<R> f16298f;

        public final l<Throwable, o8.q> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, o8.q>> qVar = this.f16295c;
            if (qVar != null) {
                return qVar.invoke(bVar, this.f16294b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f16296d;
            a<R> aVar = this.f16298f;
            b1 b1Var = null;
            if (obj instanceof g0) {
                ((g0) obj).o(this.f16297e, (Throwable) null, aVar.getContext());
                return;
            }
            if (obj instanceof b1) {
                b1Var = (b1) obj;
            }
            if (b1Var != null) {
                b1Var.dispose();
            }
        }
    }

    private final a<R>.a g(Object obj) {
        boolean z10;
        List<a<R>.a> list = this.f16289i;
        T t10 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C0269a) next).f16293a == obj) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                t10 = next;
                break;
            }
        }
        a<R>.a aVar = (C0269a) t10;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int i(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16287m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof i9.l) {
                a<R>.a g10 = g(obj);
                if (g10 == null) {
                    continue;
                } else {
                    l<Throwable, o8.q> a10 = g10.a(this, obj2);
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, g10)) {
                        this.f16292l = obj2;
                        if (c.h((i9.l) obj3, a10)) {
                            return 0;
                        }
                        this.f16292l = null;
                        return 2;
                    }
                }
            } else {
                if (m.a(obj3, c.f16301c) ? true : obj3 instanceof C0269a) {
                    return 3;
                }
                if (m.a(obj3, c.f16302d)) {
                    return 2;
                }
                if (m.a(obj3, c.f16300b)) {
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, o.b(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (b.a(atomicReferenceFieldUpdater, this, obj3, x.J((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    public void a(g0<?> g0Var, int i10) {
        this.f16290j = g0Var;
        this.f16291k = i10;
    }

    public boolean c(Object obj, Object obj2) {
        return i(obj, obj2) == 0;
    }

    public void d(Object obj) {
        this.f16292l = obj;
    }

    public void f(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16287m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == c.f16301c) {
                return;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, obj, c.f16302d));
        List<a<R>.a> list = this.f16289i;
        if (list != null) {
            for (C0269a b10 : list) {
                b10.b();
            }
            this.f16292l = c.f16303e;
            this.f16289i = null;
        }
    }

    public g getContext() {
        return this.f16288h;
    }

    public final d h(Object obj, Object obj2) {
        return c.a(i(obj, obj2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return o8.q.f16189a;
    }
}
