package i2;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool */
public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h<a, Object> f9243a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    private final b f9244b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f9245c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f9246d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f9247e;

    /* renamed from: f  reason: collision with root package name */
    private int f9248f;

    /* compiled from: LruArrayPool */
    private static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final b f9249a;

        /* renamed from: b  reason: collision with root package name */
        int f9250b;

        /* renamed from: c  reason: collision with root package name */
        private Class<?> f9251c;

        a(b bVar) {
            this.f9249a = bVar;
        }

        public void a() {
            this.f9249a.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Class<?> cls) {
            this.f9250b = i10;
            this.f9251c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9250b == aVar.f9250b && this.f9251c == aVar.f9251c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f9250b * 31;
            Class<?> cls = this.f9251c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f9250b + "array=" + this.f9251c + '}';
        }
    }

    /* compiled from: LruArrayPool */
    private static final class b extends d<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i10, Class<?> cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public j(int i10) {
        this.f9247e = i10;
    }

    private void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> m10 = m(cls);
        Integer num = (Integer) m10.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        } else if (num.intValue() == 1) {
            m10.remove(Integer.valueOf(i10));
        } else {
            m10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
        }
    }

    private void g() {
        h(this.f9247e);
    }

    private void h(int i10) {
        while (this.f9248f > i10) {
            Object f10 = this.f9243a.f();
            a3.j.d(f10);
            a i11 = i(f10);
            this.f9248f -= i11.c(f10) * i11.b();
            f(i11.c(f10), f10.getClass());
            if (Log.isLoggable(i11.a(), 2)) {
                i11.a();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(i11.c(f10));
            }
        }
    }

    private <T> a<T> i(T t10) {
        return j(t10.getClass());
    }

    private <T> a<T> j(Class<T> cls) {
        a<T> aVar = this.f9246d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else if (cls.equals(byte[].class)) {
                aVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f9246d.put(cls, aVar);
        }
        return aVar;
    }

    private <T> T k(a aVar) {
        return this.f9243a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        a<T> j10 = j(cls);
        T k10 = k(aVar);
        if (k10 != null) {
            this.f9248f -= j10.c(k10) * j10.b();
            f(j10.c(k10), cls);
        }
        if (k10 != null) {
            return k10;
        }
        if (Log.isLoggable(j10.a(), 2)) {
            j10.a();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f9250b);
            sb.append(" bytes");
        }
        return j10.newArray(aVar.f9250b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f9245c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f9245c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i10 = this.f9248f;
        return i10 == 0 || this.f9247e / i10 >= 2;
    }

    private boolean o(int i10) {
        return i10 <= this.f9247e / 2;
    }

    private boolean p(int i10, Integer num) {
        return num != null && (n() || num.intValue() <= i10 * 8);
    }

    public synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i10 >= 20 || i10 == 15) {
            h(this.f9247e / 2);
        }
    }

    public synchronized void b() {
        h(0);
    }

    public synchronized <T> T c(int i10, Class<T> cls) {
        return l(this.f9244b.e(i10, cls), cls);
    }

    public synchronized <T> void d(T t10) {
        Class<?> cls = t10.getClass();
        a<?> j10 = j(cls);
        int c10 = j10.c(t10);
        int b10 = j10.b() * c10;
        if (o(b10)) {
            a e10 = this.f9244b.e(c10, cls);
            this.f9243a.d(e10, t10);
            NavigableMap<Integer, Integer> m10 = m(cls);
            Integer num = (Integer) m10.get(Integer.valueOf(e10.f9250b));
            Integer valueOf = Integer.valueOf(e10.f9250b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            m10.put(valueOf, Integer.valueOf(i10));
            this.f9248f += b10;
            g();
        }
    }

    public synchronized <T> T e(int i10, Class<T> cls) {
        a aVar;
        Integer ceilingKey = m(cls).ceilingKey(Integer.valueOf(i10));
        if (p(i10, ceilingKey)) {
            aVar = this.f9244b.e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f9244b.e(i10, cls);
        }
        return l(aVar, cls);
    }
}
