package t4;

import a6.y;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import java.io.IOException;
import k4.b0;
import k4.i;
import k4.k;
import k4.x;
import k4.y;

/* compiled from: RawCcExtractor */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final j f11661a;

    /* renamed from: b  reason: collision with root package name */
    private final y f11662b = new y(9);

    /* renamed from: c  reason: collision with root package name */
    private b0 f11663c;

    /* renamed from: d  reason: collision with root package name */
    private int f11664d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f11665e;

    /* renamed from: f  reason: collision with root package name */
    private long f11666f;

    /* renamed from: g  reason: collision with root package name */
    private int f11667g;

    /* renamed from: h  reason: collision with root package name */
    private int f11668h;

    public a(j jVar) {
        this.f11661a = jVar;
    }

    private boolean a(k4.j jVar) {
        this.f11662b.K(8);
        if (!jVar.b(this.f11662b.d(), 0, 8, true)) {
            return false;
        }
        if (this.f11662b.m() == 1380139777) {
            this.f11665e = this.f11662b.C();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    private void e(k4.j jVar) {
        while (this.f11667g > 0) {
            this.f11662b.K(3);
            jVar.readFully(this.f11662b.d(), 0, 3);
            this.f11663c.a(this.f11662b, 3);
            this.f11668h += 3;
            this.f11667g--;
        }
        int i10 = this.f11668h;
        if (i10 > 0) {
            this.f11663c.e(this.f11666f, 1, i10, 0, (b0.a) null);
        }
    }

    private boolean f(k4.j jVar) {
        int i10 = this.f11665e;
        if (i10 == 0) {
            this.f11662b.K(5);
            if (!jVar.b(this.f11662b.d(), 0, 5, true)) {
                return false;
            }
            this.f11666f = (this.f11662b.E() * 1000) / 45;
        } else if (i10 == 1) {
            this.f11662b.K(9);
            if (!jVar.b(this.f11662b.d(), 0, 9, true)) {
                return false;
            }
            this.f11666f = this.f11662b.v();
        } else {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unsupported version number: ");
            sb.append(i10);
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
        this.f11667g = this.f11662b.C();
        this.f11668h = 0;
        return true;
    }

    public void b(long j10, long j11) {
        this.f11664d = 0;
    }

    public void c(k kVar) {
        kVar.i(new y.b(-9223372036854775807L));
        b0 e10 = kVar.e(0, 3);
        this.f11663c = e10;
        e10.d(this.f11661a);
        kVar.o();
    }

    public boolean d(k4.j jVar) {
        this.f11662b.K(8);
        jVar.o(this.f11662b.d(), 0, 8);
        if (this.f11662b.m() == 1380139777) {
            return true;
        }
        return false;
    }

    public int g(k4.j jVar, x xVar) {
        a6.a.h(this.f11663c);
        while (true) {
            int i10 = this.f11664d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        e(jVar);
                        this.f11664d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (f(jVar)) {
                    this.f11664d = 2;
                } else {
                    this.f11664d = 0;
                    return -1;
                }
            } else if (!a(jVar)) {
                return -1;
            } else {
                this.f11664d = 1;
            }
        }
    }

    public void release() {
    }
}
