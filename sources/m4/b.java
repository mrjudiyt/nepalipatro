package m4;

import k4.a;
import k4.j;
import k4.p;
import k4.s;

/* compiled from: FlacBinarySearchSeeker */
final class b extends k4.a {

    /* renamed from: m4.b$b  reason: collision with other inner class name */
    /* compiled from: FlacBinarySearchSeeker */
    private static final class C0169b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final s f10217a;

        /* renamed from: b  reason: collision with root package name */
        private final int f10218b;

        /* renamed from: c  reason: collision with root package name */
        private final p.a f10219c;

        private long c(j jVar) {
            while (jVar.e() < jVar.a() - 6 && !p.h(jVar, this.f10217a, this.f10218b, this.f10219c)) {
                jVar.f(1);
            }
            if (jVar.e() < jVar.a() - 6) {
                return this.f10219c.f9600a;
            }
            jVar.f((int) (jVar.a() - jVar.e()));
            return this.f10217a.f9613j;
        }

        public a.e a(j jVar, long j10) {
            long position = jVar.getPosition();
            long c10 = c(jVar);
            long e10 = jVar.e();
            jVar.f(Math.max(6, this.f10217a.f9606c));
            long c11 = c(jVar);
            long e11 = jVar.e();
            if (c10 <= j10 && c11 > j10) {
                return a.e.e(e10);
            }
            if (c11 <= j10) {
                return a.e.f(c11, e11);
            }
            return a.e.d(c10, position);
        }

        public /* synthetic */ void b() {
            k4.b.a(this);
        }

        private C0169b(s sVar, int i10) {
            this.f10217a = sVar;
            this.f10218b = i10;
            this.f10219c = new p.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(k4.s r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            m4.a r1 = new m4.a
            r1.<init>(r0)
            m4.b$b r2 = new m4.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.g()
            long r7 = r0.f9613j
            long r13 = r17.e()
            int r0 = r0.f9606c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.<init>(k4.s, int, long, long):void");
    }
}
