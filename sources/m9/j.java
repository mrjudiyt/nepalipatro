package m9;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import l9.e;
import r8.d;
import y8.q;

/* compiled from: SafeCollector.kt */
public final class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<e<Object>, Object, d<? super o8.q>, Object> f15770a;

    /* compiled from: SafeCollector.kt */
    /* synthetic */ class a extends kotlin.jvm.internal.j implements q<e<? super Object>, Object, d<? super o8.q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f15771h = new a();

        a() {
            super(3, e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: c */
        public final Object invoke(e<Object> eVar, Object obj, d<? super o8.q> dVar) {
            return eVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f15771h;
        m.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f15770a = (q) c0.b(aVar, 3);
    }
}
