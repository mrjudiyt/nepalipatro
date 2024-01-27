package v3;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.m;

/* compiled from: ClientMetrics */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f12326e = new C0203a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f12327a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f12328b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12329c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12330d;

    /* renamed from: v3.a$a  reason: collision with other inner class name */
    /* compiled from: ClientMetrics */
    public static final class C0203a {

        /* renamed from: a  reason: collision with root package name */
        private f f12331a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f12332b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f12333c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f12334d = "";

        C0203a() {
        }

        public C0203a a(d dVar) {
            this.f12332b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f12331a, Collections.unmodifiableList(this.f12332b), this.f12333c, this.f12334d);
        }

        public C0203a c(String str) {
            this.f12334d = str;
            return this;
        }

        public C0203a d(b bVar) {
            this.f12333c = bVar;
            return this;
        }

        public C0203a e(f fVar) {
            this.f12331a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f12327a = fVar;
        this.f12328b = list;
        this.f12329c = bVar;
        this.f12330d = str;
    }

    public static C0203a e() {
        return new C0203a();
    }

    @Protobuf(tag = 4)
    public String a() {
        return this.f12330d;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public b b() {
        return this.f12329c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<d> c() {
        return this.f12328b;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public f d() {
        return this.f12327a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
