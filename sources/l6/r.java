package l6;

/* compiled from: Present */
final class r<T> extends m<T> {

    /* renamed from: h  reason: collision with root package name */
    private final T f15621h;

    r(T t10) {
        this.f15621h = t10;
    }

    public T b() {
        return this.f15621h;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f15621h.equals(((r) obj).f15621h);
        }
        return false;
    }

    public int hashCode() {
        return this.f15621h.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15621h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
