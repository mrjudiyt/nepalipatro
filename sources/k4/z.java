package k4;

/* compiled from: SeekPoint */
public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f9632c = new z(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f9633a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9634b;

    public z(long j10, long j11) {
        this.f9633a = j10;
        this.f9634b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f9633a == zVar.f9633a && this.f9634b == zVar.f9634b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f9633a) * 31) + ((int) this.f9634b);
    }

    public String toString() {
        long j10 = this.f9633a;
        long j11 = this.f9634b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j10);
        sb.append(", position=");
        sb.append(j11);
        sb.append("]");
        return sb.toString();
    }
}
