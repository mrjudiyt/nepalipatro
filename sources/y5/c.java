package y5;

import a6.a;
import a6.m0;
import android.os.SystemClock;
import e4.j;
import g5.v;
import i5.f;
import i5.n;
import java.util.Arrays;
import java.util.List;

/* compiled from: BaseTrackSelection */
public abstract class c implements h {

    /* renamed from: a  reason: collision with root package name */
    protected final v f12987a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f12988b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f12989c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12990d;

    /* renamed from: e  reason: collision with root package name */
    private final j[] f12991e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f12992f;

    /* renamed from: g  reason: collision with root package name */
    private int f12993g;

    public c(v vVar, int... iArr) {
        this(vVar, iArr, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int w(j jVar, j jVar2) {
        return jVar2.f8092o - jVar.f8092o;
    }

    public final int a(j jVar) {
        for (int i10 = 0; i10 < this.f12988b; i10++) {
            if (this.f12991e[i10] == jVar) {
                return i10;
            }
        }
        return -1;
    }

    public final v b() {
        return this.f12987a;
    }

    public boolean e(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean f10 = f(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f12988b && !f10) {
            f10 = i11 != i10 && !f(i11, elapsedRealtime);
            i11++;
        }
        if (!f10) {
            return false;
        }
        long[] jArr = this.f12992f;
        jArr[i10] = Math.max(jArr[i10], m0.b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12987a != cVar.f12987a || !Arrays.equals(this.f12989c, cVar.f12989c)) {
            return false;
        }
        return true;
    }

    public boolean f(int i10, long j10) {
        return this.f12992f[i10] > j10;
    }

    public /* synthetic */ void g(boolean z10) {
        g.b(this, z10);
    }

    public void h() {
    }

    public int hashCode() {
        if (this.f12993g == 0) {
            this.f12993g = (System.identityHashCode(this.f12987a) * 31) + Arrays.hashCode(this.f12989c);
        }
        return this.f12993g;
    }

    public final j i(int i10) {
        return this.f12991e[i10];
    }

    public void j() {
    }

    public final int k(int i10) {
        return this.f12989c[i10];
    }

    public /* synthetic */ boolean l(long j10, f fVar, List list) {
        return g.d(this, j10, fVar, list);
    }

    public final int length() {
        return this.f12989c.length;
    }

    public int m(long j10, List<? extends n> list) {
        return list.size();
    }

    public final int n() {
        return this.f12989c[c()];
    }

    public final j o() {
        return this.f12991e[c()];
    }

    public void q(float f10) {
    }

    public /* synthetic */ void s() {
        g.a(this);
    }

    public /* synthetic */ void t() {
        g.c(this);
    }

    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f12988b; i11++) {
            if (this.f12989c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public c(v vVar, int[] iArr, int i10) {
        int i11 = 0;
        a.f(iArr.length > 0);
        this.f12990d = i10;
        this.f12987a = (v) a.e(vVar);
        int length = iArr.length;
        this.f12988b = length;
        this.f12991e = new j[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f12991e[i12] = vVar.b(iArr[i12]);
        }
        Arrays.sort(this.f12991e, b.f17293h);
        this.f12989c = new int[this.f12988b];
        while (true) {
            int i13 = this.f12988b;
            if (i11 < i13) {
                this.f12989c[i11] = vVar.c(this.f12991e[i11]);
                i11++;
            } else {
                this.f12992f = new long[i13];
                return;
            }
        }
    }
}
