package l9;

import i9.p0;
import i9.u1;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import n9.i0;
import r8.g;
import y8.q;

/* compiled from: Errors.kt */
final /* synthetic */ class k {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements d<T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f15662h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q f15663i;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: l9.k$a$a  reason: collision with other inner class name */
        /* compiled from: SafeCollector.common.kt */
        public static final class C0265a extends d {

            /* renamed from: h  reason: collision with root package name */
            /* synthetic */ Object f15664h;

            /* renamed from: i  reason: collision with root package name */
            int f15665i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ a f15666j;

            /* renamed from: k  reason: collision with root package name */
            Object f15667k;

            /* renamed from: l  reason: collision with root package name */
            Object f15668l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0265a(a aVar, r8.d dVar) {
                super(dVar);
                this.f15666j = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f15664h = obj;
                this.f15665i |= Integer.MIN_VALUE;
                return this.f15666j.collect((e) null, this);
            }
        }

        public a(d dVar, q qVar) {
            this.f15662h = dVar;
            this.f15663i = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(l9.e<? super T> r6, r8.d<? super o8.q> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l9.k.a.C0265a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                l9.k$a$a r0 = (l9.k.a.C0265a) r0
                int r1 = r0.f15665i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f15665i = r1
                goto L_0x0018
            L_0x0013:
                l9.k$a$a r0 = new l9.k$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f15664h
                java.lang.Object r1 = s8.d.c()
                int r2 = r0.f15665i
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                o8.m.b(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.f15668l
                l9.e r6 = (l9.e) r6
                java.lang.Object r2 = r0.f15667k
                l9.k$a r2 = (l9.k.a) r2
                o8.m.b(r7)
                goto L_0x0053
            L_0x0040:
                o8.m.b(r7)
                l9.d r7 = r5.f15662h
                r0.f15667k = r5
                r0.f15668l = r6
                r0.f15665i = r4
                java.lang.Object r7 = l9.f.c(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                y8.q r2 = r2.f15663i
                r4 = 0
                r0.f15667k = r4
                r0.f15668l = r4
                r0.f15665i = r3
                r3 = 6
                kotlin.jvm.internal.k.a(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.k.a(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                o8.q r6 = o8.q.f16189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l9.k.a.collect(l9.e, r8.d):java.lang.Object");
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    /* compiled from: Errors.kt */
    static final class b<T> extends d {

        /* renamed from: h  reason: collision with root package name */
        Object f15669h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f15670i;

        /* renamed from: j  reason: collision with root package name */
        int f15671j;

        b(r8.d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f15670i = obj;
            this.f15671j |= Integer.MIN_VALUE;
            return f.c((d) null, (e) null, this);
        }
    }

    /* compiled from: Errors.kt */
    static final class c<T> implements e {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e<T> f15672h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ y<Throwable> f15673i;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        /* compiled from: Errors.kt */
        static final class a extends d {

            /* renamed from: h  reason: collision with root package name */
            Object f15674h;

            /* renamed from: i  reason: collision with root package name */
            /* synthetic */ Object f15675i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c<T> f15676j;

            /* renamed from: k  reason: collision with root package name */
            int f15677k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c<? super T> cVar, r8.d<? super a> dVar) {
                super(dVar);
                this.f15676j = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f15675i = obj;
                this.f15677k |= Integer.MIN_VALUE;
                return this.f15676j.emit(null, this);
            }
        }

        c(e<? super T> eVar, y<Throwable> yVar) {
            this.f15672h = eVar;
            this.f15673i = yVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r5, r8.d<? super o8.q> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof l9.k.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                l9.k$c$a r0 = (l9.k.c.a) r0
                int r1 = r0.f15677k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f15677k = r1
                goto L_0x0018
            L_0x0013:
                l9.k$c$a r0 = new l9.k$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f15675i
                java.lang.Object r1 = s8.d.c()
                int r2 = r0.f15677k
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f15674h
                l9.k$c r5 = (l9.k.c) r5
                o8.m.b(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                o8.m.b(r6)
                l9.e<T> r6 = r4.f15672h     // Catch:{ all -> 0x004a }
                r0.f15674h = r4     // Catch:{ all -> 0x004a }
                r0.f15677k = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                o8.q r5 = o8.q.f16189a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                kotlin.jvm.internal.y<java.lang.Throwable> r5 = r5.f15673i
                r5.f15575h = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l9.k.c.emit(java.lang.Object, r8.d):java.lang.Object");
        }
    }

    public static final <T> d<T> a(d<? extends T> dVar, q<? super e<? super T>, ? super Throwable, ? super r8.d<? super o8.q>, ? extends Object> qVar) {
        return new a(dVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(l9.d<? extends T> r4, l9.e<? super T> r5, r8.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof l9.k.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            l9.k$b r0 = (l9.k.b) r0
            int r1 = r0.f15671j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15671j = r1
            goto L_0x0018
        L_0x0013:
            l9.k$b r0 = new l9.k$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f15670i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15671j
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.f15669h
            kotlin.jvm.internal.y r4 = (kotlin.jvm.internal.y) r4
            o8.m.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            o8.m.b(r6)
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            l9.k$c r2 = new l9.k$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.f15669h = r6     // Catch:{ all -> 0x0051 }
            r0.f15671j = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.f15575h
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            r8.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            o8.b.a(r4, r5)
            throw r4
        L_0x0072:
            o8.b.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.k.b(l9.d, l9.e, r8.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, g gVar) {
        u1 u1Var = (u1) gVar.h(u1.f14995d);
        if (u1Var == null || !u1Var.isCancelled()) {
            return false;
        }
        return d(th, u1Var.L());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null) {
            if (p0.d()) {
                th2 = i0.l(th2);
            }
            if (p0.d()) {
                th = i0.l(th);
            }
            if (m.a(th2, th)) {
                return true;
            }
        }
        return false;
    }
}
