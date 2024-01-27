package v3;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: LogEventDropped */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f12338c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12339a;

    /* renamed from: b  reason: collision with root package name */
    private final b f12340b;

    /* compiled from: LogEventDropped */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12341a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f12342b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f12341a, this.f12342b);
        }

        public a b(long j10) {
            this.f12341a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f12342b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped */
    public enum b implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: h  reason: collision with root package name */
        private final int f12351h;

        private b(int i10) {
            this.f12351h = i10;
        }

        public int getNumber() {
            return this.f12351h;
        }
    }

    c(long j10, b bVar) {
        this.f12339a = j10;
        this.f12340b = bVar;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.f12339a;
    }

    @Protobuf(tag = 3)
    public b b() {
        return this.f12340b;
    }
}
