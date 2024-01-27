package y7;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import v7.p;
import v7.v;
import v7.x;

/* compiled from: CacheStrategy */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final v f17335a;

    /* renamed from: b  reason: collision with root package name */
    public final x f17336b;

    /* compiled from: CacheStrategy */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long f17337a;

        /* renamed from: b  reason: collision with root package name */
        final v f17338b;

        /* renamed from: c  reason: collision with root package name */
        final x f17339c;

        /* renamed from: d  reason: collision with root package name */
        private Date f17340d;

        /* renamed from: e  reason: collision with root package name */
        private String f17341e;

        /* renamed from: f  reason: collision with root package name */
        private Date f17342f;

        /* renamed from: g  reason: collision with root package name */
        private String f17343g;

        /* renamed from: h  reason: collision with root package name */
        private Date f17344h;

        /* renamed from: i  reason: collision with root package name */
        private long f17345i;

        /* renamed from: j  reason: collision with root package name */
        private long f17346j;

        /* renamed from: k  reason: collision with root package name */
        private String f17347k;

        /* renamed from: l  reason: collision with root package name */
        private int f17348l = -1;

        public b(long j10, v vVar, x xVar) {
            this.f17337a = j10;
            this.f17338b = vVar;
            this.f17339c = xVar;
            if (xVar != null) {
                p r10 = xVar.r();
                int f10 = r10.f();
                for (int i10 = 0; i10 < f10; i10++) {
                    String d10 = r10.d(i10);
                    String g10 = r10.g(i10);
                    if ("Date".equalsIgnoreCase(d10)) {
                        this.f17340d = g.b(g10);
                        this.f17341e = g10;
                    } else if ("Expires".equalsIgnoreCase(d10)) {
                        this.f17344h = g.b(g10);
                    } else if ("Last-Modified".equalsIgnoreCase(d10)) {
                        this.f17342f = g.b(g10);
                        this.f17343g = g10;
                    } else if ("ETag".equalsIgnoreCase(d10)) {
                        this.f17347k = g10;
                    } else if ("Age".equalsIgnoreCase(d10)) {
                        this.f17348l = d.a(g10, -1);
                    } else if (k.f17422c.equalsIgnoreCase(d10)) {
                        this.f17345i = Long.parseLong(g10);
                    } else if (k.f17423d.equalsIgnoreCase(d10)) {
                        this.f17346j = Long.parseLong(g10);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f17340d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f17346j - date.getTime());
            }
            int i10 = this.f17348l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f17346j;
            return j10 + (j11 - this.f17345i) + (this.f17337a - j11);
        }

        private long b() {
            v7.c l10 = this.f17339c.l();
            if (l10.d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) l10.d());
            }
            if (this.f17344h != null) {
                Date date = this.f17340d;
                long time = this.f17344h.getTime() - (date != null ? date.getTime() : this.f17346j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f17342f == null || this.f17339c.u().j().B() != null) {
                return 0;
            } else {
                Date date2 = this.f17340d;
                long time2 = (date2 != null ? date2.getTime() : this.f17345i) - this.f17342f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        private c d() {
            if (this.f17339c == null) {
                return new c(this.f17338b, (x) null);
            }
            if (this.f17338b.k() && this.f17339c.o() == null) {
                return new c(this.f17338b, (x) null);
            }
            if (!c.a(this.f17339c, this.f17338b)) {
                return new c(this.f17338b, (x) null);
            }
            v7.c g10 = this.f17338b.g();
            if (g10.h() || e(this.f17338b)) {
                return new c(this.f17338b, (x) null);
            }
            long a10 = a();
            long b10 = b();
            if (g10.d() != -1) {
                b10 = Math.min(b10, TimeUnit.SECONDS.toMillis((long) g10.d()));
            }
            long j10 = 0;
            long millis = g10.f() != -1 ? TimeUnit.SECONDS.toMillis((long) g10.f()) : 0;
            v7.c l10 = this.f17339c.l();
            if (!l10.g() && g10.e() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) g10.e());
            }
            if (!l10.h()) {
                long j11 = millis + a10;
                if (j11 < j10 + b10) {
                    x.b t10 = this.f17339c.t();
                    if (j11 >= b10) {
                        t10.k("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        t10.k("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((v) null, t10.m());
                }
            }
            v.b m10 = this.f17338b.m();
            String str = this.f17347k;
            if (str != null) {
                m10.j("If-None-Match", str);
            } else if (this.f17342f != null) {
                m10.j("If-Modified-Since", this.f17343g);
            } else if (this.f17340d != null) {
                m10.j("If-Modified-Since", this.f17341e);
            }
            v g11 = m10.g();
            return e(g11) ? new c(g11, this.f17339c) : new c(g11, (x) null);
        }

        private static boolean e(v vVar) {
            return (vVar.h("If-Modified-Since") == null && vVar.h("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f17339c.l().d() == -1 && this.f17344h == null;
        }

        public c c() {
            c d10 = d();
            return (d10.f17335a == null || !this.f17338b.g().j()) ? d10 : new c((v) null, (x) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.l().b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(v7.x r3, v7.v r4) {
        /*
            int r0 = r3.n()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.p(r0)
            if (r0 != 0) goto L_0x005a
            v7.c r0 = r3.l()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            v7.c r0 = r3.l()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x005a
            v7.c r0 = r3.l()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            v7.c r3 = r3.l()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            v7.c r3 = r4.g()
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.c.a(v7.x, v7.v):boolean");
    }

    private c(v vVar, x xVar) {
        this.f17335a = vVar;
        this.f17336b = xVar;
    }
}
