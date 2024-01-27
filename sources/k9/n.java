package k9;

import i9.f0;
import i9.l0;
import i9.n0;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import o8.l;
import o8.q;
import r8.g;
import r8.h;
import y8.l;
import y8.p;

/* compiled from: Produce.kt */
public final class n {

    @f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* compiled from: Produce.kt */
    static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        Object f15540h;

        /* renamed from: i  reason: collision with root package name */
        Object f15541i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f15542j;

        /* renamed from: k  reason: collision with root package name */
        int f15543k;

        a(r8.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f15542j = obj;
            this.f15543k |= Integer.MIN_VALUE;
            return n.a((p<?>) null, (y8.a<q>) null, this);
        }
    }

    /* compiled from: Produce.kt */
    static final class b extends kotlin.jvm.internal.n implements l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i9.l<q> f15544h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i9.l<? super q> lVar) {
            super(1);
            this.f15544h = lVar;
        }

        public final void a(Throwable th) {
            i9.l<q> lVar = this.f15544h;
            l.a aVar = o8.l.f16183h;
            lVar.resumeWith(o8.l.a(q.f16189a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: y8.a<o8.q>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(k9.p<?> r4, y8.a<o8.q> r5, r8.d<? super o8.q> r6) {
        /*
            boolean r0 = r6 instanceof k9.n.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            k9.n$a r0 = (k9.n.a) r0
            int r1 = r0.f15543k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15543k = r1
            goto L_0x0018
        L_0x0013:
            k9.n$a r0 = new k9.n$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f15542j
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.f15543k
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f15541i
            r5 = r4
            y8.a r5 = (y8.a) r5
            java.lang.Object r4 = r0.f15540h
            k9.p r4 = (k9.p) r4
            o8.m.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            o8.m.b(r6)
            r8.g r6 = r0.getContext()
            i9.u1$b r2 = i9.u1.f14995d
            r8.g$b r6 = r6.h(r2)
            if (r6 != r4) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.f15540h = r4     // Catch:{ all -> 0x0032 }
            r0.f15541i = r5     // Catch:{ all -> 0x0032 }
            r0.f15543k = r3     // Catch:{ all -> 0x0032 }
            i9.m r6 = new i9.m     // Catch:{ all -> 0x0032 }
            r8.d r2 = s8.c.b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.z()     // Catch:{ all -> 0x0032 }
            k9.n$b r2 = new k9.n$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.f(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.w()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = s8.d.c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            o8.q r4 = o8.q.f16189a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.n.a(k9.p, y8.a, r8.d):java.lang.Object");
    }

    public static final <E> r<E> b(l0 l0Var, g gVar, int i10, a aVar, n0 n0Var, y8.l<? super Throwable, q> lVar, p<? super p<? super E>, ? super r8.d<? super q>, ? extends Object> pVar) {
        o oVar = new o(f0.d(l0Var, gVar), g.b(i10, aVar, (y8.l) null, 4, (Object) null));
        if (lVar != null) {
            oVar.y0(lVar);
        }
        oVar.S0(n0Var, oVar, pVar);
        return oVar;
    }

    public static /* synthetic */ r c(l0 l0Var, g gVar, int i10, a aVar, n0 n0Var, y8.l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = h.f16410h;
        }
        g gVar2 = gVar;
        int i12 = (i11 & 2) != 0 ? 0 : i10;
        if ((i11 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            n0Var = n0.DEFAULT;
        }
        n0 n0Var2 = n0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(l0Var, gVar2, i12, aVar2, n0Var2, lVar, pVar);
    }
}
