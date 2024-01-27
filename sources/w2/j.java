package w2;

import a3.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import java.util.List;
import java.util.concurrent.Executor;
import x2.c;

/* compiled from: SingleRequest */
public final class j<R> implements d, c, i {
    private static final boolean D = Log.isLoggable("Request", 2);
    private int A;
    private boolean B;
    private RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    private final String f12707a;

    /* renamed from: b  reason: collision with root package name */
    private final b3.c f12708b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f12709c;

    /* renamed from: d  reason: collision with root package name */
    private final g<R> f12710d;

    /* renamed from: e  reason: collision with root package name */
    private final e f12711e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f12712f;

    /* renamed from: g  reason: collision with root package name */
    private final d f12713g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f12714h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<R> f12715i;

    /* renamed from: j  reason: collision with root package name */
    private final a<?> f12716j;

    /* renamed from: k  reason: collision with root package name */
    private final int f12717k;

    /* renamed from: l  reason: collision with root package name */
    private final int f12718l;

    /* renamed from: m  reason: collision with root package name */
    private final f f12719m;

    /* renamed from: n  reason: collision with root package name */
    private final x2.d<R> f12720n;

    /* renamed from: o  reason: collision with root package name */
    private final List<g<R>> f12721o;

    /* renamed from: p  reason: collision with root package name */
    private final y2.c<? super R> f12722p;

    /* renamed from: q  reason: collision with root package name */
    private final Executor f12723q;

    /* renamed from: r  reason: collision with root package name */
    private h2.c<R> f12724r;

    /* renamed from: s  reason: collision with root package name */
    private j.d f12725s;

    /* renamed from: t  reason: collision with root package name */
    private long f12726t;

    /* renamed from: u  reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f12727u;

    /* renamed from: v  reason: collision with root package name */
    private a f12728v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f12729w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f12730x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f12731y;

    /* renamed from: z  reason: collision with root package name */
    private int f12732z;

