package o9;

import o8.l;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: Cancellable.kt */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        l.a aVar = l.f16183h;
        dVar.resumeWith(l.a(m.a(th)));
        throw th;
    }

    public static final void b(d<? super q> dVar, d<?> dVar2) {
        try {
            d b10 = c.b(dVar);
            l.a aVar = l.f16183h;
            n9.l.c(b10, l.a(q.f16189a), (y8.l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, y8.l<? super Throwable, q> lVar) {
        try {
            d b10 = c.b(c.a(pVar, r10, dVar));
            l.a aVar = l.f16183h;
            n9.l.b(b10, l.a(q.f16189a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, y8.l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, dVar, lVar);
    }
}
