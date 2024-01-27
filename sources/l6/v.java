package l6;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: Suppliers */
public final class v {

    /* compiled from: Suppliers */
    static class a<T> implements u<T>, Serializable {

        /* renamed from: h  reason: collision with root package name */
        final u<T> f15633h;

        /* renamed from: i  reason: collision with root package name */
        volatile transient boolean f15634i;

        /* renamed from: j  reason: collision with root package name */
        transient T f15635j;

        a(u<T> uVar) {
            this.f15633h = (u) p.j(uVar);
        }

        public T get() {
            if (!this.f15634i) {
                synchronized (this) {
                    if (!this.f15634i) {
                        T t10 = this.f15633h.get();
                        this.f15635j = t10;
                        this.f15634i = true;
                        return t10;
                    }
                }
            }
            return k.a(this.f15635j);
        }

        public String toString() {
            Object obj;
            if (this.f15634i) {
                String valueOf = String.valueOf(this.f15635j);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f15633h;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers */
    static class b<T> implements u<T> {

        /* renamed from: h  reason: collision with root package name */
        volatile u<T> f15636h;

        /* renamed from: i  reason: collision with root package name */
        volatile boolean f15637i;

        /* renamed from: j  reason: collision with root package name */
        T f15638j;

        b(u<T> uVar) {
            this.f15636h = (u) p.j(uVar);
        }

        public T get() {
            if (!this.f15637i) {
                synchronized (this) {
                    if (!this.f15637i) {
                        u<T> uVar = this.f15636h;
                        Objects.requireNonNull(uVar);
                        T t10 = uVar.get();
                        this.f15638j = t10;
                        this.f15637i = true;
                        this.f15636h = null;
                        return t10;
                    }
                }
            }
            return k.a(this.f15638j);
        }

        public String toString() {
            Object obj = this.f15636h;
            if (obj == null) {
                String valueOf = String.valueOf(this.f15638j);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* compiled from: Suppliers */
    private static class c<T> implements u<T>, Serializable {

        /* renamed from: h  reason: collision with root package name */
        final T f15639h;

        c(T t10) {
            this.f15639h = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return l.a(this.f15639h, ((c) obj).f15639h);
            }
            return false;
        }

        public T get() {
            return this.f15639h;
        }

        public int hashCode() {
            return l.b(this.f15639h);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f15639h);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> u<T> a(u<T> uVar) {
        if ((uVar instanceof b) || (uVar instanceof a)) {
            return uVar;
        }
        if (uVar instanceof Serializable) {
            return new a(uVar);
        }
        return new b(uVar);
    }

    public static <T> u<T> b(T t10) {
        return new c(t10);
    }
}
