package l5;

import a6.m0;
import a6.t;
import a6.y;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import com.google.common.collect.f0;
import com.google.common.collect.x;
import e4.j;
import g5.w;
import i5.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k4.a0;
import k4.b0;
import k4.k;
import l5.f;
import x4.a;
import y5.n;

/* compiled from: HlsSampleStreamWrapper */
final class p implements Loader.b<f>, Loader.f, v, k, u.d {

    /* renamed from: e0  reason: collision with root package name */
    private static final Set<Integer> f10065e0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    private f A;
    private d[] B;
    private int[] C = new int[0];
    private Set<Integer> D;
    private SparseIntArray E;
    private b0 F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private j L;
    private j M;
    private boolean N;
    private w O;
    private Set<g5.v> P;
    private int[] Q;
    private int R;
    private boolean S;
    private boolean[] T;
    private boolean[] U;
    private long V;
    private long W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10066a0;

    /* renamed from: b0  reason: collision with root package name */
    private long f10067b0;

    /* renamed from: c0  reason: collision with root package name */
    private h f10068c0;

    /* renamed from: d0  reason: collision with root package name */
    private i f10069d0;

    /* renamed from: h  reason: collision with root package name */
    private final int f10070h;

    /* renamed from: i  reason: collision with root package name */
    private final b f10071i;

    /* renamed from: j  reason: collision with root package name */
    private final f f10072j;

    /* renamed from: k  reason: collision with root package name */
    private final z5.b f10073k;

    /* renamed from: l  reason: collision with root package name */
    private final j f10074l;

    /* renamed from: m  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f10075m;

    /* renamed from: n  reason: collision with root package name */
    private final i.a f10076n;

    /* renamed from: o  reason: collision with root package name */
    private final g f10077o;

    /* renamed from: p  reason: collision with root package name */
    private final Loader f10078p = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: q  reason: collision with root package name */
    private final l.a f10079q;

    /* renamed from: r  reason: collision with root package name */
    private final int f10080r;

    /* renamed from: s  reason: collision with root package name */
    private final f.b f10081s = new f.b();

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList<i> f10082t;

    /* renamed from: u  reason: collision with root package name */
    private final List<i> f10083u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f10084v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f10085w;

    /* renamed from: x  reason: collision with root package name */
    private final Handler f10086x;

    /* renamed from: y  reason: collision with root package name */
    private final ArrayList<l> f10087y;

    /* renamed from: z  reason: collision with root package name */
    private final Map<String, h> f10088z;

    /* compiled from: HlsSampleStreamWrapper */
    public interface b extends v.a<p> {
        void j(Uri uri);

        void onPrepared();
    }

    /* compiled from: HlsSampleStreamWrapper */
    private static class c implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private static final j f10089g = new j.b().e0("application/id3").E();

        /* renamed from: h  reason: collision with root package name */
        private static final j f10090h = new j.b().e0("application/x-emsg").E();

        /* renamed from: a  reason: collision with root package name */
        private final z4.b f10091a = new z4.b();

        /* renamed from: b  reason: collision with root package name */
        private final b0 f10092b;

        /* renamed from: c  reason: collision with root package name */
        private final j f10093c;

        /* renamed from: d  reason: collision with root package name */
        private j f10094d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f10095e;

        /* renamed from: f  reason: collision with root package name */
        private int f10096f;

