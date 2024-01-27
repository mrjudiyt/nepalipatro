package ea;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;

/* compiled from: JvmOkio.kt */
final class y extends d {

    /* renamed from: m  reason: collision with root package name */
    private final Logger f14407m = Logger.getLogger("okio.Okio");

    /* renamed from: n  reason: collision with root package name */
    private final Socket f14408n;

    public y(Socket socket) {
        m.g(socket, "socket");
        this.f14408n = socket;
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void x() {
        try {
            this.f14408n.close();
        } catch (Exception e10) {
            Logger logger = this.f14407m;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + this.f14408n, e10);
        } catch (AssertionError e11) {
            if (o.c(e11)) {
                Logger logger2 = this.f14407m;
                Level level2 = Level.WARNING;
                logger2.log(level2, "Failed to close timed out socket " + this.f14408n, e11);
                return;
            }
            throw e11;
        }
    }
}
