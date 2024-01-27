package s4;

import a6.m0;
import java.util.Arrays;
import k4.j;
import k4.p;
import k4.q;
import k4.r;
import k4.s;
import k4.y;
import s4.i;

/* compiled from: FlacReader */
final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private s f11431n;

    /* renamed from: o  reason: collision with root package name */
    private a f11432o;

    /* compiled from: FlacReader */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private s f11433a;

        /* renamed from: b  reason: collision with root package name */
        private s.a f11434b;

        /* renamed from: c  reason: collision with root package name */
        private long f11435c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f11436d = -1;

        public a(s sVar, s.a aVar) {
            this.f11433a = sVar;
            this.f11434b = aVar;
        }

        public long a(j jVar) {
            long j10 = this.f11436d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f11436d = -1;
            return j11;
        }

        public y b() {
            a6.a.f(this.f11435c != -1);
            return new r(this.f11433a, this.f11435c);
        }

        public void c(long j10) {
            long[] jArr = this.f11434b.f9616a;
            this.f11436d = jArr[m0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f11435c = j10;
        }
    }

    b() {
    }

    private int n(a6.y yVar) {
        int i10 = (yVar.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            yVar.P(4);
            yVar.J();
        }
        int j10 = p.j(yVar, i10);
        yVar.O(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a6.y yVar) {
        return yVar.a() >= 5 && yVar.C() == 127 && yVar.E() == 1179402563;
    }

    /* access modifiers changed from: protected */
    public long f(a6.y yVar) {
        if (!o(yVar.d())) {
            return -1;
        }
        return (long) n(yVar);
    }

    /* access modifiers changed from: protected */
    public boolean h(a6.y yVar, long j10, i.b bVar) {
        byte[] d10 = yVar.d();
        s sVar = this.f11431n;
        if (sVar == null) {
            s sVar2 = new s(d10, 17);
            this.f11431n = sVar2;
            bVar.f11472a = sVar2.h(Arrays.copyOfRange(d10, 9, yVar.f()), (x4.a) null);
            return true;
        } else if ((d10[0] & Byte.MAX_VALUE) == 3) {
            s.a g10 = q.g(yVar);
            s c10 = sVar.c(g10);
            this.f11431n = c10;
            this.f11432o = new a(c10, g10);
            return true;
        } else if (!o(d10)) {
            return true;
        } else {
            a aVar = this.f11432o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f11473b = this.f11432o;
            }
            a6.a.e(bVar.f11472a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f11431n = null;
            this.f11432o = null;
        }
    }
}
