package ea;

import g9.d;
import kotlin.jvm.internal.m;

/* compiled from: -Platform.kt */
public final class b {
    public static final byte[] a(String str) {
        m.g(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(d.f14759b);
        m.b(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        m.g(bArr, "$this$toUtf8String");
        return new String(bArr, d.f14759b);
    }
}
