package o8;

import java.io.Serializable;

/* compiled from: Lazy.kt */
public final class d<T> implements g<T>, Serializable {

    /* renamed from: h  reason: collision with root package name */
    private final T f16173h;

    public d(T t10) {
        this.f16173h = t10;
    }

    public T getValue() {
        return this.f16173h;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
