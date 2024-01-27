package y5;

import a6.m0;
import a6.p;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.k;
import com.google.common.collect.f0;
import com.google.common.collect.h0;
import com.google.common.collect.p0;
import com.google.common.collect.x;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import e4.j;
import g5.v;
import i5.n;
import i5.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y5.h;
import z5.e;

/* compiled from: AdaptiveTrackSelection */
public class a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final e f12966h;

    /* renamed from: i  reason: collision with root package name */
    private final long f12967i;

    /* renamed from: j  reason: collision with root package name */
    private final long f12968j;

    /* renamed from: k  reason: collision with root package name */
    private final long f12969k;

    /* renamed from: l  reason: collision with root package name */
    private final float f12970l;

    /* renamed from: m  reason: collision with root package name */
    private final float f12971m;

    /* renamed from: n  reason: collision with root package name */
    private final x<C0218a> f12972n;

    /* renamed from: o  reason: collision with root package name */
    private final a6.b f12973o;

    /* renamed from: p  reason: collision with root package name */
    private float f12974p;

    /* renamed from: q  reason: collision with root package name */
    private int f12975q;

    /* renamed from: r  reason: collision with root package name */
    private int f12976r;

    /* renamed from: s  reason: collision with root package name */
    private long f12977s;

    /* renamed from: t  reason: collision with root package name */
    private n f12978t;

    /* renamed from: y5.a$a  reason: collision with other inner class name */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C0218a {

        /* renamed from: a  reason: collision with root package name */
        public final long f12979a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12980b;

        public C0218a(long j10, long j11) {
            this.f12979a = j10;
            this.f12980b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0218a)) {
                return false;
            }
            C0218a aVar = (C0218a) obj;
            if (this.f12979a == aVar.f12979a && this.f12980b == aVar.f12980b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f12979a) * 31) + ((int) this.f12980b);
        }
    }

    /* compiled from: AdaptiveTrackSelection */
    public static class b implements h.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f12981a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12982b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12983c;

        /* renamed from: d  reason: collision with root package name */
        private final float f12984d;

        /* renamed from: e  reason: collision with root package name */
        private final float f12985e;

        /* renamed from: f  reason: collision with root package name */
        private final a6.b f12986f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, a6.b.f146a);
        }

        public final h[] a(h.a[] aVarArr, e eVar, k.a aVar, a1 a1Var) {
            h hVar;
            x x10 = a.B(aVarArr);
            h[] hVarArr = new h[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                h.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f13040b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            hVar = new i(aVar2.f13039a, iArr[0], aVar2.f13041c);
                        } else {
                            hVar = b(aVar2.f13039a, iArr, aVar2.f13041c, eVar, (x) x10.get(i10));
                        }
                        hVarArr[i10] = hVar;
                    }
                }
            }
            return hVarArr;
        }

        /* access modifiers changed from: protected */
        public a b(v vVar, int[] iArr, int i10, e eVar, x<C0218a> xVar) {
            return new a(vVar, iArr, i10, eVar, (long) this.f12981a, (long) this.f12982b, (long) this.f12983c, this.f12984d, this.f12985e, xVar, this.f12986f);
        }

        public b(int i10, int i11, int i12, float f10, float f11, a6.b bVar) {
            this.f12981a = i10;
            this.f12982b = i11;
            this.f12983c = i12;
            this.f12984d = f10;
            this.f12985e = f11;
            this.f12986f = bVar;
        }
    }

    protected a(v vVar, int[] iArr, int i10, e eVar, long j10, long j11, long j12, float f10, float f11, List<C0218a> list, a6.b bVar) {
        super(vVar, iArr, i10);
        if (j12 < j10) {
            p.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f12966h = eVar;
        this.f12967i = j10 * 1000;
        this.f12968j = j11 * 1000;
        this.f12969k = j12 * 1000;
        this.f12970l = f10;
        this.f12971m = f11;
        this.f12972n = x.n(list);
        this.f12973o = bVar;
        this.f12974p = 1.0f;
        this.f12976r = 0;
        this.f12977s = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12988b; i11++) {
            if (j10 == Long.MIN_VALUE || !f(i11, j10)) {
                j i12 = i(i11);
                if (z(i12, i12.f8092o, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static x<x<C0218a>> B(h.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f13040b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                x.a l10 = x.l();
                l10.f(new C0218a(0, 0));
                arrayList.add(l10);
            }
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i11 = 0; i11 < G.length; i11++) {
            jArr[i11] = G[i11].length == 0 ? 0 : G[i11][0];
        }
        y(arrayList, jArr);
        x<Integer> H = H(G);
        for (int i12 = 0; i12 < H.size(); i12++) {
            int intValue = H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = G[intValue][i13];
            y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        y(arrayList, jArr);
        x.a l11 = x.l();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            x.a aVar = (x.a) arrayList.get(i15);
            l11.f(aVar == null ? x.s() : aVar.h());
        }
        return l11.h();
    }

    private long C(long j10) {
        long I = I(j10);
        if (this.f12972n.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f12972n.size() - 1 && this.f12972n.get(i10).f12979a < I) {
            i10++;
        }
        C0218a aVar = this.f12972n.get(i10 - 1);
        C0218a aVar2 = this.f12972n.get(i10);
        long j11 = aVar.f12979a;
        long j12 = aVar.f12980b;
        return j12 + ((long) ((((float) (I - j11)) / ((float) (aVar2.f12979a - j11))) * ((float) (aVar2.f12980b - j12))));
    }

    private long D(List<? extends n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        n nVar = (n) f0.c(list);
        long j10 = nVar.f9313g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = nVar.f9314h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private long F(o[] oVarArr, List<? extends n> list) {
        int i10 = this.f12975q;
        if (i10 >= oVarArr.length || !oVarArr[i10].next()) {
            for (o oVar : oVarArr) {
                if (oVar.next()) {
                    return oVar.b() - oVar.a();
                }
            }
            return D(list);
        }
        o oVar2 = oVarArr[this.f12975q];
        return oVar2.b() - oVar2.a();
    }

    private static long[][] G(h.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            h.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f13040b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f13040b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = (long) aVar.f13039a.b(iArr[i11]).f8092o;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static x<Integer> H(long[][] jArr) {
        double d10;
        long[][] jArr2 = jArr;
        h0<K, V> c10 = p0.a().a().c();
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            if (jArr2[i10].length > 1) {
                int length = jArr2[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    int length2 = jArr2[i10].length;
                    double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i11 >= length2) {
                        break;
                    }
                    if (jArr2[i10][i11] != -1) {
                        d11 = Math.log((double) jArr2[i10][i11]);
                    }
                    dArr[i11] = d11;
                    i11++;
                }
                int i12 = length - 1;
                double d12 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d13 = dArr[i13];
                    i13++;
                    double d14 = (d13 + dArr[i13]) * 0.5d;
                    if (d12 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    c10.put(Double.valueOf(d10), Integer.valueOf(i10));
                }
            }
        }
        return x.n(c10.values());
    }

    private long I(long j10) {
        long f10 = (long) (((float) this.f12966h.f()) * this.f12970l);
        long a10 = this.f12966h.a();
        if (a10 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return (long) (((float) f10) / this.f12974p);
        }
        float f11 = (float) j10;
        return (long) ((((float) f10) * Math.max((f11 / this.f12974p) - ((float) a10), 0.0f)) / f11);
    }

    private long J(long j10) {
        if (j10 != -9223372036854775807L && j10 <= this.f12967i) {
            return (long) (((float) j10) * this.f12971m);
        }
        return this.f12967i;
    }

    private static void y(List<x.a<C0218a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            x.a aVar = list.get(i10);
            if (aVar != null) {
                aVar.f(new C0218a(j10, jArr[i10]));
            }
        }
    }

    /* access modifiers changed from: protected */
    public long E() {
        return this.f12969k;
    }

    /* access modifiers changed from: protected */
    public boolean K(long j10, List<? extends n> list) {
        long j11 = this.f12977s;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || (!list.isEmpty() && !((n) f0.c(list)).equals(this.f12978t));
    }

    public int c() {
        return this.f12975q;
    }

    public void d(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr) {
        long elapsedRealtime = this.f12973o.elapsedRealtime();
        long F = F(oVarArr, list);
        int i10 = this.f12976r;
        if (i10 == 0) {
            this.f12976r = 1;
            this.f12975q = A(elapsedRealtime, F);
            return;
        }
        int i11 = this.f12975q;
        int a10 = list.isEmpty() ? -1 : a(((n) f0.c(list)).f9310d);
        if (a10 != -1) {
            i10 = ((n) f0.c(list)).f9311e;
            i11 = a10;
        }
        int A = A(elapsedRealtime, F);
        if (!f(i11, elapsedRealtime)) {
            j i12 = i(i11);
            j i13 = i(A);
            if ((i13.f8092o > i12.f8092o && j11 < J(j12)) || (i13.f8092o < i12.f8092o && j11 >= this.f12968j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f12976r = i10;
        this.f12975q = A;
    }

    public void h() {
        this.f12978t = null;
    }

    public void j() {
        this.f12977s = -9223372036854775807L;
        this.f12978t = null;
    }

    public int m(long j10, List<? extends n> list) {
        int i10;
        int i11;
        long elapsedRealtime = this.f12973o.elapsedRealtime();
        if (!K(elapsedRealtime, list)) {
            return list.size();
        }
        this.f12977s = elapsedRealtime;
        this.f12978t = list.isEmpty() ? null : (n) f0.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long Z = m0.Z(((n) list.get(size - 1)).f9313g - j10, this.f12974p);
        long E = E();
        if (Z < E) {
            return size;
        }
        j i12 = i(A(elapsedRealtime, D(list)));
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) list.get(i13);
            j jVar = nVar.f9310d;
            if (m0.Z(nVar.f9313g - j10, this.f12974p) >= E && jVar.f8092o < i12.f8092o && (i10 = jVar.f8102y) != -1 && i10 < 720 && (i11 = jVar.f8101x) != -1 && i11 < 1280 && i10 < i12.f8102y) {
                return i13;
            }
        }
        return size;
    }

    public int p() {
        return this.f12976r;
    }

    public void q(float f10) {
        this.f12974p = f10;
    }

    public Object r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean z(j jVar, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
