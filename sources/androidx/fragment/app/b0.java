package androidx.fragment.app;

import java.io.Writer;

/* compiled from: LogWriter */
final class b0 extends Writer {

    /* renamed from: h  reason: collision with root package name */
    private final String f3100h;

    /* renamed from: i  reason: collision with root package name */
    private StringBuilder f3101i = new StringBuilder(128);

    b0(String str) {
        this.f3100h = str;
    }

    private void a() {
        if (this.f3101i.length() > 0) {
            this.f3101i.toString();
            StringBuilder sb = this.f3101i;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f3101i.append(c10);
            }
        }
    }
}
