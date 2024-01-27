package l9;

import o8.q;
import r8.d;
import y8.p;

/* compiled from: Builders.kt */
final class o<T> extends a<T> {

    /* renamed from: h  reason: collision with root package name */
    private final p<e<? super T>, d<? super q>, Object> f15693h;

    public o(p<? super e<? super T>, ? super d<? super q>, ? extends Object> pVar) {
        this.f15693h = pVar;
    }

    public Object a(e<? super T> eVar, d<? super q> dVar) {
        Object invoke = this.f15693h.invoke(eVar, dVar);
        return invoke == d.c() ? invoke : q.f16189a;
    }
}
