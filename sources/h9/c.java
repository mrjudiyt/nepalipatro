package h9;

import d9.i;
import kotlin.jvm.internal.m;

/* compiled from: Duration.kt */
public final class c {
    /* access modifiers changed from: private */
    public static final long d(long j10, int i10) {
        return a.g((j10 << 1) + ((long) i10));
    }

    /* access modifiers changed from: private */
    public static final long e(long j10) {
        return a.g((j10 << 1) + 1);
    }

    private static final long f(long j10) {
        return a.g(j10 << 1);
    }

    /* access modifiers changed from: private */
    public static final long g(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long h(int i10, d dVar) {
        m.f(dVar, "unit");
        if (dVar.compareTo(d.SECONDS) <= 0) {
            return f(e.b((long) i10, dVar, d.NANOSECONDS));
        }
        return i((long) i10, dVar);
    }

    public static final long i(long j10, d dVar) {
        m.f(dVar, "unit");
        d dVar2 = d.NANOSECONDS;
        long b10 = e.b(4611686018426999999L, dVar2, dVar);
        if (new i(-b10, b10).d(j10)) {
            return f(e.b(j10, dVar, dVar2));
        }
        return e(l.f(e.a(j10, dVar, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
