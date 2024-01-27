package w8;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.m;

/* compiled from: ReadWrite.kt */
public final class k {
    public static final long a(Reader reader, Writer writer, int i10) {
        m.f(reader, "<this>");
        m.f(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += (long) read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final String c(Reader reader) {
        m.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        m.e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
