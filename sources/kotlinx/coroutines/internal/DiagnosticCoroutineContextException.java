package kotlinx.coroutines.internal;

import r8.g;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: h  reason: collision with root package name */
    private final transient g f15581h;

    public DiagnosticCoroutineContextException(g gVar) {
        this.f15581h = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f15581h.toString();
    }
}
