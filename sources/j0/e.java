package j0;

import j0.d;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PreferencesFactory.kt */
public final class e {
    public static final d a() {
        return new a((Map) null, true, 1, (g) null);
    }

    public static final a b(d.b<?>... bVarArr) {
        m.f(bVarArr, "pairs");
        a aVar = new a((Map) null, false, 1, (g) null);
        aVar.h((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}
