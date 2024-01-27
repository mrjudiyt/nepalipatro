package n9;

import i9.h0;
import i9.i0;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import r8.g;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
public final class i {
    public static final void a(g gVar, Throwable th) {
        for (h0 o02 : h.a()) {
            try {
                o02.o0(gVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                h.b(i0.b(th, th2));
            }
        }
        try {
            b.a(th, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        h.b(th);
    }
}
