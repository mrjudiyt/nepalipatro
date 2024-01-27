package u4;

import a6.y;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.x;
import k4.y;
import u4.i0;

/* compiled from: Ac4Extractor */
public final class e implements i {

    /* renamed from: d  reason: collision with root package name */
    public static final o f11777d = d.f16605b;

    /* renamed from: a  reason: collision with root package name */
    private final f f11778a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final y f11779b = new y(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f11780c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] e() {
        return new i[]{new e()};
    }

    public void b(long j10, long j11) {
        this.f11780c = false;
        this.f11778a.b();
    }

    public void c(k kVar) {
        this.f11778a.d(kVar, new i0.d(0, 1));
        kVar.o();
        kVar.i(new y.b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.k();
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(k4.j r9) {
        /*
            r8 = this;
            a6.y r0 = new a6.y
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.d()
            r9.o(r4, r2, r1)
            r0.O(r2)
            int r4 = r0.F()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.k()
            r9.f(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.d()
            r6 = 7
            r9.o(r5, r2, r6)
            r0.O(r2)
            int r5 = r0.I()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.k()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.f(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.d()
            int r5 = g4.c.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.f(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.P(r4)
            int r4 = r0.B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.f(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.e.d(k4.j):boolean");
    }

    public int g(j jVar, x xVar) {
        int read = jVar.read(this.f11779b.d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f11779b.O(0);
        this.f11779b.N(read);
        if (!this.f11780c) {
            this.f11778a.e(0, 4);
            this.f11780c = true;
        }
        this.f11778a.a(this.f11779b);
        return 0;
    }

    public void release() {
    }
}
