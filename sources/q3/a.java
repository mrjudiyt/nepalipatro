package q3;

import java.util.Objects;

/* compiled from: AutoValue_Event */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f10676a;

    /* renamed from: b  reason: collision with root package name */
    private final T f10677b;

    /* renamed from: c  reason: collision with root package name */
    private final d f10678c;

    a(Integer num, T t10, d dVar) {
        this.f10676a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f10677b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f10678c = dVar;
    }

    public Integer a() {
        return this.f10676a;
    }

    public T b() {
        return this.f10677b;
    }

    public d c() {
        return this.f10678c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f10676a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (!this.f10677b.equals(cVar.b()) || !this.f10678c.equals(cVar.c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f10676a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10677b.hashCode()) * 1000003) ^ this.f10678c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f10676a + ", payload=" + this.f10677b + ", priority=" + this.f10678c + "}";
    }
}
