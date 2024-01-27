package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtils */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1006a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f1006a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f1006a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1006a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        return z.t(view) == 1;
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
