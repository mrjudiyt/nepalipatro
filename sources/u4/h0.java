package u4;

import a6.i0;
import a6.m0;
import a6.x;
import a6.y;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.y;
import u4.i0;

/* compiled from: TsExtractor */
public final class h0 implements i {

    /* renamed from: t  reason: collision with root package name */
    public static final o f11820t = g0.f16607b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f11821a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11822b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<i0> f11823c;

    /* renamed from: d  reason: collision with root package name */
    private final y f11824d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f11825e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final i0.c f11826f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray<i0> f11827g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f11828h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f11829i;

    /* renamed from: j  reason: collision with root package name */
    private final f0 f11830j;

    /* renamed from: k  reason: collision with root package name */
    private e0 f11831k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public k f11832l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f11833m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f11834n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11835o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11836p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public i0 f11837q;

    /* renamed from: r  reason: collision with root package name */
    private int f11838r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int f11839s;

    /* compiled from: TsExtractor */
    private class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final x f11840a = new x(new byte[4]);

        public a() {
        }

        public void a(y yVar) {
            if (yVar.C() == 0 && (yVar.C() & 128) != 0) {
                yVar.P(6);
                int a10 = yVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    yVar.i(this.f11840a, 4);
                    int h10 = this.f11840a.h(16);
                    this.f11840a.r(3);
                    if (h10 == 0) {
                        this.f11840a.r(13);
                    } else {
                        int h11 = this.f11840a.h(13);
                        if (h0.this.f11827g.get(h11) == null) {
                            h0.this.f11827g.put(h11, new c0(new b(h11)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f11821a != 2) {
                    h0.this.f11827g.remove(0);
                }
            }
        }

        public void c(a6.i0 i0Var, k kVar, i0.d dVar) {
        }
    }

    /* compiled from: TsExtractor */
    private class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final x f11842a = new x(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<i0> f11843b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f11844c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f11845d;

        public b(int i10) {
            this.f11845d = i10;
        }

        private i0.b b(y yVar, int i10) {
            int e10 = yVar.e();
            int i11 = i10 + e10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (yVar.e() < i11) {
                int C = yVar.C();
                int e11 = yVar.e() + yVar.C();
                if (e11 > i11) {
                    break;
                }
                if (C == 5) {
                    long E = yVar.E();
                    if (E != 1094921523) {
                        if (E != 1161904947) {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i12 = 36;
                                }
                                yVar.P(e11 - yVar.e());
                            }
                        }
                        i12 = 135;
                        yVar.P(e11 - yVar.e());
                    }
                    i12 = 129;
                    yVar.P(e11 - yVar.e());
                } else {
                    if (C != 106) {
                        if (C != 122) {
                            if (C == 127) {
                                if (yVar.C() != 21) {
                                }
                            } else if (C == 123) {
                                i12 = 138;
                            } else if (C == 10) {
                                str = yVar.z(3).trim();
                            } else if (C == 89) {
                                arrayList = new ArrayList();
                                while (yVar.e() < e11) {
                                    String trim = yVar.z(3).trim();
                                    int C2 = yVar.C();
                                    byte[] bArr = new byte[4];
                                    yVar.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, C2, bArr));
                                }
                                i12 = 89;
                            } else if (C == 111) {
                                i12 = 257;
                            }
                            yVar.P(e11 - yVar.e());
                        }
                        i12 = 135;
                        yVar.P(e11 - yVar.e());
                    }
                    i12 = 129;
                    yVar.P(e11 - yVar.e());
                }
                i12 = 172;
                yVar.P(e11 - yVar.e());
            }
            yVar.O(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(yVar.d(), e10, i11));
        }

        public void a(y yVar) {
            a6.i0 i0Var;
            i0 i0Var2;
            y yVar2 = yVar;
            if (yVar.C() == 2) {
                if (h0.this.f11821a == 1 || h0.this.f11821a == 2 || h0.this.f11833m == 1) {
                    i0Var = (a6.i0) h0.this.f11823c.get(0);
                } else {
                    i0Var = new a6.i0(((a6.i0) h0.this.f11823c.get(0)).c());
                    h0.this.f11823c.add(i0Var);
                }
                if ((yVar.C() & 128) != 0) {
                    yVar2.P(1);
                    int I = yVar.I();
                    int i10 = 3;
                    yVar2.P(3);
                    yVar2.i(this.f11842a, 2);
                    this.f11842a.r(3);
                    int i11 = 13;
                    int unused = h0.this.f11839s = this.f11842a.h(13);
                    yVar2.i(this.f11842a, 2);
                    int i12 = 4;
                    this.f11842a.r(4);
                    yVar2.P(this.f11842a.h(12));
                    if (h0.this.f11821a == 2 && h0.this.f11837q == null) {
                        i0.b bVar = new i0.b(21, (String) null, (List<i0.a>) null, m0.f210f);
                        h0 h0Var = h0.this;
                        i0 unused2 = h0Var.f11837q = h0Var.f11826f.a(21, bVar);
                        h0.this.f11837q.c(i0Var, h0.this.f11832l, new i0.d(I, 21, 8192));
                    }
                    this.f11843b.clear();
                    this.f11844c.clear();
                    int a10 = yVar.a();
                    while (a10 > 0) {
                        yVar2.i(this.f11842a, 5);
                        int h10 = this.f11842a.h(8);
                        this.f11842a.r(i10);
                        int h11 = this.f11842a.h(i11);
                        this.f11842a.r(i12);
                        int h12 = this.f11842a.h(12);
                        i0.b b10 = b(yVar2, h12);
                        if (h10 == 6 || h10 == 5) {
                            h10 = b10.f11872a;
                        }
                        a10 -= h12 + 5;
                        int i13 = h0.this.f11821a == 2 ? h10 : h11;
                        if (!h0.this.f11828h.get(i13)) {
                            if (h0.this.f11821a == 2 && h10 == 21) {
                                i0Var2 = h0.this.f11837q;
                            } else {
                                i0Var2 = h0.this.f11826f.a(h10, b10);
                            }
                            if (h0.this.f11821a != 2 || h11 < this.f11844c.get(i13, 8192)) {
                                this.f11844c.put(i13, h11);
                                this.f11843b.put(i13, i0Var2);
                            }
                        }
                        i10 = 3;
                        i12 = 4;
                        i11 = 13;
                    }
                    int size = this.f11844c.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        int keyAt = this.f11844c.keyAt(i14);
                        int valueAt = this.f11844c.valueAt(i14);
                        h0.this.f11828h.put(keyAt, true);
                        h0.this.f11829i.put(valueAt, true);
                        i0 valueAt2 = this.f11843b.valueAt(i14);
                        if (valueAt2 != null) {
                            if (valueAt2 != h0.this.f11837q) {
                                valueAt2.c(i0Var, h0.this.f11832l, new i0.d(I, keyAt, 8192));
                            }
                            h0.this.f11827g.put(valueAt, valueAt2);
                        }
                    }
                    if (h0.this.f11821a != 2) {
                        h0.this.f11827g.remove(this.f11845d);
                        h0 h0Var2 = h0.this;
                        int unused3 = h0Var2.f11833m = h0Var2.f11821a == 1 ? 0 : h0.this.f11833m - 1;
                        if (h0.this.f11833m == 0) {
                            h0.this.f11832l.o();
                            boolean unused4 = h0.this.f11834n = true;
                        }
                    } else if (!h0.this.f11834n) {
                        h0.this.f11832l.o();
                        int unused5 = h0.this.f11833m = 0;
                        boolean unused6 = h0.this.f11834n = true;
                    }
                }
            }
        }

        public void c(a6.i0 i0Var, k kVar, i0.d dVar) {
        }
    }

    public h0() {
        this(0);
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i10 = h0Var.f11833m;
        h0Var.f11833m = i10 + 1;
        return i10;
    }

    private boolean u(j jVar) {
        byte[] d10 = this.f11824d.d();
        if (9400 - this.f11824d.e() < 188) {
            int a10 = this.f11824d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f11824d.e(), d10, 0, a10);
            }
            this.f11824d.M(d10, a10);
        }
        while (this.f11824d.a() < 188) {
            int f10 = this.f11824d.f();
            int read = jVar.read(d10, f10, 9400 - f10);
            if (read == -1) {
                return false;
            }
            this.f11824d.N(f10 + read);
        }
        return true;
    }

    private int v() {
        int e10 = this.f11824d.e();
        int f10 = this.f11824d.f();
        int a10 = j0.a(this.f11824d.d(), e10, f10);
        this.f11824d.O(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f11838r + (a10 - e10);
            this.f11838r = i11;
            if (this.f11821a == 2 && i11 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
            }
        } else {
            this.f11838r = 0;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] w() {
        return new i[]{new h0()};
    }

    private void x(long j10) {
        if (!this.f11835o) {
            this.f11835o = true;
            if (this.f11830j.b() != -9223372036854775807L) {
                e0 e0Var = new e0(this.f11830j.c(), this.f11830j.b(), j10, this.f11839s, this.f11822b);
                this.f11831k = e0Var;
                this.f11832l.i(e0Var.b());
                return;
            }
            this.f11832l.i(new y.b(this.f11830j.b()));
        }
    }

    private void y() {
        this.f11828h.clear();
        this.f11827g.clear();
        SparseArray<i0> b10 = this.f11826f.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11827g.put(b10.keyAt(i10), b10.valueAt(i10));
        }
        this.f11827g.put(0, new c0(new a()));
        this.f11837q = null;
    }

    private boolean z(int i10) {
        if (this.f11821a == 2 || this.f11834n || !this.f11829i.get(i10, false)) {
            return true;
        }
        return false;
    }

    public void b(long j10, long j11) {
        e0 e0Var;
        a6.a.f(this.f11821a != 2);
        int size = this.f11823c.size();
        for (int i10 = 0; i10 < size; i10++) {
            a6.i0 i0Var = this.f11823c.get(i10);
            boolean z10 = i0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = i0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                i0Var.g(j11);
            }
        }
        if (!(j11 == 0 || (e0Var = this.f11831k) == null)) {
            e0Var.h(j11);
        }
        this.f11824d.K(0);
        this.f11825e.clear();
        for (int i11 = 0; i11 < this.f11827g.size(); i11++) {
            this.f11827g.valueAt(i11).b();
        }
        this.f11838r = 0;
    }

    public void c(k kVar) {
        this.f11832l = kVar;
    }

    public boolean d(j jVar) {
        boolean z10;
        byte[] d10 = this.f11824d.d();
        jVar.o(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                jVar.l(i10);
                return true;
            }
        }
        return false;
    }

    public int g(j jVar, k4.x xVar) {
        j jVar2 = jVar;
        k4.x xVar2 = xVar;
        long a10 = jVar.a();
        if (this.f11834n) {
            if (((a10 == -1 || this.f11821a == 2) ? false : true) && !this.f11830j.d()) {
                return this.f11830j.e(jVar2, xVar2, this.f11839s);
            }
            x(a10);
            if (this.f11836p) {
                this.f11836p = false;
                b(0, 0);
                if (jVar.getPosition() != 0) {
                    xVar2.f9627a = 0;
                    return 1;
                }
            }
            e0 e0Var = this.f11831k;
            if (e0Var != null && e0Var.d()) {
                return this.f11831k.c(jVar2, xVar2);
            }
        }
        if (!u(jVar)) {
            return -1;
        }
        int v10 = v();
        int f10 = this.f11824d.f();
        if (v10 > f10) {
            return 0;
        }
        int m10 = this.f11824d.m();
        if ((8388608 & m10) != 0) {
            this.f11824d.O(v10);
            return 0;
        }
        int i10 = ((4194304 & m10) != 0 ? 1 : 0) | 0;
        int i11 = (2096896 & m10) >> 8;
        boolean z10 = (m10 & 32) != 0;
        i0 i0Var = (m10 & 16) != 0 ? this.f11827g.get(i11) : null;
        if (i0Var == null) {
            this.f11824d.O(v10);
            return 0;
        }
        if (this.f11821a != 2) {
            int i12 = m10 & 15;
            int i13 = this.f11825e.get(i11, i12 - 1);
            this.f11825e.put(i11, i12);
            if (i13 == i12) {
                this.f11824d.O(v10);
                return 0;
            } else if (i12 != ((i13 + 1) & 15)) {
                i0Var.b();
            }
        }
        if (z10) {
            int C = this.f11824d.C();
            i10 |= (this.f11824d.C() & 64) != 0 ? 2 : 0;
            this.f11824d.P(C - 1);
        }
        boolean z11 = this.f11834n;
        if (z(i11)) {
            this.f11824d.N(v10);
            i0Var.a(this.f11824d, i10);
            this.f11824d.N(f10);
        }
        if (this.f11821a != 2 && !z11 && this.f11834n && a10 != -1) {
            this.f11836p = true;
        }
        this.f11824d.O(v10);
        return 0;
    }

    public void release() {
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new a6.i0(0), new j(i11), i12);
    }

    public h0(int i10, a6.i0 i0Var, i0.c cVar) {
        this(i10, i0Var, cVar, 112800);
    }

    public h0(int i10, a6.i0 i0Var, i0.c cVar, int i11) {
        this.f11826f = (i0.c) a6.a.e(cVar);
        this.f11822b = i11;
        this.f11821a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f11823c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f11823c = arrayList;
            arrayList.add(i0Var);
        }
        this.f11824d = new a6.y(new byte[9400], 0);
        this.f11828h = new SparseBooleanArray();
        this.f11829i = new SparseBooleanArray();
        this.f11827g = new SparseArray<>();
        this.f11825e = new SparseIntArray();
        this.f11830j = new f0(i11);
        this.f11839s = -1;
        y();
    }
}
