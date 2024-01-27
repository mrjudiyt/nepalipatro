package i5;

import a6.m0;
import android.util.SparseArray;
import e4.j;
import i5.g;
import k4.a0;
import k4.b0;
import k4.d;
import k4.h;
import k4.i;
import k4.k;
import k4.x;
import k4.y;

/* compiled from: BundledChunkExtractor */
public final class e implements k, g {

    /* renamed from: q  reason: collision with root package name */
    public static final g.a f9289q = d.f14888a;

    /* renamed from: r  reason: collision with root package name */
    private static final x f9290r = new x();

    /* renamed from: h  reason: collision with root package name */
    private final i f9291h;

    /* renamed from: i  reason: collision with root package name */
    private final int f9292i;

    /* renamed from: j  reason: collision with root package name */
    private final j f9293j;

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<a> f9294k = new SparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private boolean f9295l;

    /* renamed from: m  reason: collision with root package name */
    private g.b f9296m;

    /* renamed from: n  reason: collision with root package name */
    private long f9297n;

    /* renamed from: o  reason: collision with root package name */
    private y f9298o;

    /* renamed from: p  reason: collision with root package name */
    private j[] f9299p;

    /* compiled from: BundledChunkExtractor */
    private static final class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f9300a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9301b;

        /* renamed from: c  reason: collision with root package name */
        private final j f9302c;

        /* renamed from: d  reason: collision with root package name */
        private final h f9303d = new h();

        /* renamed from: e  reason: collision with root package name */
        public j f9304e;

        /* renamed from: f  reason: collision with root package name */
        private b0 f9305f;

        /* renamed from: g  reason: collision with root package name */
        private long f9306g;

        public a(int i10, int i11, j jVar) {
            this.f9300a = i10;
            this.f9301b = i11;
            this.f9302c = jVar;
        }

        public /* synthetic */ void a(a6.y yVar, int i10) {
            a0.b(this, yVar, i10);
        }

        public int b(z5.g gVar, int i10, boolean z10, int i11) {
            return ((b0) m0.j(this.f9305f)).c(gVar, i10, z10);
        }

        public /* synthetic */ int c(z5.g gVar, int i10, boolean z10) {
            return a0.a(this, gVar, i10, z10);
        }

        public void d(j jVar) {
            j jVar2 = this.f9302c;
            if (jVar2 != null) {
                jVar = jVar.f(jVar2);
            }
            this.f9304e = jVar;
            ((b0) m0.j(this.f9305f)).d(this.f9304e);
        }

        public void e(long j10, int i10, int i11, int i12, b0.a aVar) {
            long j11 = this.f9306g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f9305f = this.f9303d;
            }
            ((b0) m0.j(this.f9305f)).e(j10, i10, i11, i12, aVar);
        }

        public void f(a6.y yVar, int i10, int i11) {
            ((b0) m0.j(this.f9305f)).a(yVar, i10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f9305f = this.f9303d;
                return;
            }
            this.f9306g = j10;
            b0 e10 = bVar.e(this.f9300a, this.f9301b);
            this.f9305f = e10;
            j jVar = this.f9304e;
            if (jVar != null) {
                e10.d(jVar);
            }
        }
    }

    public e(i iVar, int i10, j jVar) {
        this.f9291h = iVar;
        this.f9292i = i10;
        this.f9293j = jVar;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [p4.e] */
    /* JADX WARNING: type inference failed for: r9v6, types: [t4.a] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ i5.g g(int r7, e4.j r8, boolean r9, java.util.List r10, k4.b0 r11) {
        /*
            java.lang.String r0 = r8.f8095r
            boolean r1 = a6.t.r(r0)
            if (r1 == 0) goto L_0x0018
            java.lang.String r9 = "application/x-rawcc"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0016
            t4.a r9 = new t4.a
            r9.<init>(r8)
            goto L_0x0036
        L_0x0016:
            r7 = 0
            return r7
        L_0x0018:
            boolean r0 = a6.t.q(r0)
            if (r0 == 0) goto L_0x0025
            p4.e r9 = new p4.e
            r10 = 1
            r9.<init>(r10)
            goto L_0x0036
        L_0x0025:
            r0 = 0
            if (r9 == 0) goto L_0x002b
            r0 = 4
            r2 = 4
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r4.g r9 = new r4.g
            r3 = 0
            r4 = 0
            r1 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0036:
            i5.e r10 = new i5.e
            r10.<init>(r9, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.g(int, e4.j, boolean, java.util.List, k4.b0):i5.g");
    }

    public boolean a(k4.j jVar) {
        int g10 = this.f9291h.g(jVar, f9290r);
        a6.a.f(g10 != 1);
        if (g10 == 0) {
            return true;
        }
        return false;
    }

    public void b(g.b bVar, long j10, long j11) {
        this.f9296m = bVar;
        this.f9297n = j11;
        if (!this.f9295l) {
            this.f9291h.c(this);
            if (j10 != -9223372036854775807L) {
                this.f9291h.b(0, j10);
            }
            this.f9295l = true;
            return;
        }
        i iVar = this.f9291h;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        iVar.b(0, j10);
        for (int i10 = 0; i10 < this.f9294k.size(); i10++) {
            this.f9294k.valueAt(i10).g(bVar, j11);
        }
    }

    public j[] c() {
        return this.f9299p;
    }

    public d d() {
        y yVar = this.f9298o;
        if (yVar instanceof d) {
            return (d) yVar;
        }
        return null;
    }

    public b0 e(int i10, int i11) {
        a aVar = this.f9294k.get(i10);
        if (aVar == null) {
            a6.a.f(this.f9299p == null);
            aVar = new a(i10, i11, i11 == this.f9292i ? this.f9293j : null);
            aVar.g(this.f9296m, this.f9297n);
            this.f9294k.put(i10, aVar);
        }
        return aVar;
    }

    public void i(y yVar) {
        this.f9298o = yVar;
    }

    public void o() {
        j[] jVarArr = new j[this.f9294k.size()];
        for (int i10 = 0; i10 < this.f9294k.size(); i10++) {
            jVarArr[i10] = (j) a6.a.h(this.f9294k.valueAt(i10).f9304e);
        }
        this.f9299p = jVarArr;
    }

    public void release() {
        this.f9291h.release();
    }
}
