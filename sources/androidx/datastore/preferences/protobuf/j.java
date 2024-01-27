package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q1;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* compiled from: CodedInputStreamReader */
final class j implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f2825a;

    /* renamed from: b  reason: collision with root package name */
    private int f2826b;

    /* renamed from: c  reason: collision with root package name */
    private int f2827c;

    /* renamed from: d  reason: collision with root package name */
    private int f2828d = 0;

    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.q1$b[] r0 = androidx.datastore.preferences.protobuf.q1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2829a = r0
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f2829a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.q1$b r1 = androidx.datastore.preferences.protobuf.q1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j.a.<clinit>():void");
        }
    }

    private j(i iVar) {
        i iVar2 = (i) z.b(iVar, "input");
        this.f2825a = iVar2;
        iVar2.f2793d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f2793d;
        if (jVar != null) {
            return jVar;
        }
        return new j(iVar);
    }

    private Object R(q1.b bVar, Class<?> cls, o oVar) {
        switch (a.f2829a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return D();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(u());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(e());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(F());
            case 9:
                return Long.valueOf(M());
            case 10:
                return f(cls, oVar);
            case 11:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(l());
            case 13:
                return Integer.valueOf(w());
            case 14:
                return Long.valueOf(x());
            case 15:
                return N();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(e1<T> e1Var, o oVar) {
        int i10 = this.f2827c;
        this.f2827c = q1.c(q1.a(this.f2826b), 4);
        try {
            T h10 = e1Var.h();
            e1Var.b(h10, this, oVar);
            e1Var.c(h10);
            if (this.f2826b == this.f2827c) {
                return h10;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f2827c = i10;
        }
    }

    private <T> T T(e1<T> e1Var, o oVar) {
        int C = this.f2825a.C();
        i iVar = this.f2825a;
        if (iVar.f2790a < iVar.f2791b) {
            int l10 = iVar.l(C);
            T h10 = e1Var.h();
            this.f2825a.f2790a++;
            e1Var.b(h10, this, oVar);
            e1Var.c(h10);
            this.f2825a.a(0);
            i iVar2 = this.f2825a;
            iVar2.f2790a--;
            iVar2.k(l10);
            return h10;
        }
        throw InvalidProtocolBufferException.h();
    }

    private void V(int i10) {
        if (this.f2825a.d() != i10) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void W(int i10) {
        if (q1.b(this.f2826b) != i10) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void X(int i10) {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void Y(int i10) {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public int A() {
        int i10 = this.f2828d;
        if (i10 != 0) {
            this.f2826b = i10;
            this.f2828d = 0;
        } else {
            this.f2826b = this.f2825a.B();
        }
        int i11 = this.f2826b;
        return (i11 == 0 || i11 == this.f2827c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : q1.a(i11);
    }

    public void B(List<String> list) {
        U(list, false);
    }

    public void C(List<String> list) {
        U(list, true);
    }

    public h D() {
        W(2);
        return this.f2825a.n();
    }

    public void E(List<Float> list) {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 2) {
                int C = this.f2825a.C();
                X(C);
                int d10 = this.f2825a.d() + C;
                do {
                    vVar.d(this.f2825a.s());
                } while (this.f2825a.d() < d10);
            } else if (b10 == 5) {
                do {
                    vVar.d(this.f2825a.s());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 2) {
                int C2 = this.f2825a.C();
                X(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Float.valueOf(this.f2825a.s()));
                } while (this.f2825a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f2825a.s()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int F() {
        W(0);
        return this.f2825a.t();
    }

    public <T> void G(List<T> list, e1<T> e1Var, o oVar) {
        int B;
        if (q1.b(this.f2826b) == 3) {
            int i10 = this.f2826b;
            do {
                list.add(S(e1Var, oVar));
                if (!this.f2825a.e() && this.f2828d == 0) {
                    B = this.f2825a.B();
                } else {
                    return;
                }
            } while (B == i10);
            this.f2828d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public boolean H() {
        int i10;
        if (this.f2825a.e() || (i10 = this.f2826b) == this.f2827c) {
            return false;
        }
        return this.f2825a.E(i10);
    }

    public int I() {
        W(5);
        return this.f2825a.v();
    }

    public void J(List<h> list) {
        int B;
        if (q1.b(this.f2826b) == 2) {
            do {
                list.add(D());
                if (!this.f2825a.e()) {
                    B = this.f2825a.B();
                } else {
                    return;
                }
            } while (B == this.f2826b);
            this.f2828d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public void K(List<Double> list) {
        int B;
        int B2;
        if (list instanceof l) {
            l lVar = (l) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 1) {
                do {
                    lVar.d(this.f2825a.o());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int C = this.f2825a.C();
                Y(C);
                int d10 = this.f2825a.d() + C;
                do {
                    lVar.d(this.f2825a.o());
                } while (this.f2825a.d() < d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f2825a.o()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int C2 = this.f2825a.C();
                Y(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Double.valueOf(this.f2825a.o()));
                } while (this.f2825a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public <T> void L(List<T> list, e1<T> e1Var, o oVar) {
        int B;
        if (q1.b(this.f2826b) == 2) {
            int i10 = this.f2826b;
            do {
                list.add(T(e1Var, oVar));
                if (!this.f2825a.e() && this.f2828d == 0) {
                    B = this.f2825a.B();
                } else {
                    return;
                }
            } while (B == i10);
            this.f2828d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public long M() {
        W(0);
        return this.f2825a.u();
    }

    public String N() {
        W(2);
        return this.f2825a.A();
    }

    public void O(List<Long> list) {
        int B;
        int B2;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 1) {
                do {
                    g0Var.e(this.f2825a.r());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int C = this.f2825a.C();
                Y(C);
                int d10 = this.f2825a.d() + C;
                do {
                    g0Var.e(this.f2825a.r());
                } while (this.f2825a.d() < d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f2825a.r()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int C2 = this.f2825a.C();
                Y(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f2825a.r()));
                } while (this.f2825a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public <T> T P(e1<T> e1Var, o oVar) {
        W(3);
        return S(e1Var, oVar);
    }

    public void U(List<String> list, boolean z10) {
        int B;
        int B2;
        if (q1.b(this.f2826b) != 2) {
            throw InvalidProtocolBufferException.d();
        } else if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? N() : z());
                if (!this.f2825a.e()) {
                    B = this.f2825a.B();
                } else {
                    return;
                }
            } while (B == this.f2826b);
            this.f2828d = B;
        } else {
            e0 e0Var = (e0) list;
            do {
                e0Var.w(D());
                if (!this.f2825a.e()) {
                    B2 = this.f2825a.B();
                } else {
                    return;
                }
            } while (B2 == this.f2826b);
            this.f2828d = B2;
        }
    }

    public int a() {
        return this.f2826b;
    }

    public <T> T b(e1<T> e1Var, o oVar) {
        W(2);
        return T(e1Var, oVar);
    }

    public void c(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    yVar.d(this.f2825a.x());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    yVar.d(this.f2825a.x());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2825a.x()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Integer.valueOf(this.f2825a.x()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long d() {
        W(0);
        return this.f2825a.D();
    }

    public long e() {
        W(1);
        return this.f2825a.r();
    }

    public <T> T f(Class<T> cls, o oVar) {
        W(2);
        return T(a1.a().d(cls), oVar);
    }

    public void g(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 2) {
                int C = this.f2825a.C();
                X(C);
                int d10 = this.f2825a.d() + C;
                do {
                    yVar.d(this.f2825a.v());
                } while (this.f2825a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.d(this.f2825a.v());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 2) {
                int C2 = this.f2825a.C();
                X(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f2825a.v()));
                } while (this.f2825a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2825a.v()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void h(List<Long> list) {
        int B;
        int B2;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    g0Var.e(this.f2825a.y());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    g0Var.e(this.f2825a.y());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2825a.y()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Long.valueOf(this.f2825a.y()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void i(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    yVar.d(this.f2825a.C());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    yVar.d(this.f2825a.C());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2825a.C()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Integer.valueOf(this.f2825a.C()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int j() {
        W(5);
        return this.f2825a.q();
    }

    public boolean k() {
        W(0);
        return this.f2825a.m();
    }

    public long l() {
        W(1);
        return this.f2825a.w();
    }

    public void m(List<Long> list) {
        int B;
        int B2;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    g0Var.e(this.f2825a.D());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    g0Var.e(this.f2825a.D());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2825a.D()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Long.valueOf(this.f2825a.D()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public <T> T n(Class<T> cls, o oVar) {
        W(3);
        return S(a1.a().d(cls), oVar);
    }

    public int o() {
        W(0);
        return this.f2825a.C();
    }

    public void p(List<Long> list) {
        int B;
        int B2;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    g0Var.e(this.f2825a.u());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    g0Var.e(this.f2825a.u());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f2825a.u()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Long.valueOf(this.f2825a.u()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void q(List<Long> list) {
        int B;
        int B2;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 1) {
                do {
                    g0Var.e(this.f2825a.w());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int C = this.f2825a.C();
                Y(C);
                int d10 = this.f2825a.d() + C;
                do {
                    g0Var.e(this.f2825a.w());
                } while (this.f2825a.d() < d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f2825a.w()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int C2 = this.f2825a.C();
                Y(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f2825a.w()));
                } while (this.f2825a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public void r(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    yVar.d(this.f2825a.t());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    yVar.d(this.f2825a.t());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2825a.t()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Integer.valueOf(this.f2825a.t()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public double readDouble() {
        W(1);
        return this.f2825a.o();
    }

    public float readFloat() {
        W(5);
        return this.f2825a.s();
    }

    public void s(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    yVar.d(this.f2825a.p());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    yVar.d(this.f2825a.p());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f2825a.p()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Integer.valueOf(this.f2825a.p()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (H() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void t(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.i0.a<K, V> r9, androidx.datastore.preferences.protobuf.o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f2825a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.i r2 = r7.f2825a
            int r1 = r2.l(r1)
            K r2 = r9.f2817b
            V r3 = r9.f2819d
        L_0x0014:
            int r4 = r7.A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.i r5 = r7.f2825a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.H()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            androidx.datastore.preferences.protobuf.q1$b r4 = r9.f2818c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f2819d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            androidx.datastore.preferences.protobuf.q1$b r4 = r9.f2816a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.H()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.i r8 = r7.f2825a
            r8.k(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.i r9 = r7.f2825a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j.t(java.util.Map, androidx.datastore.preferences.protobuf.i0$a, androidx.datastore.preferences.protobuf.o):void");
    }

    public int u() {
        W(0);
        return this.f2825a.p();
    }

    public void v(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 2) {
                int C = this.f2825a.C();
                X(C);
                int d10 = this.f2825a.d() + C;
                do {
                    yVar.d(this.f2825a.q());
                } while (this.f2825a.d() < d10);
            } else if (b10 == 5) {
                do {
                    yVar.d(this.f2825a.q());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 2) {
                int C2 = this.f2825a.C();
                X(C2);
                int d11 = this.f2825a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f2825a.q()));
                } while (this.f2825a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f2825a.q()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int w() {
        W(0);
        return this.f2825a.x();
    }

    public long x() {
        W(0);
        return this.f2825a.y();
    }

    public void y(List<Boolean> list) {
        int B;
        int B2;
        if (list instanceof f) {
            f fVar = (f) list;
            int b10 = q1.b(this.f2826b);
            if (b10 == 0) {
                do {
                    fVar.e(this.f2825a.m());
                    if (!this.f2825a.e()) {
                        B2 = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f2826b);
                this.f2828d = B2;
            } else if (b10 == 2) {
                int d10 = this.f2825a.d() + this.f2825a.C();
                do {
                    fVar.e(this.f2825a.m());
                } while (this.f2825a.d() < d10);
                V(d10);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b11 = q1.b(this.f2826b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2825a.m()));
                    if (!this.f2825a.e()) {
                        B = this.f2825a.B();
                    } else {
                        return;
                    }
                } while (B == this.f2826b);
                this.f2828d = B;
            } else if (b11 == 2) {
                int d11 = this.f2825a.d() + this.f2825a.C();
                do {
                    list.add(Boolean.valueOf(this.f2825a.m()));
                } while (this.f2825a.d() < d11);
                V(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public String z() {
        W(2);
        return this.f2825a.z();
    }
}
