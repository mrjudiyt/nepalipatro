package i9;

import n9.f0;
import n9.n0;
import o8.k;
import o8.o;
import o8.q;
import r8.d;
import r8.g;

/* compiled from: CoroutineContext.kt */
public final class q2<T> extends f0<T> {

    /* renamed from: l  reason: collision with root package name */
    private final ThreadLocal<k<g, Object>> f14982l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q2(r8.g r3, r8.d<? super T> r4) {
        /*
            r2 = this;
            i9.r2 r0 = i9.r2.f14986h
            r8.g$b r1 = r3.h(r0)
            if (r1 != 0) goto L_0x000d
            r8.g r0 = r3.Y(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f14982l = r0
            r8.g r4 = r4.getContext()
            r8.e$b r0 = r8.e.f16407g
            r8.g$b r4 = r4.h(r0)
            boolean r4 = r4 instanceof i9.g0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = n9.n0.c(r3, r4)
            n9.n0.a(r3, r4)
            r2.U0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.q2.<init>(r8.g, r8.d):void");
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        if (this.threadLocalIsSet) {
            k kVar = this.f14982l.get();
            if (kVar != null) {
                n0.a((g) kVar.a(), kVar.b());
            }
            this.f14982l.remove();
        }
        Object a10 = c0.a(obj, this.f15800k);
        d<T> dVar = this.f15800k;
        g context = dVar.getContext();
        q2<?> q2Var = null;
        Object c10 = n0.c(context, q2Var);
        if (c10 != n0.f15826a) {
            q2Var = f0.g(dVar, context, c10);
        }
        try {
            this.f15800k.resumeWith(a10);
            q qVar = q.f16189a;
        } finally {
            if (q2Var == null || q2Var.T0()) {
                n0.a(context, c10);
            }
        }
    }

    public final boolean T0() {
        boolean z10 = this.threadLocalIsSet && this.f14982l.get() == null;
        this.f14982l.remove();
        return !z10;
    }

    public final void U0(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f14982l.set(o.a(gVar, obj));
    }
}
