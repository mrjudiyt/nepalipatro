package s9;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import i9.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import o8.l;
import o8.m;
import o8.q;
import r8.d;

/* compiled from: Tasks.kt */
public final class b {

    /* compiled from: Tasks.kt */
    static final class a<TResult> implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<T> f16474a;

        a(l<? super T> lVar) {
            this.f16474a = lVar;
        }

        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                l<T> lVar = this.f16474a;
                l.a aVar = o8.l.f16183h;
                lVar.resumeWith(o8.l.a(m.a(exception)));
            } else if (task.isCanceled()) {
                l.a.a(this.f16474a, (Throwable) null, 1, (Object) null);
            } else {
                i9.l<T> lVar2 = this.f16474a;
                l.a aVar2 = o8.l.f16183h;
                lVar2.resumeWith(o8.l.a(task.getResult()));
            }
        }
    }

    /* renamed from: s9.b$b  reason: collision with other inner class name */
    /* compiled from: Tasks.kt */
    static final class C0281b extends n implements y8.l<Throwable, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f16475h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0281b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f16475h = cancellationTokenSource;
        }

        public final void a(Throwable th) {
            this.f16475h.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f16189a;
        }
    }

    public static final <T> Object a(Task<T> task, d<? super T> dVar) {
        return b(task, (CancellationTokenSource) null, dVar);
    }

    private static final <T> Object b(Task<T> task, CancellationTokenSource cancellationTokenSource, d<? super T> dVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            } else if (!task.isCanceled()) {
                return task.getResult();
            } else {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
        } else {
            i9.m mVar = new i9.m(c.b(dVar), 1);
            mVar.z();
            task.addOnCompleteListener((Executor) a.f16473h, (OnCompleteListener<T>) new a(mVar));
            if (cancellationTokenSource != null) {
                mVar.k(new C0281b(cancellationTokenSource));
            }
            Object w10 = mVar.w();
            if (w10 == d.c()) {
                h.c(dVar);
            }
            return w10;
        }
    }
}
