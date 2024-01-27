package n9;

import r8.d;

/* compiled from: DispatchedContinuation.kt */
public final class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f15814a = new j0("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f15815b = new j0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.T0() != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(r8.d<? super T> r6, java.lang.Object r7, y8.l<? super java.lang.Throwable, o8.q> r8) {
        /*
            boolean r0 = r6 instanceof n9.k
            if (r0 == 0) goto L_0x00ba
            n9.k r6 = (n9.k) r6
            java.lang.Object r8 = i9.c0.c(r7, r8)
            i9.g0 r0 = r6.f15810k
            r8.g r1 = r6.getContext()
            boolean r0 = r0.L0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f15812m = r8
            r6.f14999j = r1
            i9.g0 r7 = r6.f15810k
            r8.g r8 = r6.getContext()
            r7.K0(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = i9.p0.a()
            i9.o2 r0 = i9.o2.f14972a
            i9.e1 r0 = r0.b()
            boolean r2 = r0.U0()
            if (r2 == 0) goto L_0x003f
            r6.f15812m = r8
            r6.f14999j = r1
            r0.Q0(r6)
            goto L_0x00bd
        L_0x003f:
            r0.S0(r1)
            r2 = 0
            r8.g r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            i9.u1$b r4 = i9.u1.f14995d     // Catch:{ all -> 0x00ad }
            r8.g$b r3 = r3.h(r4)     // Catch:{ all -> 0x00ad }
            i9.u1 r3 = (i9.u1) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.a()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.L()     // Catch:{ all -> 0x00ad }
            r6.b(r8, r3)     // Catch:{ all -> 0x00ad }
            o8.l$a r8 = o8.l.f16183h     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = o8.m.a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = o8.l.a(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            r8.d<T> r8 = r6.f15811l     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f15813n     // Catch:{ all -> 0x00ad }
            r8.g r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = n9.n0.c(r4, r3)     // Catch:{ all -> 0x00ad }
            n9.j0 r5 = n9.n0.f15826a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            i9.q2 r8 = i9.f0.g(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            r8.d<T> r5 = r6.f15811l     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            o8.q r7 = o8.q.f16189a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.T0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            n9.n0.a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.T0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            n9.n0.a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.X0()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.g(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.N0(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.N0(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.l.b(r8.d, java.lang.Object, y8.l):void");
    }

    public static /* synthetic */ void c(d dVar, Object obj, y8.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
