package y5;

import a6.m0;
import a6.t;
import android.util.Pair;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.source.k;
import e4.r;
import e4.s;
import g5.v;
import g5.w;

/* compiled from: MappingTrackSelector */
public abstract class j extends o {

    /* renamed from: c  reason: collision with root package name */
    private a f13044c;

    /* compiled from: MappingTrackSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f13045a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f13046b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f13047c;

        /* renamed from: d  reason: collision with root package name */
        private final w[] f13048d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f13049e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f13050f;

        /* renamed from: g  reason: collision with root package name */
        private final w f13051g;

        a(String[] strArr, int[] iArr, w[] wVarArr, int[] iArr2, int[][][] iArr3, w wVar) {
            this.f13046b = strArr;
            this.f13047c = iArr;
            this.f13048d = wVarArr;
            this.f13050f = iArr3;
            this.f13049e = iArr2;
            this.f13051g = wVar;
            this.f13045a = iArr.length;
        }

        public int a() {
            return this.f13045a;
        }

        public int b(int i10) {
            return this.f13047c[i10];
        }

        public w c(int i10) {
            return this.f13048d[i10];
        }
    }

    private static int e(s[] sVarArr, v vVar, int[] iArr, boolean z10) {
        int length = sVarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            s sVar = sVarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < vVar.f8920h; i13++) {
                i12 = Math.max(i12, r.c(sVar.a(vVar.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] f(s sVar, v vVar) {
        int[] iArr = new int[vVar.f8920h];
        for (int i10 = 0; i10 < vVar.f8920h; i10++) {
            iArr[i10] = sVar.a(vVar.b(i10));
        }
        return iArr;
    }

    private static int[] g(s[] sVarArr) {
        int length = sVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = sVarArr[i10].p();
        }
        return iArr;
    }

    public final void c(Object obj) {
        this.f13044c = (a) obj;
    }

    public final p d(s[] sVarArr, w wVar, k.a aVar, a1 a1Var) {
        int[] iArr;
        s[] sVarArr2 = sVarArr;
        w wVar2 = wVar;
        int[] iArr2 = new int[(sVarArr2.length + 1)];
        int length = sVarArr2.length + 1;
        v[][] vVarArr = new v[length][];
        int[][][] iArr3 = new int[(sVarArr2.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = wVar2.f8924h;
            vVarArr[i10] = new v[i11];
            iArr3[i10] = new int[i11][];
        }
        int[] g10 = g(sVarArr);
        for (int i12 = 0; i12 < wVar2.f8924h; i12++) {
            v b10 = wVar2.b(i12);
            int e10 = e(sVarArr, b10, iArr2, t.l(b10.b(0).f8096s) == 5);
            if (e10 == sVarArr2.length) {
                iArr = new int[b10.f8920h];
            } else {
                iArr = f(sVarArr2[e10], b10);
            }
            int i13 = iArr2[e10];
            vVarArr[e10][i13] = b10;
            iArr3[e10][i13] = iArr;
            iArr2[e10] = iArr2[e10] + 1;
        }
        w[] wVarArr = new w[sVarArr2.length];
        String[] strArr = new String[sVarArr2.length];
        int[] iArr4 = new int[sVarArr2.length];
        for (int i14 = 0; i14 < sVarArr2.length; i14++) {
            int i15 = iArr2[i14];
            wVarArr[i14] = new w((v[]) m0.v0(vVarArr[i14], i15));
            iArr3[i14] = (int[][]) m0.v0(iArr3[i14], i15);
            strArr[i14] = sVarArr2[i14].b();
            iArr4[i14] = sVarArr2[i14].j();
        }
        a aVar2 = new a(strArr, iArr4, wVarArr, g10, iArr3, new w((v[]) m0.v0(vVarArr[sVarArr2.length], iArr2[sVarArr2.length])));
        Pair<e4.t[], h[]> h10 = h(aVar2, iArr3, g10, aVar, a1Var);
        return new p((e4.t[]) h10.first, (h[]) h10.second, aVar2);
    }

    /* access modifiers changed from: protected */
    public abstract Pair<e4.t[], h[]> h(a aVar, int[][][] iArr, int[] iArr2, k.a aVar2, a1 a1Var);
}
