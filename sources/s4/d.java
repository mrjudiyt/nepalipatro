package s4;

import a6.a;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import k4.b0;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.x;

/* compiled from: OggExtractor */
public class d implements i {

    /* renamed from: d  reason: collision with root package name */
    public static final o f11437d = c.f16443b;

    /* renamed from: a  reason: collision with root package name */
    private k f11438a;

    /* renamed from: b  reason: collision with root package name */
    private i f11439b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11440c;

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] e() {
        return new i[]{new d()};
    }

    private static y f(y yVar) {
        yVar.O(0);
        return yVar;
    }

    private boolean h(j jVar) {
        f fVar = new f();
        if (fVar.a(jVar, true) && (fVar.f11447b & 2) == 2) {
            int min = Math.min(fVar.f11454i, 8);
            y yVar = new y(min);
            jVar.o(yVar.d(), 0, min);
            if (b.p(f(yVar))) {
                this.f11439b = new b();
            } else if (j.r(f(yVar))) {
                this.f11439b = new j();
            } else if (h.o(f(yVar))) {
                this.f11439b = new h();
            }
            return true;
        }
        return false;
    }

    public void b(long j10, long j11) {
        i iVar = this.f11439b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    public void c(k kVar) {
        this.f11438a = kVar;
    }

    public boolean d(j jVar) {
        try {
            return h(jVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    public int g(j jVar, x xVar) {
        a.h(this.f11438a);
        if (this.f11439b == null) {
            if (h(jVar)) {
                jVar.k();
            } else {
                throw ParserException.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f11440c) {
            b0 e10 = this.f11438a.e(0, 1);
            this.f11438a.o();
            this.f11439b.d(this.f11438a, e10);
            this.f11440c = true;
        }
        return this.f11439b.g(jVar, xVar);
    }

    public void release() {
    }
}
