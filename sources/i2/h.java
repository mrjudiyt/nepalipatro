package i2;

import i2.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap */
class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f9237a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, a<K, V>> f9238b = new HashMap();

    /* compiled from: GroupedLinkedMap */
    private static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f9239a;

        /* renamed from: b  reason: collision with root package name */
        private List<V> f9240b;

        /* renamed from: c  reason: collision with root package name */
        a<K, V> f9241c;

        /* renamed from: d  reason: collision with root package name */
        a<K, V> f9242d;

        a() {
            this((Object) null);
        }

        public void a(V v10) {
            if (this.f9240b == null) {
                this.f9240b = new ArrayList();
            }
            this.f9240b.add(v10);
        }

        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f9240b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f9240b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k10) {
            this.f9242d = this;
            this.f9241c = this;
            this.f9239a = k10;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f9237a;
        aVar.f9242d = aVar2;
        aVar.f9241c = aVar2.f9241c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f9237a;
        aVar.f9242d = aVar2.f9242d;
        aVar.f9241c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f9242d;
        aVar2.f9241c = aVar.f9241c;
        aVar.f9241c.f9242d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f9241c.f9242d = aVar;
        aVar.f9242d.f9241c = aVar;
    }

    public V a(K k10) {
        a aVar = this.f9238b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            this.f9238b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a aVar = this.f9238b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            c(aVar);
            this.f9238b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a<K, V> aVar = this.f9237a.f9242d; !aVar.equals(this.f9237a); aVar = aVar.f9242d) {
            V b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f9238b.remove(aVar.f9239a);
            ((m) aVar.f9239a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a<K, V> aVar = this.f9237a.f9241c; !aVar.equals(this.f9237a); aVar = aVar.f9241c) {
            z10 = true;
            sb.append('{');
            sb.append(aVar.f9239a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z10) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
