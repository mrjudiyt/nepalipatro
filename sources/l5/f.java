package l5;

import a6.k0;
import a6.m0;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.f0;
import com.google.common.collect.x;
import e4.j;
import g5.v;
import i5.l;
import i5.n;
import i5.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y5.h;
import z5.r;

/* compiled from: HlsChunkSource */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f9996a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f9997b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f9998c;

    /* renamed from: d  reason: collision with root package name */
    private final r f9999d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f10000e;

    /* renamed from: f  reason: collision with root package name */
    private final j[] f10001f;

    /* renamed from: g  reason: collision with root package name */
    private final HlsPlaylistTracker f10002g;

    /* renamed from: h  reason: collision with root package name */
    private final v f10003h;

    /* renamed from: i  reason: collision with root package name */
    private final List<j> f10004i;

    /* renamed from: j  reason: collision with root package name */
    private final e f10005j = new e(4);

    /* renamed from: k  reason: collision with root package name */
    private boolean f10006k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f10007l = m0.f210f;

    /* renamed from: m  reason: collision with root package name */
    private IOException f10008m;

    /* renamed from: n  reason: collision with root package name */
    private Uri f10009n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10010o;

    /* renamed from: p  reason: collision with root package name */
    private h f10011p;

    /* renamed from: q  reason: collision with root package name */
    private long f10012q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10013r;

    /* compiled from: HlsChunkSource */
    private static final class a extends l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f10014l;

        public a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, j jVar, int i10, Object obj, byte[] bArr) {
            super(aVar, bVar, 3, jVar, i10, obj, bArr);
        }

        /* access modifiers changed from: protected */
        public void g(byte[] bArr, int i10) {
            this.f10014l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f10014l;
        }
    }

    /* compiled from: HlsChunkSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public i5.f f10015a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10016b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f10017c;

        public b() {
            a();
        }

        public void a() {
            this.f10015a = null;
            this.f10016b = false;
            this.f10017c = null;
        }
    }

    /* compiled from: HlsChunkSource */
    static final class c extends i5.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<d.e> f10018e;

        /* renamed from: f  reason: collision with root package name */
        private final long f10019f;

        /* renamed from: g  reason: collision with root package name */
        private final String f10020g;

        public c(String str, long j10, List<d.e> list) {
            super(0, (long) (list.size() - 1));
            this.f10020g = str;
            this.f10019f = j10;
            this.f10018e = list;
        }

        public long a() {
            c();
            return this.f10019f + this.f10018e.get((int) d()).f7440l;
        }

        public long b() {
            c();
            d.e eVar = this.f10018e.get((int) d());
            return this.f10019f + eVar.f7440l + eVar.f7438j;
        }
    }

    /* compiled from: HlsChunkSource */
    private static final class d extends y5.c {

        /* renamed from: h  reason: collision with root package name */
        private int f10021h;

        public d(v vVar, int[] iArr) {
            super(vVar, iArr);
            this.f10021h = a(vVar.b(iArr[0]));
        }

        public int c() {
            return this.f10021h;
        }

        public void d(long j10, long j11, long j12, List<? extends n> list, o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f(this.f10021h, elapsedRealtime)) {
                for (int i10 = this.f12988b - 1; i10 >= 0; i10--) {
                    if (!f(i10, elapsedRealtime)) {
                        this.f10021h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int p() {
            return 0;
        }

        public Object r() {
            return null;
        }
    }

    /* compiled from: HlsChunkSource */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final d.e f10022a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10023b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10024c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f10025d;

        public e(d.e eVar, long j10, int i10) {
            this.f10022a = eVar;
            this.f10023b = j10;
            this.f10024c = i10;
            this.f10025d = (eVar instanceof d.b) && ((d.b) eVar).f7430t;
        }
    }

    public f(h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, j[] jVarArr, g gVar, r rVar, r rVar2, List<j> list) {
        this.f9996a = hVar;
        this.f10002g = hlsPlaylistTracker;
        this.f10000e = uriArr;
        this.f10001f = jVarArr;
        this.f9999d = rVar2;
        this.f10004i = list;
        com.google.android.exoplayer2.upstream.a a10 = gVar.a(1);
        this.f9997b = a10;
        if (rVar != null) {
            a10.c(rVar);
        }
        this.f9998c = gVar.a(3);
        this.f10003h = new v(jVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((jVarArr[i10].f8089l & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f10011p = new d(this.f10003h, n6.d.k(arrayList));
    }

    private static Uri c(com.google.android.exoplayer2.source.hls.playlist.d dVar, d.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f7442n) == null) {
            return null;
        }
        return k0.e(dVar.f10237a, str);
    }

    private Pair<Long, Integer> e(i iVar, boolean z10, com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, long j11) {
        List<d.b> list;
        long j12;
        int i10 = -1;
        if (iVar == null || z10) {
            long j13 = dVar.f7427u + j10;
            if (iVar != null && !this.f10010o) {
                j11 = iVar.f9313g;
            }
            if (!dVar.f7421o && j11 >= j13) {
                return new Pair<>(Long.valueOf(dVar.f7417k + ((long) dVar.f7424r.size())), -1);
            }
            long j14 = j11 - j10;
            int i11 = 0;
            int g10 = m0.g(dVar.f7424r, Long.valueOf(j14), true, !this.f10002g.e() || iVar == null);
            long j15 = ((long) g10) + dVar.f7417k;
            if (g10 >= 0) {
                d.C0117d dVar2 = dVar.f7424r.get(g10);
                if (j14 < dVar2.f7440l + dVar2.f7438j) {
                    list = dVar2.f7435t;
                } else {
                    list = dVar.f7425s;
                }
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    d.b bVar = list.get(i11);
                    if (j14 >= bVar.f7440l + bVar.f7438j) {
                        i11++;
                    } else if (bVar.f7429s) {
                        j15 += list == dVar.f7425s ? 1 : 0;
                        i10 = i11;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j15), Integer.valueOf(i10));
        } else if (!iVar.h()) {
            return new Pair<>(Long.valueOf(iVar.f9354j), Integer.valueOf(iVar.f10031o));
        } else {
            if (iVar.f10031o == -1) {
                j12 = iVar.g();
            } else {
                j12 = iVar.f9354j;
            }
            Long valueOf = Long.valueOf(j12);
            int i12 = iVar.f10031o;
            if (i12 != -1) {
                i10 = i12 + 1;
            }
            return new Pair<>(valueOf, Integer.valueOf(i10));
        }
    }

    private static e f(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, int i10) {
        int i11 = (int) (j10 - dVar.f7417k);
        if (i11 == dVar.f7424r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < dVar.f7425s.size()) {
                return new e(dVar.f7425s.get(i10), j10, i10);
            }
            return null;
        }
        d.C0117d dVar2 = dVar.f7424r.get(i11);
        if (i10 == -1) {
            return new e(dVar2, j10, -1);
        }
        if (i10 < dVar2.f7435t.size()) {
            return new e(dVar2.f7435t.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < dVar.f7424r.size()) {
            return new e(dVar.f7424r.get(i12), j10 + 1, -1);
        }
        if (!dVar.f7425s.isEmpty()) {
            return new e(dVar.f7425s.get(0), j10 + 1, 0);
        }
        return null;
    }

    static List<d.e> h(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j10, int i10) {
        int i11 = (int) (j10 - dVar.f7417k);
        if (i11 < 0 || dVar.f7424r.size() < i11) {
            return x.s();
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (i11 < dVar.f7424r.size()) {
            if (i10 != -1) {
                d.C0117d dVar2 = dVar.f7424r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar2);
                } else if (i10 < dVar2.f7435t.size()) {
                    List<d.b> list = dVar2.f7435t;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<d.C0117d> list2 = dVar.f7424r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (dVar.f7420n != -9223372036854775807L) {
            if (i10 != -1) {
                i12 = i10;
            }
            if (i12 < dVar.f7425s.size()) {
                List<d.b> list3 = dVar.f7425s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private i5.f k(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f10005j.c(uri);
        if (c10 != null) {
            this.f10005j.b(uri, c10);
            return null;
        }
        return new a(this.f9998c, new b.C0120b().i(uri).b(1).a(), this.f10001f[i10], this.f10011p.p(), this.f10011p.r(), this.f10007l);
    }

    private long r(long j10) {
        long j11 = this.f10012q;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void v(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        long j10;
        if (dVar.f7421o) {
            j10 = -9223372036854775807L;
        } else {
            j10 = dVar.e() - this.f10002g.d();
        }
        this.f10012q = j10;
    }

    public o[] a(i iVar, long j10) {
        int i10;
        i iVar2 = iVar;
        int c10 = iVar2 == null ? -1 : this.f10003h.c(iVar2.f9310d);
        int length = this.f10011p.length();
        o[] oVarArr = new o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int k10 = this.f10011p.k(i11);
            Uri uri = this.f10000e[k10];
            if (!this.f10002g.a(uri)) {
                oVarArr[i11] = o.f9355a;
                i10 = i11;
            } else {
                com.google.android.exoplayer2.source.hls.playlist.d n10 = this.f10002g.n(uri, z10);
                a6.a.e(n10);
                long d10 = n10.f7414h - this.f10002g.d();
                i10 = i11;
                Pair<Long, Integer> e10 = e(iVar, k10 != c10, n10, d10, j10);
                oVarArr[i10] = new c(n10.f10237a, d10, h(n10, ((Long) e10.first).longValue(), ((Integer) e10.second).intValue()));
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public int b(i iVar) {
        List<d.b> list;
        if (iVar.f10031o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.d dVar = (com.google.android.exoplayer2.source.hls.playlist.d) a6.a.e(this.f10002g.n(this.f10000e[this.f10003h.c(iVar.f9310d)], false));
        int i10 = (int) (iVar.f9354j - dVar.f7417k);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < dVar.f7424r.size()) {
            list = dVar.f7424r.get(i10).f7435t;
        } else {
            list = dVar.f7425s;
        }
        if (iVar.f10031o >= list.size()) {
            return 2;
        }
        d.b bVar = list.get(iVar.f10031o);
        if (bVar.f7430t) {
            return 0;
        }
        if (m0.c(Uri.parse(k0.d(dVar.f10237a, bVar.f7436h)), iVar.f9308b.f7699a)) {
            return 1;
        }
        return 2;
    }

    public void d(long j10, long j11, List<i> list, boolean z10, b bVar) {
        int i10;
        long j12;
        Uri uri;
        com.google.android.exoplayer2.source.hls.playlist.d dVar;
        int i11;
        long j13 = j11;
        b bVar2 = bVar;
        i iVar = list.isEmpty() ? null : (i) f0.c(list);
        if (iVar == null) {
            i10 = -1;
        } else {
            i10 = this.f10003h.c(iVar.f9310d);
        }
        long j14 = j13 - j10;
        long r10 = r(j10);
        if (iVar != null && !this.f10010o) {
            long d10 = iVar.d();
            j14 = Math.max(0, j14 - d10);
            if (r10 != -9223372036854775807L) {
                r10 = Math.max(0, r10 - d10);
            }
        }
        this.f10011p.d(j10, j14, r10, list, a(iVar, j13));
        int n10 = this.f10011p.n();
        boolean z11 = i10 != n10;
        Uri uri2 = this.f10000e[n10];
        if (!this.f10002g.a(uri2)) {
            bVar2.f10017c = uri2;
            this.f10013r &= uri2.equals(this.f10009n);
            this.f10009n = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.d n11 = this.f10002g.n(uri2, true);
        a6.a.e(n11);
        this.f10010o = n11.f10239c;
        v(n11);
        long d11 = n11.f7414h - this.f10002g.d();
        com.google.android.exoplayer2.source.hls.playlist.d dVar2 = n11;
        Uri uri3 = uri2;
        int i12 = n10;
        Pair<Long, Integer> e10 = e(iVar, z11, n11, d11, j11);
        long longValue = ((Long) e10.first).longValue();
        int intValue = ((Integer) e10.second).intValue();
        if (longValue >= n11.f7417k || iVar == null || !z11) {
            dVar = n11;
            j12 = d11;
            uri = uri3;
            i11 = i12;
        } else {
            Uri uri4 = this.f10000e[i10];
            com.google.android.exoplayer2.source.hls.playlist.d n12 = this.f10002g.n(uri4, true);
            a6.a.e(n12);
            j12 = n12.f7414h - this.f10002g.d();
            Pair<Long, Integer> e11 = e(iVar, false, n12, j12, j11);
            longValue = ((Long) e11.first).longValue();
            intValue = ((Integer) e11.second).intValue();
            i11 = i10;
            uri = uri4;
            dVar = n12;
        }
        if (longValue < dVar.f7417k) {
            this.f10008m = new BehindLiveWindowException();
            return;
        }
        e f10 = f(dVar, longValue, intValue);
        if (f10 == null) {
            if (!dVar.f7421o) {
                bVar2.f10017c = uri;
                this.f10013r &= uri.equals(this.f10009n);
                this.f10009n = uri;
                return;
            } else if (z10 || dVar.f7424r.isEmpty()) {
                bVar2.f10016b = true;
                return;
            } else {
                f10 = new e((d.e) f0.c(dVar.f7424r), (dVar.f7417k + ((long) dVar.f7424r.size())) - 1, -1);
            }
        }
        this.f10013r = false;
        this.f10009n = null;
        Uri c10 = c(dVar, f10.f10022a.f7437i);
        i5.f k10 = k(c10, i11);
        bVar2.f10015a = k10;
        if (k10 == null) {
            Uri c11 = c(dVar, f10.f10022a);
            i5.f k11 = k(c11, i11);
            bVar2.f10015a = k11;
            if (k11 == null) {
                boolean w10 = i.w(iVar, uri, dVar, f10, j12);
                if (!w10 || !f10.f10025d) {
                    bVar2.f10015a = i.j(this.f9996a, this.f9997b, this.f10001f[i11], j12, dVar, f10, uri, this.f10004i, this.f10011p.p(), this.f10011p.r(), this.f10006k, this.f9999d, iVar, this.f10005j.a(c11), this.f10005j.a(c10), w10);
                }
            }
        }
    }

    public int g(long j10, List<? extends n> list) {
        if (this.f10008m != null || this.f10011p.length() < 2) {
            return list.size();
        }
        return this.f10011p.m(j10, list);
    }

    public v i() {
        return this.f10003h;
    }

    public h j() {
        return this.f10011p;
    }

    public boolean l(i5.f fVar, long j10) {
        h hVar = this.f10011p;
        return hVar.e(hVar.u(this.f10003h.c(fVar.f9310d)), j10);
    }

    public void m() {
        IOException iOException = this.f10008m;
        if (iOException == null) {
            Uri uri = this.f10009n;
            if (uri != null && this.f10013r) {
                this.f10002g.c(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean n(Uri uri) {
        return m0.t(this.f10000e, uri);
    }

    public void o(i5.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f10007l = aVar.h();
            this.f10005j.b(aVar.f9308b.f7699a, (byte[]) a6.a.e(aVar.j()));
        }
    }

    public boolean p(Uri uri, long j10) {
        int u10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f10000e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (u10 = this.f10011p.u(i10)) == -1) {
            return true;
        }
        this.f10013r |= uri.equals(this.f10009n);
        if (j10 == -9223372036854775807L || (this.f10011p.e(u10, j10) && this.f10002g.f(uri, j10))) {
            return true;
        }
        return false;
    }

    public void q() {
        this.f10008m = null;
    }

    public void s(boolean z10) {
        this.f10006k = z10;
    }

    public void t(h hVar) {
        this.f10011p = hVar;
    }

    public boolean u(long j10, i5.f fVar, List<? extends n> list) {
        if (this.f10008m != null) {
            return false;
        }
        return this.f10011p.l(j10, fVar, list);
    }
}
