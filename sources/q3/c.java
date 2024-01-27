package q3;

import com.google.auto.value.AutoValue;

@AutoValue
/* compiled from: Event */
public abstract class c<T> {
    public static <T> c<T> d(T t10) {
        return new a((Integer) null, t10, d.DEFAULT);
    }

    public static <T> c<T> e(T t10) {
        return new a((Integer) null, t10, d.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
