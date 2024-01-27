package k5;

import a6.m0;
import e4.j;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: SegmentBase */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f9704a;

    /* renamed from: b  reason: collision with root package name */
    final long f9705b;

    /* renamed from: c  reason: collision with root package name */
    final long f9706c;

    /* compiled from: SegmentBase */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f9707d;

        /* renamed from: e  reason: collision with root package name */
        final long f9708e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f9709f;

        /* renamed from: g  reason: collision with root package name */
        private final long f9710g;

        /* renamed from: h  reason: collision with root package name */
        private final long f9711h;

        /* renamed from: i  reason: collision with root package name */
        final long f9712i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f9707d = j12;
            this.f9708e = j13;
            this.f9709f = list;
            this.f9712i = j14;
            this.f9710g = j15;
            this.f9711h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            if (g10 != -1) {
                return g10;
            }
            return (long) ((int) (i((j11 - this.f9711h) + this.f9712i, j10) - d(j10, j11)));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f9710g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f9711h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f9707d;
        }

        public long f(long j10, long j11) {
            if (this.f9709f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f9712i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f9709f;
            if (list != null) {
                return (list.get((int) (j10 - this.f9707d)).f9718b * 1000000) / this.f9705b;
            }
            long g10 = g(j11);
            if (g10 == -1 || j10 != (e() + g10) - 1) {
                return (this.f9708e * 1000000) / this.f9705b;
            }
            return j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f9709f == null) {
                long j12 = this.f9707d + (j10 / ((this.f9708e * 1000000) / this.f9705b));
                if (j12 < e10) {
                    return e10;
                }
                if (g10 == -1) {
                    return j12;
                }
                return Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            long j11;
            List<d> list = this.f9709f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f9707d)).f9717a - this.f9706c;
            } else {
                j11 = (j10 - this.f9707d) * this.f9708e;
            }
            return m0.C0(j11, 1000000, this.f9705b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f9709f != null;
        }
    }

    /* compiled from: SegmentBase */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f9713j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f9713j = list2;
        }

        public long g(long j10) {
            return (long) this.f9713j.size();
        }

        public i k(j jVar, long j10) {
            return this.f9713j.get((int) (j10 - this.f9707d));
        }

        public boolean l() {
            return true;
        }
    }

    /* compiled from: SegmentBase */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f9714j;

        /* renamed from: k  reason: collision with root package name */
        final n f9715k;

        /* renamed from: l  reason: collision with root package name */
        final long f9716l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f9714j = nVar;
            this.f9715k = nVar2;
            this.f9716l = j13;
        }

        public i a(j jVar) {
            n nVar = this.f9714j;
            if (nVar == null) {
                return k.super.a(jVar);
            }
            j jVar2 = jVar.f9693b;
            return new i(nVar.a(jVar2.f8085h, 0, jVar2.f8092o, 0), 0, -1);
        }

        public long g(long j10) {
            List<d> list = this.f9709f;
            if (list != null) {
                return (long) list.size();
            }
            long j11 = this.f9716l;
            if (j11 != -1) {
                return (j11 - this.f9707d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return m6.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f9705b)), BigInteger.valueOf(this.f9708e).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
            }
            return -1;
        }

        public i k(j jVar, long j10) {
            long j11;
            List<d> list = this.f9709f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f9707d)).f9717a;
            } else {
                j11 = (j10 - this.f9707d) * this.f9708e;
            }
            long j12 = j11;
            n nVar = this.f9715k;
            j jVar2 = jVar.f9693b;
            return new i(nVar.a(jVar2.f8085h, j10, jVar2.f8092o, j12), 0, -1);
        }
    }

    /* compiled from: SegmentBase */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f9717a;

        /* renamed from: b  reason: collision with root package name */
        final long f9718b;

        public d(long j10, long j11) {
            this.f9717a = j10;
            this.f9718b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f9717a == dVar.f9717a && this.f9718b == dVar.f9718b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f9717a) * 31) + ((int) this.f9718b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f9704a = iVar;
        this.f9705b = j10;
        this.f9706c = j11;
    }

    public i a(j jVar) {
        return this.f9704a;
    }

    public long b() {
        return m0.C0(this.f9706c, 1000000, this.f9705b);
    }

    /* compiled from: SegmentBase */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f9719d;

        /* renamed from: e  reason: collision with root package name */
        final long f9720e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f9719d = j12;
            this.f9720e = j13;
        }

        public i c() {
            long j10 = this.f9720e;
            if (j10 <= 0) {
                return null;
            }
            return new i((String) null, this.f9719d, j10);
        }

        public e() {
            this((i) null, 1, 0, 0, 0);
        }
    }
}
