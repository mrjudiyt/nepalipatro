package ea;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.m;

/* compiled from: JvmOkio.kt */
final /* synthetic */ class p {
    public static final boolean a(AssertionError assertionError) {
        m.g(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? q.y(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final x b(File file, boolean z10) {
        m.g(file, "$this$sink");
        return o.e(new FileOutputStream(file, z10));
    }

    public static final x c(OutputStream outputStream) {
        m.g(outputStream, "$this$sink");
        return new r(outputStream, new a0());
    }

    public static final x d(Socket socket) {
        m.g(socket, "$this$sink");
        y yVar = new y(socket);
        OutputStream outputStream = socket.getOutputStream();
        m.b(outputStream, "getOutputStream()");
        return yVar.v(new r(outputStream, yVar));
    }

    public static /* synthetic */ x e(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return o.d(file, z10);
    }

    public static final z f(Socket socket) {
        m.g(socket, "$this$source");
        y yVar = new y(socket);
        InputStream inputStream = socket.getInputStream();
        m.b(inputStream, "getInputStream()");
        return yVar.w(new n(inputStream, yVar));
    }
}
