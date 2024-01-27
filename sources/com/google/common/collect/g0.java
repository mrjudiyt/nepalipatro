package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l6.p;

/* compiled from: Iterators */
public final class g0 {

    /* compiled from: Iterators */
    class a extends k1<T> {

        /* renamed from: h  reason: collision with root package name */
        boolean f13566h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f13567i;

        a(Object obj) {
            this.f13567i = obj;
        }

        public boolean hasNext() {
            return !this.f13566h;
        }

        public T next() {
            if (!this.f13566h) {
                this.f13566h = true;
                return this.f13567i;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Iterators */
    private static final class b<T> extends a<T> {

        /* renamed from: l  reason: collision with root package name */
        static final l1<Object> f13568l = new b(new Object[0], 0, 0, 0);

        /* renamed from: j  reason: collision with root package name */
        private final T[] f13569j;

        /* renamed from: k  reason: collision with root package name */
        private final int f13570k;

        b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f13569j = tArr;
            this.f13570k = i10;
        }

        /* access modifiers changed from: protected */
        public T b(int i10) {
            return this.f13569j[this.f13570k + i10];
        }
    }

    /* compiled from: Iterators */
    private enum c implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            i.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        p.j(collection);
        p.j(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    static void b(Iterator<?> it) {
        p.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = l6.l.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.g0.c(java.util.Iterator, java.util.Iterator):boolean");
    }

    static <T> k1<T> d() {
        return e();
    }

    static <T> l1<T> e() {
        return b.f13568l;
    }

    static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> T g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T h(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? g(it) : t10;
    }

    public static <T> T i(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    static <T> T j(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean k(Iterator<?> it, Collection<?> collection) {
        p.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> k1<T> l(T t10) {
        return new a(t10);
    }

    public static String m(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb.append(", ");
            }
            z10 = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }
}
