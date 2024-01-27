package l6;

/* compiled from: Absent */
final class a<T> extends m<T> {

    /* renamed from: h  reason: collision with root package name */
    static final a<Object> f15590h = new a<>();

    private a() {
    }

    static <T> m<T> e() {
        return f15590h;
    }

    private Object readResolve() {
        return f15590h;
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
