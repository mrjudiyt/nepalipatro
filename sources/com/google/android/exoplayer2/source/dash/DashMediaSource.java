package com.google.android.exoplayer2.source.dash;

import a6.d0;
import a6.m0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.j0;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.h;
import e4.i;
import j4.o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.p;
import z5.r;

public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    private r A;
    /* access modifiers changed from: private */
    public IOException B;
    private Handler C;
    private j0.f D;
    private Uri E;
    private Uri F;
    private k5.c G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private int L;
    private long M;
    private int N;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f7152g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f7153h;

    /* renamed from: i  reason: collision with root package name */
    private final a.C0119a f7154i;

    /* renamed from: j  reason: collision with root package name */
    private final a.C0114a f7155j;

    /* renamed from: k  reason: collision with root package name */
    private final g5.d f7156k;

    /* renamed from: l  reason: collision with root package name */
    private final j f7157l;

    /* renamed from: m  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f7158m;

    /* renamed from: n  reason: collision with root package name */
    private final j5.b f7159n;

    /* renamed from: o  reason: collision with root package name */
    private final long f7160o;

    /* renamed from: p  reason: collision with root package name */
    private final l.a f7161p;

    /* renamed from: q  reason: collision with root package name */
    private final h.a<? extends k5.c> f7162q;

    /* renamed from: r  reason: collision with root package name */
    private final e f7163r;

    /* renamed from: s  reason: collision with root package name */
    private final Object f7164s;

    /* renamed from: t  reason: collision with root package name */
    private final SparseArray<b> f7165t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f7166u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f7167v;

    /* renamed from: w  reason: collision with root package name */
    private final e.b f7168w;

    /* renamed from: x  reason: collision with root package name */
    private final p f7169x;

    /* renamed from: y  reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.a f7170y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public Loader f7171z;

    public static final class Factory implements g5.r {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0114a f7172a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C0119a f7173b;

        /* renamed from: c  reason: collision with root package name */
        private o f7174c;

        /* renamed from: d  reason: collision with root package name */
        private g5.d f7175d;

        /* renamed from: e  reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.g f7176e;

        /* renamed from: f  reason: collision with root package name */
        private long f7177f;

        /* renamed from: g  reason: collision with root package name */
        private long f7178g;

        /* renamed from: h  reason: collision with root package name */
        private h.a<? extends k5.c> f7179h;

        /* renamed from: i  reason: collision with root package name */
        private List<f5.c> f7180i;

        /* renamed from: j  reason: collision with root package name */
        private Object f7181j;

        public Factory(a.C0119a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(j0 j0Var) {
            List<f5.c> list;
            j0 j0Var2 = j0Var;
            a6.a.e(j0Var2.f6744b);
            h.a aVar = this.f7179h;
            if (aVar == null) {
                aVar = new k5.d();
            }
            if (j0Var2.f6744b.f6801e.isEmpty()) {
                list = this.f7180i;
            } else {
                list = j0Var2.f6744b.f6801e;
            }
            f5.b bVar = !list.isEmpty() ? new f5.b(aVar, list) : aVar;
            j0.g gVar = j0Var2.f6744b;
            boolean z10 = true;
            boolean z11 = gVar.f6804h == null && this.f7181j != null;
            boolean z12 = gVar.f6801e.isEmpty() && !list.isEmpty();
            if (j0Var2.f6745c.f6792a != -9223372036854775807L || this.f7177f == -9223372036854775807L) {
                z10 = false;
            }
            if (z11 || z12 || z10) {
                j0.c a10 = j0Var.a();
                if (z11) {
                    a10.g(this.f7181j);
                }
                if (z12) {
                    a10.f(list);
                }
                if (z10) {
                    a10.c(this.f7177f);
                }
                j0Var2 = a10.a();
            }
            j0 j0Var3 = j0Var2;
            return new DashMediaSource(j0Var3, (k5.c) null, this.f7173b, bVar, this.f7172a, this.f7175d, this.f7174c.a(j0Var3), this.f7176e, this.f7178g, (a) null);
        }

        public Factory(a.C0114a aVar, a.C0119a aVar2) {
            this.f7172a = (a.C0114a) a6.a.e(aVar);
            this.f7173b = aVar2;
            this.f7174c = new com.google.android.exoplayer2.drm.g();
            this.f7176e = new com.google.android.exoplayer2.upstream.f();
            this.f7177f = -9223372036854775807L;
            this.f7178g = 30000;
            this.f7175d = new g5.f();
            this.f7180i = Collections.emptyList();
        }
    }

    class a implements d0.b {
        a() {
        }

        public void a(IOException iOException) {
            DashMediaSource.this.W(iOException);
        }

        public void onInitialized() {
            DashMediaSource.this.X(d0.h());
        }
    }

    private static final class b extends a1 {

        /* renamed from: c  reason: collision with root package name */
        private final long f7183c;

        /* renamed from: d  reason: collision with root package name */
        private final long f7184d;

        /* renamed from: e  reason: collision with root package name */
        private final long f7185e;

        /* renamed from: f  reason: collision with root package name */
        private final int f7186f;

        /* renamed from: g  reason: collision with root package name */
        private final long f7187g;

        /* renamed from: h  reason: collision with root package name */
        private final long f7188h;

        /* renamed from: i  reason: collision with root package name */
        private final long f7189i;

        /* renamed from: j  reason: collision with root package name */
        private final k5.c f7190j;

        /* renamed from: k  reason: collision with root package name */
        private final j0 f7191k;

        /* renamed from: l  reason: collision with root package name */
        private final j0.f f7192l;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, k5.c cVar, j0 j0Var, j0.f fVar) {
            k5.c cVar2 = cVar;
            j0.f fVar2 = fVar;
            a6.a.f(cVar2.f9648d != (fVar2 != null) ? false : true);
            this.f7183c = j10;
            this.f7184d = j11;
            this.f7185e = j12;
            this.f7186f = i10;
            this.f7187g = j13;
            this.f7188h = j14;
            this.f7189i = j15;
            this.f7190j = cVar2;
            this.f7191k = j0Var;
            this.f7192l = fVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r4 = r4.f9680c.get(r8).f9637c.get(0).l();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long s(long r11) {
            /*
                r10 = this;
                long r0 = r10.f7189i
                k5.c r2 = r10.f7190j
                boolean r2 = t(r2)
                if (r2 != 0) goto L_0x000b
                return r0
            L_0x000b:
                r2 = 0
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                long r0 = r0 + r11
                long r11 = r10.f7188h
                int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r11
            L_0x001e:
                long r11 = r10.f7187g
                long r11 = r11 + r0
                k5.c r4 = r10.f7190j
                r5 = 0
                long r6 = r4.g(r5)
                r4 = 0
            L_0x0029:
                k5.c r8 = r10.f7190j
                int r8 = r8.e()
                int r8 = r8 + -1
                if (r4 >= r8) goto L_0x0041
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 < 0) goto L_0x0041
                long r11 = r11 - r6
                int r4 = r4 + 1
                k5.c r6 = r10.f7190j
                long r6 = r6.g(r4)
                goto L_0x0029
            L_0x0041:
                k5.c r8 = r10.f7190j
                k5.g r4 = r8.d(r4)
                r8 = 2
                int r8 = r4.a(r8)
                r9 = -1
                if (r8 != r9) goto L_0x0050
                return r0
            L_0x0050:
                java.util.List<k5.a> r4 = r4.f9680c
                java.lang.Object r4 = r4.get(r8)
                k5.a r4 = (k5.a) r4
                java.util.List<k5.j> r4 = r4.f9637c
                java.lang.Object r4 = r4.get(r5)
                k5.j r4 = (k5.j) r4
                j5.e r4 = r4.l()
                if (r4 == 0) goto L_0x0079
                long r8 = r4.i(r6)
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x006f
                goto L_0x0079
            L_0x006f:
                long r2 = r4.f(r11, r6)
                long r2 = r4.a(r2)
                long r0 = r0 + r2
                long r0 = r0 - r11
            L_0x0079:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.b.s(long):long");
        }

        private static boolean t(k5.c cVar) {
            return cVar.f9648d && cVar.f9649e != -9223372036854775807L && cVar.f9646b == -9223372036854775807L;
        }

        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f7186f) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        public a1.b g(int i10, a1.b bVar, boolean z10) {
            a6.a.c(i10, 0, i());
            Integer num = null;
            String str = z10 ? this.f7190j.d(i10).f9678a : null;
            if (z10) {
                num = Integer.valueOf(this.f7186f + i10);
            }
            return bVar.n(str, num, 0, this.f7190j.g(i10), e4.c.d(this.f7190j.d(i10).f9679b - this.f7190j.d(0).f9679b) - this.f7187g);
        }

        public int i() {
            return this.f7190j.e();
        }

        public Object m(int i10) {
            a6.a.c(i10, 0, i());
            return Integer.valueOf(this.f7186f + i10);
        }

        public a1.c o(int i10, a1.c cVar, long j10) {
            a6.a.c(i10, 0, 1);
            long s10 = s(j10);
            Object obj = a1.c.f6241r;
            j0 j0Var = this.f7191k;
            k5.c cVar2 = this.f7190j;
            return cVar.g(obj, j0Var, cVar2, this.f7183c, this.f7184d, this.f7185e, true, t(cVar2), this.f7192l, s10, this.f7188h, 0, i() - 1, this.f7187g);
        }

        public int p() {
            return 1;
        }
    }

    private final class c implements e.b {
        private c() {
        }

        public void a() {
            DashMediaSource.this.Q();
        }

        public void b(long j10) {
            DashMediaSource.this.P(j10);
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements h.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f7194a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, l6.e.f15604c)).readLine();
            try {
                Matcher matcher = f7194a.matcher(readLine);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(readLine);
                    throw ParserException.c(valueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(valueOf) : new String("Couldn't parse timestamp: "), (Throwable) null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1 : -1;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j10 * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw ParserException.c((String) null, e10);
            }
        }
    }

    private final class e implements Loader.b<com.google.android.exoplayer2.upstream.h<k5.c>> {
        private e() {
        }

        /* renamed from: a */
        public void k(com.google.android.exoplayer2.upstream.h<k5.c> hVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.R(hVar, j10, j11);
        }

        /* renamed from: b */
        public void l(com.google.android.exoplayer2.upstream.h<k5.c> hVar, long j10, long j11) {
            DashMediaSource.this.S(hVar, j10, j11);
        }

        /* renamed from: c */
        public Loader.c s(com.google.android.exoplayer2.upstream.h<k5.c> hVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.T(hVar, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements p {
        f() {
        }

        private void b() {
            if (DashMediaSource.this.B != null) {
                throw DashMediaSource.this.B;
            }
        }

        public void a() {
            DashMediaSource.this.f7171z.a();
            b();
        }
    }

    private final class g implements Loader.b<com.google.android.exoplayer2.upstream.h<Long>> {
        private g() {
        }

        /* renamed from: a */
        public void k(com.google.android.exoplayer2.upstream.h<Long> hVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.R(hVar, j10, j11);
        }

        /* renamed from: b */
        public void l(com.google.android.exoplayer2.upstream.h<Long> hVar, long j10, long j11) {
            DashMediaSource.this.U(hVar, j10, j11);
        }

        /* renamed from: c */
        public Loader.c s(com.google.android.exoplayer2.upstream.h<Long> hVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.V(hVar, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements h.a<Long> {
        private h() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(m0.x0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        i.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(j0 j0Var, k5.c cVar, a.C0119a aVar, h.a aVar2, a.C0114a aVar3, g5.d dVar, j jVar, com.google.android.exoplayer2.upstream.g gVar, long j10, a aVar4) {
        this(j0Var, cVar, aVar, aVar2, aVar3, dVar, jVar, gVar, j10);
    }

    private static long H(k5.g gVar, long j10, long j11) {
        k5.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long d10 = e4.c.d(gVar2.f9679b);
        boolean L2 = L(gVar);
        long j14 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar2.f9680c.size(); i10++) {
            k5.a aVar = gVar2.f9680c.get(i10);
            List<k5.j> list = aVar.f9637c;
            if ((!L2 || aVar.f9636b != 3) && !list.isEmpty()) {
                j5.e l10 = list.get(0).l();
                if (l10 == null) {
                    return d10 + j12;
                }
                long j15 = l10.j(j12, j13);
                if (j15 == 0) {
                    return d10;
                }
                long c10 = (l10.c(j12, j13) + j15) - 1;
                j14 = Math.min(j14, l10.b(c10, j12) + l10.a(c10) + d10);
            }
        }
        return j14;
    }

    private static long I(k5.g gVar, long j10, long j11) {
        k5.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long d10 = e4.c.d(gVar2.f9679b);
        boolean L2 = L(gVar);
        long j14 = d10;
        for (int i10 = 0; i10 < gVar2.f9680c.size(); i10++) {
            k5.a aVar = gVar2.f9680c.get(i10);
            List<k5.j> list = aVar.f9637c;
            if ((!L2 || aVar.f9636b != 3) && !list.isEmpty()) {
                j5.e l10 = list.get(0).l();
                if (l10 == null || l10.j(j12, j13) == 0) {
                    return d10;
                }
                j14 = Math.max(j14, l10.a(l10.c(j12, j13)) + d10);
            }
        }
        return j14;
    }

    private static long J(k5.c cVar, long j10) {
        j5.e l10;
        k5.c cVar2 = cVar;
        int e10 = cVar.e() - 1;
        k5.g d10 = cVar2.d(e10);
        long d11 = e4.c.d(d10.f9679b);
        long g10 = cVar2.g(e10);
        long d12 = e4.c.d(j10);
        long d13 = e4.c.d(cVar2.f9645a);
        long d14 = e4.c.d(5000);
        for (int i10 = 0; i10 < d10.f9680c.size(); i10++) {
            List<k5.j> list = d10.f9680c.get(i10).f9637c;
            if (!list.isEmpty() && (l10 = list.get(0).l()) != null) {
                long d15 = ((d13 + d11) + l10.d(g10, d12)) - d12;
                if (d15 < d14 - 100000 || (d15 > d14 && d15 < d14 + 100000)) {
                    d14 = d15;
                }
            }
        }
        return m6.b.a(d14, 1000, RoundingMode.CEILING);
    }

    private long K() {
        return (long) Math.min((this.L - 1) * 1000, 5000);
    }

    private static boolean L(k5.g gVar) {
        for (int i10 = 0; i10 < gVar.f9680c.size(); i10++) {
            int i11 = gVar.f9680c.get(i10).f9636b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(k5.g gVar) {
        for (int i10 = 0; i10 < gVar.f9680c.size(); i10++) {
            j5.e l10 = gVar.f9680c.get(i10).f9637c.get(0).l();
            if (l10 == null || l10.g()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        Y(false);
    }

    private void O() {
        d0.j(this.f7171z, new a());
    }

    /* access modifiers changed from: private */
    public void W(IOException iOException) {
        a6.p.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        Y(true);
    }

    /* access modifiers changed from: private */
    public void X(long j10) {
        this.K = j10;
        Y(true);
    }

    private void Y(boolean z10) {
        long j10;
        long j11;
        k5.g gVar;
        for (int i10 = 0; i10 < this.f7165t.size(); i10++) {
            int keyAt = this.f7165t.keyAt(i10);
            if (keyAt >= this.N) {
                this.f7165t.valueAt(i10).L(this.G, keyAt - this.N);
            }
        }
        k5.g d10 = this.G.d(0);
        int e10 = this.G.e() - 1;
        k5.g d11 = this.G.d(e10);
        long g10 = this.G.g(e10);
        long d12 = e4.c.d(m0.V(this.K));
        long I2 = I(d10, this.G.g(0), d12);
        long H2 = H(d11, g10, d12);
        boolean z11 = this.G.f9648d && !M(d11);
        if (z11) {
            long j12 = this.G.f9650f;
            if (j12 != -9223372036854775807L) {
                I2 = Math.max(I2, H2 - e4.c.d(j12));
            }
        }
        long j13 = H2 - I2;
        k5.c cVar = this.G;
        k5.g gVar2 = d10;
        if (cVar.f9648d) {
            a6.a.f(cVar.f9645a != -9223372036854775807L);
            long d13 = (d12 - e4.c.d(this.G.f9645a)) - I2;
            f0(d13, j13);
            long e11 = this.G.f9645a + e4.c.e(I2);
            long d14 = d13 - e4.c.d(this.D.f6792a);
            long min = Math.min(5000000, j13 / 2);
            j11 = e11;
            j10 = d14 < min ? min : d14;
            gVar = gVar2;
        } else {
            gVar = gVar2;
            j11 = -9223372036854775807L;
            j10 = 0;
        }
        long d15 = I2 - e4.c.d(gVar.f9679b);
        k5.c cVar2 = this.G;
        z(new b(cVar2.f9645a, j11, this.K, this.N, d15, j13, j10, cVar2, this.f7152g, cVar2.f9648d ? this.D : null));
        if (!this.f7153h) {
            this.C.removeCallbacks(this.f7167v);
            if (z11) {
                this.C.postDelayed(this.f7167v, J(this.G, m0.V(this.K)));
            }
            if (this.H) {
                e0();
            } else if (z10) {
                k5.c cVar3 = this.G;
                if (cVar3.f9648d) {
                    long j14 = cVar3.f9649e;
                    if (j14 != -9223372036854775807L) {
                        if (j14 == 0) {
                            j14 = 5000;
                        }
                        c0(Math.max(0, (this.I + j14) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    private void Z(k5.o oVar) {
        String str = oVar.f9731a;
        if (m0.c(str, "urn:mpeg:dash:utc:direct:2014") || m0.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            a0(oVar);
        } else if (m0.c(str, "urn:mpeg:dash:utc:http-iso:2014") || m0.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            b0(oVar, new d());
        } else if (m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || m0.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            b0(oVar, new h((a) null));
        } else if (m0.c(str, "urn:mpeg:dash:utc:ntp:2014") || m0.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            O();
        } else {
            W(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void a0(k5.o oVar) {
        try {
            X(m0.x0(oVar.f9732b) - this.J);
        } catch (ParserException e10) {
            W(e10);
        }
    }

    private void b0(k5.o oVar, h.a<Long> aVar) {
        d0(new com.google.android.exoplayer2.upstream.h(this.f7170y, Uri.parse(oVar.f9732b), 5, aVar), new g(this, (a) null), 1);
    }

    private void c0(long j10) {
        this.C.postDelayed(this.f7166u, j10);
    }

    private <T> void d0(com.google.android.exoplayer2.upstream.h<T> hVar, Loader.b<com.google.android.exoplayer2.upstream.h<T>> bVar, int i10) {
        this.f7161p.z(new g5.h(hVar.f7768a, hVar.f7769b, this.f7171z.n(hVar, bVar, i10)), hVar.f7770c);
    }

    /* access modifiers changed from: private */
    public void e0() {
        Uri uri;
        this.C.removeCallbacks(this.f7166u);
        if (!this.f7171z.i()) {
            if (this.f7171z.j()) {
                this.H = true;
                return;
            }
            synchronized (this.f7164s) {
                uri = this.E;
            }
            this.H = false;
            d0(new com.google.android.exoplayer2.upstream.h(this.f7170y, uri, 4, this.f7162q), this.f7163r, this.f7158m.d(4));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 != -9223372036854775807L) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 != -9223372036854775807L) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f0(long r15, long r17) {
        /*
            r14 = this;
            r0 = r14
            com.google.android.exoplayer2.j0 r1 = r0.f7152g
            com.google.android.exoplayer2.j0$f r1 = r1.f6745c
            long r1 = r1.f6794c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            k5.c r1 = r0.G
            k5.l r1 = r1.f9654j
            if (r1 == 0) goto L_0x001e
            long r1 = r1.f9723c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            long r1 = e4.c.e(r15)
        L_0x0022:
            com.google.android.exoplayer2.j0 r5 = r0.f7152g
            com.google.android.exoplayer2.j0$f r5 = r5.f6745c
            long r5 = r5.f6793b
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
        L_0x002c:
            r11 = r5
            goto L_0x005a
        L_0x002e:
            k5.c r5 = r0.G
            k5.l r5 = r5.f9654j
            if (r5 == 0) goto L_0x003b
            long r5 = r5.f9722b
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x003b
            goto L_0x002c
        L_0x003b:
            long r5 = r15 - r17
            long r5 = e4.c.e(r5)
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x004c
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x004c
            r5 = r7
        L_0x004c:
            k5.c r7 = r0.G
            long r7 = r7.f9647c
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x002c
            long r5 = r5 + r7
            long r5 = java.lang.Math.min(r5, r1)
            goto L_0x002c
        L_0x005a:
            com.google.android.exoplayer2.j0$f r5 = r0.D
            long r5 = r5.f6792a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            k5.c r5 = r0.G
            k5.l r6 = r5.f9654j
            if (r6 == 0) goto L_0x0071
            long r6 = r6.f9721a
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0071
            r5 = r6
            goto L_0x007a
        L_0x0071:
            long r5 = r5.f9651g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            long r5 = r0.f7160o
        L_0x007a:
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x007f
            r5 = r11
        L_0x007f:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x009c
            r3 = 5000000(0x4c4b40, double:2.470328E-317)
            r5 = 2
            long r5 = r17 / r5
            long r3 = java.lang.Math.min(r3, r5)
            long r3 = r15 - r3
            long r5 = e4.c.e(r3)
            r7 = r11
            r9 = r1
            long r3 = a6.m0.s(r5, r7, r9)
            r6 = r3
            goto L_0x009d
        L_0x009c:
            r6 = r5
        L_0x009d:
            com.google.android.exoplayer2.j0 r3 = r0.f7152g
            com.google.android.exoplayer2.j0$f r3 = r3.f6745c
            float r4 = r3.f6795d
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00ab
            goto L_0x00b7
        L_0x00ab:
            k5.c r4 = r0.G
            k5.l r4 = r4.f9654j
            if (r4 == 0) goto L_0x00b4
            float r4 = r4.f9724d
            goto L_0x00b7
        L_0x00b4:
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00b7:
            float r3 = r3.f6796e
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00bf
        L_0x00bd:
            r13 = r3
            goto L_0x00cb
        L_0x00bf:
            k5.c r3 = r0.G
            k5.l r3 = r3.f9654j
            if (r3 == 0) goto L_0x00c8
            float r3 = r3.f9725e
            goto L_0x00bd
        L_0x00c8:
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00cb:
            com.google.android.exoplayer2.j0$f r3 = new com.google.android.exoplayer2.j0$f
            r5 = r3
            r8 = r11
            r10 = r1
            r12 = r4
            r5.<init>(r6, r8, r10, r12, r13)
            r0.D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.f0(long, long):void");
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.H = false;
        this.f7170y = null;
        Loader loader = this.f7171z;
        if (loader != null) {
            loader.l();
            this.f7171z = null;
        }
        this.I = 0;
        this.J = 0;
        this.G = this.f7153h ? this.G : null;
        this.E = this.F;
        this.B = null;
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.C = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.N = 0;
        this.f7165t.clear();
        this.f7159n.i();
        this.f7157l.release();
    }

    /* access modifiers changed from: package-private */
    public void P(long j10) {
        long j11 = this.M;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.M = j10;
        }
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.C.removeCallbacks(this.f7167v);
        e0();
    }

    /* access modifiers changed from: package-private */
    public void R(com.google.android.exoplayer2.upstream.h<?> hVar, long j10, long j11) {
        com.google.android.exoplayer2.upstream.h<?> hVar2 = hVar;
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        this.f7158m.c(hVar2.f7768a);
        this.f7161p.q(hVar3, hVar2.f7770c);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(com.google.android.exoplayer2.upstream.h<k5.c> r19, long r20, long r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r14 = r20
            g5.h r12 = new g5.h
            long r3 = r0.f7768a
            com.google.android.exoplayer2.upstream.b r5 = r0.f7769b
            android.net.Uri r6 = r19.f()
            java.util.Map r7 = r19.d()
            long r16 = r19.a()
            r2 = r12
            r8 = r20
            r10 = r22
            r14 = r12
            r12 = r16
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            com.google.android.exoplayer2.upstream.g r2 = r1.f7158m
            long r3 = r0.f7768a
            r2.c(r3)
            com.google.android.exoplayer2.source.l$a r2 = r1.f7161p
            int r3 = r0.f7770c
            r2.t(r14, r3)
            java.lang.Object r2 = r19.e()
            k5.c r2 = (k5.c) r2
            k5.c r3 = r1.G
            r4 = 0
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x0042
        L_0x003e:
            int r3 = r3.e()
        L_0x0042:
            k5.g r5 = r2.d(r4)
            long r5 = r5.f9679b
            r7 = 0
        L_0x0049:
            if (r7 >= r3) goto L_0x005a
            k5.c r8 = r1.G
            k5.g r8 = r8.d(r7)
            long r8 = r8.f9679b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0049
        L_0x005a:
            boolean r5 = r2.f9648d
            r6 = 1
            if (r5 == 0) goto L_0x00cb
            int r5 = r3 - r7
            int r8 = r2.e()
            if (r5 <= r8) goto L_0x0070
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            a6.p.h(r5, r8)
        L_0x006e:
            r5 = 1
            goto L_0x00a7
        L_0x0070:
            long r8 = r1.M
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            long r10 = r2.f9652h
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r10
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00a6
            java.lang.String r5 = "DashMediaSource"
            r12 = 73
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r12 = "Loaded stale dynamic manifest: "
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = ", "
            r13.append(r10)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            a6.p.h(r5, r8)
            goto L_0x006e
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            if (r5 == 0) goto L_0x00c9
            int r2 = r1.L
            int r3 = r2 + 1
            r1.L = r3
            com.google.android.exoplayer2.upstream.g r3 = r1.f7158m
            int r0 = r0.f7770c
            int r0 = r3.d(r0)
            if (r2 >= r0) goto L_0x00c1
            long r2 = r18.K()
            r1.c0(r2)
            goto L_0x00c8
        L_0x00c1:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r0 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r0.<init>()
            r1.B = r0
        L_0x00c8:
            return
        L_0x00c9:
            r1.L = r4
        L_0x00cb:
            r1.G = r2
            boolean r5 = r1.H
            boolean r2 = r2.f9648d
            r2 = r2 & r5
            r1.H = r2
            r8 = r20
            long r10 = r8 - r22
            r1.I = r10
            r1.J = r8
            java.lang.Object r2 = r1.f7164s
            monitor-enter(r2)
            com.google.android.exoplayer2.upstream.b r5 = r0.f7769b     // Catch:{ all -> 0x0119 }
            android.net.Uri r5 = r5.f7699a     // Catch:{ all -> 0x0119 }
            android.net.Uri r8 = r1.E     // Catch:{ all -> 0x0119 }
            if (r5 != r8) goto L_0x00e8
            r4 = 1
        L_0x00e8:
            if (r4 == 0) goto L_0x00f7
            k5.c r4 = r1.G     // Catch:{ all -> 0x0119 }
            android.net.Uri r4 = r4.f9655k     // Catch:{ all -> 0x0119 }
            if (r4 == 0) goto L_0x00f1
            goto L_0x00f5
        L_0x00f1:
            android.net.Uri r4 = r19.f()     // Catch:{ all -> 0x0119 }
        L_0x00f5:
            r1.E = r4     // Catch:{ all -> 0x0119 }
        L_0x00f7:
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            if (r3 != 0) goto L_0x0110
            k5.c r0 = r1.G
            boolean r2 = r0.f9648d
            if (r2 == 0) goto L_0x010c
            k5.o r0 = r0.f9653i
            if (r0 == 0) goto L_0x0108
            r1.Z(r0)
            goto L_0x0118
        L_0x0108:
            r18.O()
            goto L_0x0118
        L_0x010c:
            r1.Y(r6)
            goto L_0x0118
        L_0x0110:
            int r0 = r1.N
            int r0 = r0 + r7
            r1.N = r0
            r1.Y(r6)
        L_0x0118:
            return
        L_0x0119:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.S(com.google.android.exoplayer2.upstream.h, long, long):void");
    }

    /* access modifiers changed from: package-private */
    public Loader.c T(com.google.android.exoplayer2.upstream.h<k5.c> hVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVar;
        com.google.android.exoplayer2.upstream.h<k5.c> hVar2 = hVar;
        IOException iOException2 = iOException;
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        long a10 = this.f7158m.a(new g.c(hVar3, new g5.i(hVar2.f7770c), iOException2, i10));
        if (a10 == -9223372036854775807L) {
            cVar = Loader.f7665g;
        } else {
            cVar = Loader.h(false, a10);
        }
        boolean z10 = !cVar.c();
        this.f7161p.x(hVar3, hVar2.f7770c, iOException2, z10);
        if (z10) {
            this.f7158m.c(hVar2.f7768a);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public void U(com.google.android.exoplayer2.upstream.h<Long> hVar, long j10, long j11) {
        com.google.android.exoplayer2.upstream.h<Long> hVar2 = hVar;
        g5.h hVar3 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        this.f7158m.c(hVar2.f7768a);
        this.f7161p.t(hVar3, hVar2.f7770c);
        X(hVar.e().longValue() - j10);
    }

    /* access modifiers changed from: package-private */
    public Loader.c V(com.google.android.exoplayer2.upstream.h<Long> hVar, long j10, long j11, IOException iOException) {
        com.google.android.exoplayer2.upstream.h<Long> hVar2 = hVar;
        IOException iOException2 = iOException;
        l.a aVar = this.f7161p;
        g5.h hVar3 = r4;
        g5.h hVar4 = new g5.h(hVar2.f7768a, hVar2.f7769b, hVar.f(), hVar.d(), j10, j11, hVar.a());
        aVar.x(hVar3, hVar2.f7770c, iOException2, true);
        this.f7158m.c(hVar2.f7768a);
        W(iOException2);
        return Loader.f7664f;
    }

    public j0 g() {
        return this.f7152g;
    }

    public com.google.android.exoplayer2.source.j h(k.a aVar, z5.b bVar, long j10) {
        k.a aVar2 = aVar;
        int intValue = ((Integer) aVar2.f8900a).intValue() - this.N;
        int i10 = intValue;
        l.a u10 = u(aVar2, this.G.d(intValue).f9679b);
        i.a r10 = r(aVar);
        b bVar2 = r2;
        b bVar3 = new b(intValue + this.N, this.G, this.f7159n, i10, this.f7155j, this.A, this.f7157l, r10, this.f7158m, u10, this.K, this.f7169x, bVar, this.f7156k, this.f7168w);
        b bVar4 = bVar2;
        this.f7165t.put(bVar4.f7198h, bVar4);
        return bVar4;
    }

    public void l() {
        this.f7169x.a();
    }

    public void n(com.google.android.exoplayer2.source.j jVar) {
        b bVar = (b) jVar;
        bVar.H();
        this.f7165t.remove(bVar.f7198h);
    }

    /* access modifiers changed from: protected */
    public void y(r rVar) {
        this.A = rVar;
        this.f7157l.c();
        if (this.f7153h) {
            Y(false);
            return;
        }
        this.f7170y = this.f7154i.a();
        this.f7171z = new Loader("DashMediaSource");
        this.C = m0.x();
        e0();
    }

    private DashMediaSource(j0 j0Var, k5.c cVar, a.C0119a aVar, h.a<? extends k5.c> aVar2, a.C0114a aVar3, g5.d dVar, j jVar, com.google.android.exoplayer2.upstream.g gVar, long j10) {
        this.f7152g = j0Var;
        this.D = j0Var.f6745c;
        this.E = ((j0.g) a6.a.e(j0Var.f6744b)).f6797a;
        this.F = j0Var.f6744b.f6797a;
        this.G = cVar;
        this.f7154i = aVar;
        this.f7162q = aVar2;
        this.f7155j = aVar3;
        this.f7157l = jVar;
        this.f7158m = gVar;
        this.f7160o = j10;
        this.f7156k = dVar;
        this.f7159n = new j5.b();
        boolean z10 = cVar != null;
        this.f7153h = z10;
        this.f7161p = t((k.a) null);
        this.f7164s = new Object();
        this.f7165t = new SparseArray<>();
        this.f7168w = new c(this, (a) null);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        if (z10) {
            a6.a.f(true ^ cVar.f9648d);
            this.f7163r = null;
            this.f7166u = null;
            this.f7167v = null;
            this.f7169x = new p.a();
            return;
        }
        this.f7163r = new e(this, (a) null);
        this.f7169x = new f();
        this.f7166u = new j5.c(this);
        this.f7167v = new j5.d(this);
    }
}
