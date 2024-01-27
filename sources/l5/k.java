package l5;

import a6.a;
import a6.m0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.upstream.g;
import e4.j;
import g5.d;
import g5.t;
import g5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l5.p;
import z5.b;
import z5.r;

/* compiled from: HlsMediaPeriod */
public final class k implements j, p.b, HlsPlaylistTracker.b {
    private p[] A = new p[0];
    private int[][] B = new int[0][];
    private int C;
    private v D;

    /* renamed from: h  reason: collision with root package name */
    private final h f10043h;

    /* renamed from: i  reason: collision with root package name */
    private final HlsPlaylistTracker f10044i;

    /* renamed from: j  reason: collision with root package name */
    private final g f10045j;

    /* renamed from: k  reason: collision with root package name */
    private final r f10046k;

    /* renamed from: l  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.j f10047l;

    /* renamed from: m  reason: collision with root package name */
    private final i.a f10048m;

    /* renamed from: n  reason: collision with root package name */
    private final g f10049n;

    /* renamed from: o  reason: collision with root package name */
    private final l.a f10050o;

    /* renamed from: p  reason: collision with root package name */
    private final b f10051p;

    /* renamed from: q  reason: collision with root package name */
    private final IdentityHashMap<t, Integer> f10052q = new IdentityHashMap<>();

    /* renamed from: r  reason: collision with root package name */
    private final r f10053r = new r();

    /* renamed from: s  reason: collision with root package name */
    private final d f10054s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f10055t;

    /* renamed from: u  reason: collision with root package name */
    private final int f10056u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f10057v;

    /* renamed from: w  reason: collision with root package name */
    private j.a f10058w;

    /* renamed from: x  reason: collision with root package name */
    private int f10059x;

    /* renamed from: y  reason: collision with root package name */
    private w f10060y;

    /* renamed from: z  reason: collision with root package name */
    private p[] f10061z = new p[0];

    public k(h hVar, HlsPlaylistTracker hlsPlaylistTracker, g gVar, r rVar, com.google.android.exoplayer2.drm.j jVar, i.a aVar, g gVar2, l.a aVar2, b bVar, d dVar, boolean z10, int i10, boolean z11) {
        this.f10043h = hVar;
        this.f10044i = hlsPlaylistTracker;
        this.f10045j = gVar;
        this.f10046k = rVar;
        this.f10047l = jVar;
        this.f10048m = aVar;
        this.f10049n = gVar2;
        this.f10050o = aVar2;
        this.f10051p = bVar;
        this.f10054s = dVar;
        this.f10055t = z10;
        this.f10056u = i10;
        this.f10057v = z11;
        this.D = dVar.a(new v[0]);
    }

