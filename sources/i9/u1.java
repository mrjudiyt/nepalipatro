package i9;

import java.util.concurrent.CancellationException;
import o8.q;
import r8.g;
import y8.l;
import y8.p;

/* compiled from: Job.kt */
public interface u1 extends g.b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f14995d = b.f14996h;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(u1 u1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                u1Var.j(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(u1 u1Var, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(u1Var, r10, pVar);
        }

        public static <E extends g.b> E c(u1 u1Var, g.c<E> cVar) {
            return g.b.a.b(u1Var, cVar);
        }

        public static /* synthetic */ b1 d(u1 u1Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return u1Var.c0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(u1 u1Var, g.c<?> cVar) {
            return g.b.a.c(u1Var, cVar);
        }

        public static g f(u1 u1Var, g gVar) {
            return g.b.a.d(u1Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements g.c<u1> {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ b f14996h = new b();

        private b() {
        }
    }

    CancellationException L();

    boolean a();

    b1 c0(boolean z10, boolean z11, l<? super Throwable, q> lVar);

    u1 getParent();

    boolean isCancelled();

    void j(CancellationException cancellationException);

    boolean start();

    r w0(t tVar);

    b1 y0(l<? super Throwable, q> lVar);
}
