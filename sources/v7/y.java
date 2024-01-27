package v7;

import ea.g;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import w7.h;

/* compiled from: ResponseBody */
public abstract class y implements Closeable {
    private Charset h() {
        s q10 = q();
        return q10 != null ? q10.b(h.f17016c) : h.f17016c;
    }

    /* JADX INFO: finally extract failed */
    public final byte[] a() {
        long j10 = j();
        if (j10 <= 2147483647L) {
            g u10 = u();
            try {
                byte[] D = u10.D();
                h.c(u10);
                if (j10 == -1 || j10 == ((long) D.length)) {
                    return D;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                h.c(u10);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + j10);
        }
    }

    public void close() {
        u().close();
    }

    public abstract long j();

    public abstract s q();

    public abstract g u();

    public final String w() {
        return new String(a(), h().name());
    }
}
