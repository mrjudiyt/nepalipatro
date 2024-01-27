package r8;

import kotlin.jvm.internal.m;
import o8.l;
import o8.q;
import y8.p;

/* compiled from: Continuation.kt */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        m.f(pVar, "<this>");
        m.f(dVar, "completion");
        d b10 = c.b(c.a(pVar, r10, dVar));
        l.a aVar = l.f16183h;
        b10.resumeWith(l.a(q.f16189a));
    }
}
