package n1;

import android.app.Activity;
import androidx.window.layout.q;
import androidx.window.layout.u;
import i9.l0;
import i9.m0;
import i9.m1;
import i9.n0;
import i9.u1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import l9.e;
import o8.m;
import r8.d;
import r8.g;
import y8.p;

/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    private final q f10250b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f10251c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private final Map<androidx.core.util.a<?>, u1> f10252d = new LinkedHashMap();

    @f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: n1.a$a  reason: collision with other inner class name */
    /* compiled from: WindowInfoTrackerCallbackAdapter.kt */
    static final class C0170a extends k implements p<l0, d<? super o8.q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f10253h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l9.d<T> f10254i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ androidx.core.util.a<T> f10255j;

        /* renamed from: n1.a$a$a  reason: collision with other inner class name */
        /* compiled from: Collect.kt */
        public static final class C0171a implements e<T> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f10256h;

            public C0171a(androidx.core.util.a aVar) {
                this.f10256h = aVar;
            }

            public Object emit(T t10, d<? super o8.q> dVar) {
                this.f10256h.accept(t10);
                return o8.q.f16189a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0170a(l9.d<? extends T> dVar, androidx.core.util.a<T> aVar, d<? super C0170a> dVar2) {
            super(2, dVar2);
            this.f10254i = dVar;
            this.f10255j = aVar;
        }

        public final d<o8.q> create(Object obj, d<?> dVar) {
            return new C0170a(this.f10254i, this.f10255j, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super o8.q> dVar) {
            return ((C0170a) create(l0Var, dVar)).invokeSuspend(o8.q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f10253h;
            if (i10 == 0) {
                m.b(obj);
                l9.d<T> dVar = this.f10254i;
                C0171a aVar = new C0171a(this.f10255j);
                this.f10253h = 1;
                if (dVar.collect(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return o8.q.f16189a;
        }
    }

    public a(q qVar) {
        kotlin.jvm.internal.m.f(qVar, "tracker");
        this.f10250b = qVar;
    }

    private final <T> void b(Executor executor, androidx.core.util.a<T> aVar, l9.d<? extends T> dVar) {
        ReentrantLock reentrantLock = this.f10251c;
        reentrantLock.lock();
        try {
            if (this.f10252d.get(aVar) == null) {
                this.f10252d.put(aVar, i.d(m0.a(m1.a(executor)), (g) null, (n0) null, new C0170a(dVar, aVar, (d<? super C0170a>) null), 3, (Object) null));
            }
            o8.q qVar = o8.q.f16189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void d(androidx.core.util.a<?> aVar) {
        ReentrantLock reentrantLock = this.f10251c;
        reentrantLock.lock();
        try {
            u1 u1Var = this.f10252d.get(aVar);
            if (u1Var != null) {
                u1.a.a(u1Var, (CancellationException) null, 1, (Object) null);
            }
            u1 remove = this.f10252d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public l9.d<u> a(Activity activity) {
        kotlin.jvm.internal.m.f(activity, "activity");
        return this.f10250b.a(activity);
    }

    public final void c(Activity activity, Executor executor, androidx.core.util.a<u> aVar) {
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(executor, "executor");
        kotlin.jvm.internal.m.f(aVar, "consumer");
        b(executor, aVar, this.f10250b.a(activity));
    }

    public final void e(androidx.core.util.a<u> aVar) {
        kotlin.jvm.internal.m.f(aVar, "consumer");
        d(aVar);
    }
}
