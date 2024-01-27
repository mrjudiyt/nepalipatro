package w8;

import g9.d;
import java.io.File;
import java.nio.charset.Charset;

/* compiled from: FileReadWrite.kt */
class h extends g {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        w8.b.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.f(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.m.f(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = w8.k.c(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            w8.b.a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            w8.b.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.h.a(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String b(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = d.f14759b;
        }
        return a(file, charset);
    }
}
