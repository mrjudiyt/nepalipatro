package p8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import z8.a;

/* compiled from: Maps.kt */
final class a0 implements Map, Serializable, a {

    /* renamed from: h  reason: collision with root package name */
    public static final a0 f16196h = new a0();

    private a0() {
    }

    private final Object readResolve() {
        return f16196h;
    }

    public boolean a(Void voidR) {
        m.f(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public Set<Map.Entry> c() {
        return b0.f16200h;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public Set<Object> d() {
        return b0.f16200h;
    }

    public int e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Collection f() {
        return z.f16217h;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
