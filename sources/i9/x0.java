package i9;

import kotlin.jvm.internal.m;
import p9.h;
import r8.d;

/* compiled from: DispatchedTask.kt */
public abstract class x0<T> extends h {

    /* renamed from: j  reason: collision with root package name */
    public int f14999j;

    public x0(int i10) {
        this.f14999j = i10;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable e(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f15006a;
        }
        return null;
    }

    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            m.c(th);
            i0.a(c().getContext(), new o0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (r4.T0() != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r4.T0() != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = i9.p0.a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f14999j
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            p9.i r0 = r10.f16256i
            r8.d r1 = r10.c()     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch:{ all -> 0x00de }
            n9.k r1 = (n9.k) r1     // Catch:{ all -> 0x00de }
            r8.d<T> r2 = r1.f15811l     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r1.f15813n     // Catch:{ all -> 0x00de }
            r8.g r3 = r2.getContext()     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = n9.n0.c(r3, r1)     // Catch:{ all -> 0x00de }
            n9.j0 r4 = n9.n0.f15826a     // Catch:{ all -> 0x00de }
            r5 = 0
            if (r1 == r4) goto L_0x003a
            i9.q2 r4 = i9.f0.g(r2, r3, r1)     // Catch:{ all -> 0x00de }
            goto L_0x003b
        L_0x003a:
            r4 = r5
        L_0x003b:
            r8.g r6 = r2.getContext()     // Catch:{ all -> 0x00d1 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r8 = r10.e(r7)     // Catch:{ all -> 0x00d1 }
            if (r8 != 0) goto L_0x005a
            int r9 = r10.f14999j     // Catch:{ all -> 0x00d1 }
            boolean r9 = i9.y0.b(r9)     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x005a
            i9.u1$b r9 = i9.u1.f14995d     // Catch:{ all -> 0x00d1 }
            r8.g$b r6 = r6.h(r9)     // Catch:{ all -> 0x00d1 }
            i9.u1 r6 = (i9.u1) r6     // Catch:{ all -> 0x00d1 }
            goto L_0x005b
        L_0x005a:
            r6 = r5
        L_0x005b:
            if (r6 == 0) goto L_0x008a
            boolean r9 = r6.a()     // Catch:{ all -> 0x00d1 }
            if (r9 != 0) goto L_0x008a
            java.util.concurrent.CancellationException r6 = r6.L()     // Catch:{ all -> 0x00d1 }
            r10.b(r7, r6)     // Catch:{ all -> 0x00d1 }
            o8.l$a r7 = o8.l.f16183h     // Catch:{ all -> 0x00d1 }
            boolean r7 = i9.p0.d()     // Catch:{ all -> 0x00d1 }
            if (r7 == 0) goto L_0x007e
            boolean r7 = r2 instanceof kotlin.coroutines.jvm.internal.e     // Catch:{ all -> 0x00d1 }
            if (r7 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            r7 = r2
            kotlin.coroutines.jvm.internal.e r7 = (kotlin.coroutines.jvm.internal.e) r7     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r6 = n9.i0.i(r6, r7)     // Catch:{ all -> 0x00d1 }
        L_0x007e:
            java.lang.Object r6 = o8.m.a(r6)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = o8.l.a(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a7
        L_0x008a:
            if (r8 == 0) goto L_0x009a
            o8.l$a r6 = o8.l.f16183h     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = o8.m.a(r8)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = o8.l.a(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a7
        L_0x009a:
            o8.l$a r6 = o8.l.f16183h     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = r10.f(r7)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = o8.l.a(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
        L_0x00a7:
            o8.q r2 = o8.q.f16189a     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x00b1
            boolean r4 = r4.T0()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            n9.n0.a(r3, r1)     // Catch:{ all -> 0x00de }
        L_0x00b4:
            o8.l$a r1 = o8.l.f16183h     // Catch:{ all -> 0x00be }
            r0.a()     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = o8.l.a(r2)     // Catch:{ all -> 0x00be }
            goto L_0x00c9
        L_0x00be:
            r0 = move-exception
            o8.l$a r1 = o8.l.f16183h
            java.lang.Object r0 = o8.m.a(r0)
            java.lang.Object r0 = o8.l.a(r0)
        L_0x00c9:
            java.lang.Throwable r0 = o8.l.b(r0)
            r10.g(r5, r0)
            goto L_0x00fd
        L_0x00d1:
            r2 = move-exception
            if (r4 == 0) goto L_0x00da
            boolean r4 = r4.T0()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x00dd
        L_0x00da:
            n9.n0.a(r3, r1)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r2     // Catch:{ all -> 0x00de }
        L_0x00de:
            r1 = move-exception
            o8.l$a r2 = o8.l.f16183h     // Catch:{ all -> 0x00eb }
            r0.a()     // Catch:{ all -> 0x00eb }
            o8.q r0 = o8.q.f16189a     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = o8.l.a(r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00f6
        L_0x00eb:
            r0 = move-exception
            o8.l$a r2 = o8.l.f16183h
            java.lang.Object r0 = o8.m.a(r0)
            java.lang.Object r0 = o8.l.a(r0)
        L_0x00f6:
            java.lang.Throwable r0 = o8.l.b(r0)
            r10.g(r1, r0)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.x0.run():void");
    }
}
