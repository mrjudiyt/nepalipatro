package l1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator */
public class n {

    /* compiled from: WebViewGlueCommunicator */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final q f9864a = new q(n.d().getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final o f9865a = n.a();
    }

    static o a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new h();
        }
        try {
            return new p((WebViewProviderFactoryBoundaryInterface) ga.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        } catch (ClassNotFoundException unused) {
            return new h();
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static q c() {
        return a.f9864a;
    }

    public static o d() {
        return b.f9865a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return f.b();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        }
    }
}
