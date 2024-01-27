package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l6.p;
import l6.u;

/* compiled from: Multimaps */
public final class q0 {

    /* compiled from: Multimaps */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: m  reason: collision with root package name */
        transient u<? extends List<V>> f13691m;

        a(Map<K, Collection<V>> map, u<? extends List<V>> uVar) {
            super(map);
            this.f13691m = (u) p.j(uVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f13691m = (u) objectInputStream.readObject();
            v((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f13691m);
            objectOutputStream.writeObject(o());
        }

        /* access modifiers changed from: package-private */
        public Map<K, Collection<V>> c() {
            return r();
        }

        /* access modifiers changed from: package-private */
        public Set<K> d() {
            return s();
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public List<V> p() {
            return (List) this.f13691m.get();
        }
    }

    static boolean a(n0<?, ?> n0Var, Object obj) {
        if (obj == n0Var) {
            return true;
        }
        if (obj instanceof n0) {
            return n0Var.a().equals(((n0) obj).a());
        }
        return false;
    }

    public static <K, V> h0<K, V> b(Map<K, Collection<V>> map, u<? extends List<V>> uVar) {
        return new a(map, uVar);
    }
}
