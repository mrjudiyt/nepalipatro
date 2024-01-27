package z3;

import java.util.Objects;
import java.util.Set;
import z3.g;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue */
final class d extends g.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f13145a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13146b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<g.c> f13147c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue */
    static final class b extends g.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f13148a;

        /* renamed from: b  reason: collision with root package name */
        private Long f13149b;

        /* renamed from: c  reason: collision with root package name */
        private Set<g.c> f13150c;

        b() {
        }

        public g.b a() {
            String str = "";
            if (this.f13148a == null) {
                str = str + " delta";
            }
            if (this.f13149b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f13150c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new d(this.f13148a.longValue(), this.f13149b.longValue(), this.f13150c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public g.b.a b(long j10) {
            this.f13148a = Long.valueOf(j10);
            return this;
        }

        public g.b.a c(Set<g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f13150c = set;
            return this;
        }

        public g.b.a d(long j10) {
            this.f13149b = Long.valueOf(j10);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f13145a;
    }

    /* access modifiers changed from: package-private */
    public Set<g.c> c() {
        return this.f13147c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f13146b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g.b)) {
            return false;
        }
        g.b bVar = (g.b) obj;
        if (this.f13145a == bVar.b() && this.f13146b == bVar.d() && this.f13147c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13145a;
        long j11 = this.f13146b;
        return this.f13147c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f13145a + ", maxAllowedDelay=" + this.f13146b + ", flags=" + this.f13147c + "}";
    }

    private d(long j10, long j11, Set<g.c> set) {
        this.f13145a = j10;
        this.f13146b = j11;
        this.f13147c = set;
    }
}
