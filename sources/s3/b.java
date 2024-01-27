package s3;

import java.util.Map;
import java.util.Objects;
import s3.i;

/* compiled from: AutoValue_EventInternal */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f11352a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f11353b;

    /* renamed from: c  reason: collision with root package name */
    private final h f11354c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11355d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11356e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f11357f;

    /* renamed from: s3.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_EventInternal */
    static final class C0198b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11358a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f11359b;

        /* renamed from: c  reason: collision with root package name */
        private h f11360c;

        /* renamed from: d  reason: collision with root package name */
        private Long f11361d;

        /* renamed from: e  reason: collision with root package name */
        private Long f11362e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f11363f;

        C0198b() {
        }

        public i d() {
            String str = "";
            if (this.f11358a == null) {
                str = str + " transportName";
            }
            if (this.f11360c == null) {
                str = str + " encodedPayload";
            }
            if (this.f11361d == null) {
                str = str + " eventMillis";
            }
            if (this.f11362e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f11363f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f11358a, this.f11359b, this.f11360c, this.f11361d.longValue(), this.f11362e.longValue(), this.f11363f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f11363f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f11363f = map;
            return this;
        }

        public i.a g(Integer num) {
            this.f11359b = num;
            return this;
        }

        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f11360c = hVar;
            return this;
        }

        public i.a i(long j10) {
            this.f11361d = Long.valueOf(j10);
            return this;
        }

        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f11358a = str;
            return this;
        }

        public i.a k(long j10) {
            this.f11362e = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f11357f;
    }

    public Integer d() {
        return this.f11353b;
    }

    public h e() {
        return this.f11354c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f11352a.equals(iVar.j()) || ((num = this.f11353b) != null ? !num.equals(iVar.d()) : iVar.d() != null) || !this.f11354c.equals(iVar.e()) || this.f11355d != iVar.f() || this.f11356e != iVar.k() || !this.f11357f.equals(iVar.c())) {
            return false;
        }
        return true;
    }

    public long f() {
        return this.f11355d;
    }

    public int hashCode() {
        int hashCode = (this.f11352a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11353b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f11355d;
        long j11 = this.f11356e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f11354c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11357f.hashCode();
    }

    public String j() {
        return this.f11352a;
    }

    public long k() {
        return this.f11356e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f11352a + ", code=" + this.f11353b + ", encodedPayload=" + this.f11354c + ", eventMillis=" + this.f11355d + ", uptimeMillis=" + this.f11356e + ", autoMetadata=" + this.f11357f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f11352a = str;
        this.f11353b = num;
        this.f11354c = hVar;
        this.f11355d = j10;
        this.f11356e = j11;
        this.f11357f = map;
    }
}