        public c(b0 b0Var, int i10) {
            this.f10092b = b0Var;
            if (i10 == 1) {
                this.f10093c = f10089g;
            } else if (i10 == 3) {
                this.f10093c = f10090h;
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown metadataType: ");
                sb.append(i10);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f10095e = new byte[0];
            this.f10096f = 0;
        }

        private boolean g(z4.a aVar) {
            j u10 = aVar.u();
            return u10 != null && m0.c(this.f10093c.f8096s, u10.f8096s);
        }

        private void h(int i10) {
            byte[] bArr = this.f10095e;
            if (bArr.length < i10) {
                this.f10095e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private y i(int i10, int i11) {
            int i12 = this.f10096f - i11;
            y yVar = new y(Arrays.copyOfRange(this.f10095e, i12 - i10, i12));
            byte[] bArr = this.f10095e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f10096f = i11;
            return yVar;
        }

        public /* synthetic */ void a(y yVar, int i10) {
            a0.b(this, yVar, i10);
        }

        public int b(z5.g gVar, int i10, boolean z10, int i11) {
            h(this.f10096f + i10);
            int read = gVar.read(this.f10095e, this.f10096f, i10);
            if (read != -1) {
                this.f10096f += read;
                return read;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        public /* synthetic */ int c(z5.g gVar, int i10, boolean z10) {
            return a0.a(this, gVar, i10, z10);
        }

        public void d(j jVar) {
            this.f10094d = jVar;
            this.f10092b.d(this.f10093c);
        }

        public void e(long j10, int i10, int i11, int i12, b0.a aVar) {
            a6.a.e(this.f10094d);
            y i13 = i(i11, i12);
            if (!m0.c(this.f10094d.f8096s, this.f10093c.f8096s)) {
                if ("application/x-emsg".equals(this.f10094d.f8096s)) {
                    z4.a c10 = this.f10091a.c(i13);
                    if (!g(c10)) {
                        a6.p.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f10093c.f8096s, c10.u()}));
                        return;
                    }
                    i13 = new y((byte[]) a6.a.e(c10.W()));
                } else {
                    String valueOf = String.valueOf(this.f10094d.f8096s);
                    a6.p.h("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
            }
            int a10 = i13.a();
            this.f10092b.a(i13, a10);
            this.f10092b.e(j10, i10, a10, i12, aVar);
        }

        public void f(y yVar, int i10, int i11) {
            h(this.f10096f + i10);
            yVar.j(this.f10095e, this.f10096f, i10);
            this.f10096f += i10;
        }
    }

    /* compiled from: HlsSampleStreamWrapper */
    private static final class d extends u {
        private final Map<String, h> I;
        private h J;

        private x4.a h0(x4.a aVar) {
            if (aVar == null) {
                return null;
            }
            int e10 = aVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e10) {
                    i11 = -1;
                    break;
                }
                a.b d10 = aVar.d(i11);
                if ((d10 instanceof c5.l) && "com.apple.streaming.transportStreamTimestamp".equals(((c5.l) d10).f5263i)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (e10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[(e10 - 1)];
            while (i10 < e10) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.d(i10);
                }
                i10++;
            }
            return new x4.a(bVarArr);
        }

        public void e(long j10, int i10, int i11, int i12, b0.a aVar) {
            super.e(j10, i10, i11, i12, aVar);
        }

        public void i0(h hVar) {
            this.J = hVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f10027k);
        }

        public j w(j jVar) {
            h hVar;
            h hVar2 = this.J;
            if (hVar2 == null) {
                hVar2 = jVar.f8099v;
            }
            if (!(hVar2 == null || (hVar = this.I.get(hVar2.f6567j)) == null)) {
                hVar2 = hVar;
            }
            x4.a h02 = h0(jVar.f8094q);
            if (!(hVar2 == jVar.f8099v && h02 == jVar.f8094q)) {
                jVar = jVar.b().L(hVar2).X(h02).E();
            }
            return super.w(jVar);
        }

        private d(z5.b bVar, Looper looper, com.google.android.exoplayer2.drm.j jVar, i.a aVar, Map<String, h> map) {
            super(bVar, looper, jVar, aVar);
            this.I = map;
        }
    }

    public p(int i10, b bVar, f fVar, Map<String, h> map, z5.b bVar2, long j10, j jVar, com.google.android.exoplayer2.drm.j jVar2, i.a aVar, g gVar, l.a aVar2, int i11) {
        this.f10070h = i10;
        this.f10071i = bVar;
        this.f10072j = fVar;
        this.f10088z = map;
        this.f10073k = bVar2;
        this.f10074l = jVar;
        this.f10075m = jVar2;
        this.f10076n = aVar;
        this.f10077o = gVar;
        this.f10079q = aVar2;
        this.f10080r = i11;
        Set<Integer> set = f10065e0;
        this.D = new HashSet(set.size());
        this.E = new SparseIntArray(set.size());
        this.B = new d[0];
        this.U = new boolean[0];
        this.T = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f10082t = arrayList;
        this.f10083u = Collections.unmodifiableList(arrayList);
        this.f10087y = new ArrayList<>();
        this.f10084v = new o(this);
        this.f10085w = new n(this);
        this.f10086x = m0.x();
        this.V = j10;
        this.W = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.f10082t.size(); i11++) {
            if (this.f10082t.get(i11).f10030n) {
                return false;
            }
        }
        i iVar = this.f10082t.get(i10);
        for (int i12 = 0; i12 < this.B.length; i12++) {
            if (this.B[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static k4.h C(int i10, int i11) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i10);
        sb.append(" of type ");
        sb.append(i11);
        a6.p.h("HlsSampleStreamWrapper", sb.toString());
        return new k4.h();
    }

    private u D(int i10, int i11) {
        int length = this.B.length;
        boolean z10 = true;
        if (!(i11 == 1 || i11 == 2)) {
            z10 = false;
        }
        d dVar = new d(this.f10073k, this.f10086x.getLooper(), this.f10075m, this.f10076n, this.f10088z);
        dVar.b0(this.V);
        if (z10) {
            dVar.i0(this.f10068c0);
        }
        dVar.a0(this.f10067b0);
        i iVar = this.f10069d0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.C, i12);
        this.C = copyOf;
        copyOf[length] = i10;
        this.B = (d[]) m0.t0(this.B, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.U, i12);
        this.U = copyOf2;
        copyOf2[length] = z10;
        this.S = copyOf2[length] | this.S;
        this.D.add(Integer.valueOf(i11));
        this.E.append(i11, length);
        if (M(i11) > M(this.G)) {
            this.H = length;
            this.G = i11;
        }
        this.T = Arrays.copyOf(this.T, i12);
        return dVar;
    }

    private w E(g5.v[] vVarArr) {
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            g5.v vVar = vVarArr[i10];
            j[] jVarArr = new j[vVar.f8920h];
            for (int i11 = 0; i11 < vVar.f8920h; i11++) {
                j b10 = vVar.b(i11);
                jVarArr[i11] = b10.c(this.f10075m.b(b10));
            }
            vVarArr[i10] = new g5.v(jVarArr);
        }
        return new w(vVarArr);
    }

