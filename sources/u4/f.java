package u4;

import a6.a;
import a6.x;
import a6.y;
import e4.j;
import g4.c;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: Ac4Reader */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final x f11785a;

    /* renamed from: b  reason: collision with root package name */
    private final y f11786b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11787c;

    /* renamed from: d  reason: collision with root package name */
    private String f11788d;

    /* renamed from: e  reason: collision with root package name */
    private b0 f11789e;

    /* renamed from: f  reason: collision with root package name */
    private int f11790f;

    /* renamed from: g  reason: collision with root package name */
    private int f11791g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11792h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11793i;

    /* renamed from: j  reason: collision with root package name */
    private long f11794j;

    /* renamed from: k  reason: collision with root package name */
    private j f11795k;

    /* renamed from: l  reason: collision with root package name */
    private int f11796l;

    /* renamed from: m  reason: collision with root package name */
    private long f11797m;

    public f() {
        this((String) null);
    }

    private boolean f(y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f11791g);
        yVar.j(bArr, this.f11791g, min);
        int i11 = this.f11791g + min;
        this.f11791g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f11785a.p(0);
        c.b d10 = c.d(this.f11785a);
        j jVar = this.f11795k;
        if (jVar == null || d10.f8843c != jVar.F || d10.f8842b != jVar.G || !"audio/ac4".equals(jVar.f8096s)) {
            j E = new j.b().S(this.f11788d).e0("audio/ac4").H(d10.f8843c).f0(d10.f8842b).V(this.f11787c).E();
            this.f11795k = E;
            this.f11789e.d(E);
        }
        this.f11796l = d10.f8844d;
        this.f11794j = (((long) d10.f8845e) * 1000000) / ((long) this.f11795k.G);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(a6.y r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f11792h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.C()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f11792h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.C()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f11792h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f11793i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f.h(a6.y):boolean");
    }

    public void a(y yVar) {
        a.h(this.f11789e);
        while (yVar.a() > 0) {
            int i10 = this.f11790f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f11796l - this.f11791g);
                        this.f11789e.a(yVar, min);
                        int i11 = this.f11791g + min;
                        this.f11791g = i11;
                        int i12 = this.f11796l;
                        if (i11 == i12) {
                            this.f11789e.e(this.f11797m, 1, i12, 0, (b0.a) null);
                            this.f11797m += this.f11794j;
                            this.f11790f = 0;
                        }
                    }
                } else if (f(yVar, this.f11786b.d(), 16)) {
                    g();
                    this.f11786b.O(0);
                    this.f11789e.a(this.f11786b, 16);
                    this.f11790f = 2;
                }
            } else if (h(yVar)) {
                this.f11790f = 1;
                this.f11786b.d()[0] = -84;
                this.f11786b.d()[1] = (byte) (this.f11793i ? 65 : 64);
                this.f11791g = 2;
            }
        }
    }

    public void b() {
        this.f11790f = 0;
        this.f11791g = 0;
        this.f11792h = false;
        this.f11793i = false;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11788d = dVar.b();
        this.f11789e = kVar.e(dVar.c(), 1);
    }

    public void e(long j10, int i10) {
        this.f11797m = j10;
    }

    public f(String str) {
        x xVar = new x(new byte[16]);
        this.f11785a = xVar;
        this.f11786b = new y(xVar.f274a);
        this.f11790f = 0;
        this.f11791g = 0;
        this.f11792h = false;
        this.f11793i = false;
        this.f11787c = str;
    }
}
