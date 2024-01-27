package com.google.android.exoplayer2.source;

import a6.m0;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.r;

/* compiled from: ConcatenatingMediaSource */
public final class d extends c<e> {
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final j0 f7121v = new j0.c().h(Uri.EMPTY).a();

    /* renamed from: j  reason: collision with root package name */
    private final List<e> f7122j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<C0113d> f7123k;

    /* renamed from: l  reason: collision with root package name */
    private Handler f7124l;

    /* renamed from: m  reason: collision with root package name */
    private final List<e> f7125m;

    /* renamed from: n  reason: collision with root package name */
    private final IdentityHashMap<j, e> f7126n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<Object, e> f7127o;

    /* renamed from: p  reason: collision with root package name */
    private final Set<e> f7128p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f7129q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f7130r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7131s;

    /* renamed from: t  reason: collision with root package name */
    private Set<C0113d> f7132t;

    /* renamed from: u  reason: collision with root package name */
    private w f7133u;

    /* compiled from: ConcatenatingMediaSource */
    private static final class b extends com.google.android.exoplayer2.a {

        /* renamed from: f  reason: collision with root package name */
        private final int f7134f;

        /* renamed from: g  reason: collision with root package name */
        private final int f7135g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f7136h;

        /* renamed from: i  reason: collision with root package name */
        private final int[] f7137i;

        /* renamed from: j  reason: collision with root package name */
        private final a1[] f7138j;

        /* renamed from: k  reason: collision with root package name */
        private final Object[] f7139k;

        /* renamed from: l  reason: collision with root package name */
        private final HashMap<Object, Integer> f7140l = new HashMap<>();

        public b(Collection<e> collection, w wVar, boolean z10) {
            super(z10, wVar);
            int size = collection.size();
            this.f7136h = new int[size];
            this.f7137i = new int[size];
            this.f7138j = new a1[size];
            this.f7139k = new Object[size];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (e next : collection) {
                this.f7138j[i12] = next.f7143a.P();
                this.f7137i[i12] = i10;
                this.f7136h[i12] = i11;
                i10 += this.f7138j[i12].p();
                i11 += this.f7138j[i12].i();
                Object[] objArr = this.f7139k;
                objArr[i12] = next.f7144b;
                this.f7140l.put(objArr[i12], Integer.valueOf(i12));
                i12++;
            }
            this.f7134f = i10;
            this.f7135g = i11;
        }

        /* access modifiers changed from: protected */
        public int A(int i10) {
            return this.f7137i[i10];
        }

        /* access modifiers changed from: protected */
        public a1 D(int i10) {
            return this.f7138j[i10];
        }

        public int i() {
            return this.f7135g;
        }

        public int p() {
            return this.f7134f;
        }

