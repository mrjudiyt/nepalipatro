package h5;

import a6.m0;
import android.net.Uri;
import b6.y;
import e4.b;
import java.util.Arrays;

/* compiled from: AdPlaybackState */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8986g = new a((Object) null, new C0145a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h  reason: collision with root package name */
    private static final C0145a f8987h = new C0145a(0).g(0);

    /* renamed from: i  reason: collision with root package name */
    public static final b<a> f8988i = y.f5134a;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8989a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8990b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8991c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8992d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8993e;

    /* renamed from: f  reason: collision with root package name */
    private final C0145a[] f8994f;

    /* renamed from: h5.a$a  reason: collision with other inner class name */
    /* compiled from: AdPlaybackState */
    public static final class C0145a {

        /* renamed from: h  reason: collision with root package name */
        public static final b<C0145a> f8995h = y.f5134a;

        /* renamed from: a  reason: collision with root package name */
        public final long f8996a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8997b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri[] f8998c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f8999d;

        /* renamed from: e  reason: collision with root package name */
        public final long[] f9000e;

        /* renamed from: f  reason: collision with root package name */
        public final long f9001f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f9002g;

        public C0145a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0, false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f8999d;
                if (i11 >= iArr.length || this.f9002g || iArr[i11] == 0 || iArr[i11] == 1) {
                    return i11;
                }
                i11++;
            }
            return i11;
        }

        public boolean e() {
            if (this.f8997b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f8997b; i10++) {
                int[] iArr = this.f8999d;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0145a.class != obj.getClass()) {
                return false;
            }
            C0145a aVar = (C0145a) obj;
            if (this.f8996a == aVar.f8996a && this.f8997b == aVar.f8997b && Arrays.equals(this.f8998c, aVar.f8998c) && Arrays.equals(this.f8999d, aVar.f8999d) && Arrays.equals(this.f9000e, aVar.f9000e) && this.f9001f == aVar.f9001f && this.f9002g == aVar.f9002g) {
                return true;
            }
            return false;
        }

        public boolean f() {
            return this.f8997b == -1 || c() < this.f8997b;
        }

        public C0145a g(int i10) {
            int[] b10 = b(this.f8999d, i10);
            long[] a10 = a(this.f9000e, i10);
            return new C0145a(this.f8996a, i10, b10, (Uri[]) Arrays.copyOf(this.f8998c, i10), a10, this.f9001f, this.f9002g);
        }

        public int hashCode() {
            long j10 = this.f8996a;
            long j11 = this.f9001f;
            return (((((((((((this.f8997b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f8998c)) * 31) + Arrays.hashCode(this.f8999d)) * 31) + Arrays.hashCode(this.f9000e)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f9002g ? 1 : 0);
        }

        private C0145a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            a6.a.a(iArr.length == uriArr.length);
            this.f8996a = j10;
            this.f8997b = i10;
            this.f8999d = iArr;
            this.f8998c = uriArr;
            this.f9000e = jArr;
            this.f9001f = j11;
            this.f9002g = z10;
        }
    }

    private a(Object obj, C0145a[] aVarArr, long j10, long j11, int i10) {
        this.f8989a = obj;
        this.f8991c = j10;
        this.f8992d = j11;
        this.f8990b = aVarArr.length + i10;
        this.f8994f = aVarArr;
        this.f8993e = i10;
    }

    private boolean d(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = a(i10).f8996a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public C0145a a(int i10) {
        int i11 = this.f8993e;
        if (i10 < i11) {
            return f8987h;
        }
        return this.f8994f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f8993e;
        while (i10 < this.f8990b && ((a(i10).f8996a != Long.MIN_VALUE && a(i10).f8996a <= j10) || !a(i10).f())) {
            i10++;
        }
        if (i10 < this.f8990b) {
            return i10;
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f8990b - 1;
        while (i10 >= 0 && d(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !a(i10).e()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (m0.c(this.f8989a, aVar.f8989a) && this.f8990b == aVar.f8990b && this.f8991c == aVar.f8991c && this.f8992d == aVar.f8992d && this.f8993e == aVar.f8993e && Arrays.equals(this.f8994f, aVar.f8994f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f8990b * 31;
        Object obj = this.f8989a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f8991c)) * 31) + ((int) this.f8992d)) * 31) + this.f8993e) * 31) + Arrays.hashCode(this.f8994f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f8989a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f8991c);
        sb.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f8994f.length; i10++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f8994f[i10].f8996a);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < this.f8994f[i10].f8999d.length; i11++) {
                sb.append("ad(state=");
                int i12 = this.f8994f[i10].f8999d[i11];
                if (i12 == 0) {
                    sb.append('_');
                } else if (i12 == 1) {
                    sb.append('R');
                } else if (i12 == 2) {
                    sb.append('S');
                } else if (i12 == 3) {
                    sb.append('P');
                } else if (i12 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f8994f[i10].f9000e[i11]);
                sb.append(')');
                if (i11 < this.f8994f[i10].f8999d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < this.f8994f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
