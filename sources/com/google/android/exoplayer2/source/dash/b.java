package com.google.android.exoplayer2.source.dash;

import a6.m0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.g;
import e4.j;
import g5.d;
import g5.t;
import g5.w;
import i5.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k5.c;
import k5.f;
import y5.h;
import z5.p;
import z5.r;

/* compiled from: DashMediaPeriod */
final class b implements j, v.a<i<a>>, i.b<a> {
    private static final Pattern E = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern F = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private v A;
    private c B;
    private int C;
    private List<f> D;

    /* renamed from: h  reason: collision with root package name */
    final int f7198h;

    /* renamed from: i  reason: collision with root package name */
    private final a.C0114a f7199i;

    /* renamed from: j  reason: collision with root package name */
    private final r f7200j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f7201k;

    /* renamed from: l  reason: collision with root package name */
    private final g f7202l;

    /* renamed from: m  reason: collision with root package name */
    private final j5.b f7203m;

    /* renamed from: n  reason: collision with root package name */
    private final long f7204n;

    /* renamed from: o  reason: collision with root package name */
    private final p f7205o;

    /* renamed from: p  reason: collision with root package name */
    private final z5.b f7206p;

    /* renamed from: q  reason: collision with root package name */
    private final w f7207q;

    /* renamed from: r  reason: collision with root package name */
    private final a[] f7208r;

    /* renamed from: s  reason: collision with root package name */
    private final d f7209s;

    /* renamed from: t  reason: collision with root package name */
    private final e f7210t;

    /* renamed from: u  reason: collision with root package name */
    private final IdentityHashMap<i<a>, e.c> f7211u = new IdentityHashMap<>();

    /* renamed from: v  reason: collision with root package name */
    private final l.a f7212v;

    /* renamed from: w  reason: collision with root package name */
    private final i.a f7213w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f7214x;

    /* renamed from: y  reason: collision with root package name */
    private i5.i<a>[] f7215y = E(0);

    /* renamed from: z  reason: collision with root package name */
    private d[] f7216z = new d[0];

