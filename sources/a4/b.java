package a4;

import java.util.Objects;
import s3.i;
import s3.p;

/* compiled from: AutoValue_PersistedEvent */
final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f53a;

    /* renamed from: b  reason: collision with root package name */
    private final p f54b;

    /* renamed from: c  reason: collision with root package name */
    private final i f55c;

    b(long j10, p pVar, i iVar) {
        this.f53a = j10;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.f54b = pVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f55c = iVar;
    }

    public i b() {
        return this.f55c;
    }

    public long c() {
        return this.f53a;
    }

    public p d() {
        return this.f54b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f53a != kVar.c() || !this.f54b.equals(kVar.d()) || !this.f55c.equals(kVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f53a;
        return this.f55c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f54b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f53a + ", transportContext=" + this.f54b + ", event=" + this.f55c + "}";
    }
}
