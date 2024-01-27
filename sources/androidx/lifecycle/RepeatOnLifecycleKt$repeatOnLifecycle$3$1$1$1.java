package androidx.lifecycle;

import androidx.lifecycle.h;
import i9.l;
import i9.l0;
import i9.m0;
import i9.n0;
import i9.u1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.y;
import o8.l;
import o8.m;
import o8.q;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements k {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ h.a f3424h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ y<u1> f3425i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ l0 f3426j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ h.a f3427k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ l<q> f3428l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ r9.a f3429m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ p<l0, d<? super q>, Object> f3430n;

    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* compiled from: RepeatOnLifecycle.kt */
    static final class a extends k implements p<l0, d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        Object f3431h;

        /* renamed from: i  reason: collision with root package name */
        Object f3432i;

        /* renamed from: j  reason: collision with root package name */
        int f3433j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ r9.a f3434k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<l0, d<? super q>, Object> f3435l;

        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        /* compiled from: RepeatOnLifecycle.kt */
        static final class C0049a extends k implements p<l0, d<? super q>, Object> {

            /* renamed from: h  reason: collision with root package name */
            int f3436h;

            /* renamed from: i  reason: collision with root package name */
            private /* synthetic */ Object f3437i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ p<l0, d<? super q>, Object> f3438j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0049a(p<? super l0, ? super d<? super q>, ? extends Object> pVar, d<? super C0049a> dVar) {
                super(2, dVar);
                this.f3438j = pVar;
            }

            public final d<q> create(Object obj, d<?> dVar) {
                C0049a aVar = new C0049a(this.f3438j, dVar);
                aVar.f3437i = obj;
                return aVar;
            }

            public final Object invoke(l0 l0Var, d<? super q> dVar) {
                return ((C0049a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f3436h;
                if (i10 == 0) {
                    m.b(obj);
                    p<l0, d<? super q>, Object> pVar = this.f3438j;
                    this.f3436h = 1;
                    if (pVar.invoke((l0) this.f3437i, this) == c10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r9.a aVar, p<? super l0, ? super d<? super q>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3434k = aVar;
            this.f3435l = pVar;
        }

        public final d<q> create(Object obj, d<?> dVar) {
            return new a(this.f3434k, this.f3435l, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super q> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            r9.a aVar;
            r9.a aVar2;
            p<l0, d<? super q>, Object> pVar;
            Object c10 = d.c();
            int i10 = this.f3433j;
            if (i10 == 0) {
                m.b(obj);
                aVar2 = this.f3434k;
                pVar = this.f3435l;
                this.f3431h = aVar2;
                this.f3432i = pVar;
                this.f3433j = 1;
                if (aVar2.b((Object) null, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                pVar = (p) this.f3432i;
                m.b(obj);
                aVar2 = (r9.a) this.f3431h;
            } else if (i10 == 2) {
                aVar = (r9.a) this.f3431h;
                try {
                    m.b(obj);
                    q qVar = q.f16189a;
                    aVar.c((Object) null);
                    return qVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0049a aVar3 = new C0049a(pVar, (d<? super C0049a>) null);
                this.f3431h = aVar2;
                this.f3432i = null;
                this.f3433j = 2;
                if (m0.d(aVar3, this) == c10) {
                    return c10;
                }
                aVar = aVar2;
                q qVar2 = q.f16189a;
                aVar.c((Object) null);
                return qVar2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.c((Object) null);
                throw th;
            }
        }
    }

    public final void onStateChanged(m mVar, h.a aVar) {
        kotlin.jvm.internal.m.f(mVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.f(aVar, "event");
        if (aVar == this.f3424h) {
            this.f3425i.f15575h = i.d(this.f3426j, (g) null, (n0) null, new a(this.f3429m, this.f3430n, (d<? super a>) null), 3, (Object) null);
            return;
        }
        if (aVar == this.f3427k) {
            u1 u1Var = (u1) this.f3425i.f15575h;
            if (u1Var != null) {
                u1.a.a(u1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f3425i.f15575h = null;
        }
        if (aVar == h.a.ON_DESTROY) {
            l<q> lVar = this.f3428l;
            l.a aVar2 = o8.l.f16183h;
            lVar.resumeWith(o8.l.a(q.f16189a));
        }
    }
}
