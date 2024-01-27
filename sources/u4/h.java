package u4;

import a6.a;
import a6.x;
import a6.y;
import k4.e;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.y;
import u4.i0;

/* compiled from: AdtsExtractor */
public final class h implements i {

    /* renamed from: m  reason: collision with root package name */
    public static final o f11807m = g.f16606b;

    /* renamed from: a  reason: collision with root package name */
    private final int f11808a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11809b;

    /* renamed from: c  reason: collision with root package name */
    private final y f11810c;

    /* renamed from: d  reason: collision with root package name */
    private final y f11811d;

    /* renamed from: e  reason: collision with root package name */
    private final x f11812e;

    /* renamed from: f  reason: collision with root package name */
    private k f11813f;

    /* renamed from: g  reason: collision with root package name */
    private long f11814g;

    /* renamed from: h  reason: collision with root package name */
    private long f11815h;

    /* renamed from: i  reason: collision with root package name */
    private int f11816i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11817j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11818k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11819l;

    public h() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(k4.j r10) {
        /*
            r9 = this;
            boolean r0 = r9.f11817j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f11816i = r0
            r10.k()
            long r1 = r10.getPosition()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.k(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            a6.y r6 = r9.f11811d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.d(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            a6.y r6 = r9.f11811d     // Catch:{ EOFException -> 0x0076 }
            r6.O(r1)     // Catch:{ EOFException -> 0x0076 }
            a6.y r6 = r9.f11811d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.I()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = u4.i.m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            a6.y r6 = r9.f11811d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.d(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            a6.x r6 = r9.f11812e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.p(r7)     // Catch:{ EOFException -> 0x0076 }
            a6.x r6 = r9.f11812e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.m(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f11817j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            com.google.android.exoplayer2.ParserException r1 = com.google.android.exoplayer2.ParserException.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.k()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f11816i = r10
            goto L_0x0084
        L_0x0082:
            r9.f11816i = r0
        L_0x0084:
            r9.f11817j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.e(k4.j):void");
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private k4.y h(long j10) {
        return new e(j10, this.f11815h, f(this.f11816i, this.f11809b.k()), this.f11816i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] i() {
        return new i[]{new h()};
    }

    private void j(long j10, boolean z10, boolean z11) {
        if (!this.f11819l) {
            boolean z12 = z10 && this.f11816i > 0;
            if (!z12 || this.f11809b.k() != -9223372036854775807L || z11) {
                if (!z12 || this.f11809b.k() == -9223372036854775807L) {
                    this.f11813f.i(new y.b(-9223372036854775807L));
                } else {
                    this.f11813f.i(h(j10));
                }
                this.f11819l = true;
            }
        }
    }

    private int k(j jVar) {
        int i10 = 0;
        while (true) {
            jVar.o(this.f11811d.d(), 0, 10);
            this.f11811d.O(0);
            if (this.f11811d.F() != 4801587) {
                break;
            }
            this.f11811d.P(3);
            int B = this.f11811d.B();
            i10 += B + 10;
            jVar.f(B);
        }
        jVar.k();
        jVar.f(i10);
        if (this.f11815h == -1) {
            this.f11815h = (long) i10;
        }
        return i10;
    }

    public void b(long j10, long j11) {
        this.f11818k = false;
        this.f11809b.b();
        this.f11814g = j11;
    }

    public void c(k kVar) {
        this.f11813f = kVar;
        this.f11809b.d(kVar, new i0.d(0, 1));
        kVar.o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r9.k();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if ((r3 - r0) < 8192) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(k4.j r9) {
        /*
            r8 = this;
            int r0 = r8.k(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            a6.y r5 = r8.f11811d
            byte[] r5 = r5.d()
            r6 = 2
            r9.o(r5, r1, r6)
            a6.y r5 = r8.f11811d
            r5.O(r1)
            a6.y r5 = r8.f11811d
            int r5 = r5.I()
            boolean r5 = u4.i.m(r5)
            if (r5 != 0) goto L_0x0033
            r9.k()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002f
            return r1
        L_0x002f:
            r9.f(r3)
            goto L_0x0006
        L_0x0033:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003d
            return r5
        L_0x003d:
            a6.y r5 = r8.f11811d
            byte[] r5 = r5.d()
            r9.o(r5, r1, r6)
            a6.x r5 = r8.f11812e
            r6 = 14
            r5.p(r6)
            a6.x r5 = r8.f11812e
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0059
            return r1
        L_0x0059:
            int r6 = r5 + -6
            r9.f(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.d(k4.j):boolean");
    }

    public int g(j jVar, k4.x xVar) {
        a.h(this.f11813f);
        long a10 = jVar.a();
        boolean z10 = ((this.f11808a & 1) == 0 || a10 == -1) ? false : true;
        if (z10) {
            e(jVar);
        }
        int read = jVar.read(this.f11810c.d(), 0, 2048);
        boolean z11 = read == -1;
        j(a10, z10, z11);
        if (z11) {
            return -1;
        }
        this.f11810c.O(0);
        this.f11810c.N(read);
        if (!this.f11818k) {
            this.f11809b.e(this.f11814g, 4);
            this.f11818k = true;
        }
        this.f11809b.a(this.f11810c);
        return 0;
    }

    public void release() {
    }

    public h(int i10) {
        this.f11808a = i10;
        this.f11809b = new i(true);
        this.f11810c = new a6.y(2048);
        this.f11816i = -1;
        this.f11815h = -1;
        a6.y yVar = new a6.y(10);
        this.f11811d = yVar;
        this.f11812e = new x(yVar.d());
    }
}
