package x7;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.u;
import x7.b;

/* compiled from: FramedConnection */
public final class d implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService E = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), w7.h.r("OkHttp FramedConnection", true));
    final Socket A;
    final c B;
    final j C;
    /* access modifiers changed from: private */
    public final Set<Integer> D;

    /* renamed from: h  reason: collision with root package name */
    final u f17125h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f17126i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final i f17127j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map<Integer, e> f17128k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final String f17129l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f17130m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f17131n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f17132o;

    /* renamed from: p  reason: collision with root package name */
    private long f17133p;

    /* renamed from: q  reason: collision with root package name */
    private final ExecutorService f17134q;

    /* renamed from: r  reason: collision with root package name */
    private Map<Integer, l> f17135r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final m f17136s;

    /* renamed from: t  reason: collision with root package name */
    private int f17137t;

    /* renamed from: u  reason: collision with root package name */
    long f17138u;

    /* renamed from: v  reason: collision with root package name */
    long f17139v;

    /* renamed from: w  reason: collision with root package name */
    n f17140w;

    /* renamed from: x  reason: collision with root package name */
    final n f17141x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public boolean f17142y;

    /* renamed from: z  reason: collision with root package name */
    final p f17143z;

    /* compiled from: FramedConnection */
    class a extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17144i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f17145j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i10, a aVar) {
            super(str, objArr);
            this.f17144i = i10;
            this.f17145j = aVar;
        }

        public void a() {
            try {
                d.this.d1(this.f17144i, this.f17145j);
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: FramedConnection */
    class b extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17147i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f17148j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f17147i = i10;
            this.f17148j = j10;
        }

        public void a() {
            try {
                d.this.B.e(this.f17147i, this.f17148j);
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: FramedConnection */
    class c extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f17150i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f17151j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f17152k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ l f17153l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, boolean z10, int i10, int i11, l lVar) {
            super(str, objArr);
            this.f17150i = z10;
            this.f17151j = i10;
            this.f17152k = i11;
            this.f17153l = lVar;
        }

        public void a() {
            try {
                d.this.b1(this.f17150i, this.f17151j, this.f17152k, this.f17153l);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: x7.d$d  reason: collision with other inner class name */
    /* compiled from: FramedConnection */
    class C0293d extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17155i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f17156j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0293d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f17155i = i10;
            this.f17156j = list;
        }

        public void a() {
            if (d.this.f17136s.b(this.f17155i, this.f17156j)) {
                try {
                    d.this.B.g(this.f17155i, a.CANCEL);
                    synchronized (d.this) {
                        d.this.D.remove(Integer.valueOf(this.f17155i));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: FramedConnection */
    class e extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17158i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f17159j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f17160k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f17158i = i10;
            this.f17159j = list;
            this.f17160k = z10;
        }

        public void a() {
            boolean c10 = d.this.f17136s.c(this.f17158i, this.f17159j, this.f17160k);
            if (c10) {
                try {
                    d.this.B.g(this.f17158i, a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (c10 || this.f17160k) {
                synchronized (d.this) {
                    d.this.D.remove(Integer.valueOf(this.f17158i));
                }
            }
        }
    }

    /* compiled from: FramedConnection */
    class f extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17162i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ea.e f17163j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f17164k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f17165l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i10, ea.e eVar, int i11, boolean z10) {
            super(str, objArr);
            this.f17162i = i10;
            this.f17163j = eVar;
            this.f17164k = i11;
            this.f17165l = z10;
        }

        public void a() {
            try {
                boolean a10 = d.this.f17136s.a(this.f17162i, this.f17163j, this.f17164k, this.f17165l);
                if (a10) {
                    d.this.B.g(this.f17162i, a.CANCEL);
                }
                if (a10 || this.f17165l) {
                    synchronized (d.this) {
                        d.this.D.remove(Integer.valueOf(this.f17162i));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: FramedConnection */
    class g extends w7.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f17167i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f17168j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i10, a aVar) {
            super(str, objArr);
            this.f17167i = i10;
            this.f17168j = aVar;
        }

        public void a() {
            d.this.f17136s.d(this.f17167i, this.f17168j);
            synchronized (d.this) {
                d.this.D.remove(Integer.valueOf(this.f17167i));
            }
        }
    }

    /* compiled from: FramedConnection */
    public static class h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Socket f17170a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f17171b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public ea.g f17172c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public ea.f f17173d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public i f17174e = i.f17178a;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public u f17175f = u.SPDY_3;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public m f17176g = m.f17270a;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f17177h;

        public h(boolean z10) {
            this.f17177h = z10;
        }

        public d i() {
            return new d(this, (a) null);
        }

        public h j(u uVar) {
            this.f17175f = uVar;
            return this;
        }

        public h k(Socket socket, String str, ea.g gVar, ea.f fVar) {
            this.f17170a = socket;
            this.f17171b = str;
            this.f17172c = gVar;
            this.f17173d = fVar;
            return this;
        }
    }

    /* compiled from: FramedConnection */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public static final i f17178a = new a();

        /* compiled from: FramedConnection */
        static class a extends i {
            a() {
            }

            public void b(e eVar) {
                eVar.l(a.REFUSED_STREAM);
            }
        }

        public void a(d dVar) {
        }

        public abstract void b(e eVar);
    }

    /* compiled from: FramedConnection */
    class j extends w7.d implements b.a {

        /* renamed from: i  reason: collision with root package name */
        final b f17179i;

        /* compiled from: FramedConnection */
        class a extends w7.d {

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ e f17181i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, e eVar) {
                super(str, objArr);
                this.f17181i = eVar;
            }

            public void a() {
                try {
                    d.this.f17127j.b(this.f17181i);
                } catch (IOException e10) {
                    Logger logger = w7.b.f16990a;
                    Level level = Level.INFO;
                    logger.log(level, "FramedConnection.Listener failure for " + d.this.f17129l, e10);
                    try {
                        this.f17181i.l(a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: FramedConnection */
        class b extends w7.d {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            public void a() {
                d.this.f17127j.a(d.this);
            }
        }

        /* compiled from: FramedConnection */
        class c extends w7.d {

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ n f17184i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, n nVar) {
                super(str, objArr);
                this.f17184i = nVar;
            }

            public void a() {
                try {
                    d.this.B.P(this.f17184i);
                } catch (IOException unused) {
                }
            }
        }

        /* synthetic */ j(d dVar, b bVar, a aVar) {
            this(bVar);
        }

        private void b(n nVar) {
            d.E.execute(new c("OkHttp %s ACK Settings", new Object[]{d.this.f17129l}, nVar));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = x7.a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            x7.d.h(r5.f17180j, r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                x7.a r0 = x7.a.INTERNAL_ERROR
                x7.d r1 = x7.d.this     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.f17126i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 != 0) goto L_0x000d
                x7.b r1 = r5.f17179i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                r1.f0()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            L_0x000d:
                x7.b r1 = r5.f17179i     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                boolean r1 = r1.T(r5)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                if (r1 == 0) goto L_0x0016
                goto L_0x000d
            L_0x0016:
                x7.a r1 = x7.a.NO_ERROR     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
                x7.a r0 = x7.a.CANCEL     // Catch:{ IOException -> 0x0024 }
                x7.d r2 = x7.d.this     // Catch:{ IOException -> 0x002b }
                r2.K0(r1, r0)     // Catch:{ IOException -> 0x002b }
                goto L_0x002b
            L_0x0020:
                r1 = move-exception
                r2 = r0
                goto L_0x0035
            L_0x0023:
                r1 = r0
            L_0x0024:
                x7.a r0 = x7.a.PROTOCOL_ERROR     // Catch:{ all -> 0x0031 }
                x7.d r1 = x7.d.this     // Catch:{ IOException -> 0x002b }
                r1.K0(r0, r0)     // Catch:{ IOException -> 0x002b }
            L_0x002b:
                x7.b r0 = r5.f17179i
                w7.h.c(r0)
                return
            L_0x0031:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x0035:
                x7.d r3 = x7.d.this     // Catch:{ IOException -> 0x003a }
                r3.K0(r2, r0)     // Catch:{ IOException -> 0x003a }
            L_0x003a:
                x7.b r0 = r5.f17179i
                w7.h.c(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.d.j.a():void");
        }

        public void e(int i10, long j10) {
            if (i10 == 0) {
                synchronized (d.this) {
                    d dVar = d.this;
                    dVar.f17139v += j10;
                    dVar.notifyAll();
                }
                return;
            }
            e M0 = d.this.M0(i10);
            if (M0 != null) {
                synchronized (M0) {
                    M0.i(j10);
                }
            }
        }

        public void f(boolean z10, int i10, int i11) {
            if (z10) {
                l o02 = d.this.V0(i10);
                if (o02 != null) {
                    o02.b();
                    return;
                }
                return;
            }
            d.this.c1(true, i10, i11, (l) null);
        }

        public void g(int i10, a aVar) {
            if (d.this.U0(i10)) {
                d.this.T0(i10, aVar);
                return;
            }
            e W0 = d.this.W0(i10);
            if (W0 != null) {
                W0.y(aVar);
            }
        }

        public void i(int i10, int i11, List<f> list) {
            d.this.S0(i11, list);
        }

        public void j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
            if (r14.f() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            r0.n(x7.a.PROTOCOL_ERROR);
            r8.f17180j.W0(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
            r0.x(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            r0.w();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k(boolean r9, boolean r10, int r11, int r12, java.util.List<x7.f> r13, x7.g r14) {
            /*
                r8 = this;
                x7.d r12 = x7.d.this
                boolean r12 = r12.U0(r11)
                if (r12 == 0) goto L_0x000e
                x7.d r9 = x7.d.this
                r9.R0(r11, r13, r10)
                return
            L_0x000e:
                x7.d r12 = x7.d.this
                monitor-enter(r12)
                x7.d r0 = x7.d.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.f17132o     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                x7.d r0 = x7.d.this     // Catch:{ all -> 0x00a5 }
                x7.e r0 = r0.M0(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.e()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                x7.d r9 = x7.d.this     // Catch:{ all -> 0x00a5 }
                x7.a r10 = x7.a.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.e1(r11, r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x0032:
                x7.d r14 = x7.d.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.f17130m     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                x7.d r0 = x7.d.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.f17131n     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                x7.e r14 = new x7.e     // Catch:{ all -> 0x00a5 }
                x7.d r4 = x7.d.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                x7.d r9 = x7.d.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.f17130m = r11     // Catch:{ all -> 0x00a5 }
                x7.d r9 = x7.d.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.f17128k     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = x7.d.E     // Catch:{ all -> 0x00a5 }
                x7.d$j$a r10 = new x7.d$j$a     // Catch:{ all -> 0x00a5 }
                java.lang.String r13 = "OkHttp %s stream %d"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                r1 = 0
                x7.d r2 = x7.d.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r2 = r2.f17129l     // Catch:{ all -> 0x00a5 }
                r0[r1] = r2     // Catch:{ all -> 0x00a5 }
                r1 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r0[r1] = r11     // Catch:{ all -> 0x00a5 }
                r10.<init>(r13, r0, r14)     // Catch:{ all -> 0x00a5 }
                r9.execute(r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x008a:
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                boolean r9 = r14.f()
                if (r9 == 0) goto L_0x009c
                x7.a r9 = x7.a.PROTOCOL_ERROR
                r0.n(r9)
                x7.d r9 = x7.d.this
                r9.W0(r11)
                return
            L_0x009c:
                r0.x(r13, r14)
                if (r10 == 0) goto L_0x00a4
                r0.w()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.d.j.k(boolean, boolean, int, int, java.util.List, x7.g):void");
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(boolean r11, x7.n r12) {
            /*
                r10 = this;
                x7.d r0 = x7.d.this
                monitor-enter(r0)
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                x7.n r1 = r1.f17141x     // Catch:{ all -> 0x00ab }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.e(r2)     // Catch:{ all -> 0x00ab }
                if (r11 == 0) goto L_0x0016
                x7.d r11 = x7.d.this     // Catch:{ all -> 0x00ab }
                x7.n r11 = r11.f17141x     // Catch:{ all -> 0x00ab }
                r11.a()     // Catch:{ all -> 0x00ab }
            L_0x0016:
                x7.d r11 = x7.d.this     // Catch:{ all -> 0x00ab }
                x7.n r11 = r11.f17141x     // Catch:{ all -> 0x00ab }
                r11.j(r12)     // Catch:{ all -> 0x00ab }
                x7.d r11 = x7.d.this     // Catch:{ all -> 0x00ab }
                v7.u r11 = r11.L0()     // Catch:{ all -> 0x00ab }
                v7.u r3 = v7.u.HTTP_2     // Catch:{ all -> 0x00ab }
                if (r11 != r3) goto L_0x002a
                r10.b(r12)     // Catch:{ all -> 0x00ab }
            L_0x002a:
                x7.d r11 = x7.d.this     // Catch:{ all -> 0x00ab }
                x7.n r11 = r11.f17141x     // Catch:{ all -> 0x00ab }
                int r11 = r11.e(r2)     // Catch:{ all -> 0x00ab }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x0079
                if (r11 == r1) goto L_0x0079
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x00ab }
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                boolean r1 = r1.f17142y     // Catch:{ all -> 0x00ab }
                if (r1 != 0) goto L_0x004f
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                r1.I0(r11)     // Catch:{ all -> 0x00ab }
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                boolean unused = r1.f17142y = r4     // Catch:{ all -> 0x00ab }
            L_0x004f:
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                java.util.Map r1 = r1.f17128k     // Catch:{ all -> 0x00ab }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ab }
                if (r1 != 0) goto L_0x007a
                x7.d r1 = x7.d.this     // Catch:{ all -> 0x00ab }
                java.util.Map r1 = r1.f17128k     // Catch:{ all -> 0x00ab }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00ab }
                x7.d r5 = x7.d.this     // Catch:{ all -> 0x00ab }
                java.util.Map r5 = r5.f17128k     // Catch:{ all -> 0x00ab }
                int r5 = r5.size()     // Catch:{ all -> 0x00ab }
                x7.e[] r5 = new x7.e[r5]     // Catch:{ all -> 0x00ab }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x00ab }
                r5 = r1
                x7.e[] r5 = (x7.e[]) r5     // Catch:{ all -> 0x00ab }
                goto L_0x007a
            L_0x0079:
                r11 = r2
            L_0x007a:
                java.util.concurrent.ExecutorService r1 = x7.d.E     // Catch:{ all -> 0x00ab }
                x7.d$j$b r6 = new x7.d$j$b     // Catch:{ all -> 0x00ab }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ab }
                x7.d r8 = x7.d.this     // Catch:{ all -> 0x00ab }
                java.lang.String r8 = r8.f17129l     // Catch:{ all -> 0x00ab }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x00ab }
                r6.<init>(r7, r4)     // Catch:{ all -> 0x00ab }
                r1.execute(r6)     // Catch:{ all -> 0x00ab }
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                if (r5 == 0) goto L_0x00aa
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00aa
                int r0 = r5.length
            L_0x009b:
                if (r9 >= r0) goto L_0x00aa
                r1 = r5[r9]
                monitor-enter(r1)
                r1.i(r11)     // Catch:{ all -> 0x00a7 }
                monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
                int r9 = r9 + 1
                goto L_0x009b
            L_0x00a7:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
                throw r11
            L_0x00aa:
                return
            L_0x00ab:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ab }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.d.j.l(boolean, x7.n):void");
        }

        public void m(int i10, a aVar, ea.h hVar) {
            e[] eVarArr;
            hVar.u();
            synchronized (d.this) {
                eVarArr = (e[]) d.this.f17128k.values().toArray(new e[d.this.f17128k.size()]);
                boolean unused = d.this.f17132o = true;
            }
            for (e eVar : eVarArr) {
                if (eVar.o() > i10 && eVar.s()) {
                    eVar.y(a.REFUSED_STREAM);
                    d.this.W0(eVar.o());
                }
            }
        }

        public void n(boolean z10, int i10, ea.g gVar, int i11) {
            if (d.this.U0(i10)) {
                d.this.Q0(i10, gVar, i11, z10);
                return;
            }
            e M0 = d.this.M0(i10);
            if (M0 == null) {
                d.this.e1(i10, a.INVALID_STREAM);
                gVar.skip((long) i11);
                return;
            }
            M0.v(gVar, i11);
            if (z10) {
                M0.w();
            }
        }

        public void o(int i10, int i11, int i12, boolean z10) {
        }

        private j(b bVar) {
            super("OkHttp %s", d.this.f17129l);
            this.f17179i = bVar;
        }
    }

    static {
        Class<d> cls = d.class;
    }

    /* synthetic */ d(h hVar, a aVar) {
        this(hVar);
    }

    /* access modifiers changed from: private */
    public void K0(a aVar, a aVar2) {
        int i10;
        e[] eVarArr;
        l[] lVarArr = null;
        try {
            Z0(aVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f17128k.isEmpty()) {
                eVarArr = (e[]) this.f17128k.values().toArray(new e[this.f17128k.size()]);
                this.f17128k.clear();
                Y0(false);
            } else {
                eVarArr = null;
            }
            Map<Integer, l> map = this.f17135r;
            if (map != null) {
                this.f17135r = null;
                lVarArr = (l[]) map.values().toArray(new l[this.f17135r.size()]);
            }
        }
        if (eVarArr != null) {
            for (e l10 : eVarArr) {
                try {
                    l10.l(aVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        if (lVarArr != null) {
            for (l a10 : lVarArr) {
                a10.a();
            }
        }
        try {
            this.B.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.A.close();
        } catch (IOException e13) {
            e = e13;
        }
        if (e != null) {
            throw e;
        }
    }

    private e O0(int i10, List<f> list, boolean z10, boolean z11) {
        int i11;
        e eVar;
        boolean z12 = !z10;
        boolean z13 = !z11;
        synchronized (this.B) {
            synchronized (this) {
                if (!this.f17132o) {
                    i11 = this.f17131n;
                    this.f17131n = i11 + 2;
                    eVar = new e(i11, this, z12, z13, list);
                    if (eVar.t()) {
                        this.f17128k.put(Integer.valueOf(i11), eVar);
                        Y0(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i10 == 0) {
                this.B.B0(z12, z13, i11, i10, list);
            } else if (!this.f17126i) {
                this.B.i(i10, i11, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z10) {
            this.B.flush();
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public void Q0(int i10, ea.g gVar, int i11, boolean z10) {
        ea.e eVar = new ea.e();
        long j10 = (long) i11;
        gVar.C0(j10);
        gVar.S(eVar, j10);
        if (eVar.w0() == j10) {
            this.f17134q.execute(new f("OkHttp %s Push Data[%s]", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, eVar, i11, z10));
            return;
        }
        throw new IOException(eVar.w0() + " != " + i11);
    }

    /* access modifiers changed from: private */
    public void R0(int i10, List<f> list, boolean z10) {
        this.f17134q.execute(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, list, z10));
    }

    /* access modifiers changed from: private */
    public void S0(int i10, List<f> list) {
        synchronized (this) {
            if (this.D.contains(Integer.valueOf(i10))) {
                e1(i10, a.PROTOCOL_ERROR);
                return;
            }
            this.D.add(Integer.valueOf(i10));
            this.f17134q.execute(new C0293d("OkHttp %s Push Request[%s]", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, list));
        }
    }

    /* access modifiers changed from: private */
    public void T0(int i10, a aVar) {
        this.f17134q.execute(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, aVar));
    }

    /* access modifiers changed from: private */
    public boolean U0(int i10) {
        return this.f17125h == u.HTTP_2 && i10 != 0 && (i10 & 1) == 0;
    }

    /* access modifiers changed from: private */
    public synchronized l V0(int i10) {
        Map<Integer, l> map;
        map = this.f17135r;
        return map != null ? map.remove(Integer.valueOf(i10)) : null;
    }

    private synchronized void Y0(boolean z10) {
        long j10;
        if (z10) {
            try {
                j10 = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        this.f17133p = j10;
    }

    /* access modifiers changed from: private */
    public void b1(boolean z10, int i10, int i11, l lVar) {
        synchronized (this.B) {
            if (lVar != null) {
                lVar.c();
            }
            this.B.f(z10, i10, i11);
        }
    }

    /* access modifiers changed from: private */
    public void c1(boolean z10, int i10, int i11, l lVar) {
        E.execute(new c("OkHttp %s ping %08x%08x", new Object[]{this.f17129l, Integer.valueOf(i10), Integer.valueOf(i11)}, z10, i10, i11, lVar));
    }

    /* access modifiers changed from: package-private */
    public void I0(long j10) {
        this.f17139v += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public u L0() {
        return this.f17125h;
    }

    /* access modifiers changed from: package-private */
    public synchronized e M0(int i10) {
        return this.f17128k.get(Integer.valueOf(i10));
    }

    public synchronized int N0() {
        return this.f17141x.f(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public e P0(List<f> list, boolean z10, boolean z11) {
        return O0(0, list, z10, z11);
    }

    /* access modifiers changed from: package-private */
    public synchronized e W0(int i10) {
        e remove;
        remove = this.f17128k.remove(Integer.valueOf(i10));
        if (remove != null && this.f17128k.isEmpty()) {
            Y0(true);
        }
        notifyAll();
        return remove;
    }

    public void X0() {
        this.B.H();
        this.B.x0(this.f17140w);
        int e10 = this.f17140w.e(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (e10 != 65536) {
            this.B.e(0, (long) (e10 - NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST));
        }
    }

    public void Z0(a aVar) {
        synchronized (this.B) {
            synchronized (this) {
                if (!this.f17132o) {
                    this.f17132o = true;
                    int i10 = this.f17130m;
                    this.B.p(i10, aVar, w7.h.f17014a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.B.A0());
        r6 = (long) r3;
        r8.f17139v -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a1(int r9, boolean r10, ea.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            x7.c r12 = r8.B
            r12.t0(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f17139v     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, x7.e> r3 = r8.f17128k     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            x7.c r3 = r8.B     // Catch:{ all -> 0x0056 }
            int r3 = r3.A0()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f17139v     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f17139v = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            x7.c r4 = r8.B
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.t0(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.d.a1(int, boolean, ea.e, long):void");
    }

    public void close() {
        K0(a.NO_ERROR, a.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public void d1(int i10, a aVar) {
        this.B.g(i10, aVar);
    }

    /* access modifiers changed from: package-private */
    public void e1(int i10, a aVar) {
        E.submit(new a("OkHttp %s stream %d", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, aVar));
    }

    /* access modifiers changed from: package-private */
    public void f1(int i10, long j10) {
        E.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f17129l, Integer.valueOf(i10)}, i10, j10));
    }

    public void flush() {
        this.B.flush();
    }

    private d(h hVar) {
        this.f17128k = new HashMap();
        this.f17133p = System.nanoTime();
        this.f17138u = 0;
        this.f17140w = new n();
        n nVar = new n();
        this.f17141x = nVar;
        this.f17142y = false;
        this.D = new LinkedHashSet();
        u a10 = hVar.f17175f;
        this.f17125h = a10;
        this.f17136s = hVar.f17176g;
        boolean c10 = hVar.f17177h;
        this.f17126i = c10;
        this.f17127j = hVar.f17174e;
        int i10 = 2;
        this.f17131n = hVar.f17177h ? 1 : 2;
        if (hVar.f17177h && a10 == u.HTTP_2) {
            this.f17131n += 2;
        }
        this.f17137t = hVar.f17177h ? 1 : i10;
        if (hVar.f17177h) {
            this.f17140w.l(7, 0, 16777216);
        }
        String e10 = hVar.f17171b;
        this.f17129l = e10;
        if (a10 == u.HTTP_2) {
            this.f17143z = new i();
            this.f17134q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), w7.h.r(String.format("OkHttp %s Push Observer", new Object[]{e10}), true));
            nVar.l(7, 0, 65535);
            nVar.l(5, 0, 16384);
        } else if (a10 == u.SPDY_3) {
            this.f17143z = new o();
            this.f17134q = null;
        } else {
            throw new AssertionError(a10);
        }
        this.f17139v = (long) nVar.e(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        this.A = hVar.f17170a;
        this.B = this.f17143z.a(hVar.f17173d, c10);
        j jVar = new j(this, this.f17143z.b(hVar.f17172c, c10), (a) null);
        this.C = jVar;
        new Thread(jVar).start();
    }
}