    /* compiled from: DashMediaPeriod */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f7217a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7218b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7219c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7220d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7221e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7222f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7223g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f7218b = i10;
            this.f7217a = iArr;
            this.f7219c = i11;
            this.f7221e = i12;
            this.f7222f = i13;
            this.f7223g = i14;
            this.f7220d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, c cVar, j5.b bVar, int i11, a.C0114a aVar, r rVar, com.google.android.exoplayer2.drm.j jVar, i.a aVar2, g gVar, l.a aVar3, long j10, p pVar, z5.b bVar2, d dVar, e.b bVar3) {
        z5.b bVar4 = bVar2;
        d dVar2 = dVar;
        this.f7198h = i10;
        this.B = cVar;
        this.f7203m = bVar;
        this.C = i11;
        this.f7199i = aVar;
        this.f7200j = rVar;
        this.f7201k = jVar;
        this.f7213w = aVar2;
        this.f7202l = gVar;
        this.f7212v = aVar3;
        this.f7204n = j10;
        this.f7205o = pVar;
        this.f7206p = bVar4;
        this.f7209s = dVar2;
        this.f7210t = new e(cVar, bVar3, bVar4);
        this.A = dVar2.a(this.f7215y);
        k5.g d10 = cVar.d(i11);
        List<f> list = d10.f9681d;
        this.D = list;
        Pair<w, a[]> s10 = s(jVar, d10.f9680c, list);
        this.f7207q = (w) s10.first;
        this.f7208r = (a[]) s10.second;
    }

    private int A(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f7208r[i11].f7221e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f7208r[i14].f7219c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] B(h[] hVarArr) {
        int[] iArr = new int[hVarArr.length];
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            if (hVarArr[i10] != null) {
                iArr[i10] = this.f7207q.c(hVarArr[i10].b());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean C(List<k5.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<k5.j> list2 = list.get(i10).f9637c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f9696e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int D(int i10, List<k5.a> list, int[][] iArr, boolean[] zArr, e4.j[][] jVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (C(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            jVarArr[i12] = y(list, iArr[i12]);
            if (jVarArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i5.i<a>[] E(int i10) {
        return new i5.i[i10];
    }

    private static e4.j[] G(k5.e eVar, Pattern pattern, e4.j jVar) {
        String str = eVar.f9671b;
        if (str == null) {
            return new e4.j[]{jVar};
        }
        String[] E0 = m0.E0(str, ";");
        e4.j[] jVarArr = new e4.j[E0.length];
        for (int i10 = 0; i10 < E0.length; i10++) {
            Matcher matcher = pattern.matcher(E0[i10]);
            if (!matcher.matches()) {
                return new e4.j[]{jVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            j.b b10 = jVar.b();
            String str2 = jVar.f8085h;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(CertificateUtil.DELIMITER);
            sb.append(parseInt);
            jVarArr[i10] = b10.S(sb.toString()).F(parseInt).V(matcher.group(2)).E();
        }
        return jVarArr;
    }

    private void I(h[] hVarArr, boolean[] zArr, t[] tVarArr) {
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            if (hVarArr[i10] == null || !zArr[i10]) {
                if (tVarArr[i10] instanceof i5.i) {
                    tVarArr[i10].P(this);
                } else if (tVarArr[i10] instanceof i.a) {
                    tVarArr[i10].c();
                }
                tVarArr[i10] = null;
            }
        }
    }

    private void J(h[] hVarArr, t[] tVarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            if ((tVarArr[i10] instanceof g5.g) || (tVarArr[i10] instanceof i.a)) {
                int A2 = A(i10, iArr);
                if (A2 == -1) {
                    z10 = tVarArr[i10] instanceof g5.g;
                } else {
                    z10 = (tVarArr[i10] instanceof i.a) && tVarArr[i10].f9337h == tVarArr[A2];
                }
                if (!z10) {
                    if (tVarArr[i10] instanceof i.a) {
                        tVarArr[i10].c();
                    }
                    tVarArr[i10] = null;
                }
            }
        }
    }

    private void K(h[] hVarArr, t[] tVarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            h hVar = hVarArr[i10];
            if (hVar != null) {
                if (tVarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f7208r[iArr[i10]];
                    int i11 = aVar.f7219c;
                    if (i11 == 0) {
                        tVarArr[i10] = o(aVar, hVar, j10);
                    } else if (i11 == 2) {
                        tVarArr[i10] = new d(this.D.get(aVar.f7220d), hVar.b().b(0), this.B.f9648d);
                    }
                } else if (tVarArr[i10] instanceof i5.i) {
                    ((a) tVarArr[i10].E()).h(hVar);
                }
            }
        }
        for (int i12 = 0; i12 < hVarArr.length; i12++) {
            if (tVarArr[i12] == null && hVarArr[i12] != null) {
                a aVar2 = this.f7208r[iArr[i12]];
                if (aVar2.f7219c == 1) {
                    int A2 = A(i12, iArr);
                    if (A2 == -1) {
                        tVarArr[i12] = new g5.g();
                    } else {
                        tVarArr[i12] = tVarArr[A2].S(j10, aVar2.f7218b);
                    }
                }
            }
        }
    }

    private static void e(List<f> list, g5.v[] vVarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            vVarArr[i10] = new g5.v(new j.b().S(list.get(i11).a()).e0("application/x-emsg").E());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int l(com.google.android.exoplayer2.drm.j jVar, List<k5.a> list, int[][] iArr, int i10, boolean[] zArr, e4.j[][] jVarArr, g5.v[] vVarArr, a[] aVarArr) {
        int i11;
        int i12;
        List<k5.a> list2 = list;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list2.get(i16).f9637c);
            }
            int size = arrayList.size();
            e4.j[] jVarArr2 = new e4.j[size];
            for (int i17 = 0; i17 < size; i17++) {
                e4.j jVar2 = ((k5.j) arrayList.get(i17)).f9693b;
                com.google.android.exoplayer2.drm.j jVar3 = jVar;
                jVarArr2[i17] = jVar2.c(jVar.b(jVar2));
            }
            com.google.android.exoplayer2.drm.j jVar4 = jVar;
            k5.a aVar = list2.get(iArr2[0]);
            int i18 = i15 + 1;
            if (zArr[i14]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (jVarArr[i14].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            vVarArr[i15] = new g5.v(jVarArr2);
            aVarArr[i15] = a.d(aVar.f9636b, iArr2, i15, i18, i11);
            if (i18 != -1) {
                j.b bVar = new j.b();
                int i19 = aVar.f9635a;
                StringBuilder sb = new StringBuilder(16);
                sb.append(i19);
                sb.append(":emsg");
                vVarArr[i18] = new g5.v(bVar.S(sb.toString()).e0("application/x-emsg").E());
                aVarArr[i18] = a.b(iArr2, i15);
            }
            if (i11 != -1) {
                vVarArr[i11] = new g5.v(jVarArr[i14]);
                aVarArr[i11] = a.a(iArr2, i15);
            }
            i14++;
            i15 = i12;
        }
        return i15;
    }

    private i5.i<a> o(a aVar, h hVar, long j10) {
        int i10;
        g5.v vVar;
        g5.v vVar2;
        int i11;
        i5.i<a> iVar;
        a aVar2 = aVar;
        int i12 = aVar2.f7222f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            vVar = this.f7207q.b(i12);
            i10 = 1;
        } else {
            vVar = null;
            i10 = 0;
        }
        int i13 = aVar2.f7223g;
        boolean z11 = i13 != -1;
        if (z11) {
            vVar2 = this.f7207q.b(i13);
            i10 += vVar2.f8920h;
        } else {
            vVar2 = null;
        }
        e4.j[] jVarArr = new e4.j[i10];
        int[] iArr = new int[i10];
        if (z10) {
            jVarArr[0] = vVar.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < vVar2.f8920h; i14++) {
                jVarArr[i11] = vVar2.b(i14);
                iArr[i11] = 3;
                arrayList.add(jVarArr[i11]);
                i11++;
            }
        }
        if (this.B.f9648d && z10) {
            cVar = this.f7210t.k();
        }
        e.c cVar2 = cVar;
        a a10 = this.f7199i.a(this.f7205o, this.B, this.f7203m, this.C, aVar2.f7217a, hVar, aVar2.f7218b, this.f7204n, z10, arrayList, cVar2, this.f7200j);
        i5.i<a> iVar2 = r1;
        e.c cVar3 = cVar2;
        i5.i<a> iVar3 = new i5.i<>(aVar2.f7218b, iArr, jVarArr, a10, this, this.f7206p, j10, this.f7201k, this.f7213w, this.f7202l, this.f7212v);
        synchronized (this) {
            iVar = iVar2;
            this.f7211u.put(iVar, cVar3);
        }
        return iVar;
    }

    private static Pair<w, a[]> s(com.google.android.exoplayer2.drm.j jVar, List<k5.a> list, List<f> list2) {
        int[][] z10 = z(list);
        int length = z10.length;
        boolean[] zArr = new boolean[length];
        e4.j[][] jVarArr = new e4.j[length][];
        int D2 = D(length, list, z10, zArr, jVarArr) + length + list2.size();
        g5.v[] vVarArr = new g5.v[D2];
        a[] aVarArr = new a[D2];
        e(list2, vVarArr, aVarArr, l(jVar, list, z10, length, zArr, jVarArr, vVarArr, aVarArr));
        return Pair.create(new w(vVarArr), aVarArr);
    }

    private static k5.e v(List<k5.e> list) {
        return w(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static k5.e w(List<k5.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            k5.e eVar = list.get(i10);
            if (str.equals(eVar.f9670a)) {
                return eVar;
            }
        }
        return null;
    }

    private static k5.e x(List<k5.e> list) {
        return w(list, "http://dashif.org/guidelines/trickmode");
    }

    private static e4.j[] y(List<k5.a> list, int[] iArr) {
        for (int i10 : iArr) {
            k5.a aVar = list.get(i10);
            List<k5.e> list2 = list.get(i10).f9638d;
            int i11 = 0;
            while (i11 < list2.size()) {
                k5.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f9670a)) {
                    j.b e02 = new j.b().e0("application/cea-608");
                    int i12 = aVar.f9635a;
                    StringBuilder sb = new StringBuilder(18);
                    sb.append(i12);
                    sb.append(":cea608");
                    return G(eVar, E, e02.S(sb.toString()).E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f9670a)) {
                    j.b e03 = new j.b().e0("application/cea-708");
                    int i13 = aVar.f9635a;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i13);
                    sb2.append(":cea708");
                    return G(eVar, F, e03.S(sb2.toString()).E());
                } else {
                    i11++;
                }
            }
        }
        return new e4.j[0];
    }

    private static int[][] z(List<k5.a> list) {
        int i10;
        k5.e v10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f9635a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            k5.a aVar = list.get(i12);
            k5.e x10 = x(aVar.f9639e);
            if (x10 == null) {
                x10 = x(aVar.f9640f);
            }
            if (x10 == null || (i10 = sparseIntArray.get(Integer.parseInt(x10.f9671b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (v10 = v(aVar.f9640f)) != null) {
                for (String parseInt : m0.E0(v10.f9671b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = n6.d.k((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    /* renamed from: F */
    public void i(i5.i<a> iVar) {
        this.f7214x.i(this);
    }

    public void H() {
        this.f7210t.o();
        for (i5.i<a> P : this.f7215y) {
            P.P(this);
        }
        this.f7214x = null;
    }

    public void L(c cVar, int i10) {
        this.B = cVar;
        this.C = i10;
        this.f7210t.q(cVar);
        i5.i<a>[] iVarArr = this.f7215y;
        if (iVarArr != null) {
            for (i5.i<a> E2 : iVarArr) {
                E2.E().e(cVar, i10);
            }
            this.f7214x.i(this);
        }
        this.D = cVar.d(i10).f9681d;
        for (d dVar : this.f7216z) {
            Iterator<f> it = this.D.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f next = it.next();
                if (next.a().equals(dVar.b())) {
                    boolean z10 = true;
                    int e10 = cVar.e() - 1;
                    if (!cVar.f9648d || i10 != e10) {
                        z10 = false;
                    }
                    dVar.d(next, z10);
                }
            }
        }
    }

    public synchronized void a(i5.i<a> iVar) {
        e.c remove = this.f7211u.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    public long b() {
        return this.A.b();
    }

    public long c(long j10, e4.v vVar) {
        for (i5.i<a> iVar : this.f7215y) {
            if (iVar.f9318h == 2) {
                return iVar.c(j10, vVar);
            }
        }
        return j10;
    }

    public boolean d(long j10) {
        return this.A.d(j10);
    }

    public boolean f() {
        return this.A.f();
    }

    public long g() {
        return this.A.g();
    }

    public void h(long j10) {
        this.A.h(j10);
    }

    public void m() {
        this.f7205o.a();
    }

    public long n(long j10) {
        for (i5.i<a> R : this.f7215y) {
            R.R(j10);
        }
        for (d c10 : this.f7216z) {
            c10.c(j10);
        }
        return j10;
    }

    public long p() {
        return -9223372036854775807L;
    }

    public void q(j.a aVar, long j10) {
        this.f7214x = aVar;
        aVar.k(this);
    }

    public w r() {
        return this.f7207q;
    }

    public void t(long j10, boolean z10) {
        for (i5.i<a> t10 : this.f7215y) {
            t10.t(j10, z10);
        }
    }

    public long u(h[] hVarArr, boolean[] zArr, t[] tVarArr, boolean[] zArr2, long j10) {
        int[] B2 = B(hVarArr);
        I(hVarArr, zArr, tVarArr);
        J(hVarArr, tVarArr, B2);
        K(hVarArr, tVarArr, zArr2, j10, B2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i5.i iVar : tVarArr) {
            if (iVar instanceof i5.i) {
                arrayList.add(iVar);
            } else if (iVar instanceof d) {
                arrayList2.add((d) iVar);
            }
        }
        i5.i<a>[] E2 = E(arrayList.size());
        this.f7215y = E2;
        arrayList.toArray(E2);
        d[] dVarArr = new d[arrayList2.size()];
        this.f7216z = dVarArr;
        arrayList2.toArray(dVarArr);
        this.A = this.f7209s.a(this.f7215y);
        return j10;
    }
}
