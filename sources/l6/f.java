package l6;

import java.io.Serializable;

/* compiled from: Equivalence */
public abstract class f<T> {

    /* compiled from: Equivalence */
    static final class a extends f<Object> implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        static final a f15608h = new a();

        a() {
        }

        private Object readResolve() {
            return f15608h;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence */
    static final class b extends f<Object> implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        static final b f15609h = new b();

        b() {
        }

        private Object readResolve() {
            return f15609h;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected f() {
    }

    public static f<Object> c() {
        return a.f15608h;
    }

    public static f<Object> f() {
        return b.f15609h;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(T t10, T t11);

    /* access modifiers changed from: protected */
    public abstract int b(T t10);

    public final boolean d(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final int e(T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }
}
