package l9;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o8.q;

/* compiled from: Flow.kt */
public abstract class a<T> implements d<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: l9.a$a  reason: collision with other inner class name */
    /* compiled from: Flow.kt */
    static final class C0264a extends d {

        /* renamed from: h  reason: collision with root package name */
        Object f15646h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f15647i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a<T> f15648j;

        /* renamed from: k  reason: collision with root package name */
        int f15649k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0264a(a<T> aVar, r8.d<? super C0264a> dVar) {
            super(dVar);
            this.f15648j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f15647i = obj;
            this.f15649k |= Integer.MIN_VALUE;
            return this.f15648j.collect((e) null, this);
        }
    }

    public abstract Object a(e<? super T> eVar, r8.d<? super q> dVar);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(l9.e<? super T> r6, r8.d<? super o8.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l9.a.C0264a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            l9.a$a r0 = (l9.a.C0264a) r0
            int r1 = r0.f15649k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15649k = r1
            goto L_0x0018
        L_0x0013:
            l9.a$a r0 = new l9.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f15647i
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15649k
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f15646h
            m9.i r6 = (m9.i) r6
            o8.m.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            o8.m.b(r7)
            m9.i r7 = new m9.i
            r8.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f15646h = r7     // Catch:{ all -> 0x0055 }
            r0.f15649k = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.a(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            o8.q r6 = o8.q.f16189a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.a.collect(l9.e, r8.d):java.lang.Object");
    }
}
