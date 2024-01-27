package r3;

/* compiled from: AutoValue_LogResponse */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f10962a;

    h(long j10) {
        this.f10962a = j10;
    }

    public long c() {
        return this.f10962a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n) || this.f10962a != ((n) obj).c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f10962a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f10962a + "}";
    }
}
