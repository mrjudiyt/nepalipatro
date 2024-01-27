package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: Topic.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f3904a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3905b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3906c;

    public e(long j10, long j11, int i10) {
        this.f3904a = j10;
        this.f3905b = j11;
        this.f3906c = i10;
    }

    public final long a() {
        return this.f3905b;
    }

    public final long b() {
        return this.f3904a;
    }

    public final int c() {
        return this.f3906c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f3904a == eVar.f3904a && this.f3905b == eVar.f3905b && this.f3906c == eVar.f3906c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((d.a(this.f3904a) * 31) + d.a(this.f3905b)) * 31) + this.f3906c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f3904a + ", ModelVersion=" + this.f3905b + ", TopicCode=" + this.f3906c + " }");
    }
}
