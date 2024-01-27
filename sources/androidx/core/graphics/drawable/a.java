package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: DrawableCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2336a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2337b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2338c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2339d;

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    /* compiled from: DrawableCompat */
    static class C0033a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* compiled from: DrawableCompat */
    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat */
    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.a(drawable, theme);
        }
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.b(drawable);
        }
        return false;
    }

    public static int c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0033a.a(drawable);
        }
        return 0;
    }

    public static ColorFilter d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.c(drawable);
        }
        return null;
    }

    public static int e(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return c.a(drawable);
        }
        if (i10 >= 17) {
            if (!f2339d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2338c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2339d = true;
            }
            Method method = f2338c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f2338c = null;
                }
            }
        }
        return 0;
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static boolean g(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0033a.d(drawable);
        }
        return false;
    }

    @Deprecated
    public static void h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void i(Drawable drawable, boolean z10) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0033a.e(drawable, z10);
        }
    }

    public static void j(Drawable drawable, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.e(drawable, f10, f11);
        }
    }

    public static void k(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.f(drawable, i10, i11, i12, i13);
        }
    }

    public static boolean l(Drawable drawable, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return c.b(drawable, i10);
        }
        if (i11 >= 17) {
            if (!f2337b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2336a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f2337b = true;
            }
            Method method = f2336a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i10)});
                    return true;
                } catch (Exception unused2) {
                    f2336a = null;
                }
            }
        }
        return false;
    }

    public static void m(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.g(drawable, i10);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(i10);
        }
    }

    public static void n(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.h(drawable, colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(colorStateList);
        }
    }

    public static void o(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            b.i(drawable, mode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(mode);
        }
    }

    public static <T extends Drawable> T p(Drawable drawable) {
        return drawable instanceof c ? ((c) drawable).b() : drawable;
    }

    public static Drawable q(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return drawable;
        }
        return i10 >= 21 ? !(drawable instanceof b) ? new e(drawable) : drawable : !(drawable instanceof b) ? new d(drawable) : drawable;
    }
}
