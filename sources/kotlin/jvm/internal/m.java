package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics */
public class m {
    private m() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            p();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m(new NullPointerException(str + " must not be null")));
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static int h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int i(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = m.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void k() {
        u();
    }

    public static void l(int i10, String str) {
        u();
    }

    private static <T extends Throwable> T m(T t10) {
        return n(t10, m.class.getName());
    }

    static <T extends Throwable> T n(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String o(String str, Object obj) {
        return str + obj;
    }

    public static void p() {
        throw ((NullPointerException) m(new NullPointerException()));
    }

    public static void q(String str) {
        throw ((NullPointerException) m(new NullPointerException(str)));
    }

    public static void r() {
        throw ((KotlinNullPointerException) m(new KotlinNullPointerException()));
    }

    private static void s(String str) {
        throw ((IllegalArgumentException) m(new IllegalArgumentException(j(str))));
    }

    private static void t(String str) {
        throw ((NullPointerException) m(new NullPointerException(j(str))));
    }

    public static void u() {
        v("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void v(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void w(String str) {
        throw ((UninitializedPropertyAccessException) m(new UninitializedPropertyAccessException(str)));
    }

    public static void x(String str) {
        w("lateinit property " + str + " has not been initialized");
    }
}
