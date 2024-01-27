package b6;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private a f5032a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f5033b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f5034c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5035d;

    /* renamed from: e  reason: collision with root package name */
    private long f5036e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f5037f;

    /* compiled from: FixedFrameRateEstimator */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f5038a;

        /* renamed from: b  reason: collision with root package name */
        private long f5039b;

        /* renamed from: c  reason: collision with root package name */
        private long f5040c;

        /* renamed from: d  reason: collision with root package name */
        private long f5041d;

        /* renamed from: e  reason: collision with root package name */
        private long f5042e;

        /* renamed from: f  reason: collision with root package name */
        private long f5043f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f5044g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f5045h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f5042e;
            if (j10 == 0) {
                return 0;
            }
            return this.f5043f / j10;
        }

        public long b() {
            return this.f5043f;
        }

        public boolean d() {
            long j10 = this.f5041d;
            if (j10 == 0) {
                return false;
            }
            return this.f5044g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f5041d > 15 && this.f5045h == 0;
        }

        public void f(long j10) {
            long j11 = this.f5041d;
            if (j11 == 0) {
                this.f5038a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f5038a;
                this.f5039b = j12;
                this.f5043f = j12;
                this.f5042e = 1;
            } else {
                long j13 = j10 - this.f5040c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f5039b) <= 1000000) {
                    this.f5042e++;
                    this.f5043f += j13;
                    boolean[] zArr = this.f5044g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f5045h--;
                    }
                } else {
                    boolean[] zArr2 = this.f5044g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f5045h++;
                    }
                }
            }
            this.f5041d++;
            this.f5040c = j10;
        }

        public void g() {
            this.f5041d = 0;
            this.f5042e = 0;
            this.f5043f = 0;
            this.f5045h = 0;
            Arrays.fill(this.f5044g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f5032a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f5032a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f5037f;
    }

    public long d() {
        if (e()) {
            return this.f5032a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f5032a.e();
    }

    public void f(long j10) {
        this.f5032a.f(j10);
        int i10 = 0;
        if (this.f5032a.e() && !this.f5035d) {
            this.f5034c = false;
        } else if (this.f5036e != -9223372036854775807L) {
            if (!this.f5034c || this.f5033b.d()) {
                this.f5033b.g();
                this.f5033b.f(this.f5036e);
            }
            this.f5034c = true;
            this.f5033b.f(j10);
        }
        if (this.f5034c && this.f5033b.e()) {
            a aVar = this.f5032a;
            this.f5032a = this.f5033b;
            this.f5033b = aVar;
            this.f5034c = false;
            this.f5035d = false;
        }
        this.f5036e = j10;
        if (!this.f5032a.e()) {
            i10 = this.f5037f + 1;
        }
        this.f5037f = i10;
    }

    public void g() {
        this.f5032a.g();
        this.f5033b.g();
        this.f5034c = false;
        this.f5036e = -9223372036854775807L;
        this.f5037f = 0;
    }
}
