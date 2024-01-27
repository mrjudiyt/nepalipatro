package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import b3.a;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.resource.bitmap.k;
import e2.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeJob */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private long A;
    private boolean B;
    private Object C;
    private Thread D;
    private e2.e E;
    private e2.e F;
    private Object G;
    private e2.a H;
    private f2.d<?> I;
    private volatile f J;
    private volatile boolean K;
    private volatile boolean L;

    /* renamed from: h  reason: collision with root package name */
    private final g<R> f5697h = new g<>();

    /* renamed from: i  reason: collision with root package name */
    private final List<Throwable> f5698i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final b3.c f5699j = b3.c.a();

    /* renamed from: k  reason: collision with root package name */
    private final e f5700k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.core.util.e<h<?>> f5701l;

    /* renamed from: m  reason: collision with root package name */
    private final d<?> f5702m = new d<>();

    /* renamed from: n  reason: collision with root package name */
    private final f f5703n = new f();

    /* renamed from: o  reason: collision with root package name */
    private com.bumptech.glide.d f5704o;

    /* renamed from: p  reason: collision with root package name */
    private e2.e f5705p;

    /* renamed from: q  reason: collision with root package name */
    private com.bumptech.glide.f f5706q;

    /* renamed from: r  reason: collision with root package name */
    private m f5707r;

    /* renamed from: s  reason: collision with root package name */
    private int f5708s;

    /* renamed from: t  reason: collision with root package name */
    private int f5709t;

    /* renamed from: u  reason: collision with root package name */
    private h2.a f5710u;

    /* renamed from: v  reason: collision with root package name */
    private e2.g f5711v;

    /* renamed from: w  reason: collision with root package name */
    private b<R> f5712w;

    /* renamed from: x  reason: collision with root package name */
    private int f5713x;

    /* renamed from: y  reason: collision with root package name */
    private C0107h f5714y;

    /* renamed from: z  reason: collision with root package name */
    private g f5715z;

    /* compiled from: DecodeJob */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5716a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5717b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f5718c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                e2.c[] r0 = e2.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5718c = r0
                r1 = 1
                e2.c r2 = e2.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5718c     // Catch:{ NoSuchFieldError -> 0x001d }
                e2.c r3 = e2.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.h$h[] r2 = com.bumptech.glide.load.engine.h.C0107h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f5717b = r2
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.h.C0107h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f5717b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.h$h r3 = com.bumptech.glide.load.engine.h.C0107h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f5717b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.C0107h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f5717b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.C0107h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f5717b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.h$h r4 = com.bumptech.glide.load.engine.h.C0107h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.h$g[] r3 = com.bumptech.glide.load.engine.h.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5716a = r3
                com.bumptech.glide.load.engine.h$g r4 = com.bumptech.glide.load.engine.h.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f5716a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.h$g r3 = com.bumptech.glide.load.engine.h.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f5716a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.h$g r1 = com.bumptech.glide.load.engine.h.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.h.a.<clinit>():void");
        }
    }

    /* compiled from: DecodeJob */
    interface b<R> {
        void a(GlideException glideException);

        void b(h2.c<R> cVar, e2.a aVar);

        void c(h<?> hVar);
    }

    /* compiled from: DecodeJob */
    private final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final e2.a f5719a;

        c(e2.a aVar) {
            this.f5719a = aVar;
        }

        public h2.c<Z> a(h2.c<Z> cVar) {
            return h.this.A(this.f5719a, cVar);
        }
    }

    /* compiled from: DecodeJob */
    private static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        private e2.e f5721a;

        /* renamed from: b  reason: collision with root package name */
        private j<Z> f5722b;

        /* renamed from: c  reason: collision with root package name */
        private r<Z> f5723c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f5721a = null;
            this.f5722b = null;
            this.f5723c = null;
        }

        /* access modifiers changed from: package-private */
        public void b(e eVar, e2.g gVar) {
            b3.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f5721a, new e(this.f5722b, this.f5723c, gVar));
            } finally {
                this.f5723c.h();
                b3.b.d();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f5723c != null;
        }

        /* access modifiers changed from: package-private */
        public <X> void d(e2.e eVar, j<X> jVar, r<X> rVar) {
            this.f5721a = eVar;
            this.f5722b = jVar;
            this.f5723c = rVar;
        }
    }

    /* compiled from: DecodeJob */
    interface e {
        j2.a a();
    }

    /* compiled from: DecodeJob */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5724a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5725b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5726c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f5726c || z10 || this.f5725b) && this.f5724a;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.f5725b = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            this.f5726c = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean d(boolean z10) {
            this.f5724a = true;
            return a(z10);
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            this.f5725b = false;
            this.f5724a = false;
            this.f5726c = false;
        }
    }

    /* compiled from: DecodeJob */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h  reason: collision with other inner class name */
    /* compiled from: DecodeJob */
    private enum C0107h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, androidx.core.util.e<h<?>> eVar2) {
        this.f5700k = eVar;
        this.f5701l = eVar2;
    }

    private void C() {
        this.f5703n.e();
        this.f5702m.a();
        this.f5697h.a();
        this.K = false;
        this.f5704o = null;
        this.f5705p = null;
        this.f5711v = null;
        this.f5706q = null;
        this.f5707r = null;
        this.f5712w = null;
        this.f5714y = null;
        this.J = null;
        this.D = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.A = 0;
        this.L = false;
        this.C = null;
        this.f5698i.clear();
        this.f5701l.a(this);
    }

    private void D() {
        this.D = Thread.currentThread();
        this.A = a3.f.b();
        boolean z10 = false;
        while (!this.L && this.J != null && !(z10 = this.J.b())) {
            this.f5714y = p(this.f5714y);
            this.J = o();
            if (this.f5714y == C0107h.SOURCE) {
                e();
                return;
            }
        }
        if ((this.f5714y == C0107h.FINISHED || this.L) && !z10) {
            x();
        }
    }

    private <Data, ResourceType> h2.c<R> E(Data data, e2.a aVar, q<Data, ResourceType, R> qVar) {
        e2.g q10 = q(aVar);
        f2.e l10 = this.f5704o.g().l(data);
        try {
            return qVar.a(l10, q10, this.f5708s, this.f5709t, new c(aVar));
        } finally {
            l10.b();
        }
    }

    private void F() {
        int i10 = a.f5716a[this.f5715z.ordinal()];
        if (i10 == 1) {
            this.f5714y = p(C0107h.INITIALIZE);
            this.J = o();
            D();
        } else if (i10 == 2) {
            D();
        } else if (i10 == 3) {
            n();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f5715z);
        }
    }

    private void G() {
        Throwable th;
        this.f5699j.c();
        if (this.K) {
            if (this.f5698i.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f5698i;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.K = true;
    }

    private <Data> h2.c<R> l(f2.d<?> dVar, Data data, e2.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = a3.f.b();
            h2.c<R> m10 = m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                t("Decoded result " + m10, b10);
            }
            return m10;
        } finally {
            dVar.b();
        }
    }

    private <Data> h2.c<R> m(Data data, e2.a aVar) {
        return E(data, aVar, this.f5697h.h(data.getClass()));
    }

    private void n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.A;
            u("Retrieved data", j10, "data: " + this.G + ", cache key: " + this.E + ", fetcher: " + this.I);
        }
        h2.c<R> cVar = null;
        try {
            cVar = l(this.I, this.G, this.H);
        } catch (GlideException e10) {
            e10.i(this.F, this.H);
            this.f5698i.add(e10);
        }
        if (cVar != null) {
            w(cVar, this.H);
        } else {
            D();
        }
    }

    private f o() {
        int i10 = a.f5717b[this.f5714y.ordinal()];
        if (i10 == 1) {
            return new s(this.f5697h, this);
        }
        if (i10 == 2) {
            return new c(this.f5697h, this);
        }
        if (i10 == 3) {
            return new v(this.f5697h, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f5714y);
    }

    private C0107h p(C0107h hVar) {
        int i10 = a.f5717b[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.B ? C0107h.FINISHED : C0107h.SOURCE;
            }
            if (i10 == 3 || i10 == 4) {
                return C0107h.FINISHED;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + hVar);
            } else if (this.f5710u.b()) {
                return C0107h.RESOURCE_CACHE;
            } else {
                return p(C0107h.RESOURCE_CACHE);
            }
        } else if (this.f5710u.a()) {
            return C0107h.DATA_CACHE;
        } else {
            return p(C0107h.DATA_CACHE);
        }
    }

    private e2.g q(e2.a aVar) {
        e2.g gVar = this.f5711v;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        boolean z10 = aVar == e2.a.RESOURCE_DISK_CACHE || this.f5697h.w();
        e2.f fVar = k.f5886j;
        Boolean bool = (Boolean) gVar.c(fVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return gVar;
        }
        e2.g gVar2 = new e2.g();
        gVar2.d(this.f5711v);
        gVar2.e(fVar, Boolean.valueOf(z10));
        return gVar2;
    }

    private int r() {
        return this.f5706q.ordinal();
    }

    private void t(String str, long j10) {
        u(str, j10, (String) null);
    }

    private void u(String str, long j10, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(a3.f.a(j10));
        sb.append(", load key: ");
        sb.append(this.f5707r);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    private void v(h2.c<R> cVar, e2.a aVar) {
        G();
        this.f5712w.b(cVar, aVar);
    }

    private void w(h2.c<R> cVar, e2.a aVar) {
        if (cVar instanceof h2.b) {
            ((h2.b) cVar).initialize();
        }
        r<R> rVar = null;
        r<R> rVar2 = cVar;
        if (this.f5702m.c()) {
            r<R> e10 = r.e(cVar);
            rVar = e10;
            rVar2 = e10;
        }
        v(rVar2, aVar);
        this.f5714y = C0107h.ENCODE;
        try {
            if (this.f5702m.c()) {
                this.f5702m.b(this.f5700k, this.f5711v);
            }
            y();
        } finally {
            if (rVar != null) {
                rVar.h();
            }
        }
    }

    private void x() {
        G();
        this.f5712w.a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f5698i)));
        z();
    }

    private void y() {
        if (this.f5703n.b()) {
            C();
        }
    }

    private void z() {
        if (this.f5703n.c()) {
            C();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.engine.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.engine.t} */
    /* JADX WARNING: type inference failed for: r12v5, types: [e2.e] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> h2.c<Z> A(e2.a r12, h2.c<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            e2.a r0 = e2.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.g<R> r0 = r11.f5697h
            e2.k r0 = r0.r(r8)
            com.bumptech.glide.d r2 = r11.f5704o
            int r3 = r11.f5708s
            int r4 = r11.f5709t
            h2.c r2 = r0.b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.a()
        L_0x002b:
            com.bumptech.glide.load.engine.g<R> r13 = r11.f5697h
            boolean r13 = r13.v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.g<R> r13 = r11.f5697h
            e2.j r1 = r13.n(r0)
            e2.g r13 = r11.f5711v
            e2.c r13 = r1.b(r13)
            goto L_0x0042
        L_0x0040:
            e2.c r13 = e2.c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.g<R> r1 = r11.f5697h
            e2.e r2 = r11.E
            boolean r1 = r1.x(r2)
            r2 = 1
            r1 = r1 ^ r2
            h2.a r3 = r11.f5710u
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.h.a.f5718c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.t r12 = new com.bumptech.glide.load.engine.t
            com.bumptech.glide.load.engine.g<R> r13 = r11.f5697h
            i2.b r2 = r13.b()
            e2.e r3 = r11.E
            e2.e r4 = r11.f5705p
            int r5 = r11.f5708s
            int r6 = r11.f5709t
            e2.g r9 = r11.f5711v
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            e2.e r13 = r11.E
            e2.e r1 = r11.f5705p
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.r.e(r0)
            com.bumptech.glide.load.engine.h$d<?> r13 = r11.f5702m
            r13.d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.h.A(e2.a, h2.c):h2.c");
    }

    /* access modifiers changed from: package-private */
    public void B(boolean z10) {
        if (this.f5703n.d(z10)) {
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        C0107h p10 = p(C0107h.INITIALIZE);
        return p10 == C0107h.RESOURCE_CACHE || p10 == C0107h.DATA_CACHE;
    }

    public void a(e2.e eVar, Exception exc, f2.d<?> dVar, e2.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f5698i.add(glideException);
        if (Thread.currentThread() != this.D) {
            this.f5715z = g.SWITCH_TO_SOURCE_SERVICE;
            this.f5712w.c(this);
            return;
        }
        D();
    }

    public void d(e2.e eVar, Object obj, f2.d<?> dVar, e2.a aVar, e2.e eVar2) {
        this.E = eVar;
        this.G = obj;
        this.I = dVar;
        this.H = aVar;
        this.F = eVar2;
        if (Thread.currentThread() != this.D) {
            this.f5715z = g.DECODE_DATA;
            this.f5712w.c(this);
            return;
        }
        b3.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            n();
        } finally {
            b3.b.d();
        }
    }

    public void e() {
        this.f5715z = g.SWITCH_TO_SOURCE_SERVICE;
        this.f5712w.c(this);
    }

    public b3.c f() {
        return this.f5699j;
    }

    public void g() {
        this.L = true;
        f fVar = this.J;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: k */
    public int compareTo(h<?> hVar) {
        int r10 = r() - hVar.r();
        return r10 == 0 ? this.f5713x - hVar.f5713x : r10;
    }

    public void run() {
        b3.b.b("DecodeJob#run(model=%s)", this.C);
        f2.d<?> dVar = this.I;
        try {
            if (this.L) {
                x();
                if (dVar != null) {
                    dVar.b();
                }
                b3.b.d();
                return;
            }
            F();
            if (dVar != null) {
                dVar.b();
            }
            b3.b.d();
        } catch (b e10) {
            throw e10;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            b3.b.d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public h<R> s(com.bumptech.glide.d dVar, Object obj, m mVar, e2.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.f fVar, h2.a aVar, Map<Class<?>, e2.k<?>> map, boolean z10, boolean z11, boolean z12, e2.g gVar, b<R> bVar, int i12) {
        this.f5697h.u(dVar, obj, eVar, i10, i11, aVar, cls, cls2, fVar, gVar, map, z10, z11, this.f5700k);
        this.f5704o = dVar;
        this.f5705p = eVar;
        this.f5706q = fVar;
        this.f5707r = mVar;
        this.f5708s = i10;
        this.f5709t = i11;
        this.f5710u = aVar;
        this.B = z12;
        this.f5711v = gVar;
        this.f5712w = bVar;
        this.f5713x = i12;
        this.f5715z = g.INITIALIZE;
        this.C = obj;
        return this;
    }
}