    private static j F(j jVar, j jVar2, boolean z10) {
        String str;
        String str2;
        if (jVar == null) {
            return jVar2;
        }
        int l10 = t.l(jVar2.f8096s);
        if (m0.H(jVar.f8093p, l10) == 1) {
            str2 = m0.I(jVar.f8093p, l10);
            str = t.g(str2);
        } else {
            str2 = t.d(jVar.f8093p, jVar2.f8096s);
            str = jVar2.f8096s;
        }
        j.b I2 = jVar2.b().S(jVar.f8085h).U(jVar.f8086i).V(jVar.f8087j).g0(jVar.f8088k).c0(jVar.f8089l).G(z10 ? jVar.f8090m : -1).Z(z10 ? jVar.f8091n : -1).I(str2);
        if (l10 == 2) {
            I2.j0(jVar.f8101x).Q(jVar.f8102y).P(jVar.f8103z);
        }
        if (str != null) {
            I2.e0(str);
        }
        int i10 = jVar.F;
        if (i10 != -1 && l10 == 1) {
            I2.H(i10);
        }
        x4.a aVar = jVar.f8094q;
        if (aVar != null) {
            x4.a aVar2 = jVar2.f8094q;
            if (aVar2 != null) {
                aVar = aVar2.c(aVar);
            }
            I2.X(aVar);
        }
        return I2.E();
    }

