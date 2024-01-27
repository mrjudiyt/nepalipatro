package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: ViewConfigurationCompat */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2506a;

    /* compiled from: ViewConfigurationCompat */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* compiled from: ViewConfigurationCompat */
    static class b {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2506a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    private static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2506a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static float c(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(viewConfiguration);
        }
        return a(viewConfiguration, context);
    }

    public static int d(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(viewConfiguration);
        }
        return a(viewConfiguration, context);
    }

    public static boolean f(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int b10 = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return b10 != 0 && resources.getBoolean(b10);
    }
}
