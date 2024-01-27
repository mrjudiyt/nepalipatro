package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.collect.x;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import l6.p;

/* compiled from: ImmutableCollection */
public abstract class v<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f13693h = new Object[0];

    /* compiled from: ImmutableCollection */
    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f13694a;

        /* renamed from: b  reason: collision with root package name */
        int f13695b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f13696c;

        a(int i10) {
            i.b(i10, "initialCapacity");
            this.f13694a = new Object[i10];
        }

        private void e(int i10) {
            Object[] objArr = this.f13694a;
            if (objArr.length < i10) {
                this.f13694a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
                this.f13696c = false;
            } else if (this.f13696c) {
                this.f13694a = (Object[]) objArr.clone();
                this.f13696c = false;
            }
        }

        public a<E> b(E e10) {
            p.j(e10);
            e(this.f13695b + 1);
            Object[] objArr = this.f13694a;
            int i10 = this.f13695b;
            this.f13695b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> c(E... eArr) {
            d(eArr, eArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void d(Object[] objArr, int i10) {
            u0.c(objArr, i10);
            e(this.f13695b + i10);
            System.arraycopy(objArr, 0, this.f13694a, this.f13695b, i10);
            this.f13695b += i10;
        }
    }

    /* compiled from: ImmutableCollection */
    public static abstract class b<E> {
        b() {
        }

        static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    v() {
    }

    public x<E> a() {
        return isEmpty() ? x.s() : x.i(toArray());
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        k1 g10 = iterator();
        while (g10.hasNext()) {
            objArr[i10] = g10.next();
            i10++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Object[] c() {
        return null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean f();

    /* renamed from: g */
    public abstract k1<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f13693h);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new x.d(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        p.j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] c10 = c();
            if (c10 != null) {
                return w0.a(c10, e(), d(), tArr);
            }
            tArr = u0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }
}
