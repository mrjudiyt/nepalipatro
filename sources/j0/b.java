package j0;

import g0.e;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: PreferenceDataStoreFactory.kt */
public final class b implements e<d> {

    /* renamed from: a  reason: collision with root package name */
    private final e<d> f9386a;

    @f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* compiled from: PreferenceDataStoreFactory.kt */
    static final class a extends k implements p<d, d<? super d>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f9387h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f9388i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<d, d<? super d>, Object> f9389j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super d, ? super d<? super d>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f9389j = pVar;
        }

        /* renamed from: a */
        public final Object invoke(d dVar, d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(q.f16189a);
        }

        public final d<q> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f9389j, dVar);
            aVar.f9388i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f9387h;
            if (i10 == 0) {
                m.b(obj);
                p<d, d<? super d>, Object> pVar = this.f9389j;
                this.f9387h = 1;
                obj = pVar.invoke((d) this.f9388i, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar = (d) obj;
            ((a) dVar).g();
            return dVar;
        }
    }

    public b(e<d> eVar) {
        kotlin.jvm.internal.m.f(eVar, "delegate");
        this.f9386a = eVar;
    }

    public Object a(p<? super d, ? super d<? super d>, ? extends Object> pVar, d<? super d> dVar) {
        return this.f9386a.a(new a(pVar, (d<? super a>) null), dVar);
    }

    public l9.d<d> getData() {
        return this.f9386a.getData();
    }
}
