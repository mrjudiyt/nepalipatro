package s4;

import a6.a;
import a6.y;
import java.util.Arrays;
import k4.j;
import k4.l;

/* compiled from: OggPacket */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f11441a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final y f11442b = new y(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f11443c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f11444d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11445e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f11444d = 0;
        do {
            int i13 = this.f11444d;
            int i14 = i10 + i13;
            f fVar = this.f11441a;
            if (i14 >= fVar.f11452g) {
                break;
            }
            int[] iArr = fVar.f11455j;
            this.f11444d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f11441a;
    }

    public y c() {
        return this.f11442b;
    }

    public boolean d(j jVar) {
        int i10;
        a.f(jVar != null);
        if (this.f11445e) {
            this.f11445e = false;
            this.f11442b.K(0);
        }
        while (!this.f11445e) {
            if (this.f11443c < 0) {
                if (!this.f11441a.c(jVar) || !this.f11441a.a(jVar, true)) {
                    return false;
                }
                f fVar = this.f11441a;
                int i11 = fVar.f11453h;
                if ((fVar.f11447b & 1) == 1 && this.f11442b.f() == 0) {
                    i11 += a(0);
                    i10 = this.f11444d + 0;
                } else {
                    i10 = 0;
                }
                if (!l.e(jVar, i11)) {
                    return false;
                }
                this.f11443c = i10;
            }
            int a10 = a(this.f11443c);
            int i12 = this.f11443c + this.f11444d;
            if (a10 > 0) {
                y yVar = this.f11442b;
                yVar.c(yVar.f() + a10);
                if (!l.d(jVar, this.f11442b.d(), this.f11442b.f(), a10)) {
                    return false;
                }
                y yVar2 = this.f11442b;
                yVar2.N(yVar2.f() + a10);
                this.f11445e = this.f11441a.f11455j[i12 + -1] != 255;
            }
            if (i12 == this.f11441a.f11452g) {
                i12 = -1;
            }
            this.f11443c = i12;
        }
        return true;
    }

    public void e() {
        this.f11441a.b();
        this.f11442b.K(0);
        this.f11443c = -1;
        this.f11445e = false;
    }

    public void f() {
        if (this.f11442b.d().length != 65025) {
            y yVar = this.f11442b;
            yVar.M(Arrays.copyOf(yVar.d(), Math.max(65025, this.f11442b.f())), this.f11442b.f());
        }
    }
}
