package kotlin.jvm.internal;

import e9.c;
import e9.d;
import e9.e;
import e9.f;
import e9.g;
import e9.h;

/* compiled from: Reflection */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final a0 f15576a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f15577b = new c[0];

    static {
        a0 a0Var = null;
        try {
            a0Var = (a0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a0Var == null) {
            a0Var = new a0();
        }
        f15576a = a0Var;
    }

    public static e a(i iVar) {
        return f15576a.a(iVar);
    }

    public static c b(Class cls) {
        return f15576a.b(cls);
    }

    public static d c(Class cls) {
        return f15576a.c(cls, "");
    }

    public static f d(p pVar) {
        return f15576a.d(pVar);
    }

    public static g e(r rVar) {
        return f15576a.e(rVar);
    }

    public static h f(t tVar) {
        return f15576a.f(tVar);
    }

    public static String g(h hVar) {
        return f15576a.g(hVar);
    }

    public static String h(n nVar) {
        return f15576a.h(nVar);
    }
}
