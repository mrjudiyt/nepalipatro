package n9;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.m;
import n9.q0;

/* compiled from: ThreadSafeHeap.kt */
public class p0<T extends q0 & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15834b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    private T[] f15835a;

    private final T[] f() {
        T[] tArr = this.f15835a;
        if (tArr == null) {
            T[] tArr2 = new q0[4];
            this.f15835a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            m.e(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (q0[]) copyOf;
            this.f15835a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i10) {
        f15834b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 < c()) {
                T[] tArr = this.f15835a;
                m.c(tArr);
                int i12 = i11 + 1;
                if (i12 < c()) {
                    T t10 = tArr[i12];
                    m.c(t10);
                    T t11 = tArr[i11];
                    m.c(t11);
                    if (((Comparable) t10).compareTo(t11) < 0) {
                        i11 = i12;
                    }
                }
                T t12 = tArr[i10];
                m.c(t12);
                T t13 = tArr[i11];
                m.c(t13);
                if (((Comparable) t12).compareTo(t13) > 0) {
                    m(i10, i11);
                    i10 = i11;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f15835a;
            m.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            m.c(t10);
            T t11 = tArr[i10];
            m.c(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                m(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f15835a;
        m.c(tArr);
        T t10 = tArr[i11];
        m.c(t10);
        T t11 = tArr[i10];
        m.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.f(i10);
        t11.f(i11);
    }

    public final void a(T t10) {
        if (i9.p0.a()) {
            if (!(t10.a() == null)) {
                throw new AssertionError();
            }
        }
        t10.g(this);
        q0[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.f(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f15835a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f15834b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            boolean z11 = false;
            if (t10.a() == null) {
                z10 = false;
            } else {
                int e10 = t10.e();
                if (i9.p0.a()) {
                    if (e10 >= 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new AssertionError();
                    }
                }
                h(e10);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        boolean z10 = false;
        if (i9.p0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f15835a;
        m.c(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                m.c(t10);
                T t11 = tArr[i11];
                m.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        m.c(t12);
        if (i9.p0.a()) {
            if (t12.a() == this) {
                z10 = true;
            }
            if (!z10) {
                throw new AssertionError();
            }
        }
        t12.g((p0<?>) null);
        t12.f(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
