package u4;

import a6.i0;
import a6.x;
import a6.y;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.y;
import u4.i0;

/* compiled from: PsExtractor */
public final class a0 implements i {

    /* renamed from: l  reason: collision with root package name */
    public static final o f11733l = z.f16608b;

    /* renamed from: a  reason: collision with root package name */
    private final i0 f11734a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f11735b;

    /* renamed from: c  reason: collision with root package name */
    private final y f11736c;

    /* renamed from: d  reason: collision with root package name */
    private final y f11737d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11738e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11739f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11740g;

    /* renamed from: h  reason: collision with root package name */
    private long f11741h;

    /* renamed from: i  reason: collision with root package name */
    private x f11742i;

    /* renamed from: j  reason: collision with root package name */
    private k f11743j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11744k;

    /* compiled from: PsExtractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m f11745a;

        /* renamed from: b  reason: collision with root package name */
        private final i0 f11746b;

        /* renamed from: c  reason: collision with root package name */
        private final x f11747c = new x(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f11748d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11749e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11750f;

        /* renamed from: g  reason: collision with root package name */
        private int f11751g;

        /* renamed from: h  reason: collision with root package name */
        private long f11752h;

        public a(m mVar, i0 i0Var) {
            this.f11745a = mVar;
            this.f11746b = i0Var;
        }

        private void b() {
            this.f11747c.r(8);
            this.f11748d = this.f11747c.g();
            this.f11749e = this.f11747c.g();
            this.f11747c.r(6);
            this.f11751g = this.f11747c.h(8);
        }

        private void c() {
            this.f11752h = 0;
            if (this.f11748d) {
                this.f11747c.r(4);
                this.f11747c.r(1);
                this.f11747c.r(1);
                long h10 = (((long) this.f11747c.h(3)) << 30) | ((long) (this.f11747c.h(15) << 15)) | ((long) this.f11747c.h(15));
                this.f11747c.r(1);
                if (!this.f11750f && this.f11749e) {
                    this.f11747c.r(4);
                    this.f11747c.r(1);
                    this.f11747c.r(1);
                    this.f11747c.r(1);
                    this.f11746b.b((((long) this.f11747c.h(3)) << 30) | ((long) (this.f11747c.h(15) << 15)) | ((long) this.f11747c.h(15)));
                    this.f11750f = true;
                }
                this.f11752h = this.f11746b.b(h10);
            }
        }

        public void a(y yVar) {
            yVar.j(this.f11747c.f274a, 0, 3);
            this.f11747c.p(0);
            b();
            yVar.j(this.f11747c.f274a, 0, this.f11751g);
            this.f11747c.p(0);
            c();
            this.f11745a.e(this.f11752h, 4);
            this.f11745a.a(yVar);
            this.f11745a.c();
        }

        public void d() {
            this.f11750f = false;
            this.f11745a.b();
        }
    }

    public a0() {
        this(new i0(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] e() {
        return new i[]{new a0()};
    }

    private void f(long j10) {
        if (!this.f11744k) {
            this.f11744k = true;
            if (this.f11737d.c() != -9223372036854775807L) {
                x xVar = new x(this.f11737d.d(), this.f11737d.c(), j10);
                this.f11742i = xVar;
                this.f11743j.i(xVar.b());
                return;
            }
            this.f11743j.i(new y.b(this.f11737d.c()));
        }
    }

    public void b(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f11734a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f11734a.c();
            if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11) {
            this.f11734a.g(j11);
        }
        x xVar = this.f11742i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f11735b.size(); i10++) {
            this.f11735b.valueAt(i10).d();
        }
    }

    public void c(k kVar) {
        this.f11743j = kVar;
    }

    public boolean d(j jVar) {
        byte[] bArr = new byte[14];
        jVar.o(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jVar.f(bArr[13] & 7);
        jVar.o(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public int g(j jVar, k4.x xVar) {
        a6.a.h(this.f11743j);
        long a10 = jVar.a();
        int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if ((i10 != 0) && !this.f11737d.e()) {
            return this.f11737d.g(jVar, xVar);
        }
        f(a10);
        x xVar2 = this.f11742i;
        if (xVar2 != null && xVar2.d()) {
            return this.f11742i.c(jVar, xVar);
        }
        jVar.k();
        long e10 = i10 != 0 ? a10 - jVar.e() : -1;
        if ((e10 != -1 && e10 < 4) || !jVar.d(this.f11736c.d(), 0, 4, true)) {
            return -1;
        }
        this.f11736c.O(0);
        int m10 = this.f11736c.m();
        if (m10 == 441) {
            return -1;
        }
        if (m10 == 442) {
            jVar.o(this.f11736c.d(), 0, 10);
            this.f11736c.O(9);
            jVar.l((this.f11736c.C() & 7) + 14);
            return 0;
        } else if (m10 == 443) {
            jVar.o(this.f11736c.d(), 0, 2);
            this.f11736c.O(0);
            jVar.l(this.f11736c.I() + 6);
            return 0;
        } else if (((m10 & -256) >> 8) != 1) {
            jVar.l(1);
            return 0;
        } else {
            int i11 = m10 & 255;
            a aVar = this.f11735b.get(i11);
            if (!this.f11738e) {
                if (aVar == null) {
                    m mVar = null;
                    if (i11 == 189) {
                        mVar = new c();
                        this.f11739f = true;
                        this.f11741h = jVar.getPosition();
                    } else if ((i11 & 224) == 192) {
                        mVar = new t();
                        this.f11739f = true;
                        this.f11741h = jVar.getPosition();
                    } else if ((i11 & 240) == 224) {
                        mVar = new n();
                        this.f11740g = true;
                        this.f11741h = jVar.getPosition();
                    }
                    if (mVar != null) {
                        mVar.d(this.f11743j, new i0.d(i11, UserVerificationMethods.USER_VERIFY_HANDPRINT));
                        aVar = new a(mVar, this.f11734a);
                        this.f11735b.put(i11, aVar);
                    }
                }
                if (jVar.getPosition() > ((!this.f11739f || !this.f11740g) ? 1048576 : this.f11741h + 8192)) {
                    this.f11738e = true;
                    this.f11743j.o();
                }
            }
            jVar.o(this.f11736c.d(), 0, 2);
            this.f11736c.O(0);
            int I = this.f11736c.I() + 6;
            if (aVar == null) {
                jVar.l(I);
            } else {
                this.f11736c.K(I);
                jVar.readFully(this.f11736c.d(), 0, I);
                this.f11736c.O(6);
                aVar.a(this.f11736c);
                a6.y yVar = this.f11736c;
                yVar.N(yVar.b());
            }
            return 0;
        }
    }

    public void release() {
    }

    public a0(a6.i0 i0Var) {
        this.f11734a = i0Var;
        this.f11736c = new a6.y(4096);
        this.f11735b = new SparseArray<>();
        this.f11737d = new y();
    }
}
