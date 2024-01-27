package i9;

import n9.i;
import r8.g;

/* compiled from: CoroutineExceptionHandler.kt */
public final class i0 {
    public static final void a(g gVar, Throwable th) {
        try {
            h0 h0Var = (h0) gVar.h(h0.f14946c);
            if (h0Var != null) {
                h0Var.o0(gVar, th);
            } else {
                i.a(gVar, th);
            }
        } catch (Throwable th2) {
            i.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        b.a(runtimeException, th);
        return runtimeException;
    }
}
