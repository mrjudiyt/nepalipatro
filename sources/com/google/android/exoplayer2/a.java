package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.w;

/* compiled from: AbstractConcatenatedTimeline */
public abstract class a extends a1 {

    /* renamed from: c  reason: collision with root package name */
    private final int f6227c;

    /* renamed from: d  reason: collision with root package name */
    private final w f6228d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6229e;

    public a(boolean z10, w wVar) {
        this.f6229e = z10;
        this.f6228d = wVar;
        this.f6227c = wVar.a();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f6228d.e(i10);
        }
        if (i10 < this.f6227c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f6228d.d(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10);

    /* access modifiers changed from: protected */
    public abstract a1 D(int i10);

    public int a(boolean z10) {
        if (this.f6227c == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f6229e) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f6228d.c();
        }
        while (D(i10).q()) {
            i10 = B(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return A(i10) + D(i10).a(z10);
    }

    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        if (s10 == -1 || (b10 = D(s10).b(v10)) == -1) {
            return -1;
        }
        return z(s10) + b10;
    }

    public int c(boolean z10) {
        int i10 = this.f6227c;
        if (i10 == 0) {
            return -1;
        }
        if (this.f6229e) {
            z10 = false;
        }
        int g10 = z10 ? this.f6228d.g() : i10 - 1;
        while (D(g10).q()) {
            g10 = C(g10, z10);
            if (g10 == -1) {
                return -1;
            }
        }
        return A(g10) + D(g10).c(z10);
    }

    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f6229e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A = A(u10);
        a1 D = D(u10);
        int i13 = i10 - A;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = D.e(i13, i12, z10);
        if (e10 != -1) {
            return A + e10;
        }
        int B = B(u10, z10);
        while (B != -1 && D(B).q()) {
            B = B(B, z10);
        }
        if (B != -1) {
            return A(B) + D(B).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public final a1.b g(int i10, a1.b bVar, boolean z10) {
        int t10 = t(i10);
        int A = A(t10);
        D(t10).g(i10 - z(t10), bVar, z10);
        bVar.f6236c += A;
        if (z10) {
            bVar.f6235b = y(x(t10), a6.a.e(bVar.f6235b));
        }
        return bVar;
    }

    public final a1.b h(Object obj, a1.b bVar) {
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        int A = A(s10);
        D(s10).h(v10, bVar);
        bVar.f6236c += A;
        bVar.f6235b = obj;
        return bVar;
    }

    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f6229e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A = A(u10);
        a1 D = D(u10);
        int i13 = i10 - A;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = D.l(i13, i12, z10);
        if (l10 != -1) {
            return A + l10;
        }
        int C = C(u10, z10);
        while (C != -1 && D(C).q()) {
            C = C(C, z10);
        }
        if (C != -1) {
            return A(C) + D(C).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    public final Object m(int i10) {
        int t10 = t(i10);
        return y(x(t10), D(t10).m(i10 - z(t10)));
    }

    public final a1.c o(int i10, a1.c cVar, long j10) {
        int u10 = u(i10);
        int A = A(u10);
        int z10 = z(u10);
        D(u10).o(i10 - A, cVar, j10);
        Object x10 = x(u10);
        if (!a1.c.f6241r.equals(cVar.f6245a)) {
            x10 = y(x10, cVar.f6245a);
        }
        cVar.f6245a = x10;
        cVar.f6259o += z10;
        cVar.f6260p += z10;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public abstract int s(Object obj);

    /* access modifiers changed from: protected */
    public abstract int t(int i10);

    /* access modifiers changed from: protected */
    public abstract int u(int i10);

    /* access modifiers changed from: protected */
    public abstract Object x(int i10);

    /* access modifiers changed from: protected */
    public abstract int z(int i10);
}
