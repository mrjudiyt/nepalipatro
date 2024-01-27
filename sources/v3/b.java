package v3;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: GlobalMetrics */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f12335b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final e f12336a;

    /* compiled from: GlobalMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f12337a = null;

        a() {
        }

        public b a() {
            return new b(this.f12337a);
        }

        public a b(e eVar) {
            this.f12337a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f12336a = eVar;
    }

    public static a b() {
        return new a();
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public e a() {
        return this.f12336a;
    }
}
