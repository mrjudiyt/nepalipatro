package i9;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
public final class j1 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
