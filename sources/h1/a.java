package h1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f8932a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f8933b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f8934c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f8935d;

    @SuppressLint({"NewApi"})
    public static void a(String str, int i10) {
        try {
            if (f8934c == null) {
                c.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f8934c == null) {
                    f8934c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f8934c.invoke((Object) null, new Object[]{Long.valueOf(f8932a), str, Integer.valueOf(i10)});
            } catch (Exception e10) {
                g("asyncTraceBegin", e10);
            }
        }
    }

    public static void c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            b.a(str);
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(String str, int i10) {
        try {
            if (f8935d == null) {
                c.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f8935d == null) {
                    f8935d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f8935d.invoke((Object) null, new Object[]{Long.valueOf(f8932a), str, Integer.valueOf(i10)});
            } catch (Exception e10) {
                g("asyncTraceEnd", e10);
            }
        }
    }

    public static void f() {
        if (Build.VERSION.SDK_INT >= 18) {
            b.b();
        }
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f8933b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f8933b == null) {
                    f8932a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f8933b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f8933b.invoke((Object) null, new Object[]{Long.valueOf(f8932a)})).booleanValue();
            } catch (Exception e10) {
                g("isTagEnabled", e10);
            }
        }
        return false;
    }
}
