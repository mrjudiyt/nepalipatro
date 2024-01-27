package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat */
public final class d {

    /* compiled from: BundleCompat */
    static class a {
        static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* compiled from: BundleCompat */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f2382a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2383b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f2384c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2385d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f2383b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2382a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2383b = true;
            }
            Method method2 = f2382a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2382a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2385d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2384c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2385d = true;
            }
            Method method2 = f2384c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f2384c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return a.a(bundle, str);
        }
        return b.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.b(bundle, str, iBinder);
        } else {
            b.b(bundle, str, iBinder);
        }
    }
}
