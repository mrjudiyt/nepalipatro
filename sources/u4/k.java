package u4;

import a6.a;
import a6.y;
import com.google.android.exoplayer2.drm.h;
import e4.j;
import g4.t;
import k4.b0;
import u4.i0;

/* compiled from: DtsReader */
public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    private final y f11883a = new y(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f11884b;

    /* renamed from: c  reason: collision with root package name */
    private String f11885c;

    /* renamed from: d  reason: collision with root package name */
    private b0 f11886d;

    /* renamed from: e  reason: collision with root package name */
    private int f11887e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f11888f;

    /* renamed from: g  reason: collision with root package name */
    private int f11889g;

    /* renamed from: h  reason: collision with root package name */
    private long f11890h;

    /* renamed from: i  reason: collision with root package name */
    private j f11891i;

    /* renamed from: j  reason: collision with root package name */
    private int f11892j;

    /* renamed from: k  reason: collision with root package name */
    private long f11893k;

    public k(String str) {
        this.f11884b = str;
    }

    private boolean f(y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f11888f);
        yVar.j(bArr, this.f11888f, min);
        int i11 = this.f11888f + min;
        this.f11888f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] d10 = this.f11883a.d();
        if (this.f11891i == null) {
            j g10 = t.g(d10, this.f11885c, this.f11884b, (h) null);
            this.f11891i = g10;
            this.f11886d.d(g10);
        }
        this.f11892j = t.a(d10);
        this.f11890h = (long) ((int) ((((long) t.f(d10)) * 1000000) / ((long) this.f11891i.G)));
    }

    private boolean h(y yVar) {
        while (yVar.a() > 0) {
            int i10 = this.f11889g << 8;
            this.f11889g = i10;
            int C = i10 | yVar.C();
            this.f11889g = C;
            if (t.d(C)) {
                byte[] d10 = this.f11883a.d();
                int i11 = this.f11889g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f11888f = 4;
                this.f11889g = 0;
                return true;
            }
        }
        return false;
    }

    public void a(y yVar) {
        a.h(this.f11886d);
        while (yVar.a() > 0) {
            int i10 = this.f11887e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f11892j - this.f11888f);
                        this.f11886d.a(yVar, min);
                        int i11 = this.f11888f + min;
                        this.f11888f = i11;
                        int i12 = this.f11892j;
                        if (i11 == i12) {
                            this.f11886d.e(this.f11893k, 1, i12, 0, (b0.a) null);
                            this.f11893k += this.f11890h;
                            this.f11887e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (f(yVar, this.f11883a.d(), 18)) {
                    g();
                    this.f11883a.O(0);
                    this.f11886d.a(this.f11883a, 18);
                    this.f11887e = 2;
                }
            } else if (h(yVar)) {
                this.f11887e = 1;
            }
        }
    }

    public void b() {
        this.f11887e = 0;
        this.f11888f = 0;
        this.f11889g = 0;
    }

    public void c() {
    }

    public void d(k4.k kVar, i0.d dVar) {
        dVar.a();
        this.f11885c = dVar.b();
        this.f11886d = kVar.e(dVar.c(), 1);
    }

    public void e(long j10, int i10) {
        this.f11893k = j10;
    }
}
