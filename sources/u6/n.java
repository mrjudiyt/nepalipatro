package u6;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters */
public final class n {
    public static final r6.s<String> A;
    public static final r6.s<BigDecimal> B = new h();
    public static final r6.s<BigInteger> C = new i();
    public static final r6.t D;
    public static final r6.s<StringBuilder> E;
    public static final r6.t F;
    public static final r6.s<StringBuffer> G;
    public static final r6.t H;
    public static final r6.s<URL> I;
    public static final r6.t J;
    public static final r6.s<URI> K;
    public static final r6.t L;
    public static final r6.s<InetAddress> M;
    public static final r6.t N;
    public static final r6.s<UUID> O;
    public static final r6.t P;
    public static final r6.s<Currency> Q;
    public static final r6.t R;
    public static final r6.t S = new r();
    public static final r6.s<Calendar> T;
    public static final r6.t U;
    public static final r6.s<Locale> V;
    public static final r6.t W;
    public static final r6.s<r6.l> X;
    public static final r6.t Y;
    public static final r6.t Z = new w();

    /* renamed from: a  reason: collision with root package name */
    public static final r6.s<Class> f16667a;

    /* renamed from: b  reason: collision with root package name */
    public static final r6.t f16668b;

    /* renamed from: c  reason: collision with root package name */
    public static final r6.s<BitSet> f16669c;

    /* renamed from: d  reason: collision with root package name */
    public static final r6.t f16670d;

    /* renamed from: e  reason: collision with root package name */
    public static final r6.s<Boolean> f16671e;

    /* renamed from: f  reason: collision with root package name */
    public static final r6.s<Boolean> f16672f = new d0();

    /* renamed from: g  reason: collision with root package name */
    public static final r6.t f16673g;

    /* renamed from: h  reason: collision with root package name */
    public static final r6.s<Number> f16674h;

    /* renamed from: i  reason: collision with root package name */
    public static final r6.t f16675i;

    /* renamed from: j  reason: collision with root package name */
    public static final r6.s<Number> f16676j;

    /* renamed from: k  reason: collision with root package name */
    public static final r6.t f16677k;

    /* renamed from: l  reason: collision with root package name */
    public static final r6.s<Number> f16678l;

    /* renamed from: m  reason: collision with root package name */
    public static final r6.t f16679m;

    /* renamed from: n  reason: collision with root package name */
    public static final r6.s<AtomicInteger> f16680n;

    /* renamed from: o  reason: collision with root package name */
    public static final r6.t f16681o;

    /* renamed from: p  reason: collision with root package name */
    public static final r6.s<AtomicBoolean> f16682p;

    /* renamed from: q  reason: collision with root package name */
    public static final r6.t f16683q;

    /* renamed from: r  reason: collision with root package name */
    public static final r6.s<AtomicIntegerArray> f16684r;

    /* renamed from: s  reason: collision with root package name */
    public static final r6.t f16685s;

    /* renamed from: t  reason: collision with root package name */
    public static final r6.s<Number> f16686t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final r6.s<Number> f16687u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final r6.s<Number> f16688v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final r6.s<Number> f16689w;

    /* renamed from: x  reason: collision with root package name */
    public static final r6.t f16690x;

    /* renamed from: y  reason: collision with root package name */
    public static final r6.s<Character> f16691y;

    /* renamed from: z  reason: collision with root package name */
    public static final r6.t f16692z;

