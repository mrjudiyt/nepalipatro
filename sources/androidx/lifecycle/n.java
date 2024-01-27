package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import n.c;

/* compiled from: LifecycleRegistry.kt */
public class n extends h {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3507j = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3508b;

    /* renamed from: c  reason: collision with root package name */
    private o.a<l, b> f3509c;

    /* renamed from: d  reason: collision with root package name */
    private h.b f3510d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<m> f3511e;

    /* renamed from: f  reason: collision with root package name */
    private int f3512f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3513g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3514h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<h.b> f3515i;

    /* compiled from: LifecycleRegistry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final h.b a(h.b bVar, h.b bVar2) {
            m.f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private h.b f3516a;

        /* renamed from: b  reason: collision with root package name */
        private k f3517b;

        public b(l lVar, h.b bVar) {
            m.f(bVar, "initialState");
            m.c(lVar);
            this.f3517b = q.f(lVar);
            this.f3516a = bVar;
        }

        public final void a(m mVar, h.a aVar) {
            m.f(aVar, "event");
            h.b e10 = aVar.e();
            this.f3516a = n.f3507j.a(this.f3516a, e10);
            k kVar = this.f3517b;
            m.c(mVar);
            kVar.onStateChanged(mVar, aVar);
            this.f3516a = e10;
        }

        public final h.b b() {
            return this.f3516a;
        }
    }

    private n(m mVar, boolean z10) {
        this.f3508b = z10;
        this.f3509c = new o.a<>();
        this.f3510d = h.b.INITIALIZED;
        this.f3515i = new ArrayList<>();
        this.f3511e = new WeakReference<>(mVar);
    }

    private final void d(m mVar) {
        Iterator<Map.Entry<l, b>> descendingIterator = this.f3509c.descendingIterator();
        m.e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3514h) {
            Map.Entry next = descendingIterator.next();
            m.e(next, "next()");
            l lVar = (l) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f3510d) > 0 && !this.f3514h && this.f3509c.contains(lVar)) {
                h.a a10 = h.a.Companion.a(bVar.b());
                if (a10 != null) {
                    m(a10.e());
                    bVar.a(mVar, a10);
                    l();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.h.b e(androidx.lifecycle.l r4) {
        /*
            r3 = this;
            o.a<androidx.lifecycle.l, androidx.lifecycle.n$b> r0 = r3.f3509c
            java.util.Map$Entry r4 = r0.i(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.n$b r4 = (androidx.lifecycle.n.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.h$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.h$b> r1 = r3.f3515i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList<androidx.lifecycle.h$b> r0 = r3.f3515i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.h$b r0 = (androidx.lifecycle.h.b) r0
        L_0x002f:
            androidx.lifecycle.n$a r1 = f3507j
            androidx.lifecycle.h$b r2 = r3.f3510d
            androidx.lifecycle.h$b r4 = r1.a(r2, r4)
            androidx.lifecycle.h$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.n.e(androidx.lifecycle.l):androidx.lifecycle.h$b");
    }

    @SuppressLint({"RestrictedApi"})
    private final void f(String str) {
        if (this.f3508b && !c.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void g(m mVar) {
        o.b<K, V>.d c10 = this.f3509c.c();
        m.e(c10, "observerMap.iteratorWithAdditions()");
        while (c10.hasNext() && !this.f3514h) {
            Map.Entry entry = (Map.Entry) c10.next();
            l lVar = (l) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3510d) < 0 && !this.f3514h && this.f3509c.contains(lVar)) {
                m(bVar.b());
                h.a b10 = h.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(mVar, b10);
                    l();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean i() {
        if (this.f3509c.size() == 0) {
            return true;
        }
        Map.Entry<l, b> a10 = this.f3509c.a();
        m.c(a10);
        h.b b10 = a10.getValue().b();
        Map.Entry<l, b> d10 = this.f3509c.d();
        m.c(d10);
        h.b b11 = d10.getValue().b();
        if (b10 == b11 && this.f3510d == b11) {
            return true;
        }
        return false;
    }

    private final void k(h.b bVar) {
        h.b bVar2 = this.f3510d;
        if (bVar2 != bVar) {
            if ((bVar2 == h.b.INITIALIZED && bVar == h.b.DESTROYED) ? false : true) {
                this.f3510d = bVar;
                if (this.f3513g || this.f3512f != 0) {
                    this.f3514h = true;
                    return;
                }
                this.f3513g = true;
                o();
                this.f3513g = false;
                if (this.f3510d == h.b.DESTROYED) {
                    this.f3509c = new o.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f3510d + " in component " + this.f3511e.get()).toString());
        }
    }

    private final void l() {
        ArrayList<h.b> arrayList = this.f3515i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(h.b bVar) {
        this.f3515i.add(bVar);
    }

    private final void o() {
        m mVar = (m) this.f3511e.get();
        if (mVar != null) {
            while (!i()) {
                this.f3514h = false;
                h.b bVar = this.f3510d;
                Map.Entry<l, b> a10 = this.f3509c.a();
                m.c(a10);
                if (bVar.compareTo(a10.getValue().b()) < 0) {
                    d(mVar);
                }
                Map.Entry<l, b> d10 = this.f3509c.d();
                if (!this.f3514h && d10 != null && this.f3510d.compareTo(d10.getValue().b()) > 0) {
                    g(mVar);
                }
            }
            this.f3514h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public void a(l lVar) {
        m mVar;
        m.f(lVar, "observer");
        f("addObserver");
        h.b bVar = this.f3510d;
        h.b bVar2 = h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = h.b.INITIALIZED;
        }
        b bVar3 = new b(lVar, bVar2);
        if (this.f3509c.f(lVar, bVar3) == null && (mVar = (m) this.f3511e.get()) != null) {
            boolean z10 = this.f3512f != 0 || this.f3513g;
            h.b e10 = e(lVar);
            this.f3512f++;
            while (bVar3.b().compareTo(e10) < 0 && this.f3509c.contains(lVar)) {
                m(bVar3.b());
                h.a b10 = h.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(mVar, b10);
                    l();
                    e10 = e(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                o();
            }
            this.f3512f--;
        }
    }

    public h.b b() {
        return this.f3510d;
    }

    public void c(l lVar) {
        m.f(lVar, "observer");
        f("removeObserver");
        this.f3509c.g(lVar);
    }

    public void h(h.a aVar) {
        m.f(aVar, "event");
        f("handleLifecycleEvent");
        k(aVar.e());
    }

    public void j(h.b bVar) {
        m.f(bVar, "state");
        f("markState");
        n(bVar);
    }

    public void n(h.b bVar) {
        m.f(bVar, "state");
        f("setCurrentState");
        k(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        this(mVar, true);
        m.f(mVar, "provider");
    }
}
