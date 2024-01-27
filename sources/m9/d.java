package m9;

import i9.l0;
import i9.m0;
import i9.n0;
import i9.p0;
import i9.q0;
import java.util.ArrayList;
import k9.n;
import k9.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import l9.e;
import o8.m;
import o8.q;
import r8.g;
import r8.h;
import y8.l;
import y8.p;

/* compiled from: ChannelFlow.kt */
public abstract class d<T> implements l9.d {

    /* renamed from: h  reason: collision with root package name */
    public final g f15747h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15748i;

    /* renamed from: j  reason: collision with root package name */
    public final k9.a f15749j;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class a extends k implements p<l0, r8.d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f15750h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f15751i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e<T> f15752j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d<T> f15753k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e<? super T> eVar, d<T> dVar, r8.d<? super a> dVar2) {
            super(2, dVar2);
            this.f15752j = eVar;
            this.f15753k = dVar;
        }

        public final r8.d<q> create(Object obj, r8.d<?> dVar) {
            a aVar = new a(this.f15752j, this.f15753k, dVar);
            aVar.f15751i = obj;
            return aVar;
        }

        public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f15750h;
            if (i10 == 0) {
                m.b(obj);
                e<T> eVar = this.f15752j;
                r<T> f10 = this.f15753k.f((l0) this.f15751i);
                this.f15750h = 1;
                if (l9.f.e(eVar, f10, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return q.f16189a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* compiled from: ChannelFlow.kt */
    static final class b extends k implements p<k9.p<? super T>, r8.d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f15754h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f15755i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ d<T> f15756j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, r8.d<? super b> dVar2) {
            super(2, dVar2);
            this.f15756j = dVar;
        }

        public final r8.d<q> create(Object obj, r8.d<?> dVar) {
            b bVar = new b(this.f15756j, dVar);
            bVar.f15755i = obj;
            return bVar;
        }

        public final Object invoke(k9.p<? super T> pVar, r8.d<? super q> dVar) {
            return ((b) create(pVar, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f15754h;
            if (i10 == 0) {
                m.b(obj);
                d<T> dVar = this.f15756j;
                this.f15754h = 1;
                if (dVar.c((k9.p) this.f15755i, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return q.f16189a;
        }
    }

    public d(g gVar, int i10, k9.a aVar) {
        this.f15747h = gVar;
        this.f15748i = i10;
        this.f15749j = aVar;
        if (p0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
    }

    static /* synthetic */ <T> Object b(d<T> dVar, e<? super T> eVar, r8.d<? super q> dVar2) {
        Object d10 = m0.d(new a(eVar, dVar, (r8.d<? super a>) null), dVar2);
        return d10 == d.c() ? d10 : q.f16189a;
    }

    /* access modifiers changed from: protected */
    public String a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object c(k9.p<? super T> pVar, r8.d<? super q> dVar);

    public Object collect(e<? super T> eVar, r8.d<? super q> dVar) {
        return b(this, eVar, dVar);
    }

    public final p<k9.p<? super T>, r8.d<? super q>, Object> d() {
        return new b(this, (r8.d<? super b>) null);
    }

    public final int e() {
        int i10 = this.f15748i;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public r<T> f(l0 l0Var) {
        return n.c(l0Var, this.f15747h, e(), this.f15749j, n0.ATOMIC, (l) null, d(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String a10 = a();
        if (a10 != null) {
            arrayList.add(a10);
        }
        if (this.f15747h != h.f16410h) {
            arrayList.add("context=" + this.f15747h);
        }
        if (this.f15748i != -3) {
            arrayList.add("capacity=" + this.f15748i);
        }
        if (this.f15749j != k9.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f15749j);
        }
        return q0.a(this) + '[' + x.D(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ']';
    }
}
