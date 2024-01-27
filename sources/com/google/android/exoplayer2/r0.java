package com.google.android.exoplayer2;

import a6.m0;
import a6.p;
import android.os.Handler;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.w;
import f4.i1;
import g5.h;
import j4.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.r;

/* compiled from: MediaSourceList */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f7032a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<j, c> f7033b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, c> f7034c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final d f7035d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final l.a f7036e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final i.a f7037f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<c, b> f7038g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<c> f7039h;

    /* renamed from: i  reason: collision with root package name */
    private w f7040i = new w.a(0);

    /* renamed from: j  reason: collision with root package name */
    private boolean f7041j;

    /* renamed from: k  reason: collision with root package name */
    private r f7042k;

    /* compiled from: MediaSourceList */
    private final class a implements l, i {

        /* renamed from: h  reason: collision with root package name */
        private final c f7043h;

        /* renamed from: i  reason: collision with root package name */
        private l.a f7044i;

        /* renamed from: j  reason: collision with root package name */
        private i.a f7045j;

        public a(c cVar) {
            this.f7044i = r0.this.f7036e;
            this.f7045j = r0.this.f7037f;
            this.f7043h = cVar;
        }

        private boolean a(int i10, k.a aVar) {
            k.a aVar2;
            if (aVar != null) {
                aVar2 = r0.n(this.f7043h, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int e10 = r0.r(this.f7043h, i10);
            l.a aVar3 = this.f7044i;
            if (aVar3.f7465a != e10 || !m0.c(aVar3.f7466b, aVar2)) {
                this.f7044i = r0.this.f7036e.F(e10, aVar2, 0);
            }
            i.a aVar4 = this.f7045j;
            if (aVar4.f6574a == e10 && m0.c(aVar4.f6575b, aVar2)) {
                return true;
            }
            this.f7045j = r0.this.f7037f.u(e10, aVar2);
            return true;
        }

        public void P(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7045j.i();
            }
        }

        public /* synthetic */ void W(int i10, k.a aVar) {
            e.a(this, i10, aVar);
        }

        public void Z(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7045j.h();
            }
        }

        public void d0(int i10, k.a aVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7044i.E(iVar);
            }
        }

        public void g0(int i10, k.a aVar, int i11) {
            if (a(i10, aVar)) {
                this.f7045j.k(i11);
            }
        }

        public void h0(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7045j.m();
            }
        }

        public void k0(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7044i.v(hVar, iVar);
            }
        }

        public void l(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7044i.s(hVar, iVar);
            }
        }

        public void l0(int i10, k.a aVar, h hVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7044i.B(hVar, iVar);
            }
        }

        public void n(int i10, k.a aVar, h hVar, g5.i iVar, IOException iOException, boolean z10) {
            if (a(i10, aVar)) {
                this.f7044i.y(hVar, iVar, iOException, z10);
            }
        }

        public void n0(int i10, k.a aVar) {
            if (a(i10, aVar)) {
                this.f7045j.j();
            }
        }

        public void u(int i10, k.a aVar, Exception exc) {
            if (a(i10, aVar)) {
                this.f7045j.l(exc);
            }
        }

        public void z(int i10, k.a aVar, g5.i iVar) {
            if (a(i10, aVar)) {
                this.f7044i.j(iVar);
            }
        }
    }

    /* compiled from: MediaSourceList */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final k f7047a;

        /* renamed from: b  reason: collision with root package name */
        public final k.b f7048b;

        /* renamed from: c  reason: collision with root package name */
        public final a f7049c;

        public b(k kVar, k.b bVar, a aVar) {
            this.f7047a = kVar;
            this.f7048b = bVar;
            this.f7049c = aVar;
        }
    }

    /* compiled from: MediaSourceList */
    static final class c implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.source.i f7050a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f7051b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<k.a> f7052c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f7053d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7054e;

        public c(k kVar, boolean z10) {
            this.f7050a = new com.google.android.exoplayer2.source.i(kVar, z10);
        }

        public a1 a() {
            return this.f7050a.P();
        }

        public void b(int i10) {
            this.f7053d = i10;
            this.f7054e = false;
            this.f7052c.clear();
        }

        public Object getUid() {
            return this.f7051b;
        }
    }

    /* compiled from: MediaSourceList */
    public interface d {
        void c();
    }

    public r0(d dVar, i1 i1Var, Handler handler) {
        this.f7035d = dVar;
        l.a aVar = new l.a();
        this.f7036e = aVar;
        i.a aVar2 = new i.a();
        this.f7037f = aVar2;
        this.f7038g = new HashMap<>();
        this.f7039h = new HashSet();
        if (i1Var != null) {
            aVar.g(handler, i1Var);
            aVar2.g(handler, i1Var);
        }
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f7032a.remove(i12);
            this.f7034c.remove(remove.f7051b);
            g(i12, -remove.f7050a.P().p());
            remove.f7054e = true;
            if (this.f7041j) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f7032a.size()) {
            this.f7032a.get(i10).f7053d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f7038g.get(cVar);
        if (bVar != null) {
            bVar.f7047a.e(bVar.f7048b);
        }
    }

    private void k() {
        Iterator<c> it = this.f7039h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f7052c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f7039h.add(cVar);
        b bVar = this.f7038g.get(cVar);
        if (bVar != null) {
            bVar.f7047a.p(bVar.f7048b);
        }
    }

    private static Object m(Object obj) {
        return a.v(obj);
    }

    /* access modifiers changed from: private */
    public static k.a n(c cVar, k.a aVar) {
        for (int i10 = 0; i10 < cVar.f7052c.size(); i10++) {
            if (cVar.f7052c.get(i10).f8903d == aVar.f8903d) {
                return aVar.c(p(cVar, aVar.f8900a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return a.y(cVar.f7051b, obj);
    }

    /* access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f7053d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(k kVar, a1 a1Var) {
        this.f7035d.c();
    }

    private void u(c cVar) {
        if (cVar.f7054e && cVar.f7052c.isEmpty()) {
            b bVar = (b) a6.a.e(this.f7038g.remove(cVar));
            bVar.f7047a.a(bVar.f7048b);
            bVar.f7047a.d(bVar.f7049c);
            bVar.f7047a.k(bVar.f7049c);
            this.f7039h.remove(cVar);
        }
    }

    private void x(c cVar) {
        com.google.android.exoplayer2.source.i iVar = cVar.f7050a;
        q0 q0Var = new q0(this);
        a aVar = new a(cVar);
        this.f7038g.put(cVar, new b(iVar, q0Var, aVar));
        iVar.c(m0.z(), aVar);
        iVar.j(m0.z(), aVar);
        iVar.i(q0Var, this.f7042k);
    }

    public a1 A(int i10, int i11, w wVar) {
        a6.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f7040i = wVar;
        B(i10, i11);
        return i();
    }

    public a1 C(List<c> list, w wVar) {
        B(0, this.f7032a.size());
        return f(this.f7032a.size(), list, wVar);
    }

    public a1 D(w wVar) {
        int q10 = q();
        if (wVar.a() != q10) {
            wVar = wVar.h().f(0, q10);
        }
        this.f7040i = wVar;
        return i();
    }

    public a1 f(int i10, List<c> list, w wVar) {
        if (!list.isEmpty()) {
            this.f7040i = wVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f7032a.get(i11 - 1);
                    cVar.b(cVar2.f7053d + cVar2.f7050a.P().p());
                } else {
                    cVar.b(0);
                }
                g(i11, cVar.f7050a.P().p());
                this.f7032a.add(i11, cVar);
                this.f7034c.put(cVar.f7051b, cVar);
                if (this.f7041j) {
                    x(cVar);
                    if (this.f7033b.isEmpty()) {
                        this.f7039h.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public j h(k.a aVar, z5.b bVar, long j10) {
        Object o10 = o(aVar.f8900a);
        k.a c10 = aVar.c(m(aVar.f8900a));
        c cVar = (c) a6.a.e(this.f7034c.get(o10));
        l(cVar);
        cVar.f7052c.add(c10);
        com.google.android.exoplayer2.source.h L = cVar.f7050a.h(c10, bVar, j10);
        this.f7033b.put(L, cVar);
        k();
        return L;
    }

    public a1 i() {
        if (this.f7032a.isEmpty()) {
            return a1.f6231a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7032a.size(); i11++) {
            c cVar = this.f7032a.get(i11);
            cVar.f7053d = i10;
            i10 += cVar.f7050a.P().p();
        }
        return new v0(this.f7032a, this.f7040i);
    }

    public int q() {
        return this.f7032a.size();
    }

    public boolean s() {
        return this.f7041j;
    }

    public a1 v(int i10, int i11, int i12, w wVar) {
        a6.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f7040i = wVar;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f7032a.get(min).f7053d;
        m0.q0(this.f7032a, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f7032a.get(min);
            cVar.f7053d = i13;
            i13 += cVar.f7050a.P().p();
            min++;
        }
        return i();
    }

    public void w(r rVar) {
        a6.a.f(!this.f7041j);
        this.f7042k = rVar;
        for (int i10 = 0; i10 < this.f7032a.size(); i10++) {
            c cVar = this.f7032a.get(i10);
            x(cVar);
            this.f7039h.add(cVar);
        }
        this.f7041j = true;
    }

    public void y() {
        for (b next : this.f7038g.values()) {
            try {
                next.f7047a.a(next.f7048b);
            } catch (RuntimeException e10) {
                p.d("MediaSourceList", "Failed to release child source.", e10);
            }
            next.f7047a.d(next.f7049c);
            next.f7047a.k(next.f7049c);
        }
        this.f7038g.clear();
        this.f7039h.clear();
        this.f7041j = false;
    }

    public void z(j jVar) {
        c cVar = (c) a6.a.e(this.f7033b.remove(jVar));
        cVar.f7050a.n(jVar);
        cVar.f7052c.remove(((com.google.android.exoplayer2.source.h) jVar).f7288h);
        if (!this.f7033b.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
