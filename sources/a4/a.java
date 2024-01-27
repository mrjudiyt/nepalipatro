package a4;

import a4.e;

/* compiled from: AutoValue_EventStoreConfig */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f42b;

    /* renamed from: c  reason: collision with root package name */
    private final int f43c;

    /* renamed from: d  reason: collision with root package name */
    private final int f44d;

    /* renamed from: e  reason: collision with root package name */
    private final long f45e;

    /* renamed from: f  reason: collision with root package name */
    private final int f46f;

    /* compiled from: AutoValue_EventStoreConfig */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f47a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f48b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f49c;

        /* renamed from: d  reason: collision with root package name */
        private Long f50d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f51e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public e a() {
            String str = "";
            if (this.f47a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f48b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f49c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f50d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f51e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f47a.longValue(), this.f48b.intValue(), this.f49c.intValue(), this.f50d.longValue(), this.f51e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public e.a b(int i10) {
            this.f49c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a c(long j10) {
            this.f50d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a d(int i10) {
            this.f48b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a e(int i10) {
            this.f51e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a f(long j10) {
            this.f47a = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f44d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f45e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f43c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f46f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f42b == eVar.f() && this.f43c == eVar.d() && this.f44d == eVar.b() && this.f45e == eVar.c() && this.f46f == eVar.e()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f42b;
    }

    public int hashCode() {
        long j10 = this.f42b;
        long j11 = this.f45e;
        return this.f46f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f43c) * 1000003) ^ this.f44d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f42b + ", loadBatchSize=" + this.f43c + ", criticalSectionEnterTimeoutMs=" + this.f44d + ", eventCleanUpAge=" + this.f45e + ", maxBlobByteSizePerRow=" + this.f46f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f42b = j10;
        this.f43c = i10;
        this.f44d = i11;
        this.f45e = j11;
        this.f46f = i12;
    }
}
