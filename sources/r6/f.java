package r6;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import t6.k;
import t6.l;
import u6.g;
import u6.h;
import u6.i;
import u6.j;
import u6.n;

/* compiled from: Gson */
public final class f {

    /* renamed from: v  reason: collision with root package name */
    private static final x6.a<?> f16325v = x6.a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<x6.a<?>, C0271f<?>>> f16326a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<x6.a<?>, s<?>> f16327b;

    /* renamed from: c  reason: collision with root package name */
    private final t6.c f16328c;

    /* renamed from: d  reason: collision with root package name */
    private final u6.d f16329d;

    /* renamed from: e  reason: collision with root package name */
    final List<t> f16330e;

    /* renamed from: f  reason: collision with root package name */
    final t6.d f16331f;

    /* renamed from: g  reason: collision with root package name */
    final e f16332g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, h<?>> f16333h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f16334i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f16335j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f16336k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f16337l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f16338m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f16339n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f16340o;

    /* renamed from: p  reason: collision with root package name */
    final String f16341p;

    /* renamed from: q  reason: collision with root package name */
    final int f16342q;

    /* renamed from: r  reason: collision with root package name */
    final int f16343r;

    /* renamed from: s  reason: collision with root package name */
    final r f16344s;

    /* renamed from: t  reason: collision with root package name */
    final List<t> f16345t;

    /* renamed from: u  reason: collision with root package name */
    final List<t> f16346u;

    /* compiled from: Gson */
    class a extends s<Number> {
        a() {
        }

        /* renamed from: e */
        public Double b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Double.valueOf(aVar.h0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            if (number == null) {
                cVar.g0();
                return;
            }
            f.d(number.doubleValue());
            cVar.L0(number);
        }
    }

    /* compiled from: Gson */
    class b extends s<Number> {
        b() {
        }

        /* renamed from: e */
        public Float b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Float.valueOf((float) aVar.h0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            if (number == null) {
                cVar.g0();
                return;
            }
            f.d((double) number.floatValue());
            cVar.L0(number);
        }
    }