    /* compiled from: TypeAdapters */
    static class a extends r6.s<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray b(y6.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.L()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.k0()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException((Throwable) e10);
                }
            }
            aVar.w();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void d(y6.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.j();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.I0((long) atomicIntegerArray.get(i10));
            }
            cVar.w();
        }
    }

    /* compiled from: TypeAdapters */
    static class a0 implements r6.t {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Class f16693h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r6.s f16694i;

        /* compiled from: TypeAdapters */
        class a extends r6.s<T1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f16695a;

            a(Class cls) {
                this.f16695a = cls;
            }

            public T1 b(y6.a aVar) {
                T1 b10 = a0.this.f16694i.b(aVar);
                if (b10 == null || this.f16695a.isInstance(b10)) {
                    return b10;
                }
                throw new JsonSyntaxException("Expected a " + this.f16695a.getName() + " but was " + b10.getClass().getName());
            }

            public void d(y6.c cVar, T1 t12) {
                a0.this.f16694i.d(cVar, t12);
            }
        }

        a0(Class cls, r6.s sVar) {
            this.f16693h = cls;
            this.f16694i = sVar;
        }

        public <T2> r6.s<T2> a(r6.f fVar, x6.a<T2> aVar) {
            Class<? super T2> c10 = aVar.c();
            if (!this.f16693h.isAssignableFrom(c10)) {
                return null;
            }
            return new a(c10);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f16693h.getName() + ",adapter=" + this.f16694i + "]";
        }
    }

    /* compiled from: TypeAdapters */
    static class b extends r6.s<Number> {
        b() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Long.valueOf(aVar.l0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static /* synthetic */ class b0 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16697a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y6.b[] r0 = y6.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16697a = r0
                y6.b r1 = y6.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x001d }
                y6.b r1 = y6.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y6.b r1 = y6.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y6.b r1 = y6.b.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x003e }
                y6.b r1 = y6.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0049 }
                y6.b r1 = y6.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0054 }
                y6.b r1 = y6.b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0060 }
                y6.b r1 = y6.b.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x006c }
                y6.b r1 = y6.b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f16697a     // Catch:{ NoSuchFieldError -> 0x0078 }
                y6.b r1 = y6.b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.n.b0.<clinit>():void");
        }
    }

    /* compiled from: TypeAdapters */
    static class c extends r6.s<Number> {
        c() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Float.valueOf((float) aVar.h0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class c0 extends r6.s<Boolean> {
        c0() {
        }

        /* renamed from: e */
        public Boolean b(y6.a aVar) {
            y6.b I0 = aVar.I0();
            if (I0 == y6.b.NULL) {
                aVar.s0();
                return null;
            } else if (I0 == y6.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.w0()));
            } else {
                return Boolean.valueOf(aVar.g0());
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, Boolean bool) {
            cVar.K0(bool);
        }
    }

    /* compiled from: TypeAdapters */
    static class d extends r6.s<Number> {
        d() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Double.valueOf(aVar.h0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class d0 extends r6.s<Boolean> {
        d0() {
        }

        /* renamed from: e */
        public Boolean b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return Boolean.valueOf(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, Boolean bool) {
            cVar.M0(bool == null ? "null" : bool.toString());
        }
    }

    /* compiled from: TypeAdapters */
    static class e extends r6.s<Number> {
        e() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            y6.b I0 = aVar.I0();
            int i10 = b0.f16697a[I0.ordinal()];
            if (i10 == 1 || i10 == 3) {
                return new t6.g(aVar.w0());
            }
            if (i10 == 4) {
                aVar.s0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + I0);
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class e0 extends r6.s<Number> {
        e0() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.k0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class f extends r6.s<Character> {
        f() {
        }

        /* renamed from: e */
        public Character b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            String w02 = aVar.w0();
            if (w02.length() == 1) {
                return Character.valueOf(w02.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + w02);
        }

        /* renamed from: f */
        public void d(y6.c cVar, Character ch) {
            cVar.M0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: TypeAdapters */
    static class f0 extends r6.s<Number> {
        f0() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.k0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class g extends r6.s<String> {
        g() {
        }

        /* renamed from: e */
        public String b(y6.a aVar) {
            y6.b I0 = aVar.I0();
            if (I0 == y6.b.NULL) {
                aVar.s0();
                return null;
            } else if (I0 == y6.b.BOOLEAN) {
                return Boolean.toString(aVar.g0());
            } else {
                return aVar.w0();
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, String str) {
            cVar.M0(str);
        }
    }

    /* compiled from: TypeAdapters */
    static class g0 extends r6.s<Number> {
        g0() {
        }

        /* renamed from: e */
        public Number b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, Number number) {
            cVar.L0(number);
        }
    }

    /* compiled from: TypeAdapters */
    static class h extends r6.s<BigDecimal> {
        h() {
        }

        /* renamed from: e */
        public BigDecimal b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return new BigDecimal(aVar.w0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, BigDecimal bigDecimal) {
            cVar.L0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters */
    static class h0 extends r6.s<AtomicInteger> {
        h0() {
        }

        /* renamed from: e */
        public AtomicInteger b(y6.a aVar) {
            try {
                return new AtomicInteger(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, AtomicInteger atomicInteger) {
            cVar.I0((long) atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters */
    static class i extends r6.s<BigInteger> {
        i() {
        }

        /* renamed from: e */
        public BigInteger b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return new BigInteger(aVar.w0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, BigInteger bigInteger) {
            cVar.L0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters */
    static class i0 extends r6.s<AtomicBoolean> {
        i0() {
        }

        /* renamed from: e */
        public AtomicBoolean b(y6.a aVar) {
            return new AtomicBoolean(aVar.g0());
        }

        /* renamed from: f */
        public void d(y6.c cVar, AtomicBoolean atomicBoolean) {
            cVar.N0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters */
    static class j extends r6.s<StringBuilder> {
        j() {
        }

        /* renamed from: e */
        public StringBuilder b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return new StringBuilder(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, StringBuilder sb) {
            cVar.M0(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: TypeAdapters */
    private static final class j0<T extends Enum<T>> extends r6.s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f16698a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f16699b = new HashMap();

        public j0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    s6.c cVar = (s6.c) cls.getField(name).getAnnotation(s6.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f16698a.put(put, enumR);
                        }
                    }
                    this.f16698a.put(name, enumR);
                    this.f16699b.put(enumR, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        /* renamed from: e */
        public T b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return (Enum) this.f16698a.get(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, T t10) {
            cVar.M0(t10 == null ? null : this.f16699b.get(t10));
        }
    }

    /* compiled from: TypeAdapters */
    static class k extends r6.s<Class> {
        k() {
        }

        /* renamed from: e */
        public Class b(y6.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: f */
        public void d(y6.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: TypeAdapters */
    static class l extends r6.s<StringBuffer> {
        l() {
        }

        /* renamed from: e */
        public StringBuffer b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return new StringBuffer(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, StringBuffer stringBuffer) {
            cVar.M0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: TypeAdapters */
    static class m extends r6.s<URL> {
        m() {
        }

        /* renamed from: e */
        public URL b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            String w02 = aVar.w0();
            if ("null".equals(w02)) {
                return null;
            }
            return new URL(w02);
        }

        /* renamed from: f */
        public void d(y6.c cVar, URL url) {
            cVar.M0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: u6.n$n  reason: collision with other inner class name */
    /* compiled from: TypeAdapters */
    static class C0287n extends r6.s<URI> {
        C0287n() {
        }

        /* renamed from: e */
        public URI b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                String w02 = aVar.w0();
                if ("null".equals(w02)) {
                    return null;
                }
                return new URI(w02);
            } catch (URISyntaxException e10) {
                throw new JsonIOException((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, URI uri) {
            cVar.M0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters */
    static class o extends r6.s<InetAddress> {
        o() {
        }

        /* renamed from: e */
        public InetAddress b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return InetAddress.getByName(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, InetAddress inetAddress) {
            cVar.M0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters */
    static class p extends r6.s<UUID> {
        p() {
        }

        /* renamed from: e */
        public UUID b(y6.a aVar) {
            if (aVar.I0() != y6.b.NULL) {
                return UUID.fromString(aVar.w0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(y6.c cVar, UUID uuid) {
            cVar.M0(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: TypeAdapters */
    static class q extends r6.s<Currency> {
        q() {
        }

        /* renamed from: e */
        public Currency b(y6.a aVar) {
            return Currency.getInstance(aVar.w0());
        }

        /* renamed from: f */
        public void d(y6.c cVar, Currency currency) {
            cVar.M0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters */
    static class r implements r6.t {

        /* compiled from: TypeAdapters */
        class a extends r6.s<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r6.s f16700a;

            a(r6.s sVar) {
                this.f16700a = sVar;
            }

            /* renamed from: e */
            public Timestamp b(y6.a aVar) {
                Date date = (Date) this.f16700a.b(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: f */
            public void d(y6.c cVar, Timestamp timestamp) {
                this.f16700a.d(cVar, timestamp);
            }
        }

        r() {
        }

        public <T> r6.s<T> a(r6.f fVar, x6.a<T> aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(fVar.k(Date.class));
        }
    }

    /* compiled from: TypeAdapters */
    static class s extends r6.s<Calendar> {
        s() {
        }

        /* renamed from: e */
        public Calendar b(y6.a aVar) {
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            aVar.h();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.I0() != y6.b.END_OBJECT) {
                String o02 = aVar.o0();
                int k02 = aVar.k0();
                if ("year".equals(o02)) {
                    i10 = k02;
                } else if ("month".equals(o02)) {
                    i11 = k02;
                } else if ("dayOfMonth".equals(o02)) {
                    i12 = k02;
                } else if ("hourOfDay".equals(o02)) {
                    i13 = k02;
                } else if ("minute".equals(o02)) {
                    i14 = k02;
                } else if ("second".equals(o02)) {
                    i15 = k02;
                }
            }
            aVar.E();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        /* renamed from: f */
        public void d(y6.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.g0();
                return;
            }
            cVar.q();
            cVar.Y("year");
            cVar.I0((long) calendar.get(1));
            cVar.Y("month");
            cVar.I0((long) calendar.get(2));
            cVar.Y("dayOfMonth");
            cVar.I0((long) calendar.get(5));
            cVar.Y("hourOfDay");
            cVar.I0((long) calendar.get(11));
            cVar.Y("minute");
            cVar.I0((long) calendar.get(12));
            cVar.Y("second");
            cVar.I0((long) calendar.get(13));
            cVar.E();
        }
    }

    /* compiled from: TypeAdapters */
    static class t extends r6.s<Locale> {
        t() {
        }

        /* renamed from: e */
        public Locale b(y6.a aVar) {
            String str = null;
            if (aVar.I0() == y6.b.NULL) {
                aVar.s0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.w0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: f */
        public void d(y6.c cVar, Locale locale) {
            cVar.M0(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: TypeAdapters */
    static class u extends r6.s<r6.l> {
        u() {
        }

        /* renamed from: e */
        public r6.l b(y6.a aVar) {
            switch (b0.f16697a[aVar.I0().ordinal()]) {
                case 1:
                    return new r6.o((Number) new t6.g(aVar.w0()));
                case 2:
                    return new r6.o(Boolean.valueOf(aVar.g0()));
                case 3:
                    return new r6.o(aVar.w0());
                case 4:
                    aVar.s0();
                    return r6.m.f16369a;
                case 5:
                    r6.i iVar = new r6.i();
                    aVar.a();
                    while (aVar.L()) {
                        iVar.i(b(aVar));
                    }
                    aVar.w();
                    return iVar;
                case 6:
                    r6.n nVar = new r6.n();
                    aVar.h();
                    while (aVar.L()) {
                        nVar.i(aVar.o0(), b(aVar));
                    }
                    aVar.E();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: f */
        public void d(y6.c cVar, r6.l lVar) {
            if (lVar == null || lVar.e()) {
                cVar.g0();
            } else if (lVar.g()) {
                r6.o c10 = lVar.c();
                if (c10.t()) {
                    cVar.L0(c10.o());
                } else if (c10.r()) {
                    cVar.N0(c10.i());
                } else {
                    cVar.M0(c10.p());
                }
            } else if (lVar.d()) {
                cVar.j();
                Iterator<r6.l> it = lVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.w();
            } else if (lVar.f()) {
                cVar.q();
                for (Map.Entry next : lVar.b().k()) {
                    cVar.Y((String) next.getKey());
                    d(cVar, (r6.l) next.getValue());
                }
                cVar.E();
            } else {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
        }
    }

    /* compiled from: TypeAdapters */
    static class v extends r6.s<BitSet> {
        v() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.k0() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet b(y6.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                y6.b r1 = r8.I0()
                r2 = 0
                r3 = 0
            L_0x000e:
                y6.b r4 = y6.b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = u6.n.b0.f16697a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.w0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>((java.lang.String) r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.g0()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.k0()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                y6.b r1 = r8.I0()
                goto L_0x000e
            L_0x0075:
                r8.w()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.n.v.b(y6.a):java.util.BitSet");
        }

        /* renamed from: f */
        public void d(y6.c cVar, BitSet bitSet) {
            cVar.j();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.I0(bitSet.get(i10) ? 1 : 0);
            }
            cVar.w();
        }
    }

    /* compiled from: TypeAdapters */
    static class w implements r6.t {
        w() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [x6.a, x6.a<T>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> r6.s<T> a(r6.f r2, x6.a<T> r3) {
            /*
                r1 = this;
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                java.lang.Class r3 = r3.c()
                boolean r0 = r2.isAssignableFrom(r3)
                if (r0 == 0) goto L_0x001f
                if (r3 != r2) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r2 = r3.isEnum()
                if (r2 != 0) goto L_0x0019
                java.lang.Class r3 = r3.getSuperclass()
            L_0x0019:
                u6.n$j0 r2 = new u6.n$j0
                r2.<init>(r3)
                return r2
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.n.w.a(r6.f, x6.a):r6.s");
        }
    }

    /* compiled from: TypeAdapters */
    static class x implements r6.t {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Class f16702h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r6.s f16703i;

        x(Class cls, r6.s sVar) {
            this.f16702h = cls;
            this.f16703i = sVar;
        }

        public <T> r6.s<T> a(r6.f fVar, x6.a<T> aVar) {
            if (aVar.c() == this.f16702h) {
                return this.f16703i;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16702h.getName() + ",adapter=" + this.f16703i + "]";
        }
    }

    /* compiled from: TypeAdapters */
    static class y implements r6.t {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Class f16704h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Class f16705i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ r6.s f16706j;

        y(Class cls, Class cls2, r6.s sVar) {
            this.f16704h = cls;
            this.f16705i = cls2;
            this.f16706j = sVar;
        }

        public <T> r6.s<T> a(r6.f fVar, x6.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f16704h || c10 == this.f16705i) {
                return this.f16706j;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16705i.getName() + "+" + this.f16704h.getName() + ",adapter=" + this.f16706j + "]";
        }
    }

    /* compiled from: TypeAdapters */
    static class z implements r6.t {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Class f16707h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Class f16708i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ r6.s f16709j;

        z(Class cls, Class cls2, r6.s sVar) {
            this.f16707h = cls;
            this.f16708i = cls2;
            this.f16709j = sVar;
        }

        public <T> r6.s<T> a(r6.f fVar, x6.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f16707h || c10 == this.f16708i) {
                return this.f16709j;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f16707h.getName() + "+" + this.f16708i.getName() + ",adapter=" + this.f16709j + "]";
        }
    }

    static {
        r6.s<Class> a10 = new k().a();
        f16667a = a10;
        f16668b = b(Class.class, a10);
        r6.s<BitSet> a11 = new v().a();
        f16669c = a11;
        f16670d = b(BitSet.class, a11);
        c0 c0Var = new c0();
        f16671e = c0Var;
        f16673g = a(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        f16674h = e0Var;
        f16675i = a(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        f16676j = f0Var;
        f16677k = a(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        f16678l = g0Var;
        f16679m = a(Integer.TYPE, Integer.class, g0Var);
        r6.s<AtomicInteger> a12 = new h0().a();
        f16680n = a12;
        f16681o = b(AtomicInteger.class, a12);
        r6.s<AtomicBoolean> a13 = new i0().a();
        f16682p = a13;
        f16683q = b(AtomicBoolean.class, a13);
        r6.s<AtomicIntegerArray> a14 = new a().a();
        f16684r = a14;
        f16685s = b(AtomicIntegerArray.class, a14);
        e eVar = new e();
        f16689w = eVar;
        f16690x = b(Number.class, eVar);
        f fVar = new f();
        f16691y = fVar;
        f16692z = a(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        C0287n nVar = new C0287n();
        K = nVar;
        L = b(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        r6.s<Currency> a15 = new q().a();
        Q = a15;
        R = b(Currency.class, a15);
        s sVar = new s();
        T = sVar;
        U = c(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = b(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = d(r6.l.class, uVar);
    }

    public static <TT> r6.t a(Class<TT> cls, Class<TT> cls2, r6.s<? super TT> sVar) {
        return new y(cls, cls2, sVar);
    }

    public static <TT> r6.t b(Class<TT> cls, r6.s<TT> sVar) {
        return new x(cls, sVar);
    }

    public static <TT> r6.t c(Class<TT> cls, Class<? extends TT> cls2, r6.s<? super TT> sVar) {
        return new z(cls, cls2, sVar);
    }

    public static <T1> r6.t d(Class<T1> cls, r6.s<T1> sVar) {
        return new a0(cls, sVar);
    }
}
