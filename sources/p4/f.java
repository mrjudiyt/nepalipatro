package p4;

import a6.y;
import k4.j;

/* compiled from: Sniffer */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final y f10562a = new y(8);

    /* renamed from: b  reason: collision with root package name */
    private int f10563b;

    private long a(j jVar) {
        int i10 = 0;
        jVar.o(this.f10562a.d(), 0, 1);
        byte b10 = this.f10562a.d()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        jVar.o(this.f10562a.d(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f10562a.d()[i10] & 255) + (i13 << 8);
        }
        this.f10563b += i12 + 1;
        return (long) i13;
    }

    public boolean b(j jVar) {
        long a10;
        int i10;
        j jVar2 = jVar;
        long a11 = jVar.a();
        long j10 = 1024;
        int i11 = (a11 > -1 ? 1 : (a11 == -1 ? 0 : -1));
        if (i11 != 0 && a11 <= 1024) {
            j10 = a11;
        }
        int i12 = (int) j10;
        jVar2.o(this.f10562a.d(), 0, 4);
        this.f10563b = 4;
        for (long E = this.f10562a.E(); E != 440786851; E = ((E << 8) & -256) | ((long) (this.f10562a.d()[0] & 255))) {
            int i13 = this.f10563b + 1;
            this.f10563b = i13;
            if (i13 == i12) {
                return false;
            }
            jVar2.o(this.f10562a.d(), 0, 1);
        }
        long a12 = a(jVar);
        long j11 = (long) this.f10563b;
        if (a12 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a12 >= a11) {
            return false;
        }
        while (true) {
            int i14 = this.f10563b;
            long j12 = j11 + a12;
            if (((long) i14) < j12) {
                if (a(jVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                    if (i10 != 0) {
                        int a13 = (int) (a10 = a(jVar));
                        jVar2.f(a13);
                        this.f10563b += a13;
                    }
                }
            } else if (((long) i14) == j12) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
