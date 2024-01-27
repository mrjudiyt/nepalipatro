package l9;

import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.w;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: Limit.kt */
final /* synthetic */ class l {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements d<T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f15678h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f15679i;

        public a(d dVar, p pVar) {
            this.f15678h = dVar;
            this.f15679i = pVar;
        }

        public Object collect(e<? super T> eVar, d<? super q> dVar) {
            Object collect = this.f15678h.collect(new b(new w(), eVar, this.f15679i), dVar);
            if (collect == d.c()) {
                return collect;
            }
            return q.f16189a;
        }
    }

    /* compiled from: Limit.kt */
    static final class b<T> implements e {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ w f15680h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e<T> f15681i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<T, d<? super Boolean>, Object> f15682j;

        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* compiled from: Limit.kt */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: h  reason: collision with root package name */
            Object f15683h;

            /* renamed from: i  reason: collision with root package name */
            Object f15684i;

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f15685j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ b<T> f15686k;

            /* renamed from: l  reason: collision with root package name */
            int f15687l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b<? super T> bVar, d<? super a> dVar) {
                super(dVar);
                this.f15686k = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f15685j = obj;
                this.f15687l |= Integer.MIN_VALUE;
                return this.f15686k.emit(null, this);
            }
        }

        b(w wVar, e<? super T> eVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
            this.f15680h = wVar;
            this.f15681i = eVar;
            this.f15682j = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r7, r8.d<? super o8.q> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l9.l.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                l9.l$b$a r0 = (l9.l.b.a) r0
                int r1 = r0.f15687l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f15687l = r1
                goto L_0x0018
            L_0x0013:
                l9.l$b$a r0 = new l9.l$b$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f15685j
                java.lang.Object r1 = s8.d.c()
                int r2 = r0.f15687l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                o8.m.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f15684i
                java.lang.Object r2 = r0.f15683h
                l9.l$b r2 = (l9.l.b) r2
                o8.m.b(r8)
                goto L_0x006c
            L_0x0041:
                o8.m.b(r8)
                goto L_0x0059
            L_0x0045:
                o8.m.b(r8)
                kotlin.jvm.internal.w r8 = r6.f15680h
                boolean r8 = r8.f15573h
                if (r8 == 0) goto L_0x005c
                l9.e<T> r8 = r6.f15681i
                r0.f15687l = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                o8.q r7 = o8.q.f16189a
                return r7
            L_0x005c:
                y8.p<T, r8.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f15682j
                r0.f15683h = r6
                r0.f15684i = r7
                r0.f15687l = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.w r8 = r2.f15680h
                r8.f15573h = r5
                l9.e<T> r8 = r2.f15681i
                r2 = 0
                r0.f15683h = r2
                r0.f15684i = r2
                r0.f15687l = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                o8.q r7 = o8.q.f16189a
                return r7
            L_0x008b:
                o8.q r7 = o8.q.f16189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l9.l.b.emit(java.lang.Object, r8.d):java.lang.Object");
        }
    }

    public static final <T> d<T> a(d<? extends T> dVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return new a(dVar, pVar);
    }
}
