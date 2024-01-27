package n9;

/* compiled from: ConcurrentLinkedList.kt */
public final class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f15797a = new j0("CLOSED");

    public static final <N extends f<N>> N b(N n10) {
        while (true) {
            N a10 = n10.f();
            if (a10 == f15797a) {
                return n10;
            }
            N n11 = (f) a10;
            if (n11 != null) {
                n10 = n11;
            } else if (n10.j()) {
                return n10;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [y8.p, y8.p<? super java.lang.Long, ? super S, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S extends n9.g0<S>> java.lang.Object c(S r4, long r5, y8.p<? super java.lang.Long, ? super S, ? extends S> r7) {
        /*
        L_0x0000:
            long r0 = r4.f15803j
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0012
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            java.lang.Object r4 = n9.h0.a(r4)
            return r4
        L_0x0012:
            java.lang.Object r0 = r4.f()
            n9.j0 r1 = f15797a
            if (r0 != r1) goto L_0x0023
            n9.j0 r4 = f15797a
            java.lang.Object r4 = n9.h0.a(r4)
            return r4
        L_0x0023:
            n9.f r0 = (n9.f) r0
            n9.g0 r0 = (n9.g0) r0
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r4 = r0
            goto L_0x0000
        L_0x002b:
            long r0 = r4.f15803j
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            n9.g0 r0 = (n9.g0) r0
            boolean r1 = r4.l(r0)
            if (r1 == 0) goto L_0x0000
            boolean r1 = r4.h()
            if (r1 == 0) goto L_0x0029
            r4.k()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.e.c(n9.g0, long, y8.p):java.lang.Object");
    }
}
