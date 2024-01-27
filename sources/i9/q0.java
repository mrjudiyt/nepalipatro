package i9;

import n9.k;
import o8.l;
import o8.m;
import r8.d;

/* compiled from: DebugStrings.kt */
public final class q0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        Object obj;
        if (dVar instanceof k) {
            return dVar.toString();
        }
        try {
            l.a aVar = l.f16183h;
            obj = l.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            l.a aVar2 = l.f16183h;
            obj = l.a(m.a(th));
        }
        Throwable b10 = l.b(obj);
        String str = obj;
        if (b10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