    private void l(long j10, List<c.a> list, List<p> list2, List<int[]> list3, Map<String, h> map) {
        List<c.a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list4.get(i10).f7403d;
            if (!hashSet.add(str)) {
                List<p> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (m0.c(str, list4.get(i11).f7403d)) {
                        c.a aVar = list4.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f7400a);
                        arrayList2.add(aVar.f7401b);
                        z10 &= m0.H(aVar.f7401b.f8093p, 1) == 1;
                    }
                }
                p v10 = v(1, (Uri[]) arrayList.toArray((Uri[]) m0.k(new Uri[0])), (e4.j[]) arrayList2.toArray(new e4.j[0]), (e4.j) null, Collections.emptyList(), map, j10);
                list3.add(n6.d.k(arrayList3));
                list2.add(v10);
                if (this.f10055t && z10) {
                    v10.c0(new g5.v[]{new g5.v((e4.j[]) arrayList2.toArray(new e4.j[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(com.google.android.exoplayer2.source.hls.playlist.c r20, long r21, java.util.List<l5.p> r23, java.util.List<int[]> r24, java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.h> r25) {
        /*
            r19 = this;
            r0 = r20
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$b> r1 = r0.f7391e
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000e:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$b> r7 = r0.f7391e
            int r7 = r7.size()
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L_0x0047
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$b> r7 = r0.f7391e
            java.lang.Object r7 = r7.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.c$b r7 = (com.google.android.exoplayer2.source.hls.playlist.c.b) r7
            e4.j r7 = r7.f7405b
            int r10 = r7.f8102y
            if (r10 > 0) goto L_0x0040
            java.lang.String r10 = r7.f8093p
            java.lang.String r10 = a6.m0.I(r10, r8)
            if (r10 == 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            java.lang.String r7 = r7.f8093p
            java.lang.String r7 = a6.m0.I(r7, r9)
            if (r7 == 0) goto L_0x003c
            r2[r4] = r9
            int r6 = r6 + 1
            goto L_0x0044
        L_0x003c:
            r7 = -1
            r2[r4] = r7
            goto L_0x0044
        L_0x0040:
            r2[r4] = r8
            int r5 = r5 + 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0047:
            if (r5 <= 0) goto L_0x004c
            r1 = r5
            r4 = 1
            goto L_0x0053
        L_0x004c:
            if (r6 >= r1) goto L_0x0052
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L_0x0054
        L_0x0052:
            r4 = 0
        L_0x0053:
            r5 = 0
        L_0x0054:
            android.net.Uri[] r12 = new android.net.Uri[r1]
            e4.j[] r6 = new e4.j[r1]
            int[] r7 = new int[r1]
            r10 = 0
            r11 = 0
        L_0x005c:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$b> r13 = r0.f7391e
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x0088
            if (r4 == 0) goto L_0x006a
            r13 = r2[r10]
            if (r13 != r8) goto L_0x0085
        L_0x006a:
            if (r5 == 0) goto L_0x0070
            r13 = r2[r10]
            if (r13 == r9) goto L_0x0085
        L_0x0070:
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$b> r13 = r0.f7391e
            java.lang.Object r13 = r13.get(r10)
            com.google.android.exoplayer2.source.hls.playlist.c$b r13 = (com.google.android.exoplayer2.source.hls.playlist.c.b) r13
            android.net.Uri r14 = r13.f7404a
            r12[r11] = r14
            e4.j r13 = r13.f7405b
            r6[r11] = r13
            int r13 = r11 + 1
            r7[r11] = r10
            r11 = r13
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0088:
            r2 = r6[r3]
            java.lang.String r2 = r2.f8093p
            int r5 = a6.m0.H(r2, r8)
            int r2 = a6.m0.H(r2, r9)
            if (r2 > r9) goto L_0x009e
            if (r5 > r9) goto L_0x009e
            int r8 = r2 + r5
            if (r8 <= 0) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            if (r4 != 0) goto L_0x00a5
            if (r2 <= 0) goto L_0x00a5
            r11 = 1
            goto L_0x00a6
        L_0x00a5:
            r11 = 0
        L_0x00a6:
            e4.j r14 = r0.f7396j
            java.util.List<e4.j> r15 = r0.f7397k
            r10 = r19
            r13 = r6
            r16 = r25
            r17 = r21
            l5.p r4 = r10.v(r11, r12, r13, r14, r15, r16, r17)
            r10 = r23
            r10.add(r4)
            r10 = r24
            r10.add(r7)
            r7 = r19
            boolean r10 = r7.f10055t
            if (r10 == 0) goto L_0x0176
            if (r8 == 0) goto L_0x0176
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r5 <= 0) goto L_0x0128
            e4.j[] r5 = new e4.j[r1]
            r10 = 0
        L_0x00d1:
            if (r10 >= r1) goto L_0x00de
            r11 = r6[r10]
            e4.j r11 = y(r11)
            r5[r10] = r11
            int r10 = r10 + 1
            goto L_0x00d1
        L_0x00de:
            g5.v r1 = new g5.v
            r1.<init>((e4.j[]) r5)
            r8.add(r1)
            if (r2 <= 0) goto L_0x0108
            e4.j r1 = r0.f7396j
            if (r1 != 0) goto L_0x00f4
            java.util.List<com.google.android.exoplayer2.source.hls.playlist.c$a> r1 = r0.f7393g
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0108
        L_0x00f4:
            g5.v r1 = new g5.v
            e4.j[] r2 = new e4.j[r9]
            r5 = r6[r3]
            e4.j r6 = r0.f7396j
            e4.j r5 = w(r5, r6, r3)
            r2[r3] = r5
            r1.<init>((e4.j[]) r2)
            r8.add(r1)
        L_0x0108:
            java.util.List<e4.j> r0 = r0.f7397k
            if (r0 == 0) goto L_0x0142
            r1 = 0
        L_0x010d:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0142
            g5.v r2 = new g5.v
            e4.j[] r5 = new e4.j[r9]
            java.lang.Object r6 = r0.get(r1)
            e4.j r6 = (e4.j) r6
            r5[r3] = r6
            r2.<init>((e4.j[]) r5)
            r8.add(r2)
            int r1 = r1 + 1
            goto L_0x010d
        L_0x0128:
            e4.j[] r2 = new e4.j[r1]
            r5 = 0
        L_0x012b:
            if (r5 >= r1) goto L_0x013a
            r10 = r6[r5]
            e4.j r11 = r0.f7396j
            e4.j r10 = w(r10, r11, r9)
            r2[r5] = r10
            int r5 = r5 + 1
            goto L_0x012b
        L_0x013a:
            g5.v r0 = new g5.v
            r0.<init>((e4.j[]) r2)
            r8.add(r0)
        L_0x0142:
            g5.v r0 = new g5.v
            e4.j[] r1 = new e4.j[r9]
            e4.j$b r2 = new e4.j$b
            r2.<init>()
            java.lang.String r5 = "ID3"
            e4.j$b r2 = r2.S(r5)
            java.lang.String r5 = "application/id3"
            e4.j$b r2 = r2.e0(r5)
            e4.j r2 = r2.E()
            r1[r3] = r2
            r0.<init>((e4.j[]) r1)
            r8.add(r0)
            g5.v[] r1 = new g5.v[r3]
            java.lang.Object[] r1 = r8.toArray(r1)
            g5.v[] r1 = (g5.v[]) r1
            int[] r2 = new int[r9]
            int r0 = r8.indexOf(r0)
            r2[r3] = r0
            r4.c0(r1, r3, r2)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.k.o(com.google.android.exoplayer2.source.hls.playlist.c, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void s(long j10) {
        Map<String, h> map;
        c cVar = (c) a.e(this.f10044i.g());
        if (this.f10057v) {
            map = x(cVar.f7399m);
        } else {
            map = Collections.emptyMap();
        }
        Map<String, h> map2 = map;
        boolean z10 = !cVar.f7391e.isEmpty();
        List<c.a> list = cVar.f7393g;
        List<c.a> list2 = cVar.f7394h;
        this.f10059x = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            o(cVar, j10, arrayList, arrayList2, map2);
        }
        l(j10, list, arrayList, arrayList2, map2);
        this.C = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            c.a aVar = list2.get(i10);
            int i11 = i10;
            p v10 = v(3, new Uri[]{aVar.f7400a}, new e4.j[]{aVar.f7401b}, (e4.j) null, Collections.emptyList(), map2, j10);
            arrayList2.add(new int[]{i11});
            arrayList.add(v10);
            v10.c0(new g5.v[]{new g5.v(aVar.f7401b)}, 0, new int[0]);
            i10 = i11 + 1;
        }
        this.f10061z = (p[]) arrayList.toArray(new p[0]);
        this.B = (int[][]) arrayList2.toArray(new int[0][]);
        p[] pVarArr = this.f10061z;
        this.f10059x = pVarArr.length;
        pVarArr[0].l0(true);
        for (p B2 : this.f10061z) {
            B2.B();
        }
        this.A = this.f10061z;
    }

    private p v(int i10, Uri[] uriArr, e4.j[] jVarArr, e4.j jVar, List<e4.j> list, Map<String, h> map, long j10) {
        return new p(i10, this, new f(this.f10043h, this.f10044i, uriArr, jVarArr, this.f10045j, this.f10046k, this.f10053r, list), map, this.f10051p, j10, jVar, this.f10047l, this.f10048m, this.f10049n, this.f10050o, this.f10056u);
    }

    private static e4.j w(e4.j jVar, e4.j jVar2, boolean z10) {
        String str;
        int i10;
        String str2;
        int i11;
        int i12;
        x4.a aVar;
        String str3;
        int i13 = -1;
        if (jVar2 != null) {
            str3 = jVar2.f8093p;
            aVar = jVar2.f8094q;
            int i14 = jVar2.F;
            i11 = jVar2.f8088k;
            int i15 = jVar2.f8089l;
            String str4 = jVar2.f8087j;
            str = jVar2.f8086i;
            String str5 = str4;
            i10 = i14;
            i12 = i15;
            str2 = str5;
        } else {
            String I = m0.I(jVar.f8093p, 1);
            x4.a aVar2 = jVar.f8094q;
            if (z10) {
                int i16 = jVar.F;
                int i17 = jVar.f8088k;
                int i18 = jVar.f8089l;
                str2 = jVar.f8087j;
                int i19 = i16;
                str3 = I;
                str = jVar.f8086i;
                i10 = i19;
                int i20 = i18;
                i11 = i17;
                aVar = aVar2;
                i12 = i20;
            } else {
                str2 = null;
                aVar = aVar2;
                i12 = 0;
                i11 = 0;
                i10 = -1;
                str3 = I;
                str = null;
            }
        }
        String g10 = a6.t.g(str3);
        int i21 = z10 ? jVar.f8090m : -1;
        if (z10) {
            i13 = jVar.f8091n;
        }
        return new j.b().S(jVar.f8085h).U(str).K(jVar.f8095r).e0(g10).I(str3).X(aVar).G(i21).Z(i13).H(i10).g0(i11).c0(i12).V(str2).E();
    }

    private static Map<String, h> x(List<h> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            h hVar = list.get(i10);
            String str = hVar.f6567j;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                h hVar2 = (h) arrayList.get(i11);
                if (TextUtils.equals(hVar2.f6567j, str)) {
                    hVar = hVar.g(hVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, hVar);
        }
        return hashMap;
    }

    private static e4.j y(e4.j jVar) {
        String I = m0.I(jVar.f8093p, 2);
        return new j.b().S(jVar.f8085h).U(jVar.f8086i).K(jVar.f8095r).e0(a6.t.g(I)).I(I).X(jVar.f8094q).G(jVar.f8090m).Z(jVar.f8091n).j0(jVar.f8101x).Q(jVar.f8102y).P(jVar.f8103z).g0(jVar.f8088k).c0(jVar.f8089l).E();
    }

    public void A() {
        this.f10044i.b(this);
        for (p e02 : this.f10061z) {
            e02.e0();
        }
        this.f10058w = null;
    }

    public void a() {
        for (p a02 : this.f10061z) {
            a02.a0();
        }
        this.f10058w.i(this);
    }

    public long b() {
        return this.D.b();
    }

    public long c(long j10, e4.v vVar) {
        return j10;
    }

    public boolean d(long j10) {
        if (this.f10060y != null) {
            return this.D.d(j10);
        }
        for (p B2 : this.f10061z) {
            B2.B();
        }
        return false;
    }

    public boolean e(Uri uri, g.c cVar, boolean z10) {
        boolean z11 = true;
        for (p Z : this.f10061z) {
            z11 &= Z.Z(uri, cVar, z10);
        }
        this.f10058w.i(this);
        return z11;
    }

    public boolean f() {
        return this.D.f();
    }

    public long g() {
        return this.D.g();
    }

    public void h(long j10) {
        this.D.h(j10);
    }

    public void j(Uri uri) {
        this.f10044i.j(uri);
    }

    public void m() {
        for (p m10 : this.f10061z) {
            m10.m();
        }
    }

    public long n(long j10) {
        p[] pVarArr = this.A;
        if (pVarArr.length > 0) {
            boolean h02 = pVarArr[0].h0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.A;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].h0(j10, h02);
                i10++;
            }
            if (h02) {
                this.f10053r.b();
            }
        }
        return j10;
    }

    public void onPrepared() {
        int i10 = this.f10059x - 1;
        this.f10059x = i10;
        if (i10 <= 0) {
            int i11 = 0;
            for (p r10 : this.f10061z) {
                i11 += r10.r().f8924h;
            }
            g5.v[] vVarArr = new g5.v[i11];
            int i12 = 0;
            for (p pVar : this.f10061z) {
                int i13 = pVar.r().f8924h;
                int i14 = 0;
                while (i14 < i13) {
                    vVarArr[i12] = pVar.r().b(i14);
                    i14++;
                    i12++;
                }
            }
            this.f10060y = new w(vVarArr);
            this.f10058w.k(this);
        }
    }

    public long p() {
        return -9223372036854775807L;
    }

    public void q(j.a aVar, long j10) {
        this.f10058w = aVar;
        this.f10044i.m(this);
        s(j10);
    }

    public w r() {
        return (w) a.e(this.f10060y);
    }

    public void t(long j10, boolean z10) {
        for (p t10 : this.A) {
            t10.t(j10, z10);
        }
    }

    public long u(y5.h[] hVarArr, boolean[] zArr, t[] tVarArr, boolean[] zArr2, long j10) {
        boolean z10;
        y5.h[] hVarArr2 = hVarArr;
        t[] tVarArr2 = tVarArr;
        int[] iArr = new int[hVarArr2.length];
        int[] iArr2 = new int[hVarArr2.length];
        for (int i10 = 0; i10 < hVarArr2.length; i10++) {
            iArr[i10] = tVarArr2[i10] == null ? -1 : this.f10052q.get(tVarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (hVarArr2[i10] != null) {
                g5.v b10 = hVarArr2[i10].b();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.f10061z;
                    if (i11 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i11].r().c(b10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f10052q.clear();
        int length = hVarArr2.length;
        t[] tVarArr3 = new t[length];
        t[] tVarArr4 = new t[hVarArr2.length];
        y5.h[] hVarArr3 = new y5.h[hVarArr2.length];
        p[] pVarArr2 = new p[this.f10061z.length];
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (i13 < this.f10061z.length) {
            for (int i14 = 0; i14 < hVarArr2.length; i14++) {
                y5.h hVar = null;
                tVarArr4[i14] = iArr[i14] == i13 ? tVarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    hVar = hVarArr2[i14];
                }
                hVarArr3[i14] = hVar;
            }
            p pVar = this.f10061z[i13];
            p pVar2 = pVar;
            int i15 = length;
            int i16 = i13;
            int i17 = i12;
            y5.h[] hVarArr4 = hVarArr3;
            p[] pVarArr3 = pVarArr2;
            boolean i02 = pVar.i0(hVarArr3, zArr, tVarArr4, zArr2, j10, z11);
            int i18 = 0;
            boolean z12 = false;
            while (true) {
                z10 = true;
                if (i18 >= hVarArr2.length) {
                    break;
                }
                t tVar = tVarArr4[i18];
                if (iArr2[i18] == i16) {
                    a.e(tVar);
                    tVarArr3[i18] = tVar;
                    this.f10052q.put(tVar, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr[i18] == i16) {
                    if (tVar != null) {
                        z10 = false;
                    }
                    a.f(z10);
                }
                i18++;
            }
            if (z12) {
                pVarArr3[i17] = pVar2;
                i12 = i17 + 1;
                if (i17 == 0) {
                    pVar2.l0(true);
                    if (!i02) {
                        p[] pVarArr4 = this.A;
                        if (pVarArr4.length != 0 && pVar2 == pVarArr4[0]) {
                        }
                    }
                    this.f10053r.b();
                    z11 = true;
                } else {
                    if (i16 >= this.C) {
                        z10 = false;
                    }
                    pVar2.l0(z10);
                }
            } else {
                i12 = i17;
            }
            i13 = i16 + 1;
            pVarArr2 = pVarArr3;
            length = i15;
            hVarArr3 = hVarArr4;
            tVarArr2 = tVarArr;
        }
        System.arraycopy(tVarArr3, 0, tVarArr2, 0, length);
        p[] pVarArr5 = (p[]) m0.v0(pVarArr2, i12);
        this.A = pVarArr5;
        this.D = this.f10054s.a(pVarArr5);
        return j10;
    }

    /* renamed from: z */
    public void i(p pVar) {
        this.f10058w.i(this);
    }
}
