package t3;

import java.util.Objects;
import t3.g;

/* compiled from: AutoValue_BackendResponse */
final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f11637a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11638b;

    b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f11637a = aVar;
        this.f11638b = j10;
    }

    public long b() {
        return this.f11638b;
    }

    public g.a c() {
        return this.f11637a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f11637a.equals(gVar.c()) || this.f11638b != gVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f11638b;
        return ((this.f11637a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f11637a + ", nextRequestWaitMillis=" + this.f11638b + "}";
    }
}
