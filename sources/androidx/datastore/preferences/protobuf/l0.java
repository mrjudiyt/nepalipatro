package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
class l0 implements k0 {
    l0() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        int i11 = 0;
        if (j0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j0Var.entrySet()) {
            i11 += i0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> j0<K, V> j(Object obj, Object obj2) {
        j0<K, V> j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.i()) {
                j0Var = j0Var.m();
            }
            j0Var.l(j0Var2);
        }
        return j0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        ((j0) obj).k();
        return obj;
    }

    public i0.a<?, ?> c(Object obj) {
        return ((i0) obj).c();
    }

    public Map<?, ?> d(Object obj) {
        return (j0) obj;
    }

    public Object e(Object obj) {
        return j0.d().m();
    }

    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean g(Object obj) {
        return !((j0) obj).i();
    }

    public Map<?, ?> h(Object obj) {
        return (j0) obj;
    }
}
