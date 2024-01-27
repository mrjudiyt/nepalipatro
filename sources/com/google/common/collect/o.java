package com.google.common.collect;

import java.util.Comparator;
import n6.d;
import n6.f;

/* compiled from: ComparisonChain */
public abstract class o {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final o f13681a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final o f13682b = new b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final o f13683c = new b(1);

    /* compiled from: ComparisonChain */
    class a extends o {
        a() {
            super((a) null);
        }

        public o d(int i10, int i11) {
            return k(d.d(i10, i11));
        }

        public o e(long j10, long j11) {
            return k(f.a(j10, j11));
        }

        public <T> o f(T t10, T t11, Comparator<T> comparator) {
            return k(comparator.compare(t10, t11));
        }

        public o g(boolean z10, boolean z11) {
            return k(n6.a.a(z10, z11));
        }

        public o h(boolean z10, boolean z11) {
            return k(n6.a.a(z11, z10));
        }

        public int i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public o k(int i10) {
            if (i10 < 0) {
                return o.f13682b;
            }
            return i10 > 0 ? o.f13683c : o.f13681a;
        }
    }

    /* compiled from: ComparisonChain */
    private static final class b extends o {

        /* renamed from: d  reason: collision with root package name */
        final int f13684d;

        b(int i10) {
            super((a) null);
            this.f13684d = i10;
        }

        public o d(int i10, int i11) {
            return this;
        }

        public o e(long j10, long j11) {
            return this;
        }

        public <T> o f(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        public o g(boolean z10, boolean z11) {
            return this;
        }

        public o h(boolean z10, boolean z11) {
            return this;
        }

        public int i() {
            return this.f13684d;
        }
    }

    /* synthetic */ o(a aVar) {
        this();
    }

    public static o j() {
        return f13681a;
    }

    public abstract o d(int i10, int i11);

    public abstract o e(long j10, long j11);

    public abstract <T> o f(T t10, T t11, Comparator<T> comparator);

    public abstract o g(boolean z10, boolean z11);

    public abstract o h(boolean z10, boolean z11);

    public abstract int i();

    private o() {
    }
}
