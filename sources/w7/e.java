package w7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod */
class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f16993a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16994b;

    /* renamed from: c  reason: collision with root package name */
    private final Class[] f16995c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.f16993a = cls;
        this.f16994b = str;
        this.f16995c = clsArr;
    }

    private Method a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f16994b;
        if (str == null) {
            return null;
        }
        Method b10 = b(cls, str, this.f16995c);
        if (b10 == null || (cls2 = this.f16993a) == null || cls2.isAssignableFrom(b10.getReturnType())) {
            return b10;
        }
        return null;
    }

    private static Method b(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object c(T t10, Object... objArr) {
        Method a10 = a(t10.getClass());
        if (a10 != null) {
            try {
                return a10.invoke(t10, objArr);
            } catch (IllegalAccessException e10) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a10);
                assertionError.initCause(e10);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f16994b + " not supported for object " + t10);
        }
    }

    public Object d(T t10, Object... objArr) {
        Method a10 = a(t10.getClass());
        if (a10 == null) {
            return null;
        }
        try {
            return a10.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object e(T t10, Object... objArr) {
        try {
            return d(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object f(T t10, Object... objArr) {
        try {
            return c(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean g(T t10) {
        return a(t10.getClass()) != null;
    }
}
