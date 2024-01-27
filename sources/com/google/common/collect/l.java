package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import l6.p;
import n6.d;

/* compiled from: CompactHashSet */
class l<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private transient Object f13664h;

    /* renamed from: i  reason: collision with root package name */
    private transient int[] f13665i;

    /* renamed from: j  reason: collision with root package name */
    transient Object[] f13666j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public transient int f13667k;

    /* renamed from: l  reason: collision with root package name */
    private transient int f13668l;

    /* compiled from: CompactHashSet */
    class a implements Iterator<E> {

        /* renamed from: h  reason: collision with root package name */
        int f13669h;

        /* renamed from: i  reason: collision with root package name */
        int f13670i;

        /* renamed from: j  reason: collision with root package name */
        int f13671j = -1;

        a() {
            this.f13669h = l.this.f13667k;
            this.f13670i = l.this.m();
        }

        private void b() {
            if (l.this.f13667k != this.f13669h) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f13669h += 32;
        }

        public boolean hasNext() {
            return this.f13670i >= 0;
        }

        public E next() {
            b();
            if (hasNext()) {
                int i10 = this.f13670i;
                this.f13671j = i10;
                E b10 = l.this.k(i10);
                this.f13670i = l.this.n(this.f13670i);
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            i.c(this.f13671j >= 0);
            c();
            l lVar = l.this;
            lVar.remove(lVar.k(this.f13671j));
            this.f13670i = l.this.c(this.f13670i, this.f13671j);
            this.f13671j = -1;
        }
    }

    l() {
        r(3);
    }

    private void A(int i10) {
        int min;
        int length = x().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            z(min);
        }
    }

    private int B(int i10, int i11, int i12, int i13) {
        Object a10 = m.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            m.i(a10, i12 & i14, i13 + 1);
        }
        Object y10 = y();
        int[] x10 = x();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = m.h(y10, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = x10[i16];
                int b10 = m.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = m.h(a10, i18);
                m.i(a10, i18, h10);
                x10[i16] = m.d(b10, h11, i14);
                h10 = m.c(i17, i10);
            }
        }
        this.f13664h = a10;
        F(i14);
        return i14;
    }

    private void C(int i10, E e10) {
        v()[i10] = e10;
    }

    private void D(int i10, int i11) {
        x()[i10] = i11;
    }

    private void F(int i10) {
        this.f13667k = m.d(this.f13667k, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public static <E> l<E> f() {
        return new l<>();
    }

    private Set<E> g(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    /* access modifiers changed from: private */
    public E k(int i10) {
        return v()[i10];
    }

    private int l(int i10) {
        return x()[i10];
    }

    private int o() {
        return (1 << (this.f13667k & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            r(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private Object[] v() {
        Object[] objArr = this.f13666j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    private int[] x() {
        int[] iArr = this.f13665i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object y() {
        Object obj = this.f13664h;
        Objects.requireNonNull(obj);
        return obj;
    }

    public boolean add(E e10) {
        if (u()) {
            d();
        }
        Set i10 = i();
        if (i10 != null) {
            return i10.add(e10);
        }
        int[] x10 = x();
        Object[] v10 = v();
        int i11 = this.f13668l;
        int i12 = i11 + 1;
        int c10 = u.c(e10);
        int o10 = o();
        int i13 = c10 & o10;
        int h10 = m.h(y(), i13);
        if (h10 != 0) {
            int b10 = m.b(c10, o10);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = x10[i15];
                if (m.b(i16, o10) == b10 && l6.l.a(e10, v10[i15])) {
                    return false;
                }
                int c11 = m.c(i16, o10);
                i14++;
                if (c11 != 0) {
                    h10 = c11;
                } else if (i14 >= 9) {
                    return e().add(e10);
                } else {
                    if (i12 > o10) {
                        o10 = B(o10, m.e(o10), c10, i11);
                    } else {
                        x10[i15] = m.d(i16, i12, o10);
                    }
                }
            }
        } else if (i12 > o10) {
            o10 = B(o10, m.e(o10), c10, i11);
        } else {
            m.i(y(), i13, i12);
        }
        A(i12);
        s(i11, e10, c10, o10);
        this.f13668l = i12;
        p();
        return true;
    }

    /* access modifiers changed from: package-private */
    public int c(int i10, int i11) {
        return i10 - 1;
    }

    public void clear() {
        if (!u()) {
            p();
            Set i10 = i();
            if (i10 != null) {
                this.f13667k = d.e(size(), 3, 1073741823);
                i10.clear();
                this.f13664h = null;
                this.f13668l = 0;
                return;
            }
            Arrays.fill(v(), 0, this.f13668l, (Object) null);
            m.g(y());
            Arrays.fill(x(), 0, this.f13668l, 0);
            this.f13668l = 0;
        }
    }

    public boolean contains(Object obj) {
        if (u()) {
            return false;
        }
        Set i10 = i();
        if (i10 != null) {
            return i10.contains(obj);
        }
        int c10 = u.c(obj);
        int o10 = o();
        int h10 = m.h(y(), c10 & o10);
        if (h10 == 0) {
            return false;
        }
        int b10 = m.b(c10, o10);
        do {
            int i11 = h10 - 1;
            int l10 = l(i11);
            if (m.b(l10, o10) == b10 && l6.l.a(obj, k(i11))) {
                return true;
            }
            h10 = m.c(l10, o10);
        } while (h10 != 0);
        return false;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        p.p(u(), "Arrays already allocated");
        int i10 = this.f13667k;
        int j10 = m.j(i10);
        this.f13664h = m.a(j10);
        F(j10 - 1);
        this.f13665i = new int[i10];
        this.f13666j = new Object[i10];
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Set<E> e() {
        Set<E> g10 = g(o() + 1);
        int m10 = m();
        while (m10 >= 0) {
            g10.add(k(m10));
            m10 = n(m10);
        }
        this.f13664h = g10;
        this.f13665i = null;
        this.f13666j = null;
        p();
        return g10;
    }

    /* access modifiers changed from: package-private */
    public Set<E> i() {
        Object obj = this.f13664h;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<E> iterator() {
        Set i10 = i();
        if (i10 != null) {
            return i10.iterator();
        }
        return new a();
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public int n(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f13668l) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f13667k += 32;
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        p.e(i10 >= 0, "Expected size must be >= 0");
        this.f13667k = d.e(i10, 1, 1073741823);
    }

    public boolean remove(Object obj) {
        if (u()) {
            return false;
        }
        Set i10 = i();
        if (i10 != null) {
            return i10.remove(obj);
        }
        int o10 = o();
        int f10 = m.f(obj, (Object) null, o10, y(), x(), v(), (Object[]) null);
        if (f10 == -1) {
            return false;
        }
        t(f10, o10);
        this.f13668l--;
        p();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void s(int i10, E e10, int i11, int i12) {
        D(i10, m.d(i11, 0, i12));
        C(i10, e10);
    }

    public int size() {
        Set i10 = i();
        return i10 != null ? i10.size() : this.f13668l;
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11) {
        Object y10 = y();
        int[] x10 = x();
        Object[] v10 = v();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = v10[size];
            v10[i10] = obj;
            v10[size] = null;
            x10[i10] = x10[size];
            x10[size] = 0;
            int c10 = u.c(obj) & i11;
            int h10 = m.h(y10, c10);
            int i12 = size + 1;
            if (h10 == i12) {
                m.i(y10, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = x10[i13];
                int c11 = m.c(i14, i11);
                if (c11 == i12) {
                    x10[i13] = m.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            v10[i10] = null;
            x10[i10] = 0;
        }
    }

    public Object[] toArray() {
        if (u()) {
            return new Object[0];
        }
        Set i10 = i();
        return i10 != null ? i10.toArray() : Arrays.copyOf(v(), this.f13668l);
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        return this.f13664h == null;
    }

    /* access modifiers changed from: package-private */
    public void z(int i10) {
        this.f13665i = Arrays.copyOf(x(), i10);
        this.f13666j = Arrays.copyOf(v(), i10);
    }

    public <T> T[] toArray(T[] tArr) {
        if (u()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set i10 = i();
        if (i10 != null) {
            return i10.toArray(tArr);
        }
        return u0.e(v(), 0, this.f13668l, tArr);
    }
}
