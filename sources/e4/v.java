package e4;

import a6.a;
import a6.m0;

/* compiled from: SeekParameters */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f8139c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f8140d = new v(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final v f8141e = new v(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final v f8142f = new v(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final v f8143g;

    /* renamed from: a  reason: collision with root package name */
    public final long f8144a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8145b;

    static {
        v vVar = new v(0, 0);
        f8139c = vVar;
        f8143g = vVar;
    }

    public v(long j10, long j11) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 < 0 ? false : z10);
        this.f8144a = j10;
        this.f8145b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f8144a;
        if (j13 == 0 && this.f8145b == 0) {
            return j10;
        }
        long H0 = m0.H0(j10, j13, Long.MIN_VALUE);
        long b10 = m0.b(j10, this.f8145b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = H0 <= j11 && j11 <= b10;
        if (H0 > j12 || j12 > b10) {
            z10 = false;
        }
        if (z11 && z10) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z11) {
            return j11;
        }
        return z10 ? j12 : H0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f8144a == vVar.f8144a && this.f8145b == vVar.f8145b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f8144a) * 31) + ((int) this.f8145b);
    }
}
