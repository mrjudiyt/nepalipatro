package v0;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.e;
import i9.t0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;
import y8.l;

/* compiled from: CoroutineAdapter.kt */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    static final class a extends n implements l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c.a<T> f12220h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ t0<T> f12221i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a<T> aVar, t0<? extends T> t0Var) {
            super(1);
            this.f12220h = aVar;
            this.f12221i = t0Var;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f12220h.b(this.f12221i.q());
            } else if (th instanceof CancellationException) {
                this.f12220h.c();
            } else {
                this.f12220h.e(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    public static final <T> e<T> b(t0<? extends T> t0Var, Object obj) {
        m.f(t0Var, "<this>");
        e<T> a10 = c.a(new a(t0Var, obj));
        m.e(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ e c(t0 t0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(t0Var, obj);
    }

    /* access modifiers changed from: private */
    public static final Object d(t0 t0Var, Object obj, c.a aVar) {
        m.f(t0Var, "$this_asListenableFuture");
        m.f(aVar, "completer");
        t0Var.y0(new a(aVar, t0Var));
        return obj;
    }
}
