package k9;

import i9.j1;
import java.util.concurrent.CancellationException;

/* compiled from: Channels.common.kt */
final /* synthetic */ class l {
    public static final void a(r<?> rVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = j1.a("Channel was consumed, consumer had failed", th);
            }
        }
        rVar.j(cancellationException);
    }
}
