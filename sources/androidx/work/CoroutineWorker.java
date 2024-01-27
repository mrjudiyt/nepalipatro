package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.facebook.internal.NativeProtocol;
import com.google.common.util.concurrent.e;
import i9.a1;
import i9.g0;
import i9.l0;
import i9.m0;
import i9.n0;
import i9.u1;
import i9.x;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    private final x f4676a = y1.b((u1) null, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<ListenableWorker.a> f4677b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f4678c;

    /* compiled from: CoroutineWorker.kt */
    static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4679h;

        a(CoroutineWorker coroutineWorker) {
            this.f4679h = coroutineWorker;
        }

        public final void run() {
            if (this.f4679h.g().isCancelled()) {
                u1.a.a(this.f4679h.h(), (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @f(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    static final class b extends k implements p<l0, d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        Object f4680h;

        /* renamed from: i  reason: collision with root package name */
        int f4681i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<g> f4682j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4683k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l<g> lVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f4682j = lVar;
            this.f4683k = coroutineWorker;
        }

        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.f4682j, this.f4683k, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super q> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            l<g> lVar;
            Object c10 = d.c();
            int i10 = this.f4681i;
            if (i10 == 0) {
                m.b(obj);
                l<g> lVar2 = this.f4682j;
                CoroutineWorker coroutineWorker = this.f4683k;
                this.f4680h = lVar2;
                this.f4681i = 1;
                Object d10 = coroutineWorker.d(this);
                if (d10 == c10) {
                    return c10;
                }
                lVar = lVar2;
                obj = d10;
            } else if (i10 == 1) {
                lVar = (l) this.f4680h;
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar.b(obj);
            return q.f16189a;
        }
    }

    @f(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* compiled from: CoroutineWorker.kt */
    static final class c extends k implements p<l0, d<? super q>, Object> {

        /* renamed from: h  reason: collision with root package name */
        int f4684h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f4685i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CoroutineWorker coroutineWorker, d<? super c> dVar) {
            super(2, dVar);
            this.f4685i = coroutineWorker;
        }

        public final d<q> create(Object obj, d<?> dVar) {
            return new c(this.f4685i, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super q> dVar) {
            return ((c) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f4684h;
            if (i10 == 0) {
                m.b(obj);
                CoroutineWorker coroutineWorker = this.f4685i;
                this.f4684h = 1;
                obj = coroutineWorker.a(this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    m.b(obj);
                } catch (Throwable th) {
                    this.f4685i.g().p(th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f4685i.g().o((ListenableWorker.a) obj);
            return q.f16189a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.m.f(context, "appContext");
        kotlin.jvm.internal.m.f(workerParameters, NativeProtocol.WEB_DIALOG_PARAMS);
        androidx.work.impl.utils.futures.c<ListenableWorker.a> s10 = androidx.work.impl.utils.futures.c.s();
        kotlin.jvm.internal.m.e(s10, "create()");
        this.f4677b = s10;
        s10.addListener(new a(this), getTaskExecutor().c());
        this.f4678c = a1.a();
    }

    static /* synthetic */ Object f(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object a(d<? super ListenableWorker.a> dVar);

    public g0 c() {
        return this.f4678c;
    }

    public Object d(d<? super g> dVar) {
        return f(this, dVar);
    }

    public final androidx.work.impl.utils.futures.c<ListenableWorker.a> g() {
        return this.f4677b;
    }

    public final e<g> getForegroundInfoAsync() {
        x b10 = y1.b((u1) null, 1, (Object) null);
        l0 a10 = m0.a(c().Y(b10));
        l lVar = new l(b10, (androidx.work.impl.utils.futures.c) null, 2, (g) null);
        u1 unused = i.d(a10, (r8.g) null, (n0) null, new b(lVar, this, (d<? super b>) null), 3, (Object) null);
        return lVar;
    }

    public final x h() {
        return this.f4676a;
    }

    public final void onStopped() {
        super.onStopped();
        this.f4677b.cancel(false);
    }

    public final e<ListenableWorker.a> startWork() {
        u1 unused = i.d(m0.a(c().Y(this.f4676a)), (r8.g) null, (n0) null, new c(this, (d<? super c>) null), 3, (Object) null);
        return this.f4677b;
    }
}
