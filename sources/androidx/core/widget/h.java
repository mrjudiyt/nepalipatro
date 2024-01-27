package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.d;
import androidx.core.view.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2669a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2670b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2671c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2672d;

    /* compiled from: PopupWindowCompat */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.c(popupWindow, z10);
        } else if (i10 >= 21) {
            if (!f2672d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2671c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f2672d = true;
            }
            Field field = f2671c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z10));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i10);
            return;
        }
        if (!f2670b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2669a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2670b = true;
        }
        Method method = f2669a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i10)});
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(popupWindow, view, i10, i11, i12);
            return;
        }
        if ((d.a(i12, z.t(view)) & 7) == 5) {
            i10 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i10, i11);
    }
}
