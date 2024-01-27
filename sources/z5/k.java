package z5;

import a6.a;
import a6.m0;
import java.util.Arrays;

/* compiled from: DefaultAllocator */
public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13216a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13217b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f13218c;

    /* renamed from: d  reason: collision with root package name */
    private final a[] f13219d;

    /* renamed from: e  reason: collision with root package name */
    private int f13220e;

    /* renamed from: f  reason: collision with root package name */
    private int f13221f;

    /* renamed from: g  reason: collision with root package name */
    private int f13222g;

    /* renamed from: h  reason: collision with root package name */
    private a[] f13223h;

    public k(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized void a(a[] aVarArr) {
        int i10 = this.f13222g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f13223h;
        if (length >= aVarArr2.length) {
            this.f13223h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f13223h;
            int i11 = this.f13222g;
            this.f13222g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f13221f -= aVarArr.length;
        notifyAll();
    }

    public synchronized a b() {
        a aVar;
        this.f13221f++;
        int i10 = this.f13222g;
        if (i10 > 0) {
            a[] aVarArr = this.f13223h;
            int i11 = i10 - 1;
            this.f13222g = i11;
            aVar = (a) a.e(aVarArr[i11]);
            this.f13223h[this.f13222g] = null;
        } else {
            aVar = new a(new byte[this.f13217b], 0);
        }
        return aVar;
    }

    public synchronized void c() {
        int i10 = 0;
        int max = Math.max(0, m0.l(this.f13220e, this.f13217b) - this.f13221f);
        int i11 = this.f13222g;
        if (max < i11) {
            if (this.f13218c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) a.e(this.f13223h[i10]);
                    if (aVar.f13196a == this.f13218c) {
                        i10++;
                    } else {
                        a aVar2 = (a) a.e(this.f13223h[i12]);
                        if (aVar2.f13196a != this.f13218c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f13223h;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f13222g) {
                    return;
                }
            }
            Arrays.fill(this.f13223h, max, this.f13222g, (Object) null);
            this.f13222g = max;
        }
    }

    public synchronized void d(a aVar) {
        a[] aVarArr = this.f13219d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    public int e() {
        return this.f13217b;
    }

    public synchronized int f() {
        return this.f13221f * this.f13217b;
    }

    public synchronized void g() {
        if (this.f13216a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f13220e;
        this.f13220e = i10;
        if (z10) {
            c();
        }
    }

    public k(boolean z10, int i10, int i11) {
        a.a(i10 > 0);
        a.a(i11 >= 0);
        this.f13216a = z10;
        this.f13217b = i10;
        this.f13222g = i11;
        this.f13223h = new a[(i11 + 100)];
        if (i11 > 0) {
            this.f13218c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f13223h[i12] = new a(this.f13218c, i12 * i10);
            }
        } else {
            this.f13218c = null;
        }
        this.f13219d = new a[1];
    }
}
