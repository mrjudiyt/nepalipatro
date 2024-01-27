package v3;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: TimeWindow */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f12362c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12363a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12364b;

    /* compiled from: TimeWindow */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12365a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f12366b = 0;

        a() {
        }

        public f a() {
            return new f(this.f12365a, this.f12366b);
        }

        public a b(long j10) {
            this.f12366b = j10;
            return this;
        }

        public a c(long j10) {
            this.f12365a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f12363a = j10;
        this.f12364b = j11;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 2)
    public long a() {
        return this.f12364b;
    }

    @Protobuf(tag = 1)
    public long b() {
        return this.f12363a;
    }
}
