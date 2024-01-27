package k4;

import a6.m0;
import k4.y;

/* compiled from: BinarySearchSeeker */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0160a f9512a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f9513b;

    /* renamed from: c  reason: collision with root package name */
    protected c f9514c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9515d;

    /* renamed from: k4.a$a  reason: collision with other inner class name */
    /* compiled from: BinarySearchSeeker */
    public static class C0160a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final d f9516a;

        /* renamed from: b  reason: collision with root package name */
        private final long f9517b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f9518c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f9519d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f9520e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f9521f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f9522g;

        public C0160a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f9516a = dVar;
            this.f9517b = j10;
            this.f9518c = j11;
            this.f9519d = j12;
            this.f9520e = j13;
            this.f9521f = j14;
            this.f9522g = j15;
        }

        public boolean f() {
            return true;
        }

        public y.a h(long j10) {
            return new y.a(new z(j10, c.h(this.f9516a.a(j10), this.f9518c, this.f9519d, this.f9520e, this.f9521f, this.f9522g)));
        }

        public long i() {
            return this.f9517b;
        }

        public long k(long j10) {
            return this.f9516a.a(j10);
        }
    }

    /* compiled from: BinarySearchSeeker */
    public static final class b implements d {
        public long a(long j10) {
            return j10;
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f9523a;

        /* renamed from: b  reason: collision with root package name */
        private final long f9524b;

        /* renamed from: c  reason: collision with root package name */
        private final long f9525c;

        /* renamed from: d  reason: collision with root package name */
        private long f9526d;

        /* renamed from: e  reason: collision with root package name */
        private long f9527e;

        /* renamed from: f  reason: collision with root package name */
        private long f9528f;

        /* renamed from: g  reason: collision with root package name */
        private long f9529g;

        /* renamed from: h  reason: collision with root package name */
        private long f9530h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f9523a = j10;
            this.f9524b = j11;
            this.f9526d = j12;
            this.f9527e = j13;
            this.f9528f = j14;
            this.f9529g = j15;
            this.f9525c = j16;
            this.f9530h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return m0.s(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.f9529g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f9528f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.f9530h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.f9523a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.f9524b;
        }

        private void n() {
            this.f9530h = h(this.f9524b, this.f9526d, this.f9527e, this.f9528f, this.f9529g, this.f9525c);
        }

        /* access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f9527e = j10;
            this.f9529g = j11;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f9526d = j10;
            this.f9528f = j11;
            n();
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected interface d {
        long a(long j10);
    }

    /* compiled from: BinarySearchSeeker */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f9531d = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f9532a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f9533b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f9534c;

        private e(int i10, long j10, long j11) {
            this.f9532a = i10;
            this.f9533b = j10;
            this.f9534c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* compiled from: BinarySearchSeeker */
    protected interface f {
        e a(j jVar, long j10);

        void b();
    }

    protected a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f9513b = fVar;
        this.f9515d = i10;
        this.f9512a = new C0160a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* access modifiers changed from: protected */
    public c a(long j10) {
        long j11 = j10;
        return new c(j11, this.f9512a.k(j11), this.f9512a.f9518c, this.f9512a.f9519d, this.f9512a.f9520e, this.f9512a.f9521f, this.f9512a.f9522g);
    }

    public final y b() {
        return this.f9512a;
    }

    public int c(j jVar, x xVar) {
        while (true) {
            c cVar = (c) a6.a.h(this.f9514c);
            long b10 = cVar.j();
            long c10 = cVar.i();
            long d10 = cVar.k();
            if (c10 - b10 <= ((long) this.f9515d)) {
                e(false, b10);
                return g(jVar, b10, xVar);
            } else if (!i(jVar, d10)) {
                return g(jVar, d10, xVar);
            } else {
                jVar.k();
                e a10 = this.f9513b.a(jVar, cVar.m());
                int a11 = a10.f9532a;
                if (a11 == -3) {
                    e(false, d10);
                    return g(jVar, d10, xVar);
                } else if (a11 == -2) {
                    cVar.p(a10.f9533b, a10.f9534c);
                } else if (a11 == -1) {
                    cVar.o(a10.f9533b, a10.f9534c);
                } else if (a11 == 0) {
                    i(jVar, a10.f9534c);
                    e(true, a10.f9534c);
                    return g(jVar, a10.f9534c, xVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.f9514c != null;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z10, long j10) {
        this.f9514c = null;
        this.f9513b.b();
        f(z10, j10);
    }

    /* access modifiers changed from: protected */
    public void f(boolean z10, long j10) {
    }

    /* access modifiers changed from: protected */
    public final int g(j jVar, long j10, x xVar) {
        if (j10 == jVar.getPosition()) {
            return 0;
        }
        xVar.f9627a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f9514c;
        if (cVar == null || cVar.l() != j10) {
            this.f9514c = a(j10);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(j jVar, long j10) {
        long position = j10 - jVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        jVar.l((int) position);
        return true;
    }
}
