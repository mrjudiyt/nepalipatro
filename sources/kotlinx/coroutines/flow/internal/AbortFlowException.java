package kotlinx.coroutines.flow.internal;

import i9.p0;
import java.util.concurrent.CancellationException;
import l9.e;

/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {

    /* renamed from: h  reason: collision with root package name */
    public final transient e<?> f15580h;

    public AbortFlowException(e<?> eVar) {
        super("Flow was aborted, no more elements needed");
        this.f15580h = eVar;
    }

    public Throwable fillInStackTrace() {
        if (p0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
