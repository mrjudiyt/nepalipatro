package g0;

import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import o8.m;
import o8.q;
import y8.l;
import y8.p;

/* compiled from: DataMigrationInitializer.kt */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8678a = new a((g) null);

    /* compiled from: DataMigrationInitializer.kt */
    public static final class a {

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: g0.d$a$a  reason: collision with other inner class name */
        /* compiled from: DataMigrationInitializer.kt */
        static final class C0135a extends k implements p<h<T>, r8.d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f8679h;

            /* renamed from: i  reason: collision with root package name */
            /* synthetic */ Object f8680i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ List<c<T>> f8681j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0135a(List<? extends c<T>> list, r8.d<? super C0135a> dVar) {
                super(2, dVar);
                this.f8681j = list;
            }

            /* renamed from: a */
            public final Object invoke(h<T> hVar, r8.d<? super q> dVar) {
                return ((C0135a) create(hVar, dVar)).invokeSuspend(q.f16189a);
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                C0135a aVar = new C0135a(this.f8681j, dVar);
                aVar.f8680i = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f8679h;
                if (i10 == 0) {
                    m.b(obj);
                    a aVar = d.f8678a;
                    List<c<T>> list = this.f8681j;
                    this.f8679h = 1;
                    if (aVar.c(list, (h) this.f8680i, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    m.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return q.f16189a;
            }
        }

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* compiled from: DataMigrationInitializer.kt */
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: h  reason: collision with root package name */
            Object f8682h;

            /* renamed from: i  reason: collision with root package name */
            Object f8683i;

            /* renamed from: j  reason: collision with root package name */
            /* synthetic */ Object f8684j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ a f8685k;

            /* renamed from: l  reason: collision with root package name */
            int f8686l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, r8.d<? super b> dVar) {
                super(dVar);
                this.f8685k = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8684j = obj;
                this.f8686l |= Integer.MIN_VALUE;
                return this.f8685k.c((List) null, (h) null, this);
            }
        }

        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        /* compiled from: DataMigrationInitializer.kt */
        static final class c extends k implements p<T, r8.d<? super T>, Object> {

            /* renamed from: h  reason: collision with root package name */
            Object f8687h;

            /* renamed from: i  reason: collision with root package name */
            Object f8688i;

            /* renamed from: j  reason: collision with root package name */
            Object f8689j;

            /* renamed from: k  reason: collision with root package name */
            int f8690k;

            /* renamed from: l  reason: collision with root package name */
            /* synthetic */ Object f8691l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ List<c<T>> f8692m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ List<l<r8.d<? super q>, Object>> f8693n;

            @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: g0.d$a$c$a  reason: collision with other inner class name */
            /* compiled from: DataMigrationInitializer.kt */
            static final class C0136a extends k implements l<r8.d<? super q>, Object> {

                /* renamed from: h  reason: collision with root package name */
                int f8694h;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ c<T> f8695i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0136a(c<T> cVar, r8.d<? super C0136a> dVar) {
                    super(1, dVar);
                    this.f8695i = cVar;
                }

                /* renamed from: a */
                public final Object invoke(r8.d<? super q> dVar) {
                    return ((C0136a) create(dVar)).invokeSuspend(q.f16189a);
                }

                public final r8.d<q> create(r8.d<?> dVar) {
                    return new C0136a(this.f8695i, dVar);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c10 = d.c();
                    int i10 = this.f8694h;
                    if (i10 == 0) {
                        m.b(obj);
                        c<T> cVar = this.f8695i;
                        this.f8694h = 1;
                        if (cVar.b(this) == c10) {
                            return c10;
                        }
                    } else if (i10 == 1) {
                        m.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return q.f16189a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(List<? extends c<T>> list, List<l<r8.d<? super q>, Object>> list2, r8.d<? super c> dVar) {
                super(2, dVar);
                this.f8692m = list;
                this.f8693n = list2;
            }

            /* renamed from: a */
            public final Object invoke(T t10, r8.d<? super T> dVar) {
                return ((c) create(t10, dVar)).invokeSuspend(q.f16189a);
            }

            public final r8.d<q> create(Object obj, r8.d<?> dVar) {
                c cVar = new c(this.f8692m, this.f8693n, dVar);
                cVar.f8691l = obj;
                return cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = s8.d.c()
                    int r1 = r10.f8690k
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x003a
                    if (r1 == r3) goto L_0x0024
                    if (r1 != r2) goto L_0x001c
                    java.lang.Object r1 = r10.f8687h
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f8691l
                    java.util.List r4 = (java.util.List) r4
                    o8.m.b(r11)
                    r7 = r10
                    goto L_0x008c
                L_0x001c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x0024:
                    java.lang.Object r1 = r10.f8689j
                    java.lang.Object r4 = r10.f8688i
                    g0.c r4 = (g0.c) r4
                    java.lang.Object r5 = r10.f8687h
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f8691l
                    java.util.List r6 = (java.util.List) r6
                    o8.m.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L_0x006a
                L_0x003a:
                    o8.m.b(r11)
                    java.lang.Object r11 = r10.f8691l
                    java.util.List<g0.c<T>> r1 = r10.f8692m
                    java.util.List<y8.l<r8.d<? super o8.q>, java.lang.Object>> r4 = r10.f8693n
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L_0x0048:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L_0x0091
                    java.lang.Object r6 = r1.next()
                    g0.c r6 = (g0.c) r6
                    r5.f8691l = r4
                    r5.f8687h = r1
                    r5.f8688i = r6
                    r5.f8689j = r11
                    r5.f8690k = r3
                    java.lang.Object r7 = r6.c(r11, r5)
                    if (r7 != r0) goto L_0x0065
                    return r0
                L_0x0065:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L_0x006a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L_0x008e
                    g0.d$a$c$a r11 = new g0.d$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f8691l = r4
                    r7.f8687h = r5
                    r7.f8688i = r8
                    r7.f8689j = r8
                    r7.f8690k = r2
                    java.lang.Object r11 = r6.a(r1, r7)
                    if (r11 != r0) goto L_0x008f
                    return r0
                L_0x008c:
                    r5 = r7
                    goto L_0x0048
                L_0x008e:
                    r11 = r1
                L_0x008f:
                    r1 = r5
                    goto L_0x008c
                L_0x0091:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: g0.d.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> java.lang.Object c(java.util.List<? extends g0.c<T>> r7, g0.h<T> r8, r8.d<? super o8.q> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof g0.d.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                g0.d$a$b r0 = (g0.d.a.b) r0
                int r1 = r0.f8686l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8686l = r1
                goto L_0x0018
            L_0x0013:
                g0.d$a$b r0 = new g0.d$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f8684j
                java.lang.Object r1 = s8.d.c()
                int r2 = r0.f8686l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f8683i
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f8682h
                kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
                o8.m.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x0069
            L_0x0034:
                r9 = move-exception
                goto L_0x0082
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f8682h
                java.util.List r7 = (java.util.List) r7
                o8.m.b(r9)
                goto L_0x0060
            L_0x0046:
                o8.m.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                g0.d$a$c r2 = new g0.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f8682h = r9
                r0.f8686l = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0069:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                y8.l r9 = (y8.l) r9
                r0.f8682h = r8     // Catch:{ all -> 0x0034 }
                r0.f8683i = r7     // Catch:{ all -> 0x0034 }
                r0.f8686l = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.invoke(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x0069
                return r1
            L_0x0082:
                T r2 = r8.f15575h
                if (r2 != 0) goto L_0x0089
                r8.f15575h = r9
                goto L_0x0069
            L_0x0089:
                kotlin.jvm.internal.m.c(r2)
                T r2 = r8.f15575h
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                o8.b.a(r2, r9)
                goto L_0x0069
            L_0x0094:
                T r7 = r8.f15575h
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                o8.q r7 = o8.q.f16189a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.d.a.c(java.util.List, g0.h, r8.d):java.lang.Object");
        }

        public final <T> p<h<T>, r8.d<? super q>, Object> b(List<? extends c<T>> list) {
            kotlin.jvm.internal.m.f(list, "migrations");
            return new C0135a(list, (r8.d<? super C0135a>) null);
        }
    }
}
