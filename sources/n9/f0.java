package n9;

import i9.a;
import i9.c0;
import kotlin.coroutines.jvm.internal.e;
import r8.d;
import r8.g;
import y8.l;

/* compiled from: Scopes.kt */
public class f0<T> extends a<T> implements e {

    /* renamed from: k  reason: collision with root package name */
    public final d<T> f15800k;

    public f0(g gVar, d<? super T> dVar) {
        super(gVar, true, true);
        this.f15800k = dVar;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        d<T> dVar = this.f15800k;
        dVar.resumeWith(c0.a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    public final boolean e0() {
        return true;
    }

    public final e getCallerFrame() {
        d<T> dVar = this.f15800k;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        l.c(c.b(this.f15800k), c0.a(obj, this.f15800k), (l) null, 2, (Object) null);
    }
}
