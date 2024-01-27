package o9;

import i9.b2;
import i9.p0;
import i9.z;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.c0;
import n9.f0;
import n9.i0;
import n9.n0;
import o8.l;
import o8.m;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: Undispatched.kt */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        g context;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = n0.c(context, (Object) null);
            Object invoke = ((p) c0.b(pVar, 2)).invoke(r10, a10);
            n0.a(context, c10);
            if (invoke != d.c()) {
                l.a aVar = l.f16183h;
                a10.resumeWith(l.a(invoke));
            }
        } catch (Throwable th) {
            l.a aVar2 = l.f16183h;
            a10.resumeWith(l.a(m.a(th)));
        }
    }

    public static final <T, R> Object b(f0<? super T> f0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = ((p) c0.b(pVar, 2)).invoke(r10, f0Var);
        } catch (Throwable th) {
            obj = new z(th, false, 2, (kotlin.jvm.internal.g) null);
        }
        if (obj == d.c()) {
            return d.c();
        }
        Object j02 = f0Var.j0(obj);
        if (j02 == b2.f14915b) {
            return d.c();
        }
        if (!(j02 instanceof z)) {
            return b2.h(j02);
        }
        Throwable th2 = ((z) j02).f15006a;
        d<T> dVar = f0Var.f15800k;
        if (p0.d() && (dVar instanceof e)) {
            th2 = i0.i(th2, (e) dVar);
        }
        throw th2;
    }
}
