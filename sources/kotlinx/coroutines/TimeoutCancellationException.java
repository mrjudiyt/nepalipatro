package kotlinx.coroutines;

import i9.e0;
import i9.u1;
import java.util.concurrent.CancellationException;

/* compiled from: Timeout.kt */
public final class TimeoutCancellationException extends CancellationException implements e0<TimeoutCancellationException> {

    /* renamed from: h  reason: collision with root package name */
    public final transient u1 f15579h;

    public TimeoutCancellationException(String str, u1 u1Var) {
        super(str);
        this.f15579h = u1Var;
    }

    /* renamed from: b */
    public TimeoutCancellationException a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f15579h);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