        /* access modifiers changed from: protected */
        public int s(Object obj) {
            Integer num = this.f7140l.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        public int t(int i10) {
            return m0.h(this.f7136h, i10 + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public int u(int i10) {
            return m0.h(this.f7137i, i10 + 1, false, false);
        }

        /* access modifiers changed from: protected */
        public Object x(int i10) {
            return this.f7139k[i10];
        }

        /* access modifiers changed from: protected */
        public int z(int i10) {
            return this.f7136h[i10];
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    private static final class c extends a {
        private c() {
        }

        /* access modifiers changed from: protected */
        public void A() {
        }

        public j0 g() {
            return d.f7121v;
        }

        public j h(k.a aVar, z5.b bVar, long j10) {
            throw new UnsupportedOperationException();
        }

        public void l() {
        }

        public void n(j jVar) {
        }

        /* access modifiers changed from: protected */
        public void y(r rVar) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.d$d  reason: collision with other inner class name */
    /* compiled from: ConcatenatingMediaSource */
    private static final class C0113d {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f7141a;

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f7142b;

        public C0113d(Handler handler, Runnable runnable) {
            this.f7141a = handler;
            this.f7142b = runnable;
        }

        public void a() {
            this.f7141a.post(this.f7142b);
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final i f7143a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f7144b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<k.a> f7145c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f7146d;

        /* renamed from: e  reason: collision with root package name */
        public int f7147e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7148f;

        public e(k kVar, boolean z10) {
            this.f7143a = new i(kVar, z10);
        }

        public void a(int i10, int i11) {
            this.f7146d = i10;
            this.f7147e = i11;
            this.f7148f = false;
            this.f7145c.clear();
        }
    }

    /* compiled from: ConcatenatingMediaSource */
    private static final class f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f7149a;

        /* renamed from: b  reason: collision with root package name */
        public final T f7150b;

        /* renamed from: c  reason: collision with root package name */
        public final C0113d f7151c;

        public f(int i10, T t10, C0113d dVar) {
            this.f7149a = i10;
            this.f7150b = t10;
            this.f7151c = dVar;
        }
    }

    public d(k... kVarArr) {
        this(false, kVarArr);
    }

    private void N(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f7125m.get(i10 - 1);
            eVar.a(i10, eVar2.f7147e + eVar2.f7143a.P().p());
        } else {
            eVar.a(i10, 0);
        }
        S(i10, 1, eVar.f7143a.P().p());
        this.f7125m.add(i10, eVar);
        this.f7127o.put(eVar.f7144b, eVar);
        J(eVar, eVar.f7143a);
        if (!x() || !this.f7126n.isEmpty()) {
            C(eVar);
        } else {
            this.f7128p.add(eVar);
        }
    }

    private void Q(int i10, Collection<e> collection) {
        for (e N : collection) {
            N(i10, N);
            i10++;
        }
    }

    private void R(int i10, Collection<k> collection, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        a6.a.a(z10);
        Handler handler2 = this.f7124l;
        for (k e10 : collection) {
            a6.a.e(e10);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (k eVar : collection) {
            arrayList.add(new e(eVar, this.f7130r));
        }
        this.f7122j.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, T(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void S(int i10, int i11, int i12) {
        while (i10 < this.f7125m.size()) {
            e eVar = this.f7125m.get(i10);
            eVar.f7146d += i11;
            eVar.f7147e += i12;
            i10++;
        }
    }

    private C0113d T(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C0113d dVar = new C0113d(handler, runnable);
        this.f7123k.add(dVar);
        return dVar;
    }

    private void U() {
        Iterator<e> it = this.f7128p.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f7145c.isEmpty()) {
                C(next);
                it.remove();
            }
        }
    }

    private synchronized void V(Set<C0113d> set) {
        for (C0113d a10 : set) {
            a10.a();
        }
        this.f7123k.removeAll(set);
    }

    private void W(e eVar) {
        this.f7128p.add(eVar);
        D(eVar);
    }

    private static Object X(Object obj) {
        return com.google.android.exoplayer2.a.v(obj);
    }

    private static Object Z(Object obj) {
        return com.google.android.exoplayer2.a.w(obj);
    }

    private static Object a0(e eVar, Object obj) {
        return com.google.android.exoplayer2.a.y(eVar.f7144b, obj);
    }

    private Handler b0() {
        return (Handler) a6.a.e(this.f7124l);
    }

    /* access modifiers changed from: private */
    public boolean e0(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) m0.j(message.obj);
            this.f7133u = this.f7133u.f(fVar.f7149a, ((Collection) fVar.f7150b).size());
            Q(fVar.f7149a, (Collection) fVar.f7150b);
            o0(fVar.f7151c);
        } else if (i10 == 1) {
            f fVar2 = (f) m0.j(message.obj);
            int i11 = fVar2.f7149a;
            int intValue = ((Integer) fVar2.f7150b).intValue();
            if (i11 == 0 && intValue == this.f7133u.a()) {
                this.f7133u = this.f7133u.h();
            } else {
                this.f7133u = this.f7133u.b(i11, intValue);
            }
            for (int i12 = intValue - 1; i12 >= i11; i12--) {
                k0(i12);
            }
            o0(fVar2.f7151c);
        } else if (i10 == 2) {
            f fVar3 = (f) m0.j(message.obj);
            w wVar = this.f7133u;
            int i13 = fVar3.f7149a;
            w b10 = wVar.b(i13, i13 + 1);
            this.f7133u = b10;
            this.f7133u = b10.f(((Integer) fVar3.f7150b).intValue(), 1);
            h0(fVar3.f7149a, ((Integer) fVar3.f7150b).intValue());
            o0(fVar3.f7151c);
        } else if (i10 == 3) {
            f fVar4 = (f) m0.j(message.obj);
            this.f7133u = (w) fVar4.f7150b;
            o0(fVar4.f7151c);
        } else if (i10 == 4) {
            s0();
        } else if (i10 == 5) {
            V((Set) m0.j(message.obj));
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    private void f0(e eVar) {
        if (eVar.f7148f && eVar.f7145c.isEmpty()) {
            this.f7128p.remove(eVar);
            K(eVar);
        }
    }

    private void h0(int i10, int i11) {
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        int i12 = this.f7125m.get(min).f7147e;
        List<e> list = this.f7125m;
        list.add(i11, list.remove(i10));
        while (min <= max) {
            e eVar = this.f7125m.get(min);
            eVar.f7146d = min;
            eVar.f7147e = i12;
            i12 += eVar.f7143a.P().p();
            min++;
        }
    }

    private void i0(int i10, int i11, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        a6.a.a(z10);
        Handler handler2 = this.f7124l;
        List<e> list = this.f7122j;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i10, Integer.valueOf(i11), T(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void k0(int i10) {
        e remove = this.f7125m.remove(i10);
        this.f7127o.remove(remove.f7144b);
        S(i10, -1, -remove.f7143a.P().p());
        remove.f7148f = true;
        f0(remove);
    }

    private void m0(int i10, int i11, Handler handler, Runnable runnable) {
        boolean z10 = false;
        if ((handler == null) == (runnable == null)) {
            z10 = true;
        }
        a6.a.a(z10);
        Handler handler2 = this.f7124l;
        m0.B0(this.f7122j, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), T(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void n0() {
        o0((C0113d) null);
    }

    private void o0(C0113d dVar) {
        if (!this.f7131s) {
            b0().obtainMessage(4).sendToTarget();
            this.f7131s = true;
        }
        if (dVar != null) {
            this.f7132t.add(dVar);
        }
    }

    private void p0(w wVar, Handler handler, Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        a6.a.a(z10);
        Handler handler2 = this.f7124l;
        if (handler2 != null) {
            int c02 = c0();
            if (wVar.a() != c02) {
                wVar = wVar.h().f(0, c02);
            }
            handler2.obtainMessage(3, new f(0, wVar, T(handler, runnable))).sendToTarget();
            return;
        }
        if (wVar.a() > 0) {
            wVar = wVar.h();
        }
        this.f7133u = wVar;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    private void r0(e eVar, a1 a1Var) {
        int p10;
        if (eVar.f7146d + 1 < this.f7125m.size() && (p10 = a1Var.p() - (this.f7125m.get(eVar.f7146d + 1).f7147e - eVar.f7147e)) != 0) {
            S(eVar.f7146d + 1, 0, p10);
        }
        n0();
    }

    private void s0() {
        this.f7131s = false;
        Set<C0113d> set = this.f7132t;
        this.f7132t = new HashSet();
        z(new b(this.f7125m, this.f7133u, this.f7129q));
        b0().obtainMessage(5, set).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public synchronized void A() {
        super.A();
        this.f7125m.clear();
        this.f7128p.clear();
        this.f7127o.clear();
        this.f7133u = this.f7133u.h();
        Handler handler = this.f7124l;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f7124l = null;
        }
        this.f7131s = false;
        this.f7132t.clear();
        V(this.f7123k);
    }

    public synchronized void O(int i10, Collection<k> collection, Handler handler, Runnable runnable) {
        R(i10, collection, handler, runnable);
    }

    public synchronized void P(Collection<k> collection) {
        R(this.f7122j.size(), collection, (Handler) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public k.a E(e eVar, k.a aVar) {
        for (int i10 = 0; i10 < eVar.f7145c.size(); i10++) {
            if (eVar.f7145c.get(i10).f8903d == aVar.f8903d) {
                return aVar.c(a0(eVar, aVar.f8900a));
            }
        }
        return null;
    }

    public synchronized int c0() {
        return this.f7122j.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public int G(e eVar, int i10) {
        return i10 + eVar.f7147e;
    }

    public j0 g() {
        return f7121v;
    }

    public synchronized void g0(int i10, int i11, Handler handler, Runnable runnable) {
        i0(i10, i11, handler, runnable);
    }

    public j h(k.a aVar, z5.b bVar, long j10) {
        Object Z = Z(aVar.f8900a);
        k.a c10 = aVar.c(X(aVar.f8900a));
        e eVar = this.f7127o.get(Z);
        if (eVar == null) {
            eVar = new e(new c(), this.f7130r);
            eVar.f7148f = true;
            J(eVar, eVar.f7143a);
        }
        W(eVar);
        eVar.f7145c.add(c10);
        h L = eVar.f7143a.h(c10, bVar, j10);
        this.f7126n.put(L, eVar);
        U();
        return L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void I(e eVar, k kVar, a1 a1Var) {
        r0(eVar, a1Var);
    }

    public synchronized void l0(int i10, int i11, Handler handler, Runnable runnable) {
        m0(i10, i11, handler, runnable);
    }

    public boolean m() {
        return false;
    }

    public void n(j jVar) {
        e eVar = (e) a6.a.e(this.f7126n.remove(jVar));
        eVar.f7143a.n(jVar);
        eVar.f7145c.remove(((h) jVar).f7288h);
        if (!this.f7126n.isEmpty()) {
            U();
        }
        f0(eVar);
    }

    public synchronized a1 o() {
        w wVar;
        if (this.f7133u.a() != this.f7122j.size()) {
            wVar = this.f7133u.h().f(0, this.f7122j.size());
        } else {
            wVar = this.f7133u;
        }
        return new b(this.f7122j, wVar, this.f7129q);
    }

    public synchronized void q0(w wVar) {
        p0(wVar, (Handler) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    public void v() {
        super.v();
        this.f7128p.clear();
    }

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: protected */
    public synchronized void y(r rVar) {
        super.y(rVar);
        this.f7124l = new Handler(new g5.e(this));
        if (this.f7122j.isEmpty()) {
            s0();
        } else {
            this.f7133u = this.f7133u.f(0, this.f7122j.size());
            Q(0, this.f7122j);
            n0();
        }
    }

    public d(boolean z10, k... kVarArr) {
        this(z10, new w.a(0), kVarArr);
    }

    public d(boolean z10, w wVar, k... kVarArr) {
        this(z10, false, wVar, kVarArr);
    }

    public d(boolean z10, boolean z11, w wVar, k... kVarArr) {
        for (k e10 : kVarArr) {
            a6.a.e(e10);
        }
        this.f7133u = wVar.a() > 0 ? wVar.h() : wVar;
        this.f7126n = new IdentityHashMap<>();
        this.f7127o = new HashMap();
        this.f7122j = new ArrayList();
        this.f7125m = new ArrayList();
        this.f7132t = new HashSet();
        this.f7123k = new HashSet();
        this.f7128p = new HashSet();
        this.f7129q = z10;
        this.f7130r = z11;
        P(Arrays.asList(kVarArr));
    }
}
