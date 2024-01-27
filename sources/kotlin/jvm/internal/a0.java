package kotlin.jvm.internal;

import e9.c;
import e9.d;
import e9.e;
import e9.f;
import e9.g;
import e9.h;

/* compiled from: ReflectionFactory */
public class a0 {
    public e a(i iVar) {
        return iVar;
    }

    public c b(Class cls) {
        return new e(cls);
    }

    public d c(Class cls, String str) {
        return new o(cls, str);
    }

    public f d(p pVar) {
        return pVar;
    }

    public g e(r rVar) {
        return rVar;
    }

    public h f(t tVar) {
        return tVar;
    }

    public String g(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(n nVar) {
        return g(nVar);
    }
}
