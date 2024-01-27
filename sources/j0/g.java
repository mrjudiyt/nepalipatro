package j0;

import g0.e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: Preferences.kt */
public final class g {

    @f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* compiled from: Preferences.kt */
    static final class a extends k implements p<d, d<? super d>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f9395h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f9396i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<a, d<? super q>, Object> f9397j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super a, ? super d<? super q>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f9397j = pVar;
        }

        /* renamed from: a */
        public final Object invoke(d dVar, d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(q.f16189a);
        }

        public final d<q> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f9397j, dVar);
            aVar.f9396i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f9395h;
            if (i10 == 0) {
                m.b(obj);
                a c11 = ((d) this.f9396i).c();
                p<a, d<? super q>, Object> pVar = this.f9397j;
                this.f9396i = c11;
                this.f9395h = 1;
                return pVar.invoke(c11, this) == c10 ? c10 : c11;
            } else if (i10 == 1) {
                a aVar = (a) this.f9396i;
                m.b(obj);
                return aVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(e<d> eVar, p<? super a, ? super d<? super q>, ? extends Object> pVar, d<? super d> dVar) {
        return eVar.a(new a(pVar, (d<? super a>) null), dVar);
    }
}