    /* compiled from: Gson */
    static class c extends s<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Long.valueOf(aVar.l0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            if (number == null) {
                cVar.g0();
            } else {
                cVar.M0(number.toString());
            }
        }
    }

    /* compiled from: Gson */
    static class d extends s<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f16349a;

        d(s sVar) {
            this.f16349a = sVar;
        }

        /* renamed from: e */
        public AtomicLong b(y6.a aVar) {
            return new AtomicLong(((Number) this.f16349a.b(aVar)).longValue());
        }

        /* renamed from: f */
        public void d(y6.c cVar, AtomicLong atomicLong) {
            this.f16349a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: Gson */
    static class e extends s<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f16350a;

        e(s sVar) {
            this.f16350a = sVar;
        }

        /* renamed from: e */
        public AtomicLongArray b(y6.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                arrayList.add(Long.valueOf(((Number) this.f16350a.b(aVar)).longValue()));
            }
            aVar.w();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void d(y6.c cVar, AtomicLongArray atomicLongArray) {
            cVar.j();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f16350a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.w();
        }
    }

    /* renamed from: r6.f$f  reason: collision with other inner class name */
    /* compiled from: Gson */
    static class C0271f<T> extends s<T> {

        /* renamed from: a  reason: collision with root package name */
        private s<T> f16351a;

        C0271f() {
        }

        public T b(y6.a aVar) {
            s<T> sVar = this.f16351a;
            if (sVar != null) {
                return sVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        public void d(y6.c cVar, T t10) {
            s<T> sVar = this.f16351a;
            if (sVar != null) {
                sVar.d(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(s<T> sVar) {
            if (this.f16351a == null) {
                this.f16351a = sVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public f() {
        this(t6.d.f16508n, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, r.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, y6.a aVar) {
        if (obj != null) {
            try {
                if (aVar.I0() != y6.b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            } catch (IOException e11) {
                throw new JsonIOException((Throwable) e11);
            }
        }
    }

    private static s<AtomicLong> b(s<Number> sVar) {
        return new d(sVar).a();
    }

    private static s<AtomicLongArray> c(s<Number> sVar) {
        return new e(sVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private s<Number> e(boolean z10) {
        if (z10) {
            return n.f16688v;
        }
        return new a();
    }

    private s<Number> f(boolean z10) {
        if (z10) {
            return n.f16687u;
        }
        return new b();
    }

    private static s<Number> n(r rVar) {
        if (rVar == r.DEFAULT) {
            return n.f16686t;
        }
        return new c();
    }

    public <T> T g(Reader reader, Type type) {
        y6.a o10 = o(reader);
        T j10 = j(o10, type);
        a(j10, o10);
        return j10;
    }

    public <T> T h(String str, Class<T> cls) {
        return k.c(cls).cast(i(str, cls));
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), type);
    }

    public <T> T j(y6.a aVar, Type type) {
        boolean W = aVar.W();
        aVar.O0(true);
        try {
            aVar.I0();
            T b10 = l(x6.a.b(type)).b(aVar);
            aVar.O0(W);
            return b10;
        } catch (EOFException e10) {
            if (1 != 0) {
                aVar.O0(W);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e10);
        } catch (IllegalStateException e11) {
            throw new JsonSyntaxException((Throwable) e11);
        } catch (IOException e12) {
            throw new JsonSyntaxException((Throwable) e12);
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e13.getMessage(), e13);
        } catch (Throwable th) {
            aVar.O0(W);
            throw th;
        }
    }

    public <T> s<T> k(Class<T> cls) {
        return l(x6.a.a(cls));
    }

    public <T> s<T> l(x6.a<T> aVar) {
        s<T> sVar = this.f16327b.get(aVar == null ? f16325v : aVar);
        if (sVar != null) {
            return sVar;
        }
        Map map = this.f16326a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap();
            this.f16326a.set(map);
            z10 = true;
        }
        C0271f fVar = (C0271f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C0271f fVar2 = new C0271f();
            map.put(aVar, fVar2);
            for (t a10 : this.f16330e) {
                s<T> a11 = a10.a(this, aVar);
                if (a11 != null) {
                    fVar2.e(a11);
                    this.f16327b.put(aVar, a11);
                    return a11;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f16326a.remove();
            }
        }
    }

    public <T> s<T> m(t tVar, x6.a<T> aVar) {
        if (!this.f16330e.contains(tVar)) {
            tVar = this.f16329d;
        }
        boolean z10 = false;
        for (t next : this.f16330e) {
            if (z10) {
                s<T> a10 = next.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (next == tVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public y6.a o(Reader reader) {
        y6.a aVar = new y6.a(reader);
        aVar.O0(this.f16339n);
        return aVar;
    }

    public y6.c p(Writer writer) {
        if (this.f16336k) {
            writer.write(")]}'\n");
        }
        y6.c cVar = new y6.c(writer);
        if (this.f16338m) {
            cVar.s0("  ");
        }
        cVar.w0(this.f16334i);
        return cVar;
    }

    public String q(Object obj) {
        if (obj == null) {
            return s(m.f16369a);
        }
        return r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        t(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String s(l lVar) {
        StringWriter stringWriter = new StringWriter();
        v(lVar, stringWriter);
        return stringWriter.toString();
    }

    public void t(Object obj, Type type, Appendable appendable) {
        try {
            u(obj, type, p(l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f16334i + ",factories:" + this.f16330e + ",instanceCreators:" + this.f16328c + "}";
    }

    public void u(Object obj, Type type, y6.c cVar) {
        s<?> l10 = l(x6.a.b(type));
        boolean W = cVar.W();
        cVar.v0(true);
        boolean L = cVar.L();
        cVar.r0(this.f16337l);
        boolean J = cVar.J();
        cVar.w0(this.f16334i);
        try {
            l10.d(cVar, obj);
            cVar.v0(W);
            cVar.r0(L);
            cVar.w0(J);
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
        } catch (Throwable th) {
            cVar.v0(W);
            cVar.r0(L);
            cVar.w0(J);
            throw th;
        }
    }

    public void v(l lVar, Appendable appendable) {
        try {
            w(lVar, p(l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        }
    }

    public void w(l lVar, y6.c cVar) {
        boolean W = cVar.W();
        cVar.v0(true);
        boolean L = cVar.L();
        cVar.r0(this.f16337l);
        boolean J = cVar.J();
        cVar.w0(this.f16334i);
        try {
            l.b(lVar, cVar);
            cVar.v0(W);
            cVar.r0(L);
            cVar.w0(J);
        } catch (IOException e10) {
            throw new JsonIOException((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
        } catch (Throwable th) {
            cVar.v0(W);
            cVar.r0(L);
            cVar.w0(J);
            throw th;
        }
    }

    f(t6.d dVar, e eVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, r rVar, String str, int i10, int i11, List<t> list, List<t> list2, List<t> list3) {
        boolean z17 = z11;
        boolean z18 = z16;
        this.f16326a = new ThreadLocal<>();
        this.f16327b = new ConcurrentHashMap();
        this.f16331f = dVar;
        this.f16332g = eVar;
        this.f16333h = map;
        t6.c cVar = new t6.c(map);
        this.f16328c = cVar;
        this.f16334i = z10;
        this.f16335j = z17;
        this.f16336k = z12;
        this.f16337l = z13;
        this.f16338m = z14;
        this.f16339n = z15;
        this.f16340o = z18;
        this.f16344s = rVar;
        this.f16341p = str;
        this.f16342q = i10;
        this.f16343r = i11;
        this.f16345t = list;
        this.f16346u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.Y);
        arrayList.add(h.f16632b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.D);
        arrayList.add(n.f16679m);
        arrayList.add(n.f16673g);
        arrayList.add(n.f16675i);
        arrayList.add(n.f16677k);
        s<Number> n10 = n(rVar);
        arrayList.add(n.a(Long.TYPE, Long.class, n10));
        arrayList.add(n.a(Double.TYPE, Double.class, e(z18)));
        arrayList.add(n.a(Float.TYPE, Float.class, f(z18)));
        arrayList.add(n.f16690x);
        arrayList.add(n.f16681o);
        arrayList.add(n.f16683q);
        arrayList.add(n.b(AtomicLong.class, b(n10)));
        arrayList.add(n.b(AtomicLongArray.class, c(n10)));
        arrayList.add(n.f16685s);
        arrayList.add(n.f16692z);
        arrayList.add(n.F);
        arrayList.add(n.H);
        arrayList.add(n.b(BigDecimal.class, n.B));
        arrayList.add(n.b(BigInteger.class, n.C));
        arrayList.add(n.J);
        arrayList.add(n.L);
        arrayList.add(n.P);
        arrayList.add(n.R);
        arrayList.add(n.W);
        arrayList.add(n.N);
        arrayList.add(n.f16670d);
        arrayList.add(u6.c.f16615b);
        arrayList.add(n.U);
        arrayList.add(u6.k.f16654b);
        arrayList.add(j.f16652b);
        arrayList.add(n.S);
        arrayList.add(u6.a.f16609c);
        arrayList.add(n.f16668b);
        arrayList.add(new u6.b(cVar));
        arrayList.add(new g(cVar, z17));
        u6.d dVar2 = new u6.d(cVar);
        this.f16329d = dVar2;
        arrayList.add(dVar2);
        arrayList.add(n.Z);
        arrayList.add(new i(cVar, eVar, dVar, dVar2));
        this.f16330e = Collections.unmodifiableList(arrayList);
    }
}
