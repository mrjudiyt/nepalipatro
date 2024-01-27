package u6;

import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import r6.f;
import r6.l;
import r6.o;
import r6.s;
import r6.t;
import t6.c;
import t6.i;
import y6.b;

/* compiled from: MapTypeAdapterFactory */
public final class g implements t {

    /* renamed from: h  reason: collision with root package name */
    private final c f16626h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f16627i;

    /* compiled from: MapTypeAdapterFactory */
    private final class a<K, V> extends s<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final s<K> f16628a;

        /* renamed from: b  reason: collision with root package name */
        private final s<V> f16629b;

        /* renamed from: c  reason: collision with root package name */
        private final i<? extends Map<K, V>> f16630c;

        public a(f fVar, Type type, s<K> sVar, Type type2, s<V> sVar2, i<? extends Map<K, V>> iVar) {
            this.f16628a = new m(fVar, sVar, type);
            this.f16629b = new m(fVar, sVar2, type2);
            this.f16630c = iVar;
        }

        private String e(l lVar) {
            if (lVar.g()) {
                o c10 = lVar.c();
                if (c10.t()) {
                    return String.valueOf(c10.o());
                }
                if (c10.r()) {
                    return Boolean.toString(c10.i());
                }
                if (c10.v()) {
                    return c10.p();
                }
                throw new AssertionError();
            } else if (lVar.e()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map<K, V> b(y6.a aVar) {
            b I0 = aVar.I0();
            if (I0 == b.NULL) {
                aVar.s0();
                return null;
            }
            Map<K, V> map = (Map) this.f16630c.a();
            if (I0 == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.L()) {
                    aVar.a();
                    K b10 = this.f16628a.b(aVar);
                    if (map.put(b10, this.f16629b.b(aVar)) == null) {
                        aVar.w();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b10);
                    }
                }
                aVar.w();
            } else {
                aVar.h();
                while (aVar.L()) {
                    t6.f.f16522a.a(aVar);
                    K b11 = this.f16628a.b(aVar);
                    if (map.put(b11, this.f16629b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b11);
                    }
                }
                aVar.E();
            }
            return map;
        }

        /* renamed from: g */
        public void d(y6.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.g0();
            } else if (!g.this.f16627i) {
                cVar.q();
                for (Map.Entry next : map.entrySet()) {
                    cVar.Y(String.valueOf(next.getKey()));
                    this.f16629b.d(cVar, next.getValue());
                }
                cVar.E();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry next2 : map.entrySet()) {
                    l c10 = this.f16628a.c(next2.getKey());
                    arrayList.add(c10);
                    arrayList2.add(next2.getValue());
                    z10 |= c10.d() || c10.f();
                }
                if (z10) {
                    cVar.j();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.j();
                        t6.l.b((l) arrayList.get(i10), cVar);
                        this.f16629b.d(cVar, arrayList2.get(i10));
                        cVar.w();
                        i10++;
                    }
                    cVar.w();
                    return;
                }
                cVar.q();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.Y(e((l) arrayList.get(i10)));
                    this.f16629b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.E();
            }
        }
    }

    public g(c cVar, boolean z10) {
        this.f16626h = cVar;
        this.f16627i = z10;
    }

    private s<?> b(f fVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return n.f16672f;
        }
        return fVar.l(x6.a.b(type));
    }

    public <T> s<T> a(f fVar, x6.a<T> aVar) {
        Type e10 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j10 = t6.b.j(e10, t6.b.k(e10));
        return new a(fVar, j10[0], b(fVar, j10[0]), j10[1], fVar.l(x6.a.b(j10[1])), this.f16626h.a(aVar));
    }
}
