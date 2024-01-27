package h9;

import androidx.privacysandbox.ads.adservices.topics.d;
import d9.i;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Duration.kt */
public final class a implements Comparable<a> {

    /* renamed from: i  reason: collision with root package name */
    public static final C0251a f14840i = new C0251a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private static final long f14841j = g(0);

    /* renamed from: k  reason: collision with root package name */
    private static final long f14842k = c.e(4611686018427387903L);

    /* renamed from: l  reason: collision with root package name */
    private static final long f14843l = c.e(-4611686018427387903L);

    /* renamed from: h  reason: collision with root package name */
    private final long f14844h;

    /* renamed from: h9.a$a  reason: collision with other inner class name */
    /* compiled from: Duration.kt */
    public static final class C0251a {
        private C0251a() {
        }

        public /* synthetic */ C0251a(g gVar) {
            this();
        }
    }

    private /* synthetic */ a(long j10) {
        this.f14844h = j10;
    }

    private static final boolean A(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean B(long j10) {
        return j10 == f14842k || j10 == f14843l;
    }

    public static final boolean C(long j10) {
        return j10 < 0;
    }

    public static final boolean D(long j10) {
        return j10 > 0;
    }

    public static final long E(long j10, d dVar) {
        m.f(dVar, "unit");
        if (j10 == f14842k) {
            return Long.MAX_VALUE;
        }
        if (j10 == f14843l) {
            return Long.MIN_VALUE;
        }
        return e.a(w(j10), v(j10), dVar);
    }

    public static String F(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f14842k) {
            return "Infinity";
        }
        if (j10 == f14843l) {
            return "-Infinity";
        }
        boolean C = C(j10);
        StringBuilder sb = new StringBuilder();
        if (C) {
            sb.append('-');
        }
        long l10 = l(j10);
        long n10 = n(l10);
        int m10 = m(l10);
        int s10 = s(l10);
        int u10 = u(l10);
        int t10 = t(l10);
        int i10 = 0;
        boolean z10 = n10 != 0;
        boolean z11 = m10 != 0;
        boolean z12 = s10 != 0;
        boolean z13 = (u10 == 0 && t10 == 0) ? false : true;
        if (z10) {
            sb.append(n10);
            sb.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(m10);
            sb.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(s10);
            sb.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (u10 != 0 || z10 || z11 || z12) {
                a(j10, sb, u10, t10, 9, "s", false);
            } else if (t10 >= 1000000) {
                a(j10, sb, t10 / 1000000, t10 % 1000000, 6, "ms", false);
            } else if (t10 >= 1000) {
                a(j10, sb, t10 / 1000, t10 % 1000, 3, "us", false);
            } else {
                sb.append(t10);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (C && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        m.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final long G(long j10) {
        return c.d(-w(j10), ((int) j10) & 1);
    }

    private static final void a(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String R = q.R(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = R.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (R.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb.append(R, 0, ((i15 + 2) / 3) * 3);
                m.e(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append(R, 0, i15);
                m.e(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a d(long j10) {
        return new a(j10);
    }

    public static int f(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return m.i(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return C(j10) ? -i10 : i10;
    }

    public static long g(long j10) {
        if (b.a()) {
            if (A(j10)) {
                if (!new i(-4611686018426999999L, 4611686018426999999L).d(w(j10))) {
                    throw new AssertionError(w(j10) + " ns is out of nanoseconds range");
                }
            } else if (!new i(-4611686018427387903L, 4611686018427387903L).d(w(j10))) {
                throw new AssertionError(w(j10) + " ms is out of milliseconds range");
            } else if (new i(-4611686018426L, 4611686018426L).d(w(j10))) {
                throw new AssertionError(w(j10) + " ms is denormalized");
            }
        }
        return j10;
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).H();
    }

    public static final long l(long j10) {
        return C(j10) ? G(j10) : j10;
    }

    public static final int m(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (o(j10) % ((long) 24));
    }

    public static final long n(long j10) {
        return E(j10, d.DAYS);
    }

    public static final long o(long j10) {
        return E(j10, d.HOURS);
    }

    public static final long p(long j10) {
        return (!z(j10) || !y(j10)) ? E(j10, d.MILLISECONDS) : w(j10);
    }

    public static final long q(long j10) {
        return E(j10, d.MINUTES);
    }

    public static final long r(long j10) {
        return E(j10, d.SECONDS);
    }

    public static final int s(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (q(j10) % ((long) 60));
    }

    public static final int t(long j10) {
        long j11;
        if (B(j10)) {
            return 0;
        }
        if (z(j10)) {
            j11 = c.g(w(j10) % ((long) 1000));
        } else {
            j11 = w(j10) % ((long) 1000000000);
        }
        return (int) j11;
    }

    public static final int u(long j10) {
        if (B(j10)) {
            return 0;
        }
        return (int) (r(j10) % ((long) 60));
    }

    private static final d v(long j10) {
        return A(j10) ? d.NANOSECONDS : d.MILLISECONDS;
    }

    private static final long w(long j10) {
        return j10 >> 1;
    }

    public static int x(long j10) {
        return d.a(j10);
    }

    public static final boolean y(long j10) {
        return !B(j10);
    }

    private static final boolean z(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public final /* synthetic */ long H() {
        return this.f14844h;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return e(((a) obj).H());
    }

    public int e(long j10) {
        return f(this.f14844h, j10);
    }

    public boolean equals(Object obj) {
        return k(this.f14844h, obj);
    }

    public int hashCode() {
        return x(this.f14844h);
    }

    public String toString() {
        return F(this.f14844h);
    }
}
