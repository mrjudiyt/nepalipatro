package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class b0 extends c0 {

    /* renamed from: f  reason: collision with root package name */
    private final p0 f2712f;

    /* compiled from: LazyField */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: h  reason: collision with root package name */
        private Map.Entry<K, b0> f2713h;

        public b0 a() {
            return this.f2713h.getValue();
        }

        public K getKey() {
            return this.f2713h.getKey();
        }

        public Object getValue() {
            b0 value = this.f2713h.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof p0) {
                return this.f2713h.getValue().d((p0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, b0> entry) {
            this.f2713h = entry;
        }
    }

    /* compiled from: LazyField */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: h  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f2714h;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2714h = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2714h.next();
            return next.getValue() instanceof b0 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f2714h.hasNext();
        }

        public void remove() {
            this.f2714h.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public p0 f() {
        return c(this.f2712f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
