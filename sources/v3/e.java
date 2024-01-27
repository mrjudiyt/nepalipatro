package v3;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: StorageMetrics */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f12357c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12358a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12359b;

    /* compiled from: StorageMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12360a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f12361b = 0;

        a() {
        }

        public e a() {
            return new e(this.f12360a, this.f12361b);
        }

        public a b(long j10) {
            this.f12360a = j10;
            return this;
        }

        public a c(long j10) {
            this.f12361b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f12358a = j10;
        this.f12359b = j11;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.f12358a;
    }

    @Protobuf(tag = 2)
    public long b() {
        return this.f12359b;
    }
}
