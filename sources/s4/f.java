package s4;

import a6.a;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import k4.j;
import k4.l;

/* compiled from: OggPageHeader */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f11446a;

    /* renamed from: b  reason: collision with root package name */
    public int f11447b;

    /* renamed from: c  reason: collision with root package name */
    public long f11448c;

    /* renamed from: d  reason: collision with root package name */
    public long f11449d;

    /* renamed from: e  reason: collision with root package name */
    public long f11450e;

    /* renamed from: f  reason: collision with root package name */
    public long f11451f;

    /* renamed from: g  reason: collision with root package name */
    public int f11452g;

    /* renamed from: h  reason: collision with root package name */
    public int f11453h;

    /* renamed from: i  reason: collision with root package name */
    public int f11454i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f11455j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final y f11456k = new y(255);

    f() {
    }

    public boolean a(j jVar, boolean z10) {
        b();
        this.f11456k.K(27);
        if (!l.b(jVar, this.f11456k.d(), 0, 27, z10) || this.f11456k.E() != 1332176723) {
            return false;
        }
        int C = this.f11456k.C();
        this.f11446a = C;
        if (C == 0) {
            this.f11447b = this.f11456k.C();
            this.f11448c = this.f11456k.q();
            this.f11449d = this.f11456k.s();
            this.f11450e = this.f11456k.s();
            this.f11451f = this.f11456k.s();
            int C2 = this.f11456k.C();
            this.f11452g = C2;
            this.f11453h = C2 + 27;
            this.f11456k.K(C2);
            if (!l.b(jVar, this.f11456k.d(), 0, this.f11452g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f11452g; i10++) {
                this.f11455j[i10] = this.f11456k.C();
                this.f11454i += this.f11455j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw ParserException.d("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f11446a = 0;
        this.f11447b = 0;
        this.f11448c = 0;
        this.f11449d = 0;
        this.f11450e = 0;
        this.f11451f = 0;
        this.f11452g = 0;
        this.f11453h = 0;
        this.f11454i = 0;
    }

    public boolean c(j jVar) {
        return d(jVar, -1);
    }

    public boolean d(j jVar, long j10) {
        int i10;
        a.a(jVar.getPosition() == jVar.e());
        this.f11456k.K(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || jVar.getPosition() + 4 < j10) && l.b(jVar, this.f11456k.d(), 0, 4, true)) {
                this.f11456k.O(0);
                if (this.f11456k.E() == 1332176723) {
                    jVar.k();
                    return true;
                }
                jVar.l(1);
            }
        }
        do {
            if ((i10 != 0 && jVar.getPosition() >= j10) || jVar.g(1) == -1) {
                return false;
            }
            break;
        } while (jVar.g(1) == -1);
        return false;
    }
}
