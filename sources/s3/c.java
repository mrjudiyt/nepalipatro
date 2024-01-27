package s3;

import java.util.Objects;
import q3.e;
import s3.o;

/* compiled from: AutoValue_SendRequest */
final class c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f11364a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11365b;

    /* renamed from: c  reason: collision with root package name */
    private final q3.c<?> f11366c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f11367d;

    /* renamed from: e  reason: collision with root package name */
    private final q3.b f11368e;

    /* compiled from: AutoValue_SendRequest */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f11369a;

        /* renamed from: b  reason: collision with root package name */
        private String f11370b;

        /* renamed from: c  reason: collision with root package name */
        private q3.c<?> f11371c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f11372d;

        /* renamed from: e  reason: collision with root package name */
        private q3.b f11373e;

        b() {
        }

        public o a() {
            String str = "";
            if (this.f11369a == null) {
                str = str + " transportContext";
            }
            if (this.f11370b == null) {
                str = str + " transportName";
            }
            if (this.f11371c == null) {
                str = str + " event";
            }
            if (this.f11372d == null) {
                str = str + " transformer";
            }
            if (this.f11373e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f11369a, this.f11370b, this.f11371c, this.f11372d, this.f11373e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public o.a b(q3.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f11373e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a c(q3.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f11371c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public o.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f11372d = eVar;
            return this;
        }

        public o.a e(p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.f11369a = pVar;
            return this;
        }

        public o.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f11370b = str;
            return this;
        }
    }

    public q3.b b() {
        return this.f11368e;
    }

    /* access modifiers changed from: package-private */
    public q3.c<?> c() {
        return this.f11366c;
    }

    /* access modifiers changed from: package-private */
    public e<?, byte[]> e() {
        return this.f11367d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f11364a.equals(oVar.f()) || !this.f11365b.equals(oVar.g()) || !this.f11366c.equals(oVar.c()) || !this.f11367d.equals(oVar.e()) || !this.f11368e.equals(oVar.b())) {
            return false;
        }
        return true;
    }

    public p f() {
        return this.f11364a;
    }

    public String g() {
        return this.f11365b;
    }

    public int hashCode() {
        return ((((((((this.f11364a.hashCode() ^ 1000003) * 1000003) ^ this.f11365b.hashCode()) * 1000003) ^ this.f11366c.hashCode()) * 1000003) ^ this.f11367d.hashCode()) * 1000003) ^ this.f11368e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f11364a + ", transportName=" + this.f11365b + ", event=" + this.f11366c + ", transformer=" + this.f11367d + ", encoding=" + this.f11368e + "}";
    }

    private c(p pVar, String str, q3.c<?> cVar, e<?, byte[]> eVar, q3.b bVar) {
        this.f11364a = pVar;
        this.f11365b = str;
        this.f11366c = cVar;
        this.f11367d = eVar;
        this.f11368e = bVar;
    }
}
