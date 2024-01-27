package u4;

import a6.y;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.x;
import k4.y;
import u4.i0;

/* compiled from: Ac3Extractor */
public final class b implements i {

    /* renamed from: d  reason: collision with root package name */
    public static final o f11753d = a.f16604b;

    /* renamed from: a  reason: collision with root package name */
    private final c f11754a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final y f11755b = new y(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f11756c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] e() {
        return new i[]{new b()};
    }

    public void b(long j10, long j11) {
        this.f11756c = false;
        this.f11754a.b();
    }

    public void c(k kVar) {
        this.f11754a.d(kVar, new i0.d(0, 1));
        kVar.o();
        kVar.i(new y.b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.k();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(k4.j r8) {
        /*
            r7 = this;
            a6.y r0 = new a6.y
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.d()
            r8.o(r4, r2, r1)
            r0.O(r2)
            int r4 = r0.F()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.k()
            r8.f(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.d()
            r6 = 6
            r8.o(r5, r2, r6)
            r0.O(r2)
            int r5 = r0.I()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.k()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.f(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.d()
            int r5 = g4.b.f(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.f(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.P(r4)
            int r4 = r0.B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.f(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.d(k4.j):boolean");
    }

    public int g(j jVar, x xVar) {
        int read = jVar.read(this.f11755b.d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f11755b.O(0);
        this.f11755b.N(read);
        if (!this.f11756c) {
            this.f11754a.e(0, 4);
            this.f11756c = true;
        }
        this.f11754a.a(this.f11755b);
        return 0;
    }

    public void release() {
    }
}
