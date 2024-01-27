package l9;

import k9.a;
import m9.d;
import o8.q;
import r8.g;
import y8.p;

/* compiled from: Builders.kt */
class c<T> extends d<T> {

    /* renamed from: k  reason: collision with root package name */
    private final p<k9.p<? super T>, r8.d<? super q>, Object> f15655k;

    public c(p<? super k9.p<? super T>, ? super r8.d<? super q>, ? extends Object> pVar, g gVar, int i10, a aVar) {
        super(gVar, i10, aVar);
        this.f15655k = pVar;
    }

    static /* synthetic */ <T> Object g(c<T> cVar, k9.p<? super T> pVar, r8.d<? super q> dVar) {
        Object invoke = cVar.f15655k.invoke(pVar, dVar);
        return invoke == d.c() ? invoke : q.f16189a;
    }

    /* access modifiers changed from: protected */
    public Object c(k9.p<? super T> pVar, r8.d<? super q> dVar) {
        return g(this, pVar, dVar);
    }

    public String toString() {
        return "block[" + this.f15655k + "] -> " + super.toString();
    }
}
