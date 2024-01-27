package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
final class q extends p<x.d> {

    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2886a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.q1$b[] r0 = androidx.datastore.preferences.protobuf.q1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2886a = r0
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f2886a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.q.a.<clinit>():void");
        }
    }

    q() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).getNumber();
    }

    /* access modifiers changed from: package-private */
    public Object b(o oVar, p0 p0Var, int i10) {
        return oVar.a(p0Var, i10);
    }

    /* access modifiers changed from: package-private */
    public t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    public t<x.d> d(Object obj) {
        return ((x.c) obj).J();
    }

    /* access modifiers changed from: package-private */
    public boolean e(p0 p0Var) {
        return p0Var instanceof x.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).t();
    }

    /* access modifiers changed from: package-private */
    public <UT, UB> UB g(d1 d1Var, Object obj, o oVar, t<x.d> tVar, UB ub, k1<UT, UB> k1Var) {
        Object i10;
        ArrayList arrayList;
        x.e eVar = (x.e) obj;
        int c10 = eVar.c();
        if (!eVar.f3012b.b() || !eVar.f3012b.i()) {
            Object obj2 = null;
            if (eVar.a() != q1.b.ENUM) {
                switch (a.f2886a[eVar.a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(d1Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(d1Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(d1Var.M());
                        break;
                    case 4:
                        obj2 = Long.valueOf(d1Var.d());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(d1Var.F());
                        break;
                    case 6:
                        obj2 = Long.valueOf(d1Var.e());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(d1Var.j());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(d1Var.k());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(d1Var.o());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(d1Var.I());
                        break;
                    case 11:
                        obj2 = Long.valueOf(d1Var.l());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(d1Var.w());
                        break;
                    case 13:
                        obj2 = Long.valueOf(d1Var.x());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = d1Var.D();
                        break;
                    case 16:
                        obj2 = d1Var.z();
                        break;
                    case 17:
                        obj2 = d1Var.n(eVar.b().getClass(), oVar);
                        break;
                    case 18:
                        obj2 = d1Var.f(eVar.b().getClass(), oVar);
                        break;
                }
            } else {
                int F = d1Var.F();
                if (eVar.f3012b.d().a(F) == null) {
                    return g1.L(c10, F, ub, k1Var);
                }
                obj2 = Integer.valueOf(F);
            }
            if (eVar.d()) {
                tVar.a(eVar.f3012b, obj2);
            } else {
                int i11 = a.f2886a[eVar.a().ordinal()];
                if ((i11 == 17 || i11 == 18) && (i10 = tVar.i(eVar.f3012b)) != null) {
                    obj2 = z.h(i10, obj2);
                }
                tVar.x(eVar.f3012b, obj2);
            }
        } else {
            switch (a.f2886a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    d1Var.K(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d1Var.E(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d1Var.p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d1Var.m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d1Var.r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d1Var.O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d1Var.v(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    d1Var.y(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    d1Var.i(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    d1Var.g(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    d1Var.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    d1Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d1Var.h(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d1Var.s(arrayList);
                    ub = g1.z(c10, arrayList, eVar.f3012b.d(), ub, k1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f3012b.c());
            }
            tVar.x(eVar.f3012b, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    public void h(d1 d1Var, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        tVar.x(eVar.f3012b, d1Var.f(eVar.b().getClass(), oVar));
    }

    /* access modifiers changed from: package-private */
    public void i(h hVar, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        p0 j10 = eVar.b().f().j();
        e Q = e.Q(ByteBuffer.wrap(hVar.t()), true);
        a1.a().b(j10, Q, oVar);
        tVar.x(eVar.f3012b, j10);
        if (Q.A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(r1 r1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        if (dVar.b()) {
            switch (a.f2886a[dVar.c().ordinal()]) {
                case 1:
                    g1.P(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 2:
                    g1.T(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 3:
                    g1.W(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 4:
                    g1.e0(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 5:
                    g1.V(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 6:
                    g1.S(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 7:
                    g1.R(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 8:
                    g1.N(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 9:
                    g1.d0(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 10:
                    g1.Y(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 11:
                    g1.Z(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 12:
                    g1.a0(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 13:
                    g1.b0(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 14:
                    g1.V(dVar.getNumber(), (List) entry.getValue(), r1Var, dVar.i());
                    return;
                case 15:
                    g1.O(dVar.getNumber(), (List) entry.getValue(), r1Var);
                    return;
                case 16:
                    g1.c0(dVar.getNumber(), (List) entry.getValue(), r1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        g1.U(dVar.getNumber(), (List) entry.getValue(), r1Var, a1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        g1.X(dVar.getNumber(), (List) entry.getValue(), r1Var, a1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.f2886a[dVar.c().ordinal()]) {
                case 1:
                    r1Var.e(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    r1Var.E(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    r1Var.p(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    r1Var.n(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    r1Var.t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    r1Var.h(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    r1Var.d(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    r1Var.q(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    r1Var.b(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    r1Var.r(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    r1Var.x(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    r1Var.M(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    r1Var.D(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    r1Var.t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    r1Var.w(dVar.getNumber(), (h) entry.getValue());
                    return;
                case 16:
                    r1Var.m(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    r1Var.O(dVar.getNumber(), entry.getValue(), a1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    r1Var.z(dVar.getNumber(), entry.getValue(), a1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
