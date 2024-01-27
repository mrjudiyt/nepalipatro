package com.google.common.collect;

import com.google.common.collect.a0;
import com.google.common.collect.x;
import com.google.common.collect.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: ImmutableListMultimap */
public class y<K, V> extends a0<K, V> implements h0<K, V> {

    /* compiled from: ImmutableListMultimap */
    public static final class a<K, V> extends a0.b<K, V> {
        public y<K, V> e() {
            return (y) super.a();
        }

        /* renamed from: f */
        public a<K, V> c(K k10, Iterable<? extends V> iterable) {
            super.c(k10, iterable);
            return this;
        }

        public a<K, V> g(K k10, V... vArr) {
            super.d(k10, vArr);
            return this;
        }
    }

    y(z<K, x<V>> zVar, int i10) {
        super(zVar, i10);
    }

    public static <K, V> a<K, V> l() {
        return new a<>();
    }

    static <K, V> y<K, V> m(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        x<E> xVar;
        if (collection.isEmpty()) {
            return o();
        }
        z.a aVar = new z.a(collection.size());
        int i10 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                xVar = x.n(collection2);
            } else {
                xVar = x.B(comparator, collection2);
            }
            if (!xVar.isEmpty()) {
                aVar.f(key, xVar);
                i10 += xVar.size();
            }
        }
        return new y<>(aVar.c(), i10);
    }

    public static <K, V> y<K, V> o() {
        return p.f13685m;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            z.a a10 = z.a();
            int i10 = 0;
            int i11 = 0;
            while (i10 < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    x.a l10 = x.l();
                    for (int i12 = 0; i12 < readInt2; i12++) {
                        l10.f(objectInputStream.readObject());
                    }
                    a10.f(readObject, l10.h());
                    i11 += readInt2;
                    i10++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                a0.c.f13499a.b(this, a10.c());
                a0.c.f13500b.a(this, i11);
            } catch (IllegalArgumentException e10) {
                throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        d1.b(this, objectOutputStream);
    }

    public x<V> n(K k10) {
        x<V> xVar = (x) this.f13491k.get(k10);
        return xVar == null ? x.s() : xVar;
    }
}
