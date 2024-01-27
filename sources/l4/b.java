package l4;

import a6.a;
import a6.m0;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import java.io.EOFException;
import java.util.Arrays;
import k4.b0;
import k4.e;
import k4.i;
import k4.k;
import k4.o;
import k4.x;
import k4.y;

/* compiled from: AmrExtractor */
public final class b implements i {

    /* renamed from: p  reason: collision with root package name */
    public static final o f9961p = a.f15586b;

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f9962q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f9963r;

    /* renamed from: s  reason: collision with root package name */
    private static final byte[] f9964s = m0.g0("#!AMR\n");

    /* renamed from: t  reason: collision with root package name */
    private static final byte[] f9965t = m0.g0("#!AMR-WB\n");

    /* renamed from: u  reason: collision with root package name */
    private static final int f9966u;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9967a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9968b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9969c;

    /* renamed from: d  reason: collision with root package name */
    private long f9970d;

    /* renamed from: e  reason: collision with root package name */
    private int f9971e;

    /* renamed from: f  reason: collision with root package name */
    private int f9972f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9973g;

    /* renamed from: h  reason: collision with root package name */
    private long f9974h;

    /* renamed from: i  reason: collision with root package name */
    private int f9975i;

    /* renamed from: j  reason: collision with root package name */
    private int f9976j;

    /* renamed from: k  reason: collision with root package name */
    private long f9977k;

    /* renamed from: l  reason: collision with root package name */
    private k f9978l;

    /* renamed from: m  reason: collision with root package name */
    private b0 f9979m;

    /* renamed from: n  reason: collision with root package name */
    private y f9980n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9981o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9963r = iArr;
        f9966u = iArr[8];
    }

    public b() {
        this(0);
    }

    private void e() {
        a.h(this.f9979m);
        m0.j(this.f9978l);
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private y h(long j10) {
        return new e(j10, this.f9974h, f(this.f9975i, 20000), this.f9975i);
    }

    private int i(int i10) {
        if (k(i10)) {
            return this.f9969c ? f9963r[i10] : f9962q[i10];
        }
        String str = this.f9969c ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i10);
        throw ParserException.a(sb.toString(), (Throwable) null);
    }

    private boolean j(int i10) {
        return !this.f9969c && (i10 < 12 || i10 > 14);
    }

    private boolean k(int i10) {
        return i10 >= 0 && i10 <= 15 && (l(i10) || j(i10));
    }

    private boolean l(int i10) {
        return this.f9969c && (i10 < 10 || i10 > 13);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] m() {
        return new i[]{new b()};
    }

    private void n() {
        if (!this.f9981o) {
            this.f9981o = true;
            boolean z10 = this.f9969c;
            this.f9979m.d(new j.b().e0(z10 ? "audio/amr-wb" : "audio/3gpp").W(f9966u).H(1).f0(z10 ? 16000 : 8000).E());
        }
    }

    private void o(long j10, int i10) {
        int i11;
        if (!this.f9973g) {
            if ((this.f9968b & 1) == 0 || j10 == -1 || !((i11 = this.f9975i) == -1 || i11 == this.f9971e)) {
                y.b bVar = new y.b(-9223372036854775807L);
                this.f9980n = bVar;
                this.f9978l.i(bVar);
                this.f9973g = true;
            } else if (this.f9976j >= 20 || i10 == -1) {
                y h10 = h(j10);
                this.f9980n = h10;
                this.f9978l.i(h10);
                this.f9973g = true;
            }
        }
    }

    private static boolean p(k4.j jVar, byte[] bArr) {
        jVar.k();
        byte[] bArr2 = new byte[bArr.length];
        jVar.o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(k4.j jVar) {
        jVar.k();
        jVar.o(this.f9967a, 0, 1);
        byte b10 = this.f9967a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Invalid padding bits for frame header ");
        sb.append(b10);
        throw ParserException.a(sb.toString(), (Throwable) null);
    }

    private boolean r(k4.j jVar) {
        byte[] bArr = f9964s;
        if (p(jVar, bArr)) {
            this.f9969c = false;
            jVar.l(bArr.length);
            return true;
        }
        byte[] bArr2 = f9965t;
        if (!p(jVar, bArr2)) {
            return false;
        }
        this.f9969c = true;
        jVar.l(bArr2.length);
        return true;
    }

    private int s(k4.j jVar) {
        if (this.f9972f == 0) {
            try {
                int q10 = q(jVar);
                this.f9971e = q10;
                this.f9972f = q10;
                if (this.f9975i == -1) {
                    this.f9974h = jVar.getPosition();
                    this.f9975i = this.f9971e;
                }
                if (this.f9975i == this.f9971e) {
                    this.f9976j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int c10 = this.f9979m.c(jVar, this.f9972f, true);
        if (c10 == -1) {
            return -1;
        }
        int i10 = this.f9972f - c10;
        this.f9972f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f9979m.e(this.f9977k + this.f9970d, 1, this.f9971e, 0, (b0.a) null);
        this.f9970d += 20000;
        return 0;
    }

    public void b(long j10, long j11) {
        this.f9970d = 0;
        this.f9971e = 0;
        this.f9972f = 0;
        if (j10 != 0) {
            y yVar = this.f9980n;
            if (yVar instanceof e) {
                this.f9977k = ((e) yVar).c(j10);
                return;
            }
        }
        this.f9977k = 0;
    }

    public void c(k kVar) {
        this.f9978l = kVar;
        this.f9979m = kVar.e(0, 1);
        kVar.o();
    }

    public boolean d(k4.j jVar) {
        return r(jVar);
    }

    public int g(k4.j jVar, x xVar) {
        e();
        if (jVar.getPosition() != 0 || r(jVar)) {
            n();
            int s10 = s(jVar);
            o(jVar.a(), s10);
            return s10;
        }
        throw ParserException.a("Could not find AMR header.", (Throwable) null);
    }

    public void release() {
    }

    public b(int i10) {
        this.f9968b = i10;
        this.f9967a = new byte[1];
        this.f9975i = -1;
    }
}
