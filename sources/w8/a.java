package w8;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;

/* compiled from: IOStreams.kt */
public final class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i10) {
        m.f(inputStream, "<this>");
        m.f(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }
}
