package com.google.common.collect;

import com.google.common.collect.a0;
import com.google.common.collect.b0;
import com.google.common.collect.d0;
import com.google.common.collect.d1;
import com.google.common.collect.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: ImmutableSetMultimap */
public class c0<K, V> extends a0<K, V> {

    /* renamed from: m  reason: collision with root package name */
    private final transient b0<V> f13517m;

    /* compiled from: ImmutableSetMultimap */
    public static final class a<K, V> extends a0.b<K, V> {
        /* access modifiers changed from: package-private */
        public Collection<V> b() {
            return w0.c();
        }

        public c0<K, V> e() {
            Collection entrySet = this.f13496a.entrySet();
            Comparator comparator = this.f13497b;
            if (comparator != null) {
                entrySet = v0.a(comparator).d().b(entrySet);
            }
            return c0.m(entrySet, this.f13498c);
        }

        /* renamed from: f */
        public a<K, V> c(K k10, Iterable<? extends V> iterable) {
            super.c(k10, iterable);
            return this;
        }
    }

    /* compiled from: ImmutableSetMultimap */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final d1.b<c0> f13518a = d1.a(c0.class, "emptySet");
    }

    c0(z<K, b0<V>> zVar, int i10, Comparator<? super V> comparator) {
        super(zVar, i10);
        this.f13517m = l(comparator);
    }

    private static <V> b0<V> l(Comparator<? super V> comparator) {
        if (comparator == null) {
            return b0.s();
        }
        return d0.G(comparator);
    }

    static <K, V> c0<K, V> m(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return n();
        }
        z.a aVar = new z.a(collection.size());
        int i10 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            b0<V> p10 = p(comparator, (Collection) entry.getValue());
            if (!p10.isEmpty()) {
                aVar.f(key, p10);
                i10 += p10.size();
            }
        }
        return new c0<>(aVar.c(), i10, comparator);
    }

    public static <K, V> c0<K, V> n() {
        return q.f13690n;
    }

    private static <V> b0<V> p(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return b0.n(collection);
        }
        return d0.B(comparator, collection);
    }

    private static <V> b0.a<V> q(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new b0.a<>();
        }
        return new d0.a(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            z.a a10 = z.a();
            int i10 = 0;
            int i11 = 0;
            while (i10 < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    b0.a q10 = q(comparator);
                    for (int i12 = 0; i12 < readInt2; i12++) {
                        q10.f(objectInputStream.readObject());
                    }
                    b0 i13 = q10.i();
                    if (i13.size() == readInt2) {
                        a10.f(readObject, i13);
                        i11 += readInt2;
                        i10++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                a0.c.f13499a.b(this, a10.c());
                a0.c.f13500b.a(this, i11);
                b.f13518a.b(this, l(comparator));
            } catch (IllegalArgumentException e10) {
                throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
            }
        } else {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(o());
        d1.b(this, objectOutputStream);
    }

    /* access modifiers changed from: package-private */
    public Comparator<? super V> o() {
        b0<V> b0Var = this.f13517m;
        if (b0Var instanceof d0) {
            return ((d0) b0Var).comparator();
        }
        return null;
    }
}
