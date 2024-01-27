package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* compiled from: DebugMetadata.kt */
final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f15548a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f15549b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    private static a f15550c;

    /* compiled from: DebugMetadata.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f15551a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f15552b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f15553c;

        public a(Method method, Method method2, Method method3) {
            this.f15551a = method;
            this.f15552b = method2;
            this.f15553c = method3;
        }
    }

    private i() {
    }

    private final a a(a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f15550c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f15549b;
            f15550c = aVar3;
            return aVar3;
        }
    }

    public final String b(a aVar) {
        m.f(aVar, "continuation");
        a aVar2 = f15550c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f15549b) {
            return null;
        }
        Method method = aVar2.f15551a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f15552b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f15553c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
