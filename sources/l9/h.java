package l9;

import k9.r;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o8.q;

/* compiled from: Channels.kt */
final /* synthetic */ class h {

    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* compiled from: Channels.kt */
    static final class a<T> extends d {

        /* renamed from: h  reason: collision with root package name */
        Object f15656h;

        /* renamed from: i  reason: collision with root package name */
        Object f15657i;

        /* renamed from: j  reason: collision with root package name */
        Object f15658j;

        /* renamed from: k  reason: collision with root package name */
        boolean f15659k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f15660l;

        /* renamed from: m  reason: collision with root package name */
        int f15661m;

        a(r8.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f15660l = obj;
            this.f15661m |= Integer.MIN_VALUE;
            return h.c((e) null, (r) null, false, this);
        }
    }

    public static final <T> Object b(e<? super T> eVar, r<? extends T> rVar, r8.d<? super q> dVar) {
        Object c10 = c(eVar, rVar, true, dVar);
        return c10 == d.c() ? c10 : q.f16189a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r9 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        k9.j.a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        throw r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ all -> 0x009d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object c(l9.e<? super T> r7, k9.r<? extends T> r8, boolean r9, r8.d<? super o8.q> r10) {
        /*
            boolean r0 = r10 instanceof l9.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            l9.h$a r0 = (l9.h.a) r0
            int r1 = r0.f15661m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15661m = r1
            goto L_0x0018
        L_0x0013:
            l9.h$a r0 = new l9.h$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f15660l
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15661m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            boolean r9 = r0.f15659k
            java.lang.Object r7 = r0.f15658j
            k9.f r7 = (k9.f) r7
            java.lang.Object r8 = r0.f15657i
            k9.r r8 = (k9.r) r8
            java.lang.Object r2 = r0.f15656h
            l9.e r2 = (l9.e) r2
            o8.m.b(r10)     // Catch:{ all -> 0x009b }
        L_0x0039:
            r10 = r7
            r7 = r2
            goto L_0x0060
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            boolean r9 = r0.f15659k
            java.lang.Object r7 = r0.f15658j
            k9.f r7 = (k9.f) r7
            java.lang.Object r8 = r0.f15657i
            k9.r r8 = (k9.r) r8
            java.lang.Object r2 = r0.f15656h
            l9.e r2 = (l9.e) r2
            o8.m.b(r10)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x0056:
            o8.m.b(r10)
            l9.f.g(r7)
            k9.f r10 = r8.iterator()     // Catch:{ all -> 0x009b }
        L_0x0060:
            r0.f15656h = r7     // Catch:{ all -> 0x009b }
            r0.f15657i = r8     // Catch:{ all -> 0x009b }
            r0.f15658j = r10     // Catch:{ all -> 0x009b }
            r0.f15659k = r9     // Catch:{ all -> 0x009b }
            r0.f15661m = r4     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x009b }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L_0x0075:
            r5 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x009b }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x009b }
            if (r10 == 0) goto L_0x0093
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x009b }
            r0.f15656h = r2     // Catch:{ all -> 0x009b }
            r0.f15657i = r8     // Catch:{ all -> 0x009b }
            r0.f15658j = r7     // Catch:{ all -> 0x009b }
            r0.f15659k = r9     // Catch:{ all -> 0x009b }
            r0.f15661m = r3     // Catch:{ all -> 0x009b }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x009b }
            if (r10 != r1) goto L_0x0039
            return r1
        L_0x0093:
            if (r9 == 0) goto L_0x0098
            k9.j.a(r8, r5)
        L_0x0098:
            o8.q r7 = o8.q.f16189a
            return r7
        L_0x009b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            if (r9 == 0) goto L_0x00a3
            k9.j.a(r8, r7)
        L_0x00a3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.h.c(l9.e, k9.r, boolean, r8.d):java.lang.Object");
    }
}
