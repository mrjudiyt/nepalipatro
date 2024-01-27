package v3;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LogSourceMetrics */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f12352c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f12353a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f12354b;

    /* compiled from: LogSourceMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f12355a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f12356b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f12355a, Collections.unmodifiableList(this.f12356b));
        }

        public a b(List<c> list) {
            this.f12356b = list;
            return this;
        }

        public a c(String str) {
            this.f12355a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f12353a = str;
        this.f12354b = list;
    }

    public static a c() {
        return new a();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<c> a() {
        return this.f12354b;
    }

    @Protobuf(tag = 1)
    public String b() {
        return this.f12353a;
    }
}