    private void G(int i10) {
        a6.a.f(!this.f10078p.j());
        while (true) {
            if (i10 >= this.f10082t.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = K().f9314h;
            i H2 = H(i10);
            if (this.f10082t.isEmpty()) {
                this.W = this.V;
            } else {
                ((i) f0.c(this.f10082t)).o();
            }
            this.Z = false;
            this.f10079q.D(this.G, H2.f9313g, j10);
        }
    }

    private i H(int i10) {
        i iVar = this.f10082t.get(i10);
        ArrayList<i> arrayList = this.f10082t;
        m0.B0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.B.length; i11++) {
            this.B[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i10 = iVar.f10027k;
        int length = this.B.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.T[i11] && this.B[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(j jVar, j jVar2) {
        String str = jVar.f8096s;
        String str2 = jVar2.f8096s;
        int l10 = t.l(str);
        if (l10 != 3) {
            if (l10 == t.l(str2)) {
                return true;
            }
            return false;
        } else if (!m0.c(str, str2)) {
            return false;
        } else {
            if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && jVar.K != jVar2.K) {
                return false;
            }
            return true;
        }
    }

    private i K() {
        ArrayList<i> arrayList = this.f10082t;
        return arrayList.get(arrayList.size() - 1);
    }

    private b0 L(int i10, int i11) {
        a6.a.a(f10065e0.contains(Integer.valueOf(i11)));
        int i12 = this.E.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.D.add(Integer.valueOf(i11))) {
            this.C[i12] = i10;
        }
        if (this.C[i12] == i10) {
            return this.B[i12];
        }
        return C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void N(i iVar) {
        this.f10069d0 = iVar;
        this.L = iVar.f9310d;
        this.W = -9223372036854775807L;
        this.f10082t.add(iVar);
        x.a l10 = x.l();
        for (d G2 : this.B) {
            l10.f(Integer.valueOf(G2.G()));
        }
        iVar.n(this, l10.h());
        for (d dVar : this.B) {
            dVar.j0(iVar);
            if (iVar.f10030n) {
                dVar.g0();
            }
        }
    }

    private static boolean O(i5.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        return this.W != -9223372036854775807L;
    }

    private void R() {
        int i10 = this.O.f8924h;
        int[] iArr = new int[i10];
        this.Q = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.B;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((j) a6.a.h(dVarArr[i12].F()), this.O.b(i11).b(0))) {
                    this.Q[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<l> it = this.f10087y.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* access modifiers changed from: private */
    public void S() {
        if (!this.N && this.Q == null && this.I) {
            d[] dVarArr = this.B;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (dVarArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            if (this.O != null) {
                R();
                return;
            }
            z();
            k0();
            this.f10071i.onPrepared();
        }
    }

    /* access modifiers changed from: private */
    public void b0() {
        this.I = true;
        S();
    }

    private void f0() {
        for (d W2 : this.B) {
            W2.W(this.X);
        }
        this.X = false;
    }

    private boolean g0(long j10) {
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.B[i10].Z(j10, false) && (this.U[i10] || !this.S)) {
                return false;
            }
        }
        return true;
    }

    private void k0() {
        this.J = true;
    }

    private void p0(g5.t[] tVarArr) {
        this.f10087y.clear();
        for (l lVar : tVarArr) {
            if (lVar != null) {
                this.f10087y.add(lVar);
            }
        }
    }

    private void x() {
        a6.a.f(this.J);
        a6.a.e(this.O);
        a6.a.e(this.P);
    }

    private void z() {
        int length = this.B.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 7;
        int i12 = -1;
        while (true) {
            int i13 = 2;
            if (i10 >= length) {
                break;
            }
            String str = ((j) a6.a.h(this.B[i10].F())).f8096s;
            if (!t.s(str)) {
                if (t.p(str)) {
                    i13 = 1;
                } else {
                    i13 = t.r(str) ? 3 : 7;
                }
            }
            if (M(i13) > M(i11)) {
                i12 = i10;
                i11 = i13;
            } else if (i13 == i11 && i12 != -1) {
                i12 = -1;
            }
            i10++;
        }
        g5.v i14 = this.f10072j.i();
        int i15 = i14.f8920h;
        this.R = -1;
        this.Q = new int[length];
        for (int i16 = 0; i16 < length; i16++) {
            this.Q[i16] = i16;
        }
        g5.v[] vVarArr = new g5.v[length];
        for (int i17 = 0; i17 < length; i17++) {
            j jVar = (j) a6.a.h(this.B[i17].F());
            if (i17 == i12) {
                j[] jVarArr = new j[i15];
                if (i15 == 1) {
                    jVarArr[0] = jVar.f(i14.b(0));
                } else {
                    for (int i18 = 0; i18 < i15; i18++) {
                        jVarArr[i18] = F(i14.b(i18), jVar, true);
                    }
                }
                vVarArr[i17] = new g5.v(jVarArr);
                this.R = i17;
            } else {
                vVarArr[i17] = new g5.v(F((i11 != 2 || !t.p(jVar.f8096s)) ? null : this.f10074l, jVar, false));
            }
        }
        this.O = E(vVarArr);
        if (this.P == null) {
            z10 = true;
        }
        a6.a.f(z10);
        this.P = Collections.emptySet();
    }

    public void B() {
        if (!this.J) {
            d(this.V);
        }
    }

    public boolean Q(int i10) {
        return !P() && this.B[i10].K(this.Z);
    }

    public void T() {
        this.f10078p.a();
        this.f10072j.m();
    }

    public void U(int i10) {
        T();
        this.B[i10].N();
    }

    /* renamed from: V */
    public void k(i5.f fVar, long j10, long j11, boolean z10) {
        i5.f fVar2 = fVar;
        this.A = null;
        g5.h hVar = new g5.h(fVar2.f9307a, fVar2.f9308b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f10077o.c(fVar2.f9307a);
        this.f10079q.r(hVar, fVar2.f9309c, this.f10070h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, fVar2.f9313g, fVar2.f9314h);
        if (!z10) {
            if (P() || this.K == 0) {
                f0();
            }
            if (this.K > 0) {
                this.f10071i.i(this);
            }
        }
    }

    /* renamed from: W */
    public void l(i5.f fVar, long j10, long j11) {
        i5.f fVar2 = fVar;
        this.A = null;
        this.f10072j.o(fVar2);
        g5.h hVar = new g5.h(fVar2.f9307a, fVar2.f9308b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f10077o.c(fVar2.f9307a);
        this.f10079q.u(hVar, fVar2.f9309c, this.f10070h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, fVar2.f9313g, fVar2.f9314h);
        if (!this.J) {
            d(this.V);
        } else {
            this.f10071i.i(this);
        }
    }

    /* renamed from: X */
    public Loader.c s(i5.f fVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVar;
        int i11;
        i5.f fVar2 = fVar;
        IOException iOException2 = iOException;
        boolean O2 = O(fVar);
        if (O2 && !((i) fVar2).q() && (iOException2 instanceof HttpDataSource.InvalidResponseCodeException) && ((i11 = ((HttpDataSource.InvalidResponseCodeException) iOException2).f7656k) == 410 || i11 == 404)) {
            return Loader.f7662d;
        }
        long a10 = fVar.a();
        g5.h hVar = new g5.h(fVar2.f9307a, fVar2.f9308b, fVar.f(), fVar.e(), j10, j11, a10);
        g.c cVar2 = new g.c(hVar, new g5.i(fVar2.f9309c, this.f10070h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, e4.c.e(fVar2.f9313g), e4.c.e(fVar2.f9314h)), iOException2, i10);
        g.b b10 = this.f10077o.b(n.a(this.f10072j.j()), cVar2);
        boolean z10 = false;
        boolean l10 = (b10 == null || b10.f7762a != 2) ? false : this.f10072j.l(fVar2, b10.f7763b);
        if (l10) {
            if (O2 && a10 == 0) {
                ArrayList<i> arrayList = this.f10082t;
                if (arrayList.remove(arrayList.size() - 1) == fVar2) {
                    z10 = true;
                }
                a6.a.f(z10);
                if (this.f10082t.isEmpty()) {
                    this.W = this.V;
                } else {
                    ((i) f0.c(this.f10082t)).o();
                }
            }
            cVar = Loader.f7664f;
        } else {
            long a11 = this.f10077o.a(cVar2);
            if (a11 != -9223372036854775807L) {
                cVar = Loader.h(false, a11);
            } else {
                cVar = Loader.f7665g;
            }
        }
        Loader.c cVar3 = cVar;
        boolean z11 = !cVar3.c();
        this.f10079q.w(hVar, fVar2.f9309c, this.f10070h, fVar2.f9310d, fVar2.f9311e, fVar2.f9312f, fVar2.f9313g, fVar2.f9314h, iOException, z11);
        if (z11) {
            this.A = null;
            this.f10077o.c(fVar2.f9307a);
        }
        if (l10) {
            if (!this.J) {
                d(this.V);
            } else {
                this.f10071i.i(this);
            }
        }
        return cVar3;
    }

    public void Y() {
        this.D.clear();
    }

    public boolean Z(Uri uri, g.c cVar, boolean z10) {
        g.b b10;
        if (!this.f10072j.n(uri)) {
            return true;
        }
        long j10 = -9223372036854775807L;
        if (!z10 && (b10 = this.f10077o.b(n.a(this.f10072j.j()), cVar)) != null && b10.f7762a == 2) {
            j10 = b10.f7763b;
        }
        return this.f10072j.p(uri, j10);
    }

    public void a(j jVar) {
        this.f10086x.post(this.f10084v);
    }

    public void a0() {
        if (!this.f10082t.isEmpty()) {
            i iVar = (i) f0.c(this.f10082t);
            int b10 = this.f10072j.b(iVar);
            if (b10 == 1) {
                iVar.v();
            } else if (b10 == 2 && !this.Z && this.f10078p.j()) {
                this.f10078p.f();
            }
        }
    }

    public long b() {
        if (P()) {
            return this.W;
        }
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        return K().f9314h;
    }

    public void c0(g5.v[] vVarArr, int i10, int... iArr) {
        this.O = E(vVarArr);
        this.P = new HashSet();
        for (int b10 : iArr) {
            this.P.add(this.O.b(b10));
        }
        this.R = i10;
        Handler handler = this.f10086x;
        b bVar = this.f10071i;
        Objects.requireNonNull(bVar);
        handler.post(new m(bVar));
        k0();
    }

    public boolean d(long j10) {
        long j11;
        List<i> list;
        if (this.Z || this.f10078p.j() || this.f10078p.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            j11 = this.W;
            for (d b02 : this.B) {
                b02.b0(this.W);
            }
        } else {
            list = this.f10083u;
            i K2 = K();
            if (K2.h()) {
                j11 = K2.f9314h;
            } else {
                j11 = Math.max(this.V, K2.f9313g);
            }
        }
        List<i> list2 = list;
        long j12 = j11;
        this.f10081s.a();
        this.f10072j.d(j10, j12, list2, this.J || !list2.isEmpty(), this.f10081s);
        f.b bVar = this.f10081s;
        boolean z10 = bVar.f10016b;
        i5.f fVar = bVar.f10015a;
        Uri uri = bVar.f10017c;
        if (z10) {
            this.W = -9223372036854775807L;
            this.Z = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f10071i.j(uri);
            }
            return false;
        } else {
            if (O(fVar)) {
                N((i) fVar);
            }
            this.A = fVar;
            this.f10079q.A(new g5.h(fVar.f9307a, fVar.f9308b, this.f10078p.n(fVar, this, this.f10077o.d(fVar.f9309c))), fVar.f9309c, this.f10070h, fVar.f9310d, fVar.f9311e, fVar.f9312f, fVar.f9313g, fVar.f9314h);
            return true;
        }
    }

    public int d0(int i10, e4.k kVar, DecoderInputBuffer decoderInputBuffer, int i11) {
        j jVar;
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f10082t.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f10082t.size() - 1 && I(this.f10082t.get(i13))) {
                i13++;
            }
            m0.B0(this.f10082t, 0, i13);
            i iVar = this.f10082t.get(0);
            j jVar2 = iVar.f9310d;
            if (!jVar2.equals(this.M)) {
                this.f10079q.i(this.f10070h, jVar2, iVar.f9311e, iVar.f9312f, iVar.f9313g);
            }
            this.M = jVar2;
        }
        if (!this.f10082t.isEmpty() && !this.f10082t.get(0).q()) {
            return -3;
        }
        int S2 = this.B[i10].S(kVar, decoderInputBuffer, i11, this.Z);
        if (S2 == -5) {
            j jVar3 = (j) a6.a.e(kVar.f8131b);
            if (i10 == this.H) {
                int Q2 = this.B[i10].Q();
                while (i12 < this.f10082t.size() && this.f10082t.get(i12).f10027k != Q2) {
                    i12++;
                }
                if (i12 < this.f10082t.size()) {
                    jVar = this.f10082t.get(i12).f9310d;
                } else {
                    jVar = (j) a6.a.e(this.L);
                }
                jVar3 = jVar3.f(jVar);
            }
            kVar.f8131b = jVar3;
        }
        return S2;
    }

    public b0 e(int i10, int i11) {
        b0 b0Var;
        if (!f10065e0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                b0[] b0VarArr = this.B;
                if (i12 >= b0VarArr.length) {
                    b0Var = null;
                    break;
                } else if (this.C[i12] == i10) {
                    b0Var = b0VarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            b0Var = L(i10, i11);
        }
        if (b0Var == null) {
            if (this.f10066a0) {
                return C(i10, i11);
            }
            b0Var = D(i10, i11);
        }
        if (i11 != 5) {
            return b0Var;
        }
        if (this.F == null) {
            this.F = new c(b0Var, this.f10080r);
        }
        return this.F;
    }

    public void e0() {
        if (this.J) {
            for (d R2 : this.B) {
                R2.R();
            }
        }
        this.f10078p.m(this);
        this.f10086x.removeCallbacksAndMessages((Object) null);
        this.N = true;
        this.f10087y.clear();
    }

    public boolean f() {
        return this.f10078p.j();
    }

    public long g() {
        if (this.Z) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.W;
        }
        long j10 = this.V;
        i K2 = K();
        if (!K2.h()) {
            if (this.f10082t.size() > 1) {
                ArrayList<i> arrayList = this.f10082t;
                K2 = arrayList.get(arrayList.size() - 2);
            } else {
                K2 = null;
            }
        }
        if (K2 != null) {
            j10 = Math.max(j10, K2.f9314h);
        }
        if (this.I) {
            for (d z10 : this.B) {
                j10 = Math.max(j10, z10.z());
            }
        }
        return j10;
    }

    public void h(long j10) {
        if (!this.f10078p.i() && !P()) {
            if (this.f10078p.j()) {
                a6.a.e(this.A);
                if (this.f10072j.u(j10, this.A, this.f10083u)) {
                    this.f10078p.f();
                    return;
                }
                return;
            }
            int size = this.f10083u.size();
            while (size > 0 && this.f10072j.b(this.f10083u.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f10083u.size()) {
                G(size);
            }
            int g10 = this.f10072j.g(j10, this.f10083u);
            if (g10 < this.f10082t.size()) {
                G(g10);
            }
        }
    }

    public boolean h0(long j10, boolean z10) {
        this.V = j10;
        if (P()) {
            this.W = j10;
            return true;
        }
        if (this.I && !z10 && g0(j10)) {
            return false;
        }
        this.W = j10;
        this.Z = false;
        this.f10082t.clear();
        if (this.f10078p.j()) {
            if (this.I) {
                for (d r10 : this.B) {
                    r10.r();
                }
            }
            this.f10078p.f();
        } else {
            this.f10078p.g();
            f0();
        }
        return true;
    }

    public void i(k4.y yVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i0(y5.h[] r20, boolean[] r21, g5.t[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.x()
            int r3 = r0.K
            r14 = 0
            r4 = 0
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            l5.l r5 = (l5.l) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.K
            int r7 = r7 - r15
            r0.K = r7
            r5.d()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.Y
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.V
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            l5.f r4 = r0.f10072j
            y5.h r4 = r4.j()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a3
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x00a0
        L_0x0054:
            g5.w r7 = r0.O
            g5.v r8 = r5.b()
            int r7 = r7.c(r8)
            int r8 = r0.R
            if (r7 != r8) goto L_0x0068
            l5.f r8 = r0.f10072j
            r8.t(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a0
            int r5 = r0.K
            int r5 = r5 + r15
            r0.K = r5
            l5.l r5 = new l5.l
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.Q
            if (r5 == 0) goto L_0x00a0
            r5 = r2[r3]
            l5.l r5 = (l5.l) r5
            r5.b()
            if (r16 != 0) goto L_0x00a0
            l5.p$d[] r5 = r0.B
            int[] r8 = r0.Q
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.Z(r12, r15)
            if (r7 != 0) goto L_0x009d
            int r5 = r5.C()
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r16 = r5
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00a3:
            int r1 = r0.K
            if (r1 != 0) goto L_0x00da
            l5.f r1 = r0.f10072j
            r1.q()
            r0.M = r6
            r0.X = r15
            java.util.ArrayList<l5.i> r1 = r0.f10082t
            r1.clear()
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f10078p
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r0.I
            if (r1 == 0) goto L_0x00ce
            l5.p$d[] r1 = r0.B
            int r3 = r1.length
        L_0x00c4:
            if (r14 >= r3) goto L_0x00ce
            r4 = r1[r14]
            r4.r()
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00ce:
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f10078p
            r1.f()
            goto L_0x0140
        L_0x00d5:
            r19.f0()
            goto L_0x0140
        L_0x00da:
            java.util.ArrayList<l5.i> r1 = r0.f10082t
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012d
            boolean r1 = a6.m0.c(r11, r4)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r0.Y
            if (r1 != 0) goto L_0x0124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            long r3 = -r12
        L_0x00f3:
            r6 = r3
            l5.i r1 = r19.K()
            l5.f r3 = r0.f10072j
            i5.o[] r17 = r3.a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<l5.i> r10 = r0.f10083u
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.d(r4, r6, r8, r10, r11)
            l5.f r3 = r0.f10072j
            g5.v r3 = r3.i()
            e4.j r1 = r1.f9310d
            int r1 = r3.c(r1)
            int r3 = r18.n()
            if (r3 == r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0125
        L_0x0124:
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012d
            r0.X = r15
            r1 = 1
            r16 = 1
            goto L_0x012f
        L_0x012d:
            r1 = r26
        L_0x012f:
            if (r16 == 0) goto L_0x0140
            r0.h0(r12, r1)
        L_0x0134:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0140
            r1 = r2[r14]
            if (r1 == 0) goto L_0x013d
            r23[r14] = r15
        L_0x013d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0140:
            r0.p0(r2)
            r0.Y = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.p.i0(y5.h[], boolean[], g5.t[], boolean[], long, boolean):boolean");
    }

    public void j() {
        for (d T2 : this.B) {
            T2.T();
        }
    }

    public void j0(h hVar) {
        if (!m0.c(this.f10068c0, hVar)) {
            this.f10068c0 = hVar;
            int i10 = 0;
            while (true) {
                d[] dVarArr = this.B;
                if (i10 < dVarArr.length) {
                    if (this.U[i10]) {
                        dVarArr[i10].i0(hVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void l0(boolean z10) {
        this.f10072j.s(z10);
    }

    public void m() {
        T();
        if (this.Z && !this.J) {
            throw ParserException.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public void m0(long j10) {
        if (this.f10067b0 != j10) {
            this.f10067b0 = j10;
            for (d a02 : this.B) {
                a02.a0(j10);
            }
        }
    }

    public int n0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.B[i10];
        int E2 = dVar.E(j10, this.Z);
        i iVar = (i) f0.d(this.f10082t, null);
        if (iVar != null && !iVar.q()) {
            E2 = Math.min(E2, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E2);
        return E2;
    }

    public void o() {
        this.f10066a0 = true;
        this.f10086x.post(this.f10085w);
    }

    public void o0(int i10) {
        x();
        a6.a.e(this.Q);
        int i11 = this.Q[i10];
        a6.a.f(this.T[i11]);
        this.T[i11] = false;
    }

    public w r() {
        x();
        return this.O;
    }

    public void t(long j10, boolean z10) {
        if (this.I && !P()) {
            int length = this.B.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.B[i10].q(j10, z10, this.T[i10]);
            }
        }
    }

    public int y(int i10) {
        x();
        a6.a.e(this.Q);
        int i11 = this.Q[i10];
        if (i11 != -1) {
            boolean[] zArr = this.T;
            if (zArr[i11]) {
                return -2;
            }
            zArr[i11] = true;
            return i11;
        } else if (this.P.contains(this.O.b(i10))) {
            return -3;
        } else {
            return -2;
        }
    }
}
