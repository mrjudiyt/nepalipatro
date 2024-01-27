package a3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, Y> f31a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private final long f32b;

    /* renamed from: c  reason: collision with root package name */
    private long f33c;

    /* renamed from: d  reason: collision with root package name */
    private long f34d;

    public g(long j10) {
        this.f32b = j10;
        this.f33c = j10;
    }

    private void f() {
        m(this.f33c);
    }

    public void b() {
        m(0);
    }

    public synchronized Y g(T t10) {
        return this.f31a.get(t10);
    }

    public synchronized long h() {
        return this.f33c;
    }

    /* access modifiers changed from: protected */
    public int i(Y y10) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        long i10 = (long) i(y10);
        if (i10 >= this.f33c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f34d += i10;
        }
        Y put = this.f31a.put(t10, y10);
        if (put != null) {
            this.f34d -= (long) i(put);
            if (!put.equals(y10)) {
                j(t10, put);
            }
        }
        f();
        return put;
    }

    public synchronized Y l(T t10) {
        Y remove;
        remove = this.f31a.remove(t10);
        if (remove != null) {
            this.f34d -= (long) i(remove);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    public synchronized void m(long j10) {
        while (this.f34d > j10) {
            Iterator<Map.Entry<T, Y>> it = this.f31a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f34d -= (long) i(value);
            Object key = next.getKey();
            it.remove();
            j(key, value);
        }
    }
}
