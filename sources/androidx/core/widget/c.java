package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Field f2666a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2667b;

    /* compiled from: CompoundButtonCompat */
    static class a {
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat */
    static class b {
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(compoundButton);
        }
        if (!f2667b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2666a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2667b = true;
        }
        Field field = f2666a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f2666a = null;
            }
        }
        return null;
    }

    public static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.c(compoundButton, colorStateList);
        } else if (compoundButton instanceof j) {
            ((j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            a.d(compoundButton, mode);
        } else if (compoundButton instanceof j) {
            ((j) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