    /* compiled from: SingleRequest */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, f fVar, x2.d<R> dVar2, g<R> gVar, List<g<R>> list, e eVar, com.bumptech.glide.load.engine.j jVar, y2.c<? super R> cVar, Executor executor) {
        this.f12707a = D ? String.valueOf(super.hashCode()) : null;
        this.f12708b = b3.c.a();
        this.f12709c = obj;
        this.f12712f = context;
        this.f12713g = dVar;
        this.f12714h = obj2;
        this.f12715i = cls;
        this.f12716j = aVar;
        this.f12717k = i10;
        this.f12718l = i11;
        this.f12719m = fVar;
        this.f12720n = dVar2;
        this.f12710d = gVar;
        this.f12721o = list;
        this.f12711e = eVar;
        this.f12727u = jVar;
        this.f12722p = cVar;
        this.f12723q = executor;
        this.f12728v = a.PENDING;
        if (this.C == null && dVar.h()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        if (l()) {
            Drawable drawable = null;
            if (this.f12714h == null) {
                drawable = p();
            }
            if (drawable == null) {
                drawable = o();
            }
            if (drawable == null) {
                drawable = q();
            }
            this.f12720n.f(drawable);
        }
    }

    private void i() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        e eVar = this.f12711e;
        return eVar == null || eVar.i(this);
    }

    private boolean l() {
        e eVar = this.f12711e;
        return eVar == null || eVar.e(this);
    }

    private boolean m() {
        e eVar = this.f12711e;
        return eVar == null || eVar.g(this);
    }

    private void n() {
        i();
        this.f12708b.c();
        this.f12720n.g(this);
        j.d dVar = this.f12725s;
        if (dVar != null) {
            dVar.a();
            this.f12725s = null;
        }
    }

    private Drawable o() {
        if (this.f12729w == null) {
            Drawable l10 = this.f12716j.l();
            this.f12729w = l10;
            if (l10 == null && this.f12716j.k() > 0) {
                this.f12729w = s(this.f12716j.k());
            }
        }
        return this.f12729w;
    }

    private Drawable p() {
        if (this.f12731y == null) {
            Drawable m10 = this.f12716j.m();
            this.f12731y = m10;
            if (m10 == null && this.f12716j.n() > 0) {
                this.f12731y = s(this.f12716j.n());
            }
        }
        return this.f12731y;
    }

    private Drawable q() {
        if (this.f12730x == null) {
            Drawable s10 = this.f12716j.s();
            this.f12730x = s10;
            if (s10 == null && this.f12716j.t() > 0) {
                this.f12730x = s(this.f12716j.t());
            }
        }
        return this.f12730x;
    }

    private boolean r() {
        e eVar = this.f12711e;
        return eVar == null || !eVar.b().c();
    }

    private Drawable s(int i10) {
        return p2.a.a(this.f12713g, i10, this.f12716j.y() != null ? this.f12716j.y() : this.f12712f.getTheme());
    }

    private void t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f12707a);
    }

    private static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * ((float) i10));
    }

    private void v() {
        e eVar = this.f12711e;
        if (eVar != null) {
            eVar.a(this);
        }
    }

    private void w() {
        e eVar = this.f12711e;
        if (eVar != null) {
            eVar.k(this);
        }
    }

    public static <R> j<R> x(Context context, d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, f fVar, x2.d<R> dVar2, g<R> gVar, List<g<R>> list, e eVar, com.bumptech.glide.load.engine.j jVar, y2.c<? super R> cVar, Executor executor) {
        return new j(context, dVar, obj, obj2, cls, aVar, i10, i11, fVar, dVar2, gVar, list, eVar, jVar, cVar, executor);
    }

    /* JADX INFO: finally extract failed */
    private void y(GlideException glideException, int i10) {
        boolean z10;
        this.f12708b.c();
        synchronized (this.f12709c) {
            glideException.k(this.C);
            int f10 = this.f12713g.f();
            if (f10 <= i10) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f12714h);
                sb.append(" with size [");
                sb.append(this.f12732z);
                sb.append("x");
                sb.append(this.A);
                sb.append("]");
                if (f10 <= 4) {
                    glideException.g("Glide");
                }
            }
            this.f12725s = null;
            this.f12728v = a.FAILED;
            boolean z11 = true;
            this.B = true;
            try {
                List<g<R>> list = this.f12721o;
                if (list != null) {
                    z10 = false;
                    for (g<R> d10 : list) {
                        z10 |= d10.d(glideException, this.f12714h, this.f12720n, r());
                    }
                } else {
                    z10 = false;
                }
                g<R> gVar = this.f12710d;
                if (gVar == null || !gVar.d(glideException, this.f12714h, this.f12720n, r())) {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    A();
                }
                this.B = false;
                v();
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z(h2.c<R> r11, R r12, e2.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.r()
            w2.j$a r0 = w2.j.a.COMPLETE
            r10.f12728v = r0
            r10.f12724r = r11
            com.bumptech.glide.d r11 = r10.f12713g
            int r11 = r11.f()
            r0 = 3
            if (r11 > r0) goto L_0x0061
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f12714h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f12732z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f12726t
            double r0 = a3.f.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
        L_0x0061:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<w2.g<R>> r0 = r10.f12721o     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00af }
            r9 = 0
        L_0x006e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00af }
            w2.g r0 = (w2.g) r0     // Catch:{ all -> 0x00af }
            java.lang.Object r2 = r10.f12714h     // Catch:{ all -> 0x00af }
            x2.d<R> r3 = r10.f12720n     // Catch:{ all -> 0x00af }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.e(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
            r9 = r9 | r0
            goto L_0x006e
        L_0x0087:
            r9 = 0
        L_0x0088:
            w2.g<R> r0 = r10.f12710d     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r2 = r10.f12714h     // Catch:{ all -> 0x00af }
            x2.d<R> r3 = r10.f12720n     // Catch:{ all -> 0x00af }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.e(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r11 = 0
        L_0x009b:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00a9
            y2.c<? super R> r11 = r10.f12722p     // Catch:{ all -> 0x00af }
            y2.b r11 = r11.a(r13, r6)     // Catch:{ all -> 0x00af }
            x2.d<R> r13 = r10.f12720n     // Catch:{ all -> 0x00af }
            r13.b(r12, r11)     // Catch:{ all -> 0x00af }
        L_0x00a9:
            r10.B = r7
            r10.w()
            return
        L_0x00af:
            r11 = move-exception
            r10.B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.j.z(h2.c, java.lang.Object, e2.a):void");
    }

    public void a(GlideException glideException) {
        y(glideException, 5);
    }

    public void b(h2.c<?> cVar, e2.a aVar) {
        this.f12708b.c();
        h2.c<?> cVar2 = null;
        try {
            synchronized (this.f12709c) {
                try {
                    this.f12725s = null;
                    if (cVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f12715i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    if (obj != null) {
                        if (this.f12715i.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                try {
                                    this.f12724r = null;
                                    this.f12728v = a.COMPLETE;
                                    this.f12727u.k(cVar);
                                    return;
                                } catch (Throwable th) {
                                    cVar2 = cVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                z(cVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.f12724r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f12715i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(cVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    a(new GlideException(sb.toString()));
                    this.f12727u.k(cVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (cVar2 != null) {
                this.f12727u.k(cVar2);
            }
            throw th3;
        }
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f12709c) {
            z10 = this.f12728v == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f12727u.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12709c
            monitor-enter(r0)
            r5.i()     // Catch:{ all -> 0x0039 }
            b3.c r1 = r5.f12708b     // Catch:{ all -> 0x0039 }
            r1.c()     // Catch:{ all -> 0x0039 }
            w2.j$a r1 = r5.f12728v     // Catch:{ all -> 0x0039 }
            w2.j$a r2 = w2.j.a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.n()     // Catch:{ all -> 0x0039 }
            h2.c<R> r1 = r5.f12724r     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f12724r = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.k()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            x2.d<R> r3 = r5.f12720n     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.q()     // Catch:{ all -> 0x0039 }
            r3.j(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f12728v = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            com.bumptech.glide.load.engine.j r0 = r5.f12727u
            r0.k(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.j.clear():void");
    }

    public boolean d(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        f fVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        f fVar2;
        int size2;
        d dVar2 = dVar;
        if (!(dVar2 instanceof j)) {
            return false;
        }
        synchronized (this.f12709c) {
            i10 = this.f12717k;
            i11 = this.f12718l;
            obj = this.f12714h;
            cls = this.f12715i;
            aVar = this.f12716j;
            fVar = this.f12719m;
            List<g<R>> list = this.f12721o;
            size = list != null ? list.size() : 0;
        }
        j jVar = (j) dVar2;
        synchronized (jVar.f12709c) {
            i12 = jVar.f12717k;
            i13 = jVar.f12718l;
            obj2 = jVar.f12714h;
            cls2 = jVar.f12715i;
            aVar2 = jVar.f12716j;
            fVar2 = jVar.f12719m;
            List<g<R>> list2 = jVar.f12721o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && k.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2;
    }

    public void e(int i10, int i11) {
        Object obj;
        this.f12708b.c();
        Object obj2 = this.f12709c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    t("Got onSizeReady in " + a3.f.a(this.f12726t));
                }
                if (this.f12728v == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.f12728v = aVar;
                    float x10 = this.f12716j.x();
                    this.f12732z = u(i10, x10);
                    this.A = u(i11, x10);
                    if (z10) {
                        t("finished setup for calling load in " + a3.f.a(this.f12726t));
                    }
                    a aVar2 = aVar;
                    boolean z11 = z10;
                    a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f12725s = this.f12727u.f(this.f12713g, this.f12714h, this.f12716j.w(), this.f12732z, this.A, this.f12716j.v(), this.f12715i, this.f12719m, this.f12716j.i(), this.f12716j.z(), this.f12716j.H(), this.f12716j.E(), this.f12716j.p(), this.f12716j.C(), this.f12716j.B(), this.f12716j.A(), this.f12716j.o(), this, this.f12723q);
                        if (this.f12728v != aVar3) {
                            this.f12725s = null;
                        }
                        if (z11) {
                            t("finished onSizeReady in " + a3.f.a(this.f12726t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f12709c) {
            z10 = this.f12728v == a.CLEARED;
        }
        return z10;
    }

    public Object g() {
        this.f12708b.c();
        return this.f12709c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12709c
            monitor-enter(r0)
            r5.i()     // Catch:{ all -> 0x00a7 }
            b3.c r1 = r5.f12708b     // Catch:{ all -> 0x00a7 }
            r1.c()     // Catch:{ all -> 0x00a7 }
            long r1 = a3.f.b()     // Catch:{ all -> 0x00a7 }
            r5.f12726t = r1     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r5.f12714h     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f12717k     // Catch:{ all -> 0x00a7 }
            int r2 = r5.f12718l     // Catch:{ all -> 0x00a7 }
            boolean r1 = a3.k.s(r1, r2)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f12717k     // Catch:{ all -> 0x00a7 }
            r5.f12732z = r1     // Catch:{ all -> 0x00a7 }
            int r1 = r5.f12718l     // Catch:{ all -> 0x00a7 }
            r5.A = r1     // Catch:{ all -> 0x00a7 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.p()     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            r5.y(r2, r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x003c:
            w2.j$a r1 = r5.f12728v     // Catch:{ all -> 0x00a7 }
            w2.j$a r2 = w2.j.a.RUNNING     // Catch:{ all -> 0x00a7 }
            if (r1 == r2) goto L_0x009f
            w2.j$a r3 = w2.j.a.COMPLETE     // Catch:{ all -> 0x00a7 }
            if (r1 != r3) goto L_0x004f
            h2.c<R> r1 = r5.f12724r     // Catch:{ all -> 0x00a7 }
            e2.a r2 = e2.a.MEMORY_CACHE     // Catch:{ all -> 0x00a7 }
            r5.b(r1, r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x004f:
            w2.j$a r1 = w2.j.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a7 }
            r5.f12728v = r1     // Catch:{ all -> 0x00a7 }
            int r3 = r5.f12717k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f12718l     // Catch:{ all -> 0x00a7 }
            boolean r3 = a3.k.s(r3, r4)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0065
            int r3 = r5.f12717k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f12718l     // Catch:{ all -> 0x00a7 }
            r5.e(r3, r4)     // Catch:{ all -> 0x00a7 }
            goto L_0x006a
        L_0x0065:
            x2.d<R> r3 = r5.f12720n     // Catch:{ all -> 0x00a7 }
            r3.a(r5)     // Catch:{ all -> 0x00a7 }
        L_0x006a:
            w2.j$a r3 = r5.f12728v     // Catch:{ all -> 0x00a7 }
            if (r3 == r2) goto L_0x0070
            if (r3 != r1) goto L_0x007f
        L_0x0070:
            boolean r1 = r5.l()     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007f
            x2.d<R> r1 = r5.f12720n     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r2 = r5.q()     // Catch:{ all -> 0x00a7 }
            r1.h(r2)     // Catch:{ all -> 0x00a7 }
        L_0x007f:
            boolean r1 = D     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            long r2 = r5.f12726t     // Catch:{ all -> 0x00a7 }
            double r2 = a3.f.a(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r5.t(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x009f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.j.h():void");
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f12709c) {
            a aVar = this.f12728v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f12709c) {
            z10 = this.f12728v == a.COMPLETE;
        }
        return z10;
    }

    public void pause() {
        synchronized (this.f12709c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
