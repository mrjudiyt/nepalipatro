package l9;

import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o8.q;
import r8.d;

/* compiled from: Reduce.kt */
final /* synthetic */ class m {

    /* compiled from: Limit.kt */
    public static final class a implements e<T> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ y f15688h;

        public a(y yVar) {
            this.f15688h = yVar;
        }

        public Object emit(T t10, d<? super q> dVar) {
            this.f15688h.f15575h = t10;
            throw new AbortFlowException(this);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* compiled from: Reduce.kt */
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f15689h;

        /* renamed from: i  reason: collision with root package name */
        Object f15690i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f15691j;

        /* renamed from: k  reason: collision with root package name */
        int f15692k;

        b(d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f15691j = obj;
            this.f15692k |= Integer.MIN_VALUE;
            return f.h((d) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(l9.d<? extends T> r4, r8.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof l9.m.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            l9.m$b r0 = (l9.m.b) r0
            int r1 = r0.f15692k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15692k = r1
            goto L_0x0018
        L_0x0013:
            l9.m$b r0 = new l9.m$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f15691j
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15692k
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f15690i
            l9.m$a r4 = (l9.m.a) r4
            java.lang.Object r0 = r0.f15689h
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            o8.m.b(r5)     // Catch:{ AbortFlowException -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            o8.m.b(r5)
            kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
            r5.<init>()
            n9.j0 r2 = m9.h.f15761a
            r5.f15575h = r2
            l9.m$a r2 = new l9.m$a
            r2.<init>(r5)
            r0.f15689h = r5     // Catch:{ AbortFlowException -> 0x005b }
            r0.f15690i = r2     // Catch:{ AbortFlowException -> 0x005b }
            r0.f15692k = r3     // Catch:{ AbortFlowException -> 0x005b }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            m9.f.a(r5, r4)
        L_0x0062:
            T r4 = r0.f15575h
            n9.j0 r5 = m9.h.f15761a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.m.a(l9.d, r8.d):java.lang.Object");
    }
}
