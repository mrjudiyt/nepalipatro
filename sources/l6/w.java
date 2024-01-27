package l6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Throwables */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15640a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f15641b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f15642c;

    static {
        Method method;
        Object b10 = b();
        f15640a = b10;
        Method method2 = null;
        if (b10 == null) {
            method = null;
        } else {
            method = a();
        }
        f15641b = method;
        if (b10 != null) {
            method2 = d(b10);
        }
        f15642c = method2;
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) {
        try {
            Method c10 = c("getStackTraceDepth", Throwable.class);
            if (c10 == null) {
                return null;
            }
            c10.invoke(obj, new Object[]{new Throwable()});
            return c10;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void e(Throwable th) {
        p.j(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
