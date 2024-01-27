package fa;

import ea.b;
import ea.e;
import kotlin.jvm.internal.m;

/* compiled from: Buffer.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f14673a = b.a("0123456789abcdef");

    public static final byte[] a() {
        return f14673a;
    }

    public static final String b(e eVar, long j10) {
        m.g(eVar, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.W(j11) == ((byte) 13)) {
                String r02 = eVar.r0(j11);
                eVar.skip(2);
                return r02;
            }
        }
        String r03 = eVar.r0(j10);
        eVar.skip(1);
        return r03;
    }
}
