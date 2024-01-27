package kotlinx.coroutines.flow.internal;

import i9.p0;
import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        if (p0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
