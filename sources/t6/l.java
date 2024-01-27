package t6;

import java.io.Writer;
import u6.n;
import y6.c;

/* compiled from: Streams */
public final class l {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return r6.m.f16369a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static r6.l a(y6.a r2) {
        /*
            r2.I0()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            r6.s<r6.l> r1 = u6.n.X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.b(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r6.l r2 = (r6.l) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r6.m r2 = r6.m.f16369a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.l.a(y6.a):r6.l");
    }

    public static void b(r6.l lVar, c cVar) {
        n.X.d(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams */
    private static final class a extends Writer {

        /* renamed from: h  reason: collision with root package name */
        private final Appendable f16550h;

        /* renamed from: i  reason: collision with root package name */
        private final C0284a f16551i = new C0284a();

        /* renamed from: t6.l$a$a  reason: collision with other inner class name */
        /* compiled from: Streams */
        static class C0284a implements CharSequence {

            /* renamed from: h  reason: collision with root package name */
            char[] f16552h;

            C0284a() {
            }

            public char charAt(int i10) {
                return this.f16552h[i10];
            }

            public int length() {
                return this.f16552h.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f16552h, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f16550h = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i10, int i11) {
            C0284a aVar = this.f16551i;
            aVar.f16552h = cArr;
            this.f16550h.append(aVar, i10, i11 + i10);
        }

        public void write(int i10) {
            this.f16550h.append((char) i10);
        }
    }
}
