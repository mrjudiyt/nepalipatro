package l6;

import java.io.Serializable;

/* compiled from: Optional */
public abstract class m<T> implements Serializable {
    m() {
    }

    public static <T> m<T> a() {
        return a.e();
    }

    public static <T> m<T> d(T t10) {
        return new r(p.j(t10));
    }

    public abstract T b();

    public abstract boolean c();
}
