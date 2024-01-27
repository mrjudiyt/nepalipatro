package k9;

import i9.l0;
import k9.h;
import kotlin.coroutines.jvm.internal.f;
import o8.l;
import o8.m;
import o8.q;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: Channels.kt */
final /* synthetic */ class k {

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    /* compiled from: Channels.kt */
    static final class a extends kotlin.coroutines.jvm.internal.k implements p<l0, d<? super h<? extends q>>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f15534h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f15535i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s<E> f15536j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ E f15537k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s<? super E> sVar, E e10, d<? super a> dVar) {
            super(2, dVar);
            this.f15536j = sVar;
            this.f15537k = e10;
        }

        public final d<q> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f15536j, this.f15537k, dVar);
            aVar.f15535i = obj;
            return aVar;
        }

        public final Object invoke(l0 l0Var, d<? super h<q>> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object c10 = d.c();
            int i10 = this.f15534h;
            if (i10 == 0) {
                m.b(obj);
                l0 l0Var = (l0) this.f15535i;
                s<E> sVar = this.f15536j;
                E e10 = this.f15537k;
                l.a aVar = l.f16183h;
                this.f15534h = 1;
                if (sVar.c(e10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    m.b(obj);
                } catch (Throwable th) {
                    l.a aVar2 = l.f16183h;
                    obj2 = l.a(m.a(th));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = l.a(q.f16189a);
            if (l.d(obj2)) {
                obj3 = h.f15528b.c(q.f16189a);
            } else {
                obj3 = h.f15528b.a(l.b(obj2));
            }
            return h.b(obj3);
        }
    }

    public static final <E> Object a(s<? super E> sVar, E e10) {
        Object n10 = sVar.n(e10);
        if (n10 instanceof h.c) {
            return ((h) h.b((g) null, new a(sVar, e10, (d<? super a>) null), 1, (Object) null)).k();
        }
        q qVar = (q) n10;
        return h.f15528b.c(q.f16189a);
    }
}
