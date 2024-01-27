package y7;

import ea.h;
import ea.j;
import ea.o;
import ea.z;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import v7.p;
import v7.u;
import v7.v;
import v7.x;
import v7.y;
import x7.d;
import x7.e;

/* compiled from: Http2xStream */
public final class f implements j {

    /* renamed from: e  reason: collision with root package name */
    private static final h f17372e;

    /* renamed from: f  reason: collision with root package name */
    private static final h f17373f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f17374g;

    /* renamed from: h  reason: collision with root package name */
    private static final h f17375h;

    /* renamed from: i  reason: collision with root package name */
    private static final h f17376i;

    /* renamed from: j  reason: collision with root package name */
    private static final h f17377j;

    /* renamed from: k  reason: collision with root package name */
    private static final h f17378k;

    /* renamed from: l  reason: collision with root package name */
    private static final h f17379l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<h> f17380m;

    /* renamed from: n  reason: collision with root package name */
    private static final List<h> f17381n;

    /* renamed from: o  reason: collision with root package name */
    private static final List<h> f17382o;

    /* renamed from: p  reason: collision with root package name */
    private static final List<h> f17383p;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final q f17384a;

    /* renamed from: b  reason: collision with root package name */
    private final d f17385b;

    /* renamed from: c  reason: collision with root package name */
    private h f17386c;

    /* renamed from: d  reason: collision with root package name */
    private e f17387d;

    /* compiled from: Http2xStream */
    class a extends j {
        public a(z zVar) {
            super(zVar);
        }

        public void close() {
            f.this.f17384a.q(f.this);
            super.close();
        }
    }

    static {
        h e10 = h.e("connection");
        f17372e = e10;
        h e11 = h.e("host");
        f17373f = e11;
        h e12 = h.e("keep-alive");
        f17374g = e12;
        h e13 = h.e("proxy-connection");
        f17375h = e13;
        h e14 = h.e("transfer-encoding");
        f17376i = e14;
        h e15 = h.e("te");
        f17377j = e15;
        h e16 = h.e("encoding");
        f17378k = e16;
        h e17 = h.e("upgrade");
        f17379l = e17;
        h hVar = x7.f.f17209e;
        h hVar2 = x7.f.f17210f;
        h hVar3 = x7.f.f17211g;
        h hVar4 = x7.f.f17212h;
        h hVar5 = x7.f.f17213i;
        h hVar6 = x7.f.f17214j;
        f17380m = w7.h.k(e10, e11, e12, e13, e14, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f17381n = w7.h.k(e10, e11, e12, e13, e14);
        f17382o = w7.h.k(e10, e11, e12, e13, e15, e14, e16, e17, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f17383p = w7.h.k(e10, e11, e12, e13, e15, e14, e16, e17);
    }

    public f(q qVar, d dVar) {
        this.f17384a = qVar;
        this.f17385b = dVar;
    }

    public static List<x7.f> i(v vVar) {
        p i10 = vVar.i();
        ArrayList arrayList = new ArrayList(i10.f() + 4);
        arrayList.add(new x7.f(x7.f.f17209e, vVar.l()));
        arrayList.add(new x7.f(x7.f.f17210f, m.c(vVar.j())));
        arrayList.add(new x7.f(x7.f.f17212h, w7.h.i(vVar.j())));
        arrayList.add(new x7.f(x7.f.f17211g, vVar.j().E()));
        int f10 = i10.f();
        for (int i11 = 0; i11 < f10; i11++) {
            h e10 = h.e(i10.d(i11).toLowerCase(Locale.US));
            if (!f17382o.contains(e10)) {
                arrayList.add(new x7.f(e10, i10.g(i11)));
            }
        }
        return arrayList;
    }

    private static String j(String str, String str2) {
        return str + 0 + str2;
    }

    public static x.b k(List<x7.f> list) {
        p.b bVar = new p.b();
        int size = list.size();
        String str = null;
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = list.get(i10).f17215a;
            String x10 = list.get(i10).f17216b.x();
            if (hVar.equals(x7.f.f17208d)) {
                str = x10;
            } else if (!f17383p.contains(hVar)) {
                bVar.b(hVar.x(), x10);
            }
        }
        if (str != null) {
            p a10 = p.a("HTTP/1.1 " + str);
            return new x.b().x(u.HTTP_2).q(a10.f17441b).u(a10.f17442c).t(bVar.e());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static x.b l(List<x7.f> list) {
        p.b bVar = new p.b();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = list.get(i10).f17215a;
            String x10 = list.get(i10).f17216b.x();
            int i11 = 0;
            while (i11 < x10.length()) {
                int indexOf = x10.indexOf(0, i11);
                if (indexOf == -1) {
                    indexOf = x10.length();
                }
                String substring = x10.substring(i11, indexOf);
                if (hVar.equals(x7.f.f17208d)) {
                    str = substring;
                } else if (hVar.equals(x7.f.f17214j)) {
                    str2 = substring;
                } else if (!f17381n.contains(hVar)) {
                    bVar.b(hVar.x(), substring);
                }
                i11 = indexOf + 1;
            }
        }
        if (str != null) {
            p a10 = p.a(str2 + " " + str);
            return new x.b().x(u.SPDY_3).q(a10.f17441b).u(a10.f17442c).t(bVar.e());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static List<x7.f> m(v vVar) {
        p i10 = vVar.i();
        ArrayList arrayList = new ArrayList(i10.f() + 5);
        arrayList.add(new x7.f(x7.f.f17209e, vVar.l()));
        arrayList.add(new x7.f(x7.f.f17210f, m.c(vVar.j())));
        arrayList.add(new x7.f(x7.f.f17214j, "HTTP/1.1"));
        arrayList.add(new x7.f(x7.f.f17213i, w7.h.i(vVar.j())));
        arrayList.add(new x7.f(x7.f.f17211g, vVar.j().E()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int f10 = i10.f();
        for (int i11 = 0; i11 < f10; i11++) {
            h e10 = h.e(i10.d(i11).toLowerCase(Locale.US));
            if (!f17380m.contains(e10)) {
                String g10 = i10.g(i11);
                if (linkedHashSet.add(e10)) {
                    arrayList.add(new x7.f(e10, g10));
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        } else if (((x7.f) arrayList.get(i12)).f17215a.equals(e10)) {
                            arrayList.set(i12, new x7.f(e10, j(((x7.f) arrayList.get(i12)).f17216b.x(), g10)));
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(n nVar) {
        nVar.h(this.f17387d.q());
    }

    public void b() {
        this.f17387d.q().close();
    }

    public y c(x xVar) {
        return new l(xVar.r(), o.b(new a(this.f17387d.r())));
    }

    public void d(v vVar) {
        List<x7.f> list;
        if (this.f17387d == null) {
            this.f17386c.A();
            boolean o10 = this.f17386c.o(vVar);
            if (this.f17385b.L0() == u.HTTP_2) {
                list = i(vVar);
            } else {
                list = m(vVar);
            }
            e P0 = this.f17385b.P0(list, o10, true);
            this.f17387d = P0;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            P0.u().g((long) this.f17386c.f17394a.t(), timeUnit);
            this.f17387d.A().g((long) this.f17386c.f17394a.x(), timeUnit);
        }
    }

    public ea.x e(v vVar, long j10) {
        return this.f17387d.q();
    }

    public void f(h hVar) {
        this.f17386c = hVar;
    }

    public x.b g() {
        if (this.f17385b.L0() == u.HTTP_2) {
            return k(this.f17387d.p());
        }
        return l(this.f17387d.p());
    }
}
