package com.google.common.collect;

import com.facebook.internal.NativeProtocol;
import com.google.common.collect.k0.i;
import com.google.common.collect.k0.n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: MapMakerInternalMap */
class k0<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: q  reason: collision with root package name */
    static final b0<Object, Object, e> f13606q = new a();

    /* renamed from: h  reason: collision with root package name */
    final transient int f13607h;

    /* renamed from: i  reason: collision with root package name */
    final transient int f13608i;

    /* renamed from: j  reason: collision with root package name */
    final transient n<K, V, E, S>[] f13609j;

    /* renamed from: k  reason: collision with root package name */
    final int f13610k;

    /* renamed from: l  reason: collision with root package name */
    final l6.f<Object> f13611l;

    /* renamed from: m  reason: collision with root package name */
    final transient j<K, V, E, S> f13612m;

    /* renamed from: n  reason: collision with root package name */
    transient Set<K> f13613n;

    /* renamed from: o  reason: collision with root package name */
    transient Collection<V> f13614o;

    /* renamed from: p  reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f13615p;

    /* compiled from: MapMakerInternalMap */
    class a implements b0<Object, Object, e> {
        a() {
        }

        /* renamed from: c */
        public b0<Object, Object, e> b(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }

        public void clear() {
        }

        /* renamed from: d */
        public e a() {
            return null;
        }

        public Object get() {
            return null;
        }
    }

    /* compiled from: MapMakerInternalMap */
    interface a0<K, V, E extends i<K, V, E>> extends i<K, V, E> {
        b0<K, V, E> b();
    }

    /* compiled from: MapMakerInternalMap */
    static abstract class b<K, V> extends r<K, V> implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        final p f13616h;

        /* renamed from: i  reason: collision with root package name */
        final p f13617i;

        /* renamed from: j  reason: collision with root package name */
        final l6.f<Object> f13618j;

        /* renamed from: k  reason: collision with root package name */
        final l6.f<Object> f13619k;

        /* renamed from: l  reason: collision with root package name */
        final int f13620l;

        /* renamed from: m  reason: collision with root package name */
        transient ConcurrentMap<K, V> f13621m;

        b(p pVar, p pVar2, l6.f<Object> fVar, l6.f<Object> fVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            this.f13616h = pVar;
            this.f13617i = pVar2;
            this.f13618j = fVar;
            this.f13619k = fVar2;
            this.f13620l = i10;
            this.f13621m = concurrentMap;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public ConcurrentMap<K, V> b() {
            return this.f13621m;
        }

        /* access modifiers changed from: package-private */
        public void d(ObjectInputStream objectInputStream) {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.f13621m.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public j0 e(ObjectInputStream objectInputStream) {
            return new j0().g(objectInputStream.readInt()).j(this.f13616h).k(this.f13617i).h(this.f13618j).a(this.f13620l);
        }

        /* access modifiers changed from: package-private */
        public void f(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeInt(this.f13621m.size());
            for (Map.Entry entry : this.f13621m.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }
    }

    /* compiled from: MapMakerInternalMap */
    interface b0<K, V, E extends i<K, V, E>> {
        E a();

        b0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    /* compiled from: MapMakerInternalMap */
    static abstract class c<K, V, E extends i<K, V, E>> implements i<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final K f13622a;

        /* renamed from: b  reason: collision with root package name */
        final int f13623b;

        /* renamed from: c  reason: collision with root package name */
        final E f13624c;

        c(K k10, int i10, E e10) {
            this.f13622a = k10;
            this.f13623b = i10;
            this.f13624c = e10;
        }

        public E a() {
            return this.f13624c;
        }

        public int c() {
            return this.f13623b;
        }

        public K getKey() {
            return this.f13622a;
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class c0<K, V, E extends i<K, V, E>> extends WeakReference<V> implements b0<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final E f13625a;

        c0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f13625a = e10;
        }

        public E a() {
            return this.f13625a;
        }

        public b0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new c0(referenceQueue, get(), e10);
        }
    }

    /* compiled from: MapMakerInternalMap */
    static abstract class d<K, V, E extends i<K, V, E>> extends WeakReference<K> implements i<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final int f13626a;

        /* renamed from: b  reason: collision with root package name */
        final E f13627b;

        d(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f13626a = i10;
            this.f13627b = e10;
        }

        public E a() {
            return this.f13627b;
        }

        public int c() {
            return this.f13626a;
        }

        public K getKey() {
            return get();
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class d0 extends e<K, V> {

        /* renamed from: h  reason: collision with root package name */
        final K f13628h;

        /* renamed from: i  reason: collision with root package name */
        V f13629i;

        d0(K k10, V v10) {
            this.f13628h = k10;
            this.f13629i = v10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f13628h.equals(entry.getKey()) || !this.f13629i.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f13628h;
        }

        public V getValue() {
            return this.f13629i;
        }

        public int hashCode() {
            return this.f13628h.hashCode() ^ this.f13629i.hashCode();
        }

        public V setValue(V v10) {
            V put = k0.this.put(this.f13628h, v10);
            this.f13629i = v10;
            return put;
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class e implements i<Object, Object, e> {
        private e() {
            throw new AssertionError();
        }

        public int c() {
            throw new AssertionError();
        }

        /* renamed from: d */
        public e a() {
            throw new AssertionError();
        }

        public Object getKey() {
            throw new AssertionError();
        }

        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class f extends k0<K, V, E, S>.h<Map.Entry<K, V>> {
        f(k0 k0Var) {
            super();
        }

        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class g extends m<Map.Entry<K, V>> {
        g() {
            super((a) null);
        }

        public void clear() {
            k0.this.clear();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.k0 r2 = com.google.common.collect.k0.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0028
                com.google.common.collect.k0 r2 = com.google.common.collect.k0.this
                l6.f r2 = r2.m()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.d(r4, r0)
                if (r4 == 0) goto L_0x0028
                r1 = 1
            L_0x0028:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.k0.g.contains(java.lang.Object):boolean");
        }

        public boolean isEmpty() {
            return k0.this.isEmpty();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k0.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.k0 r2 = com.google.common.collect.k0.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.k0.g.remove(java.lang.Object):boolean");
        }

        public int size() {
            return k0.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap */
    abstract class h<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        int f13632h;

        /* renamed from: i  reason: collision with root package name */
        int f13633i = -1;

        /* renamed from: j  reason: collision with root package name */
        n<K, V, E, S> f13634j;

        /* renamed from: k  reason: collision with root package name */
        AtomicReferenceArray<E> f13635k;

        /* renamed from: l  reason: collision with root package name */
        E f13636l;

        /* renamed from: m  reason: collision with root package name */
        k0<K, V, E, S>.d0 f13637m;

        /* renamed from: n  reason: collision with root package name */
        k0<K, V, E, S>.d0 f13638n;

        h() {
            this.f13632h = k0.this.f13609j.length - 1;
            b();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            this.f13637m = null;
            if (!e() && !f()) {
                while (true) {
                    int i10 = this.f13632h;
                    if (i10 >= 0) {
                        n<K, V, E, S>[] nVarArr = k0.this.f13609j;
                        this.f13632h = i10 - 1;
                        n<K, V, E, S> nVar = nVarArr[i10];
                        this.f13634j = nVar;
                        if (nVar.f13642i != 0) {
                            AtomicReferenceArray<E> atomicReferenceArray = this.f13634j.f13645l;
                            this.f13635k = atomicReferenceArray;
                            this.f13633i = atomicReferenceArray.length() - 1;
                            if (f()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(E e10) {
            boolean z10;
            try {
                Object key = e10.getKey();
                Object d10 = k0.this.d(e10);
                if (d10 != null) {
                    this.f13637m = new d0(key, d10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f13634j.r();
            }
        }

        /* access modifiers changed from: package-private */
        public k0<K, V, E, S>.d0 d() {
            k0<K, V, E, S>.d0 d0Var = this.f13637m;
            if (d0Var != null) {
                this.f13638n = d0Var;
                b();
                return this.f13638n;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            E e10 = this.f13636l;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f13636l = e10.a();
                E e11 = this.f13636l;
                if (e11 == null) {
                    return false;
                }
                if (c(e11)) {
                    return true;
                }
                e10 = this.f13636l;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            while (true) {
                int i10 = this.f13633i;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f13635k;
                this.f13633i = i10 - 1;
                E e10 = (i) atomicReferenceArray.get(i10);
                this.f13636l = e10;
                if (e10 != null && (c(e10) || e())) {
                    return true;
                }
            }
        }

        public boolean hasNext() {
            return this.f13637m != null;
        }

        public void remove() {
            i.c(this.f13638n != null);
            k0.this.remove(this.f13638n.getKey());
            this.f13638n = null;
        }
    }

    /* compiled from: MapMakerInternalMap */
    interface i<K, V, E extends i<K, V, E>> {
        E a();

        int c();

        K getKey();

        V getValue();
    }

    /* compiled from: MapMakerInternalMap */
    interface j<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> {
        E a(S s10, E e10, E e11);

        p b();

        p c();

        void d(S s10, E e10, V v10);

        S e(k0<K, V, E, S> k0Var, int i10, int i11);

        E f(S s10, K k10, int i10, E e10);
    }

    /* compiled from: MapMakerInternalMap */
    final class k extends k0<K, V, E, S>.h<K> {
        k(k0 k0Var) {
            super();
        }

        public K next() {
            return d().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class l extends m<K> {
        l() {
            super((a) null);
        }

        public void clear() {
            k0.this.clear();
        }

        public boolean contains(Object obj) {
            return k0.this.containsKey(obj);
        }

        public boolean isEmpty() {
            return k0.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new k(k0.this);
        }

        public boolean remove(Object obj) {
            return k0.this.remove(obj) != null;
        }

        public int size() {
            return k0.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap */
    private static abstract class m<E> extends AbstractSet<E> {
        private m() {
        }

        public Object[] toArray() {
            return k0.k(this).toArray();
        }

        /* synthetic */ m(a aVar) {
            this();
        }

        public <T> T[] toArray(T[] tArr) {
            return k0.k(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap */
    static abstract class n<K, V, E extends i<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: h  reason: collision with root package name */
        final k0<K, V, E, S> f13641h;

        /* renamed from: i  reason: collision with root package name */
        volatile int f13642i;

        /* renamed from: j  reason: collision with root package name */
        int f13643j;

        /* renamed from: k  reason: collision with root package name */
        int f13644k;

        /* renamed from: l  reason: collision with root package name */
        volatile AtomicReferenceArray<E> f13645l;

        /* renamed from: m  reason: collision with root package name */
        final int f13646m;

        /* renamed from: n  reason: collision with root package name */
        final AtomicInteger f13647n = new AtomicInteger();

        n(k0<K, V, E, S> k0Var, int i10, int i11) {
            this.f13641h = k0Var;
            this.f13646m = i11;
            m(q(i10));
        }

        static <K, V, E extends i<K, V, E>> boolean n(E e10) {
            return e10.getValue() == null;
        }

        /* access modifiers changed from: package-private */
        public boolean A(K k10, int i10, V v10, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(k10, key)) {
                        iVar2 = iVar2.a();
                    } else {
                        Object value = iVar2.getValue();
                        if (value == null) {
                            if (n(iVar2)) {
                                this.f13643j++;
                                atomicReferenceArray.set(length, y(iVar, iVar2));
                                this.f13642i--;
                            }
                            return false;
                        } else if (this.f13641h.m().d(v10, value)) {
                            this.f13643j++;
                            E(iVar2, v11);
                            unlock();
                            return true;
                        } else {
                            unlock();
                            return false;
                        }
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public void B() {
            C();
        }

        /* access modifiers changed from: package-private */
        public void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f13647n.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public abstract S D();

        /* access modifiers changed from: package-private */
        public void E(E e10, V v10) {
            this.f13641h.f13612m.d(D(), e10, v10);
        }

        /* access modifiers changed from: package-private */
        public void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (this.f13642i != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, (Object) null);
                    }
                    o();
                    this.f13647n.set(0);
                    this.f13643j++;
                    this.f13642i = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public <T> void b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f13642i != 0) {
                    i k10 = k(obj, i10);
                    if (!(k10 == null || k10.getValue() == null)) {
                        z10 = true;
                    }
                    return z10;
                }
                r();
                return false;
            } finally {
                r();
            }
        }

        /* access modifiers changed from: package-private */
        public E d(E e10, E e11) {
            return this.f13641h.f13612m.a(D(), e10, e11);
        }

        /* access modifiers changed from: package-private */
        public void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f13641h.g((i) poll);
                    i10++;
                } else {
                    return;
                }
            } while (i10 != 16);
        }

        /* access modifiers changed from: package-private */
        public void f(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f13641h.h((b0) poll);
                    i10++;
                } else {
                    return;
                }
            } while (i10 != 16);
        }

        /* access modifiers changed from: package-private */
        public void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i10 = this.f13642i;
                AtomicReferenceArray<E> q10 = q(length << 1);
                this.f13644k = (q10.length() * 3) / 4;
                int length2 = q10.length() - 1;
                for (int i11 = 0; i11 < length; i11++) {
                    i iVar = (i) atomicReferenceArray.get(i11);
                    if (iVar != null) {
                        i a10 = iVar.a();
                        int c10 = iVar.c() & length2;
                        if (a10 == null) {
                            q10.set(c10, iVar);
                        } else {
                            i iVar2 = iVar;
                            while (a10 != null) {
                                int c11 = a10.c() & length2;
                                if (c11 != c10) {
                                    iVar2 = a10;
                                    c10 = c11;
                                }
                                a10 = a10.a();
                            }
                            q10.set(c10, iVar2);
                            while (iVar != iVar2) {
                                int c12 = iVar.c() & length2;
                                i d10 = d(iVar, (i) q10.get(c12));
                                if (d10 != null) {
                                    q10.set(c12, d10);
                                } else {
                                    i10--;
                                }
                                iVar = iVar.a();
                            }
                        }
                    }
                }
                this.f13645l = q10;
                this.f13642i = i10;
            }
        }

        /* access modifiers changed from: package-private */
        public V h(Object obj, int i10) {
            try {
                i k10 = k(obj, i10);
                if (k10 == null) {
                    return null;
                }
                V value = k10.getValue();
                if (value == null) {
                    F();
                }
                r();
                return value;
            } finally {
                r();
            }
        }

        /* access modifiers changed from: package-private */
        public E i(Object obj, int i10) {
            if (this.f13642i == 0) {
                return null;
            }
            for (E j10 = j(i10); j10 != null; j10 = j10.a()) {
                if (j10.c() == i10) {
                    Object key = j10.getKey();
                    if (key == null) {
                        F();
                    } else if (this.f13641h.f13611l.d(obj, key)) {
                        return j10;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public E j(int i10) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
            return (i) atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        public E k(Object obj, int i10) {
            return i(obj, i10);
        }

        /* access modifiers changed from: package-private */
        public V l(E e10) {
            if (e10.getKey() == null) {
                F();
                return null;
            }
            V value = e10.getValue();
            if (value != null) {
                return value;
            }
            F();
            return null;
        }

        /* access modifiers changed from: package-private */
        public void m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f13644k = length;
            if (length == this.f13646m) {
                this.f13644k = length + 1;
            }
            this.f13645l = atomicReferenceArray;
        }

        /* access modifiers changed from: package-private */
        public void o() {
        }

        /* access modifiers changed from: package-private */
        public void p() {
        }

        /* access modifiers changed from: package-private */
        public AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        /* access modifiers changed from: package-private */
        public void r() {
            if ((this.f13647n.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        /* access modifiers changed from: package-private */
        public void s() {
            C();
        }

        /* access modifiers changed from: package-private */
        public V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f13642i + 1;
                if (i11 > this.f13644k) {
                    g();
                    i11 = this.f13642i + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(k10, key)) {
                        iVar2 = iVar2.a();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            this.f13643j++;
                            E(iVar2, v10);
                            this.f13642i = this.f13642i;
                            return null;
                        } else if (z10) {
                            unlock();
                            return value;
                        } else {
                            this.f13643j++;
                            E(iVar2, v10);
                            unlock();
                            return value;
                        }
                    }
                }
                this.f13643j++;
                E f10 = this.f13641h.f13612m.f(D(), k10, i10, iVar);
                E(f10, v10);
                atomicReferenceArray.set(length, f10);
                this.f13642i = i11;
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean u(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = (i) atomicReferenceArray.get(length);
                for (E e12 = e11; e12 != null; e12 = e12.a()) {
                    if (e12 == e10) {
                        this.f13643j++;
                        atomicReferenceArray.set(length, y(e11, e12));
                        this.f13642i--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean v(K k10, int i10, b0<K, V, E> b0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(k10, key)) {
                        iVar2 = iVar2.a();
                    } else if (((a0) iVar2).b() == b0Var) {
                        this.f13643j++;
                        atomicReferenceArray.set(length, y(iVar, iVar2));
                        this.f13642i--;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public V w(Object obj, int i10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(obj, key)) {
                        iVar2 = iVar2.a();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (!n(iVar2)) {
                                unlock();
                                return null;
                            }
                        }
                        this.f13643j++;
                        atomicReferenceArray.set(length, y(iVar, iVar2));
                        this.f13642i--;
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean x(Object obj, int i10, Object obj2) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (true) {
                    boolean z10 = false;
                    if (iVar2 != null) {
                        Object key = iVar2.getKey();
                        if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(obj, key)) {
                            iVar2 = iVar2.a();
                        } else {
                            if (this.f13641h.m().d(obj2, iVar2.getValue())) {
                                z10 = true;
                            } else if (!n(iVar2)) {
                                unlock();
                                return false;
                            }
                            this.f13643j++;
                            atomicReferenceArray.set(length, y(iVar, iVar2));
                            this.f13642i--;
                            return z10;
                        }
                    } else {
                        unlock();
                        return false;
                    }
                }
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public E y(E e10, E e11) {
            int i10 = this.f13642i;
            E a10 = e11.a();
            while (e10 != e11) {
                E d10 = d(e10, a10);
                if (d10 != null) {
                    a10 = d10;
                } else {
                    i10--;
                }
                e10 = e10.a();
            }
            this.f13642i = i10;
            return a10;
        }

        /* access modifiers changed from: package-private */
        public V z(K k10, int i10, V v10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f13645l;
                int length = (atomicReferenceArray.length() - 1) & i10;
                i iVar = (i) atomicReferenceArray.get(length);
                i iVar2 = iVar;
                while (iVar2 != null) {
                    Object key = iVar2.getKey();
                    if (iVar2.c() != i10 || key == null || !this.f13641h.f13611l.d(k10, key)) {
                        iVar2 = iVar2.a();
                    } else {
                        V value = iVar2.getValue();
                        if (value == null) {
                            if (n(iVar2)) {
                                this.f13643j++;
                                atomicReferenceArray.set(length, y(iVar, iVar2));
                                this.f13642i--;
                            }
                            return null;
                        }
                        this.f13643j++;
                        E(iVar2, v10);
                        unlock();
                        return value;
                    }
                }
                unlock();
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* compiled from: MapMakerInternalMap */
    private static final class o<K, V> extends b<K, V> {
        o(p pVar, p pVar2, l6.f<Object> fVar, l6.f<Object> fVar2, int i10, ConcurrentMap<K, V> concurrentMap) {
            super(pVar, pVar2, fVar, fVar2, i10, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f13621m = e(objectInputStream).i();
            d(objectInputStream);
        }

        private Object readResolve() {
            return this.f13621m;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            f(objectOutputStream);
        }
    }

    /* compiled from: MapMakerInternalMap */
    enum p {
        STRONG {
            /* access modifiers changed from: package-private */
            public l6.f<Object> d() {
                return l6.f.c();
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public l6.f<Object> d() {
                return l6.f.f();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract l6.f<Object> d();
    }

    /* compiled from: MapMakerInternalMap */
    static final class q<K, V> extends c<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile V f13651d = null;

        /* compiled from: MapMakerInternalMap */
        static final class a<K, V> implements j<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f13652a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return f13652a;
            }

            public p b() {
                return p.STRONG;
            }

            public p c() {
                return p.STRONG;
            }

            /* renamed from: g */
            public q<K, V> a(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                return qVar.d(qVar2);
            }

            /* renamed from: i */
            public q<K, V> f(r<K, V> rVar, K k10, int i10, q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            /* renamed from: j */
            public r<K, V> e(k0<K, V, q<K, V>, r<K, V>> k0Var, int i10, int i11) {
                return new r<>(k0Var, i10, i11);
            }

            /* renamed from: k */
            public void d(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.e(v10);
            }
        }

        q(K k10, int i10, q<K, V> qVar) {
            super(k10, i10, qVar);
        }

        /* access modifiers changed from: package-private */
        public q<K, V> d(q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f13622a, this.f13623b, qVar);
            qVar2.f13651d = this.f13651d;
            return qVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(V v10) {
            this.f13651d = v10;
        }

        public V getValue() {
            return this.f13651d;
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class r<K, V> extends n<K, V, q<K, V>, r<K, V>> {
        r(k0<K, V, q<K, V>, r<K, V>> k0Var, int i10, int i11) {
            super(k0Var, i10, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public r<K, V> D() {
            return this;
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class s<K, V> extends c<K, V, s<K, V>> implements a0<K, V, s<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile b0<K, V, s<K, V>> f13653d = k0.l();

        /* compiled from: MapMakerInternalMap */
        static final class a<K, V> implements j<K, V, s<K, V>, t<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f13654a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return f13654a;
            }

            public p b() {
                return p.STRONG;
            }

            public p c() {
                return p.WEAK;
            }

            /* renamed from: g */
            public s<K, V> a(t<K, V> tVar, s<K, V> sVar, s<K, V> sVar2) {
                if (n.n(sVar)) {
                    return null;
                }
                return sVar.d(tVar.f13655o, sVar2);
            }

            /* renamed from: i */
            public s<K, V> f(t<K, V> tVar, K k10, int i10, s<K, V> sVar) {
                return new s<>(k10, i10, sVar);
            }

            /* renamed from: j */
            public t<K, V> e(k0<K, V, s<K, V>, t<K, V>> k0Var, int i10, int i11) {
                return new t<>(k0Var, i10, i11);
            }

            /* renamed from: k */
            public void d(t<K, V> tVar, s<K, V> sVar, V v10) {
                sVar.e(v10, tVar.f13655o);
            }
        }

        s(K k10, int i10, s<K, V> sVar) {
            super(k10, i10, sVar);
        }

        public b0<K, V, s<K, V>> b() {
            return this.f13653d;
        }

        /* access modifiers changed from: package-private */
        public s<K, V> d(ReferenceQueue<V> referenceQueue, s<K, V> sVar) {
            s<K, V> sVar2 = new s<>(this.f13622a, this.f13623b, sVar);
            sVar2.f13653d = this.f13653d.b(referenceQueue, sVar2);
            return sVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(V v10, ReferenceQueue<V> referenceQueue) {
            b0<K, V, s<K, V>> b0Var = this.f13653d;
            this.f13653d = new c0(referenceQueue, v10, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f13653d.get();
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public final ReferenceQueue<V> f13655o = new ReferenceQueue<>();

        t(k0<K, V, s<K, V>, t<K, V>> k0Var, int i10, int i11) {
            super(k0Var, i10, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public t<K, V> D() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            b(this.f13655o);
        }

        /* access modifiers changed from: package-private */
        public void p() {
            f(this.f13655o);
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class u extends k0<K, V, E, S>.h<V> {
        u(k0 k0Var) {
            super();
        }

        public V next() {
            return d().getValue();
        }
    }

    /* compiled from: MapMakerInternalMap */
    final class v extends AbstractCollection<V> {
        v() {
        }

        public void clear() {
            k0.this.clear();
        }

        public boolean contains(Object obj) {
            return k0.this.containsValue(obj);
        }

        public boolean isEmpty() {
            return k0.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new u(k0.this);
        }

        public int size() {
            return k0.this.size();
        }

        public Object[] toArray() {
            return k0.k(this).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return k0.k(this).toArray(tArr);
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class w<K, V> extends d<K, V, w<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile V f13657c = null;

        /* compiled from: MapMakerInternalMap */
        static final class a<K, V> implements j<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f13658a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return f13658a;
            }

            public p b() {
                return p.WEAK;
            }

            public p c() {
                return p.STRONG;
            }

            /* renamed from: g */
            public w<K, V> a(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null) {
                    return null;
                }
                return wVar.d(xVar.f13659o, wVar2);
            }

            /* renamed from: i */
            public w<K, V> f(x<K, V> xVar, K k10, int i10, w<K, V> wVar) {
                return new w<>(xVar.f13659o, k10, i10, wVar);
            }

            /* renamed from: j */
            public x<K, V> e(k0<K, V, w<K, V>, x<K, V>> k0Var, int i10, int i11) {
                return new x<>(k0Var, i10, i11);
            }

            /* renamed from: k */
            public void d(x<K, V> xVar, w<K, V> wVar, V v10) {
                wVar.e(v10);
            }
        }

        w(ReferenceQueue<K> referenceQueue, K k10, int i10, w<K, V> wVar) {
            super(referenceQueue, k10, i10, wVar);
        }

        /* access modifiers changed from: package-private */
        public w<K, V> d(ReferenceQueue<K> referenceQueue, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f13626a, wVar);
            wVar2.e(this.f13657c);
            return wVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(V v10) {
            this.f13657c = v10;
        }

        public V getValue() {
            return this.f13657c;
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class x<K, V> extends n<K, V, w<K, V>, x<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public final ReferenceQueue<K> f13659o = new ReferenceQueue<>();

        x(k0<K, V, w<K, V>, x<K, V>> k0Var, int i10, int i11) {
            super(k0Var, i10, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public x<K, V> D() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            b(this.f13659o);
        }

        /* access modifiers changed from: package-private */
        public void p() {
            e(this.f13659o);
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class y<K, V> extends d<K, V, y<K, V>> implements a0<K, V, y<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile b0<K, V, y<K, V>> f13660c = k0.l();

        /* compiled from: MapMakerInternalMap */
        static final class a<K, V> implements j<K, V, y<K, V>, z<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f13661a = new a<>();

            a() {
            }

            static <K, V> a<K, V> h() {
                return f13661a;
            }

            public p b() {
                return p.WEAK;
            }

            public p c() {
                return p.WEAK;
            }

            /* renamed from: g */
            public y<K, V> a(z<K, V> zVar, y<K, V> yVar, y<K, V> yVar2) {
                if (yVar.getKey() != null && !n.n(yVar)) {
                    return yVar.d(zVar.f13662o, zVar.f13663p, yVar2);
                }
                return null;
            }

            /* renamed from: i */
            public y<K, V> f(z<K, V> zVar, K k10, int i10, y<K, V> yVar) {
                return new y<>(zVar.f13662o, k10, i10, yVar);
            }

            /* renamed from: j */
            public z<K, V> e(k0<K, V, y<K, V>, z<K, V>> k0Var, int i10, int i11) {
                return new z<>(k0Var, i10, i11);
            }

            /* renamed from: k */
            public void d(z<K, V> zVar, y<K, V> yVar, V v10) {
                yVar.e(v10, zVar.f13663p);
            }
        }

        y(ReferenceQueue<K> referenceQueue, K k10, int i10, y<K, V> yVar) {
            super(referenceQueue, k10, i10, yVar);
        }

        public b0<K, V, y<K, V>> b() {
            return this.f13660c;
        }

        /* access modifiers changed from: package-private */
        public y<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, y<K, V> yVar) {
            y<K, V> yVar2 = new y<>(referenceQueue, getKey(), this.f13626a, yVar);
            yVar2.f13660c = this.f13660c.b(referenceQueue2, yVar2);
            return yVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(V v10, ReferenceQueue<V> referenceQueue) {
            b0<K, V, y<K, V>> b0Var = this.f13660c;
            this.f13660c = new c0(referenceQueue, v10, this);
            b0Var.clear();
        }

        public V getValue() {
            return this.f13660c.get();
        }
    }

    /* compiled from: MapMakerInternalMap */
    static final class z<K, V> extends n<K, V, y<K, V>, z<K, V>> {
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public final ReferenceQueue<K> f13662o = new ReferenceQueue<>();
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public final ReferenceQueue<V> f13663p = new ReferenceQueue<>();

        z(k0<K, V, y<K, V>, z<K, V>> k0Var, int i10, int i11) {
            super(k0Var, i10, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public z<K, V> D() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            b(this.f13662o);
        }

        /* access modifiers changed from: package-private */
        public void p() {
            e(this.f13662o);
            f(this.f13663p);
        }
    }

    private k0(j0 j0Var, j<K, V, E, S> jVar) {
        this.f13610k = Math.min(j0Var.b(), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        this.f13611l = j0Var.d();
        this.f13612m = jVar;
        int min = Math.min(j0Var.c(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i12 < this.f13610k) {
            i13++;
            i12 <<= 1;
        }
        this.f13608i = 32 - i13;
        this.f13607h = i12 - 1;
        this.f13609j = f(i12);
        int i14 = min / i12;
        while (i11 < (i12 * i14 < min ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.f13609j;
            if (i10 < nVarArr.length) {
                nVarArr[i10] = c(i11, -1);
                i10++;
            } else {
                return;
            }
        }
    }

    static <K, V> k0<K, V, ? extends i<K, V, ?>, ?> b(j0 j0Var) {
        p e10 = j0Var.e();
        p pVar = p.STRONG;
        if (e10 == pVar && j0Var.f() == pVar) {
            return new k0<>(j0Var, q.a.h());
        }
        if (j0Var.e() == pVar && j0Var.f() == p.WEAK) {
            return new k0<>(j0Var, s.a.h());
        }
        p e11 = j0Var.e();
        p pVar2 = p.WEAK;
        if (e11 == pVar2 && j0Var.f() == pVar) {
            return new k0<>(j0Var, w.a.h());
        }
        if (j0Var.e() == pVar2 && j0Var.f() == pVar2) {
            return new k0<>(j0Var, y.a.h());
        }
        throw new AssertionError();
    }

    static int i(int i10) {
        int i11 = i10 + ((i10 << 15) ^ -12931);
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* access modifiers changed from: private */
    public static <E> ArrayList<E> k(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        g0.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends i<K, V, E>> b0<K, V, E> l() {
        return f13606q;
    }

    /* access modifiers changed from: package-private */
    public n<K, V, E, S> c(int i10, int i11) {
        return this.f13612m.e(this, i10, i11);
    }

    public void clear() {
        for (n<K, V, E, S> a10 : this.f13609j) {
            a10.a();
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int e10 = e(obj);
        return j(e10).c(obj, e10);
    }

    public boolean containsValue(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.f13609j;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            for (n<K, V, E, S> nVar : nVarArr) {
                int i11 = nVar.f13642i;
                AtomicReferenceArray<E> atomicReferenceArray = nVar.f13645l;
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    for (i iVar = (i) atomicReferenceArray.get(i12); iVar != null; iVar = iVar.a()) {
                        V l10 = nVar.l(iVar);
                        if (l10 != null && m().d(obj2, l10)) {
                            return true;
                        }
                    }
                }
                j11 += (long) nVar.f13643j;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public V d(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return e10.getValue();
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj) {
        return i(this.f13611l.e(obj));
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f13615p;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f13615p = gVar;
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public final n<K, V, E, S>[] f(int i10) {
        return new n[i10];
    }

    /* access modifiers changed from: package-private */
    public void g(E e10) {
        int c10 = e10.c();
        j(c10).u(e10, c10);
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int e10 = e(obj);
        return j(e10).h(obj, e10);
    }

    /* access modifiers changed from: package-private */
    public void h(b0<K, V, E> b0Var) {
        E a10 = b0Var.a();
        int c10 = a10.c();
        j(c10).v(a10.getKey(), c10, b0Var);
    }

    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.f13609j;
        long j10 = 0;
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            if (nVarArr[i10].f13642i != 0) {
                return false;
            }
            j10 += (long) nVarArr[i10].f13643j;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < nVarArr.length; i11++) {
            if (nVarArr[i11].f13642i != 0) {
                return false;
            }
            j10 -= (long) nVarArr[i11].f13643j;
        }
        if (j10 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public n<K, V, E, S> j(int i10) {
        return this.f13609j[(i10 >>> this.f13608i) & this.f13607h];
    }

    public Set<K> keySet() {
        Set<K> set = this.f13613n;
        if (set != null) {
            return set;
        }
        l lVar = new l();
        this.f13613n = lVar;
        return lVar;
    }

    /* access modifiers changed from: package-private */
    public l6.f<Object> m() {
        return this.f13612m.c().d();
    }

    public V put(K k10, V v10) {
        l6.p.j(k10);
        l6.p.j(v10);
        int e10 = e(k10);
        return j(e10).t(k10, e10, v10, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V putIfAbsent(K k10, V v10) {
        l6.p.j(k10);
        l6.p.j(v10);
        int e10 = e(k10);
        return j(e10).t(k10, e10, v10, true);
    }

    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int e10 = e(obj);
        return j(e10).w(obj, e10);
    }

    public boolean replace(K k10, V v10, V v11) {
        l6.p.j(k10);
        l6.p.j(v11);
        if (v10 == null) {
            return false;
        }
        int e10 = e(k10);
        return j(e10).A(k10, e10, v10, v11);
    }

    public int size() {
        n<K, V, E, S>[] nVarArr = this.f13609j;
        long j10 = 0;
        for (n<K, V, E, S> nVar : nVarArr) {
            j10 += (long) nVar.f13642i;
        }
        return n6.d.j(j10);
    }

    public Collection<V> values() {
        Collection<V> collection = this.f13614o;
        if (collection != null) {
            return collection;
        }
        v vVar = new v();
        this.f13614o = vVar;
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new o(this.f13612m.b(), this.f13612m.c(), this.f13611l, this.f13612m.c().d(), this.f13610k, this);
    }

    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e10 = e(obj);
        return j(e10).x(obj, e10, obj2);
    }

    public V replace(K k10, V v10) {
        l6.p.j(k10);
        l6.p.j(v10);
        int e10 = e(k10);
        return j(e10).z(k10, e10, v10);
    }
}
