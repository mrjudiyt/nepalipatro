package a3;

import androidx.collection.a;
import androidx.collection.h;

/* compiled from: CachedHashCodeArrayMap */
public final class b<K, V> extends a<K, V> {

    /* renamed from: p  reason: collision with root package name */
    private int f21p;

    public void clear() {
        this.f21p = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f21p == 0) {
            this.f21p = super.hashCode();
        }
        return this.f21p;
    }

    public void j(h<? extends K, ? extends V> hVar) {
        this.f21p = 0;
        super.j(hVar);
    }

    public V k(int i10) {
        this.f21p = 0;
        return super.k(i10);
    }

    public V l(int i10, V v10) {
        this.f21p = 0;
        return super.l(i10, v10);
    }

    public V put(K k10, V v10) {
        this.f21p = 0;
        return super.put(k10, v10);
    }
}
