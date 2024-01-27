package l9;

import kotlin.coroutines.jvm.internal.f;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: Share.kt */
public final class s<T> implements e<T> {

    /* renamed from: h  reason: collision with root package name */
    private final e<T> f15707h;

    /* renamed from: i  reason: collision with root package name */
    private final p<e<? super T>, d<? super q>, Object> f15708i;

    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* compiled from: Share.kt */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: h  reason: collision with root package name */
        Object f15709h;

        /* renamed from: i  reason: collision with root package name */
        Object f15710i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f15711j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ s<T> f15712k;

        /* renamed from: l  reason: collision with root package name */
        int f15713l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, d<? super a> dVar) {
            super(dVar);
            this.f15712k = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15711j = obj;
            this.f15713l |= Integer.MIN_VALUE;
            return this.f15712k.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(r8.d<? super o8.q> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof l9.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            l9.s$a r0 = (l9.s.a) r0
            int r1 = r0.f15713l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15713l = r1
            goto L_0x0018
        L_0x0013:
            l9.s$a r0 = new l9.s$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f15711j
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15713l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            o8.m.b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f15710i
            m9.i r2 = (m9.i) r2
            java.lang.Object r4 = r0.f15709h
            l9.s r4 = (l9.s) r4
            o8.m.b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            o8.m.b(r7)
            m9.i r2 = new m9.i
            l9.e<T> r7 = r6.f15707h
            r8.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            y8.p<l9.e<? super T>, r8.d<? super o8.q>, java.lang.Object> r7 = r6.f15708i     // Catch:{ all -> 0x007d }
            r0.f15709h = r6     // Catch:{ all -> 0x007d }
            r0.f15710i = r2     // Catch:{ all -> 0x007d }
            r0.f15713l = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            l9.e<T> r7 = r4.f15707h
            boolean r2 = r7 instanceof l9.s
            if (r2 == 0) goto L_0x007a
            l9.s r7 = (l9.s) r7
            r2 = 0
            r0.f15709h = r2
            r0.f15710i = r2
            r0.f15713l = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            o8.q r7 = o8.q.f16189a
            return r7
        L_0x007a:
            o8.q r7 = o8.q.f16189a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.s.a(r8.d):java.lang.Object");
    }

    public Object emit(T t10, d<? super q> dVar) {
        return this.f15707h.emit(t10, dVar);
    }
}
