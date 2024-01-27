package u4;

import a6.a;
import a6.y;
import e4.j;
import g4.u;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: MpegAudioReader */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final y f12053a;

    /* renamed from: b  reason: collision with root package name */
    private final u.a f12054b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12055c;

    /* renamed from: d  reason: collision with root package name */
    private b0 f12056d;

    /* renamed from: e  reason: collision with root package name */
    private String f12057e;

    /* renamed from: f  reason: collision with root package name */
    private int f12058f;

    /* renamed from: g  reason: collision with root package name */
    private int f12059g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12060h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12061i;

    /* renamed from: j  reason: collision with root package name */
    private long f12062j;

    /* renamed from: k  reason: collision with root package name */
    private int f12063k;

    /* renamed from: l  reason: collision with root package name */
    private long f12064l;

    public t() {
        this((String) null);
    }

    private void f(y yVar) {
        byte[] d10 = yVar.d();
        int f10 = yVar.f();
        for (int e10 = yVar.e(); e10 < f10; e10++) {
            boolean z10 = (d10[e10] & 255) == 255;
            boolean z11 = this.f12061i && (d10[e10] & 224) == 224;
            this.f12061i = z10;
            if (z11) {
                yVar.O(e10 + 1);
                this.f12061i = false;
                this.f12053a.d()[1] = d10[e10];
                this.f12059g = 2;
                this.f12058f = 1;
                return;
            }
        }
        yVar.O(f10);
    }

    private void g(y yVar) {
        int min = Math.min(yVar.a(), this.f12063k - this.f12059g);
        this.f12056d.a(yVar, min);
        int i10 = this.f12059g + min;
        this.f12059g = i10;
        int i11 = this.f12063k;
        if (i10 >= i11) {
            this.f12056d.e(this.f12064l, 1, i11, 0, (b0.a) null);
            this.f12064l += this.f12062j;
            this.f12059g = 0;
            this.f12058f = 0;
        }
    }

    private void h(y yVar) {
        int min = Math.min(yVar.a(), 4 - this.f12059g);
        yVar.j(this.f12053a.d(), this.f12059g, min);
        int i10 = this.f12059g + min;
        this.f12059g = i10;
        if (i10 >= 4) {
            this.f12053a.O(0);
            if (!this.f12054b.a(this.f12053a.m())) {
                this.f12059g = 0;
                this.f12058f = 1;
                return;
            }
            u.a aVar = this.f12054b;
            this.f12063k = aVar.f8876c;
            if (!this.f12060h) {
                this.f12062j = (((long) aVar.f8880g) * 1000000) / ((long) aVar.f8877d);
                this.f12056d.d(new j.b().S(this.f12057e).e0(this.f12054b.f8875b).W(4096).H(this.f12054b.f8878e).f0(this.f12054b.f8877d).V(this.f12055c).E());
                this.f12060h = true;
            }
            this.f12053a.O(0);
            this.f12056d.a(this.f12053a, 4);
            this.f12058f = 2;
        }
    }

    public void a(y yVar) {
        a.h(this.f12056d);
        while (yVar.a() > 0) {
            int i10 = this.f12058f;
            if (i10 == 0) {
                f(yVar);
            } else if (i10 == 1) {
                h(yVar);
            } else if (i10 == 2) {
                g(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void b() {
        this.f12058f = 0;
        this.f12059g = 0;
        this.f12061i = false;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f12057e = dVar.b();
        this.f12056d = kVar.e(dVar.c(), 1);
    }

    public void e(long j10, int i10) {
        this.f12064l = j10;
    }

    public t(String str) {
        this.f12058f = 0;
        y yVar = new y(4);
        this.f12053a = yVar;
        yVar.d()[0] = -1;
        this.f12054b = new u.a();
        this.f12055c = str;
    }
}
