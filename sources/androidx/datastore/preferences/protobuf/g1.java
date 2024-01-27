package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil */
final class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2750a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final k1<?, ?> f2751b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final k1<?, ?> f2752c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final k1<?, ?> f2753d = new m1();

    static <UT, UB> UB A(int i10, List<Integer> list, z.e eVar, UB ub, k1<UT, UB> k1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = L(i10, intValue, ub, k1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = L(i10, intValue2, ub, k1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static k1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (k1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t10, T t11) {
        t<FT> c10 = pVar.c(t11);
        if (!c10.n()) {
            pVar.d(t10).u(c10);
        }
    }

    static <T> void F(k0 k0Var, T t10, T t11, long j10) {
        o1.O(t10, j10, k0Var.a(o1.A(t10, j10), o1.A(t11, j10)));
    }

    static <T, UT, UB> void G(k1<UT, UB> k1Var, T t10, T t11) {
        k1Var.p(t10, k1Var.k(k1Var.g(t10), k1Var.g(t11)));
    }

    public static k1<?, ?> H() {
        return f2751b;
    }

    public static k1<?, ?> I() {
        return f2752c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && (cls2 = f2750a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i10, int i11, UB ub, k1<UT, UB> k1Var) {
        if (ub == null) {
            ub = k1Var.n();
        }
        k1Var.e(ub, i10, (long) i11);
        return ub;
    }

    public static k1<?, ?> M() {
        return f2753d;
    }

    public static void N(int i10, List<Boolean> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.A(i10, list, z10);
        }
    }

    public static void O(int i10, List<h> list, r1 r1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.N(i10, list);
        }
    }

    public static void P(int i10, List<Double> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.K(i10, list, z10);
        }
    }

    public static void Q(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.J(i10, list, z10);
        }
    }

    public static void R(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.y(i10, list, z10);
        }
    }

    public static void S(int i10, List<Long> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.u(i10, list, z10);
        }
    }

    public static void T(int i10, List<Float> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.a(i10, list, z10);
        }
    }

    public static void U(int i10, List<?> list, r1 r1Var, e1 e1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.l(i10, list, e1Var);
        }
    }

    public static void V(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.o(i10, list, z10);
        }
    }

    public static void W(int i10, List<Long> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.I(i10, list, z10);
        }
    }

    public static void X(int i10, List<?> list, r1 r1Var, e1 e1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.j(i10, list, e1Var);
        }
    }

    public static void Y(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.v(i10, list, z10);
        }
    }

    public static void Z(int i10, List<Long> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.f(i10, list, z10);
        }
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.G(i10, list, z10);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.C(i10, list, z10);
        }
    }

    static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            V += CodedOutputStream.h(list.get(i11));
        }
        return V;
    }

    public static void c0(int i10, List<String> list, r1 r1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.k(i10, list);
        }
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(e10);
        }
        return e10 + (size * CodedOutputStream.V(i10));
    }

    public static void d0(int i10, List<Integer> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.B(i10, list, z10);
        }
    }

    static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.l(yVar.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, r1 r1Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r1Var.g(i10, list, z10);
        }
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i10, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<p0> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.s(i10, list.get(i12), e1Var);
        }
        return i11;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(l10);
        }
        return l10 + (size * CodedOutputStream.V(i10));
    }

    static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.w(yVar.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(n10);
        }
        return n10 + (list.size() * CodedOutputStream.V(i10));
    }

    static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.y(g0Var.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, e1 e1Var) {
        if (obj instanceof c0) {
            return CodedOutputStream.A(i10, (c0) obj);
        }
        return CodedOutputStream.F(i10, (p0) obj, e1Var);
    }

    static int p(int i10, List<?> list, e1 e1Var) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof c0) {
                i11 = CodedOutputStream.B((c0) obj);
            } else {
                i11 = CodedOutputStream.H((p0) obj, e1Var);
            }
            V += i11;
        }
        return V;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(r10);
        }
        return r10 + (size * CodedOutputStream.V(i10));
    }

    static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Q(yVar.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(t10);
        }
        return t10 + (size * CodedOutputStream.V(i10));
    }

    static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.S(g0Var.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.V(i10) * size;
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            while (i13 < size) {
                Object L = e0Var.L(i13);
                if (L instanceof h) {
                    i12 = CodedOutputStream.h((h) L);
                } else {
                    i12 = CodedOutputStream.U((String) L);
                }
                V += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof h) {
                    i11 = CodedOutputStream.h((h) obj);
                } else {
                    i11 = CodedOutputStream.U((String) obj);
                }
                V += i11;
                i13++;
            }
        }
        return V;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(w10);
        }
        return w10 + (size * CodedOutputStream.V(i10));
    }

    static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.X(yVar.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return CodedOutputStream.V(i10) + CodedOutputStream.C(y10);
        }
        return y10 + (size * CodedOutputStream.V(i10));
    }

    static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Z(g0Var.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static <UT, UB> UB z(int i10, List<Integer> list, z.d<?> dVar, UB ub, k1<UT, UB> k1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = L(i10, intValue, ub, k1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = L(i10, intValue2, ub, k1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
