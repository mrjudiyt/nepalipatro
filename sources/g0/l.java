package g0;

import i9.l0;
import i9.u;
import i9.u1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.y;

/* compiled from: SingleProcessDataStore.kt */
public final class l<T> implements e<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8709k = new a((kotlin.jvm.internal.g) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Set<String> f8710l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f8711m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final y8.a<File> f8712a;

    /* renamed from: b  reason: collision with root package name */
    private final j<T> f8713b;

    /* renamed from: c  reason: collision with root package name */
    private final a<T> f8714c;

    /* renamed from: d  reason: collision with root package name */
    private final l0 f8715d;

    /* renamed from: e  reason: collision with root package name */
    private final l9.d<T> f8716e = l9.f.i(new g(this, (r8.d<? super g>) null));

    /* renamed from: f  reason: collision with root package name */
    private final String f8717f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    private final o8.g f8718g = i.a(new h(this));
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final l9.n<m<T>> f8719h = l9.q.a(n.f8808a);

    /* renamed from: i  reason: collision with root package name */
    private List<? extends y8.p<? super h<T>, ? super r8.d<? super o8.q>, ? extends Object>> f8720i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final k<b<T>> f8721j;

    /* compiled from: SingleProcessDataStore.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set<String> a() {
            return l.f8710l;
        }

        public final Object b() {
            return l.f8711m;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        public static final class a<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final m<T> f8722a;

            public a(m<T> mVar) {
                super((kotlin.jvm.internal.g) null);
                this.f8722a = mVar;
            }

            public m<T> a() {
                return this.f8722a;
            }
        }

        /* renamed from: g0.l$b$b  reason: collision with other inner class name */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C0137b<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final y8.p<T, r8.d<? super T>, Object> f8723a;

            /* renamed from: b  reason: collision with root package name */
            private final u<T> f8724b;

            /* renamed from: c  reason: collision with root package name */
            private final m<T> f8725c;

            /* renamed from: d  reason: collision with root package name */
            private final r8.g f8726d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0137b(y8.p<? super T, ? super r8.d<? super T>, ? extends Object> pVar, u<T> uVar, m<T> mVar, r8.g gVar) {
                super((kotlin.jvm.internal.g) null);
                kotlin.jvm.internal.m.f(pVar, "transform");
                kotlin.jvm.internal.m.f(uVar, "ack");
                kotlin.jvm.internal.m.f(gVar, "callerContext");
                this.f8723a = pVar;
                this.f8724b = uVar;
                this.f8725c = mVar;
                this.f8726d = gVar;
            }

            public final u<T> a() {
                return this.f8724b;
            }

            public final r8.g b() {
                return this.f8726d;
            }

            public m<T> c() {
                return this.f8725c;
            }

            public final y8.p<T, r8.d<? super T>, Object> d() {
                return this.f8723a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    private static final class c extends OutputStream {

        /* renamed from: h  reason: collision with root package name */
        private final FileOutputStream f8727h;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.m.f(fileOutputStream, "fileOutputStream");
            this.f8727h = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.f8727h.flush();
        }

        public void write(int i10) {
            this.f8727h.write(i10);
        }

        public void write(byte[] bArr) {
            kotlin.jvm.internal.m.f(bArr, "b");
            this.f8727h.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.m.f(bArr, "bytes");
            this.f8727h.write(bArr, i10, i11);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    static final class d extends kotlin.jvm.internal.n implements y8.l<Throwable, o8.q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l<T> f8728h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l<T> lVar) {
            super(1);
            this.f8728h = lVar;
        }

        public final void a(Throwable th) {
            if (th != null) {
                this.f8728h.f8719h.setValue(new g(th));
            }
            a aVar = l.f8709k;
            Object b10 = aVar.b();
            l<T> lVar = this.f8728h;
            synchronized (b10) {
                aVar.a().remove(lVar.q().getAbsolutePath());
                o8.q qVar = o8.q.f16189a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return o8.q.f16189a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    static final class e extends kotlin.jvm.internal.n implements y8.p<b<T>, Throwable, o8.q> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f8729h = new e();

        e() {
            super(2);
        }

        public final void a(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.m.f(bVar, "msg");
            if (bVar instanceof b.C0137b) {
                u a10 = ((b.C0137b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.k0(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return o8.q.f16189a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class f extends kotlin.coroutines.jvm.internal.k implements y8.p<b<T>, r8.d<? super o8.q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f8730h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f8731i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<T> f8732j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l<T> lVar, r8.d<? super f> dVar) {
            super(2, dVar);
            this.f8732j = lVar;
        }

        /* renamed from: a */
        public final Object invoke(b<T> bVar, r8.d<? super o8.q> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(o8.q.f16189a);
        }

        public final r8.d<o8.q> create(Object obj, r8.d<?> dVar) {
            f fVar = new f(this.f8732j, dVar);
            fVar.f8731i = obj;
            return fVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f8730h;
            if (i10 == 0) {
                o8.m.b(obj);
                b bVar = (b) this.f8731i;
                if (bVar instanceof b.a) {
                    this.f8730h = 1;
                    if (this.f8732j.r((b.a) bVar, this) == c10) {
                        return c10;
                    }
                } else if (bVar instanceof b.C0137b) {
                    this.f8730h = 2;
                    if (this.f8732j.s((b.C0137b) bVar, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                o8.m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return o8.q.f16189a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class g extends kotlin.coroutines.jvm.internal.k implements y8.p<l9.e<? super T>, r8.d<? super o8.q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f8733h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f8734i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<T> f8735j;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        /* compiled from: SingleProcessDataStore.kt */
        static final class a extends kotlin.coroutines.jvm.internal.k implements y8.p<m<T>, r8.d<? super Boolean>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f8736h;

            /* renamed from: i  reason: collision with root package name */
            /* synthetic */ Object f8737i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ m<T> f8738j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m<T> mVar, r8.d<? super a> dVar) {
                super(2, dVar);
                this.f8738j = mVar;
            }

            /* renamed from: a */
            public final Object invoke(m<T> mVar, r8.d<? super Boolean> dVar) {
                return ((a) create(mVar, dVar)).invokeSuspend(o8.q.f16189a);
            }

            public final r8.d<o8.q> create(Object obj, r8.d<?> dVar) {
                a aVar = new a(this.f8738j, dVar);
                aVar.f8737i = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.f8736h == 0) {
                    o8.m.b(obj);
                    m<T> mVar = (m) this.f8737i;
                    m<T> mVar2 = this.f8738j;
                    boolean z10 = false;
                    if (!(mVar2 instanceof b) && !(mVar2 instanceof g) && mVar == mVar2) {
                        z10 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        public static final class b implements l9.d<T> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ l9.d f8739h;

            /* compiled from: Collect.kt */
            public static final class a implements l9.e<m<T>> {

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ l9.e f8740h;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: g0.l$g$b$a$a  reason: collision with other inner class name */
                public static final class C0138a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: h  reason: collision with root package name */
                    /* synthetic */ Object f8741h;

                    /* renamed from: i  reason: collision with root package name */
                    int f8742i;

                    /* renamed from: j  reason: collision with root package name */
                    final /* synthetic */ a f8743j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0138a(a aVar, r8.d dVar) {
                        super(dVar);
                        this.f8743j = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f8741h = obj;
                        this.f8742i |= Integer.MIN_VALUE;
                        return this.f8743j.emit((Object) null, this);
                    }
                }

                public a(l9.e eVar) {
                    this.f8740h = eVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, r8.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof g0.l.g.b.a.C0138a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        g0.l$g$b$a$a r0 = (g0.l.g.b.a.C0138a) r0
                        int r1 = r0.f8742i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8742i = r1
                        goto L_0x0018
                    L_0x0013:
                        g0.l$g$b$a$a r0 = new g0.l$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f8741h
                        java.lang.Object r1 = s8.d.c()
                        int r2 = r0.f8742i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        o8.m.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        o8.m.b(r6)
                        l9.e r6 = r4.f8740h
                        g0.m r5 = (g0.m) r5
                        boolean r2 = r5 instanceof g0.i
                        if (r2 != 0) goto L_0x0073
                        boolean r2 = r5 instanceof g0.g
                        if (r2 != 0) goto L_0x006c
                        boolean r2 = r5 instanceof g0.b
                        if (r2 == 0) goto L_0x0056
                        g0.b r5 = (g0.b) r5
                        java.lang.Object r5 = r5.b()
                        r0.f8742i = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        o8.q r5 = o8.q.f16189a
                        return r5
                    L_0x0056:
                        boolean r5 = r5 instanceof g0.n
                        if (r5 == 0) goto L_0x0066
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L_0x0066:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L_0x006c:
                        g0.g r5 = (g0.g) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L_0x0073:
                        g0.i r5 = (g0.i) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g0.l.g.b.a.emit(java.lang.Object, r8.d):java.lang.Object");
                }
            }

            public b(l9.d dVar) {
                this.f8739h = dVar;
            }

            public Object collect(l9.e eVar, r8.d dVar) {
                Object collect = this.f8739h.collect(new a(eVar), dVar);
                if (collect == d.c()) {
                    return collect;
                }
                return o8.q.f16189a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(l<T> lVar, r8.d<? super g> dVar) {
            super(2, dVar);
            this.f8735j = lVar;
        }

        /* renamed from: a */
        public final Object invoke(l9.e<? super T> eVar, r8.d<? super o8.q> dVar) {
            return ((g) create(eVar, dVar)).invokeSuspend(o8.q.f16189a);
        }

        public final r8.d<o8.q> create(Object obj, r8.d<?> dVar) {
            g gVar = new g(this.f8735j, dVar);
            gVar.f8734i = obj;
            return gVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f8733h;
            if (i10 == 0) {
                o8.m.b(obj);
                l9.e eVar = (l9.e) this.f8734i;
                m mVar = (m) this.f8735j.f8719h.getValue();
                if (!(mVar instanceof b)) {
                    this.f8735j.f8721j.e(new b.a(mVar));
                }
                b bVar = new b(l9.f.d(this.f8735j.f8719h, new a(mVar, (r8.d<? super a>) null)));
                this.f8733h = 1;
                if (l9.f.f(eVar, bVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o8.m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return o8.q.f16189a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    static final class h extends kotlin.jvm.internal.n implements y8.a<File> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l<T> f8744h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(l<T> lVar) {
            super(0);
            this.f8744h = lVar;
        }

        /* renamed from: a */
        public final File invoke() {
            File file = (File) this.f8744h.f8712a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = l.f8709k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set<String> a10 = aVar.a();
                    kotlin.jvm.internal.m.e(absolutePath, "it");
                    a10.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* compiled from: SingleProcessDataStore.kt */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8745h;

        /* renamed from: i  reason: collision with root package name */
        Object f8746i;

        /* renamed from: j  reason: collision with root package name */
        Object f8747j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f8748k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ l<T> f8749l;

        /* renamed from: m  reason: collision with root package name */
        int f8750m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(l<T> lVar, r8.d<? super i> dVar) {
            super(dVar);
            this.f8749l = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8748k = obj;
            this.f8750m |= Integer.MIN_VALUE;
            return this.f8749l.s((b.C0137b) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* compiled from: SingleProcessDataStore.kt */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8751h;

        /* renamed from: i  reason: collision with root package name */
        Object f8752i;

        /* renamed from: j  reason: collision with root package name */
        Object f8753j;

        /* renamed from: k  reason: collision with root package name */
        Object f8754k;

        /* renamed from: l  reason: collision with root package name */
        Object f8755l;

        /* renamed from: m  reason: collision with root package name */
        Object f8756m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8757n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l<T> f8758o;

        /* renamed from: p  reason: collision with root package name */
        int f8759p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(l<T> lVar, r8.d<? super j> dVar) {
            super(dVar);
            this.f8758o = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8757n = obj;
            this.f8759p |= Integer.MIN_VALUE;
            return this.f8758o.t(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class k implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r9.a f8760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f8761b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y<T> f8762c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l<T> f8763d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        /* compiled from: SingleProcessDataStore.kt */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: h  reason: collision with root package name */
            Object f8764h;

            /* renamed from: i  reason: collision with root package name */
            Object f8765i;

            /* renamed from: j  reason: collision with root package name */
            Object f8766j;

            /* renamed from: k  reason: collision with root package name */
            Object f8767k;

            /* renamed from: l  reason: collision with root package name */
            Object f8768l;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f8769m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ k f8770n;

            /* renamed from: o  reason: collision with root package name */
            int f8771o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, r8.d<? super a> dVar) {
                super(dVar);
                this.f8770n = kVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8769m = obj;
                this.f8771o |= Integer.MIN_VALUE;
                return this.f8770n.a((y8.p) null, this);
            }
        }

        k(r9.a aVar, w wVar, y<T> yVar, l<T> lVar) {
            this.f8760a = aVar;
            this.f8761b = wVar;
            this.f8762c = yVar;
            this.f8763d = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(y8.p<? super T, ? super r8.d<? super T>, ? extends java.lang.Object> r11, r8.d<? super T> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof g0.l.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                g0.l$k$a r0 = (g0.l.k.a) r0
                int r1 = r0.f8771o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8771o = r1
                goto L_0x0018
            L_0x0013:
                g0.l$k$a r0 = new g0.l$k$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f8769m
                java.lang.Object r1 = s8.d.c()
                int r2 = r0.f8771o
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r11 = r0.f8766j
                java.lang.Object r1 = r0.f8765i
                kotlin.jvm.internal.y r1 = (kotlin.jvm.internal.y) r1
                java.lang.Object r0 = r0.f8764h
                r9.a r0 = (r9.a) r0
                o8.m.b(r12)     // Catch:{ all -> 0x003b }
                goto L_0x00cc
            L_0x003b:
                r11 = move-exception
                goto L_0x00e1
            L_0x003e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0046:
                java.lang.Object r11 = r0.f8766j
                g0.l r11 = (g0.l) r11
                java.lang.Object r2 = r0.f8765i
                kotlin.jvm.internal.y r2 = (kotlin.jvm.internal.y) r2
                java.lang.Object r4 = r0.f8764h
                r9.a r4 = (r9.a) r4
                o8.m.b(r12)     // Catch:{ all -> 0x0056 }
                goto L_0x00b2
            L_0x0056:
                r11 = move-exception
                r0 = r4
                goto L_0x00e1
            L_0x005a:
                java.lang.Object r11 = r0.f8768l
                g0.l r11 = (g0.l) r11
                java.lang.Object r2 = r0.f8767k
                kotlin.jvm.internal.y r2 = (kotlin.jvm.internal.y) r2
                java.lang.Object r5 = r0.f8766j
                kotlin.jvm.internal.w r5 = (kotlin.jvm.internal.w) r5
                java.lang.Object r7 = r0.f8765i
                r9.a r7 = (r9.a) r7
                java.lang.Object r8 = r0.f8764h
                y8.p r8 = (y8.p) r8
                o8.m.b(r12)
                r12 = r7
                r9 = r8
                r8 = r11
                r11 = r9
                goto L_0x0096
            L_0x0076:
                o8.m.b(r12)
                r9.a r12 = r10.f8760a
                kotlin.jvm.internal.w r2 = r10.f8761b
                kotlin.jvm.internal.y<T> r7 = r10.f8762c
                g0.l<T> r8 = r10.f8763d
                r0.f8764h = r11
                r0.f8765i = r12
                r0.f8766j = r2
                r0.f8767k = r7
                r0.f8768l = r8
                r0.f8771o = r5
                java.lang.Object r5 = r12.b(r6, r0)
                if (r5 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r5 = r2
                r2 = r7
            L_0x0096:
                boolean r5 = r5.f15573h     // Catch:{ all -> 0x00df }
                if (r5 != 0) goto L_0x00d7
                T r5 = r2.f15575h     // Catch:{ all -> 0x00df }
                r0.f8764h = r12     // Catch:{ all -> 0x00df }
                r0.f8765i = r2     // Catch:{ all -> 0x00df }
                r0.f8766j = r8     // Catch:{ all -> 0x00df }
                r0.f8767k = r6     // Catch:{ all -> 0x00df }
                r0.f8768l = r6     // Catch:{ all -> 0x00df }
                r0.f8771o = r4     // Catch:{ all -> 0x00df }
                java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
                if (r11 != r1) goto L_0x00af
                return r1
            L_0x00af:
                r4 = r12
                r12 = r11
                r11 = r8
            L_0x00b2:
                T r5 = r2.f15575h     // Catch:{ all -> 0x0056 }
                boolean r5 = kotlin.jvm.internal.m.a(r12, r5)     // Catch:{ all -> 0x0056 }
                if (r5 != 0) goto L_0x00d0
                r0.f8764h = r4     // Catch:{ all -> 0x0056 }
                r0.f8765i = r2     // Catch:{ all -> 0x0056 }
                r0.f8766j = r12     // Catch:{ all -> 0x0056 }
                r0.f8771o = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r11.z(r12, r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00cc:
                r1.f15575h = r11     // Catch:{ all -> 0x003b }
                r2 = r1
                goto L_0x00d1
            L_0x00d0:
                r0 = r4
            L_0x00d1:
                T r11 = r2.f15575h     // Catch:{ all -> 0x003b }
                r0.c(r6)
                return r11
            L_0x00d7:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00df }
                throw r11     // Catch:{ all -> 0x00df }
            L_0x00df:
                r11 = move-exception
                r0 = r12
            L_0x00e1:
                r0.c(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.l.k.a(y8.p, r8.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: g0.l$l  reason: collision with other inner class name */
    /* compiled from: SingleProcessDataStore.kt */
    static final class C0139l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8772h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f8773i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<T> f8774j;

        /* renamed from: k  reason: collision with root package name */
        int f8775k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0139l(l<T> lVar, r8.d<? super C0139l> dVar) {
            super(dVar);
            this.f8774j = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8773i = obj;
            this.f8775k |= Integer.MIN_VALUE;
            return this.f8774j.u(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* compiled from: SingleProcessDataStore.kt */
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8776h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f8777i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<T> f8778j;

        /* renamed from: k  reason: collision with root package name */
        int f8779k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(l<T> lVar, r8.d<? super m> dVar) {
            super(dVar);
            this.f8778j = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8777i = obj;
            this.f8779k |= Integer.MIN_VALUE;
            return this.f8778j.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* compiled from: SingleProcessDataStore.kt */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8780h;

        /* renamed from: i  reason: collision with root package name */
        Object f8781i;

        /* renamed from: j  reason: collision with root package name */
        Object f8782j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f8783k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ l<T> f8784l;

        /* renamed from: m  reason: collision with root package name */
        int f8785m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(l<T> lVar, r8.d<? super n> dVar) {
            super(dVar);
            this.f8784l = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8783k = obj;
            this.f8785m |= Integer.MIN_VALUE;
            return this.f8784l.w(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* compiled from: SingleProcessDataStore.kt */
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8786h;

        /* renamed from: i  reason: collision with root package name */
        Object f8787i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f8788j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ l<T> f8789k;

        /* renamed from: l  reason: collision with root package name */
        int f8790l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(l<T> lVar, r8.d<? super o> dVar) {
            super(dVar);
            this.f8789k = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8788j = obj;
            this.f8790l |= Integer.MIN_VALUE;
            return this.f8789k.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    /* compiled from: SingleProcessDataStore.kt */
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8791h;

        /* renamed from: i  reason: collision with root package name */
        Object f8792i;

        /* renamed from: j  reason: collision with root package name */
        Object f8793j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f8794k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ l<T> f8795l;

        /* renamed from: m  reason: collision with root package name */
        int f8796m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(l<T> lVar, r8.d<? super p> dVar) {
            super(dVar);
            this.f8795l = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8794k = obj;
            this.f8796m |= Integer.MIN_VALUE;
            return this.f8795l.y((y8.p) null, (r8.g) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    /* compiled from: SingleProcessDataStore.kt */
    static final class q extends kotlin.coroutines.jvm.internal.k implements y8.p<l0, r8.d<? super T>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f8797h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ y8.p<T, r8.d<? super T>, Object> f8798i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ T f8799j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(y8.p<? super T, ? super r8.d<? super T>, ? extends Object> pVar, T t10, r8.d<? super q> dVar) {
            super(2, dVar);
            this.f8798i = pVar;
            this.f8799j = t10;
        }

        public final r8.d<o8.q> create(Object obj, r8.d<?> dVar) {
            return new q(this.f8798i, this.f8799j, dVar);
        }

        public final Object invoke(l0 l0Var, r8.d<? super T> dVar) {
            return ((q) create(l0Var, dVar)).invokeSuspend(o8.q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f8797h;
            if (i10 == 0) {
                o8.m.b(obj);
                y8.p<T, r8.d<? super T>, Object> pVar = this.f8798i;
                T t10 = this.f8799j;
                this.f8797h = 1;
                obj = pVar.invoke(t10, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o8.m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* compiled from: SingleProcessDataStore.kt */
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f8800h;

        /* renamed from: i  reason: collision with root package name */
        Object f8801i;

        /* renamed from: j  reason: collision with root package name */
        Object f8802j;

        /* renamed from: k  reason: collision with root package name */
        Object f8803k;

        /* renamed from: l  reason: collision with root package name */
        Object f8804l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f8805m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l<T> f8806n;

        /* renamed from: o  reason: collision with root package name */
        int f8807o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(l<T> lVar, r8.d<? super r> dVar) {
            super(dVar);
            this.f8806n = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8805m = obj;
            this.f8807o |= Integer.MIN_VALUE;
            return this.f8806n.z(null, this);
        }
    }

    public l(y8.a<? extends File> aVar, j<T> jVar, List<? extends y8.p<? super h<T>, ? super r8.d<? super o8.q>, ? extends Object>> list, a<T> aVar2, l0 l0Var) {
        kotlin.jvm.internal.m.f(aVar, "produceFile");
        kotlin.jvm.internal.m.f(jVar, "serializer");
        kotlin.jvm.internal.m.f(list, "initTasksList");
        kotlin.jvm.internal.m.f(aVar2, "corruptionHandler");
        kotlin.jvm.internal.m.f(l0Var, "scope");
        this.f8712a = aVar;
        this.f8713b = jVar;
        this.f8714c = aVar2;
        this.f8715d = l0Var;
        this.f8720i = x.R(list);
        this.f8721j = new k<>(l0Var, new d(this), e.f8729h, new f(this, (r8.d<? super f>) null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(kotlin.jvm.internal.m.o("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    public final File q() {
        return (File) this.f8718g.getValue();
    }

    /* access modifiers changed from: private */
    public final Object r(b.a<T> aVar, r8.d<? super o8.q> dVar) {
        m<T> value = this.f8719h.getValue();
        if (!(value instanceof b)) {
            if (value instanceof i) {
                if (value == aVar.a()) {
                    Object v10 = v(dVar);
                    return v10 == d.c() ? v10 : o8.q.f16189a;
                }
            } else if (kotlin.jvm.internal.m.a(value, n.f8808a)) {
                Object v11 = v(dVar);
                return v11 == d.c() ? v11 : o8.q.f16189a;
            } else if (value instanceof g) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return o8.q.f16189a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(g0.l.b.C0137b<T> r9, r8.d<? super o8.q> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof g0.l.i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            g0.l$i r0 = (g0.l.i) r0
            int r1 = r0.f8750m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8750m = r1
            goto L_0x0018
        L_0x0013:
            g0.l$i r0 = new g0.l$i
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8748k
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8750m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f8745h
            i9.u r9 = (i9.u) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f8747j
            i9.u r9 = (i9.u) r9
            java.lang.Object r2 = r0.f8746i
            g0.l r2 = (g0.l) r2
            java.lang.Object r4 = r0.f8745h
            g0.l$b$b r4 = (g0.l.b.C0137b) r4
            o8.m.b(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.f8745h
            i9.u r9 = (i9.u) r9
        L_0x004e:
            o8.m.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            o8.m.b(r10)
            i9.u r10 = r9.a()
            o8.l$a r2 = o8.l.f16183h     // Catch:{ all -> 0x00d5 }
            l9.n<g0.m<T>> r2 = r8.f8719h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            g0.m r2 = (g0.m) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof g0.b     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            y8.p r2 = r9.d()     // Catch:{ all -> 0x00d5 }
            r8.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f8745h = r10     // Catch:{ all -> 0x00d5 }
            r0.f8750m = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.y(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof g0.i     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof g0.n     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            g0.m r5 = r9.c()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.f8745h = r9     // Catch:{ all -> 0x00d5 }
            r0.f8746i = r8     // Catch:{ all -> 0x00d5 }
            r0.f8747j = r10     // Catch:{ all -> 0x00d5 }
            r0.f8750m = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.u(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            y8.p r4 = r9.d()     // Catch:{ all -> 0x00d5 }
            r8.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f8745h = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.f8746i = r5     // Catch:{ all -> 0x00d5 }
            r0.f8747j = r5     // Catch:{ all -> 0x00d5 }
            r0.f8750m = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.y(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = o8.l.a(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            g0.i r2 = (g0.i) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof g0.g     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            g0.g r2 = (g0.g) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            o8.l$a r0 = o8.l.f16183h
            java.lang.Object r10 = o8.m.a(r10)
            java.lang.Object r10 = o8.l.a(r10)
        L_0x00e3:
            i9.w.c(r9, r10)
            o8.q r9 = o8.q.f16189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.s(g0.l$b$b, r8.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(r8.d<? super o8.q> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof g0.l.j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            g0.l$j r0 = (g0.l.j) r0
            int r1 = r0.f8759p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8759p = r1
            goto L_0x0018
        L_0x0013:
            g0.l$j r0 = new g0.l$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f8757n
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8759p
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.f8754k
            r9.a r1 = (r9.a) r1
            java.lang.Object r2 = r0.f8753j
            kotlin.jvm.internal.w r2 = (kotlin.jvm.internal.w) r2
            java.lang.Object r3 = r0.f8752i
            kotlin.jvm.internal.y r3 = (kotlin.jvm.internal.y) r3
            java.lang.Object r0 = r0.f8751h
            g0.l r0 = (g0.l) r0
            o8.m.b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.f8756m
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.f8755l
            g0.l$k r8 = (g0.l.k) r8
            java.lang.Object r9 = r0.f8754k
            kotlin.jvm.internal.w r9 = (kotlin.jvm.internal.w) r9
            java.lang.Object r10 = r0.f8753j
            kotlin.jvm.internal.y r10 = (kotlin.jvm.internal.y) r10
            java.lang.Object r11 = r0.f8752i
            r9.a r11 = (r9.a) r11
            java.lang.Object r12 = r0.f8751h
            g0.l r12 = (g0.l) r12
            o8.m.b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.f8754k
            kotlin.jvm.internal.y r2 = (kotlin.jvm.internal.y) r2
            java.lang.Object r8 = r0.f8753j
            kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
            java.lang.Object r9 = r0.f8752i
            r9.a r9 = (r9.a) r9
            java.lang.Object r10 = r0.f8751h
            g0.l r10 = (g0.l) r10
            o8.m.b(r14)
            goto L_0x00b8
        L_0x007b:
            o8.m.b(r14)
            l9.n<g0.m<T>> r14 = r13.f8719h
            java.lang.Object r14 = r14.getValue()
            g0.n r2 = g0.n.f8808a
            boolean r14 = kotlin.jvm.internal.m.a(r14, r2)
            if (r14 != 0) goto L_0x0099
            l9.n<g0.m<T>> r14 = r13.f8719h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof g0.i
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 == 0) goto L_0x0136
            r9.a r9 = r9.c.b(r5, r6, r7)
            kotlin.jvm.internal.y r2 = new kotlin.jvm.internal.y
            r2.<init>()
            r0.f8751h = r13
            r0.f8752i = r9
            r0.f8753j = r2
            r0.f8754k = r2
            r0.f8759p = r6
            java.lang.Object r14 = r13.x(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.f15575h = r14
            kotlin.jvm.internal.w r14 = new kotlin.jvm.internal.w
            r14.<init>()
            g0.l$k r2 = new g0.l$k
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends y8.p<? super g0.h<T>, ? super r8.d<? super o8.q>, ? extends java.lang.Object>> r11 = r10.f8720i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00ce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            y8.p r14 = (y8.p) r14
            r0.f8751h = r12
            r0.f8752i = r11
            r0.f8753j = r10
            r0.f8754k = r9
            r0.f8755l = r8
            r0.f8756m = r2
            r0.f8759p = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x00fe:
            r0.f8720i = r7
            r14.f8751h = r0
            r14.f8752i = r8
            r14.f8753j = r9
            r14.f8754k = r1
            r14.f8755l = r7
            r14.f8756m = r7
            r14.f8759p = r3
            java.lang.Object r14 = r1.b(r7, r14)
            if (r14 != r2) goto L_0x0115
            return r2
        L_0x0115:
            r3 = r8
            r2 = r9
        L_0x0117:
            r2.f15573h = r6     // Catch:{ all -> 0x0131 }
            o8.q r14 = o8.q.f16189a     // Catch:{ all -> 0x0131 }
            r1.c(r7)
            l9.n<g0.m<T>> r0 = r0.f8719h
            g0.b r1 = new g0.b
            T r2 = r3.f15575h
            if (r2 == 0) goto L_0x012a
            int r5 = r2.hashCode()
        L_0x012a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0131:
            r14 = move-exception
            r1.c(r7)
            throw r14
        L_0x0136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.t(r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(r8.d<? super o8.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g0.l.C0139l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            g0.l$l r0 = (g0.l.C0139l) r0
            int r1 = r0.f8775k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8775k = r1
            goto L_0x0018
        L_0x0013:
            g0.l$l r0 = new g0.l$l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f8773i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8775k
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f8772h
            g0.l r0 = (g0.l) r0
            o8.m.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            o8.m.b(r5)
            r0.f8772h = r4     // Catch:{ all -> 0x0048 }
            r0.f8775k = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            o8.q r5 = o8.q.f16189a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            l9.n<g0.m<T>> r0 = r0.f8719h
            g0.i r1 = new g0.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.u(r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(r8.d<? super o8.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g0.l.m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            g0.l$m r0 = (g0.l.m) r0
            int r1 = r0.f8779k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8779k = r1
            goto L_0x0018
        L_0x0013:
            g0.l$m r0 = new g0.l$m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f8777i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8779k
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f8776h
            g0.l r0 = (g0.l) r0
            o8.m.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            o8.m.b(r5)
            r0.f8776h = r4     // Catch:{ all -> 0x0045 }
            r0.f8779k = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.t(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            l9.n<g0.m<T>> r0 = r0.f8719h
            g0.i r1 = new g0.i
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            o8.q r5 = o8.q.f16189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.v(r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        w8.b.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0060, B:30:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(r8.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g0.l.n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g0.l$n r0 = (g0.l.n) r0
            int r1 = r0.f8785m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8785m = r1
            goto L_0x0018
        L_0x0013:
            g0.l$n r0 = new g0.l$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8783k
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8785m
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f8782j
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f8781i
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f8780h
            g0.l r0 = (g0.l) r0
            o8.m.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r6 = move-exception
            goto L_0x0068
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            o8.m.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r6 = r5.q()     // Catch:{ FileNotFoundException -> 0x006e }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006e }
            r6 = 0
            g0.j<T> r4 = r5.f8713b     // Catch:{ all -> 0x0066 }
            r0.f8780h = r5     // Catch:{ all -> 0x0066 }
            r0.f8781i = r2     // Catch:{ all -> 0x0066 }
            r0.f8782j = r6     // Catch:{ all -> 0x0066 }
            r0.f8785m = r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r4.b(r2, r0)     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0060:
            w8.b.a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0064 }
            return r6
        L_0x0064:
            r6 = move-exception
            goto L_0x0070
        L_0x0066:
            r6 = move-exception
            r0 = r5
        L_0x0068:
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            w8.b.a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0064 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0064 }
        L_0x006e:
            r6 = move-exception
            r0 = r5
        L_0x0070:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0081
            g0.j<T> r6 = r0.f8713b
            java.lang.Object r6 = r6.a()
            return r6
        L_0x0081:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.w(r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(r8.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof g0.l.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            g0.l$o r0 = (g0.l.o) r0
            int r1 = r0.f8790l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8790l = r1
            goto L_0x0018
        L_0x0013:
            g0.l$o r0 = new g0.l$o
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8788j
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8790l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f8787i
            java.lang.Object r0 = r0.f8786h
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            o8.m.b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.f8787i
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f8786h
            g0.l r4 = (g0.l) r4
            o8.m.b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.f8786h
            g0.l r2 = (g0.l) r2
            o8.m.b(r8)     // Catch:{ CorruptionException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            o8.m.b(r8)
            r0.f8786h = r7     // Catch:{ CorruptionException -> 0x0064 }
            r0.f8790l = r5     // Catch:{ CorruptionException -> 0x0064 }
            java.lang.Object r8 = r7.w(r0)     // Catch:{ CorruptionException -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            g0.a<T> r5 = r2.f8714c
            r0.f8786h = r2
            r0.f8787i = r8
            r0.f8790l = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.f8786h = r2     // Catch:{ IOException -> 0x0088 }
            r0.f8787i = r8     // Catch:{ IOException -> 0x0088 }
            r0.f8790l = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.z(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            o8.b.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.x(r8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(y8.p<? super T, ? super r8.d<? super T>, ? extends java.lang.Object> r8, r8.g r9, r8.d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof g0.l.p
            if (r0 == 0) goto L_0x0013
            r0 = r10
            g0.l$p r0 = (g0.l.p) r0
            int r1 = r0.f8796m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8796m = r1
            goto L_0x0018
        L_0x0013:
            g0.l$p r0 = new g0.l$p
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8794k
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8796m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f8792i
            java.lang.Object r9 = r0.f8791h
            g0.l r9 = (g0.l) r9
            o8.m.b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f8793j
            java.lang.Object r9 = r0.f8792i
            g0.b r9 = (g0.b) r9
            java.lang.Object r2 = r0.f8791h
            g0.l r2 = (g0.l) r2
            o8.m.b(r10)
            goto L_0x0073
        L_0x0049:
            o8.m.b(r10)
            l9.n<g0.m<T>> r10 = r7.f8719h
            java.lang.Object r10 = r10.getValue()
            g0.b r10 = (g0.b) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            g0.l$q r6 = new g0.l$q
            r6.<init>(r8, r2, r3)
            r0.f8791h = r7
            r0.f8792i = r10
            r0.f8793j = r2
            r0.f8796m = r5
            java.lang.Object r8 = i9.g.g(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.a()
            boolean r9 = kotlin.jvm.internal.m.a(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.f8791h = r2
            r0.f8792i = r10
            r0.f8793j = r3
            r0.f8796m = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            l9.n<g0.m<T>> r9 = r9.f8719h
            g0.b r10 = new g0.b
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.y(y8.p, r8.g, r8.d):java.lang.Object");
    }

    public Object a(y8.p<? super T, ? super r8.d<? super T>, ? extends Object> pVar, r8.d<? super T> dVar) {
        u b10 = i9.w.b((u1) null, 1, (Object) null);
        this.f8721j.e(new b.C0137b(pVar, b10, this.f8719h.getValue(), dVar.getContext()));
        return b10.v0(dVar);
    }

    public l9.d<T> getData() {
        return this.f8716e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        w8.b.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0092, B:34:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(T r8, r8.d<? super o8.q> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g0.l.r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            g0.l$r r0 = (g0.l.r) r0
            int r1 = r0.f8807o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8807o = r1
            goto L_0x0018
        L_0x0013:
            g0.l$r r0 = new g0.l$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8805m
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f8807o
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.f8804l
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f8803k
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f8802j
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f8801i
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f8800h
            g0.l r0 = (g0.l) r0
            o8.m.b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00be
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            o8.m.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f8717f
            java.lang.String r2 = kotlin.jvm.internal.m.o(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c7 }
            r4 = 0
            g0.j<T> r5 = r7.f8713b     // Catch:{ all -> 0x00bc }
            g0.l$c r6 = new g0.l$c     // Catch:{ all -> 0x00bc }
            r6.<init>(r2)     // Catch:{ all -> 0x00bc }
            r0.f8800h = r7     // Catch:{ all -> 0x00bc }
            r0.f8801i = r9     // Catch:{ all -> 0x00bc }
            r0.f8802j = r2     // Catch:{ all -> 0x00bc }
            r0.f8803k = r4     // Catch:{ all -> 0x00bc }
            r0.f8804l = r2     // Catch:{ all -> 0x00bc }
            r0.f8807o = r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r5.c(r8, r6, r0)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            o8.q r8 = o8.q.f16189a     // Catch:{ all -> 0x003d }
            w8.b.a(r2, r1)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r9 = r0.q()     // Catch:{ IOException -> 0x00c4 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c4 }
            if (r9 == 0) goto L_0x00a0
            return r8
        L_0x00a0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r9.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c4 }
            throw r8     // Catch:{ IOException -> 0x00c4 }
        L_0x00bc:
            r8 = move-exception
            r3 = r9
        L_0x00be:
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            w8.b.a(r2, r8)     // Catch:{ IOException -> 0x00c4 }
            throw r9     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8 = move-exception
            r9 = r3
            goto L_0x00c8
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d1
            r9.delete()
        L_0x00d1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.z(java.lang.Object, r8.d):java.lang.Object");
    }
}
