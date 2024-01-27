package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* compiled from: WindowMetricsCalculatorCompat.kt */
public final class y implements x {

    /* renamed from: b  reason: collision with root package name */
    public static final y f4674b = new y();

    /* renamed from: c  reason: collision with root package name */
    private static final String f4675c;

    static {
        String simpleName = y.class.getSimpleName();
        m.e(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f4675c = simpleName;
    }

    private y() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout g(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    private final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void j(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public v a(Activity activity) {
        Rect rect;
        m.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = b.f4599a.b(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            m.e(defaultDisplay, "display");
            Point i10 = i(defaultDisplay);
            rect = new Rect(0, 0, i10.x, i10.y);
        }
        return new v(rect);
    }

    public v b(Activity activity) {
        Rect rect;
        m.f(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rect = b.f4599a.a(activity);
        } else if (i10 >= 29) {
            rect = f(activity);
        } else if (i10 >= 28) {
            rect = e(activity);
        } else if (i10 >= 24) {
            rect = d(activity);
        } else {
            rect = c(activity);
        }
        return new v(rect);
    }

    public final Rect c(Activity activity) {
        int i10;
        m.f(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        m.e(defaultDisplay, "defaultDisplay");
        Point i11 = i(defaultDisplay);
        Rect rect = new Rect();
        int i12 = i11.x;
        if (i12 == 0 || (i10 = i11.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i12;
            rect.bottom = i10;
        }
        return rect;
    }

    public final Rect d(Activity activity) {
        m.f(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!a.f4598a.a(activity)) {
            m.e(defaultDisplay, "defaultDisplay");
            Point i10 = i(defaultDisplay);
            int h10 = h(activity);
            int i11 = rect.bottom;
            if (i11 + h10 == i10.y) {
                rect.bottom = i11 + h10;
            } else {
                int i12 = rect.right;
                if (i12 + h10 == i10.x) {
                    rect.right = i12 + h10;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect e(Activity activity) {
        DisplayCutout g10;
        m.f(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (a.f4598a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (NoSuchFieldException unused) {
            j(activity, rect);
        } catch (NoSuchMethodException unused2) {
            j(activity, rect);
        } catch (IllegalAccessException unused3) {
            j(activity, rect);
        } catch (InvocationTargetException unused4) {
            j(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        c cVar = c.f4600a;
        m.e(defaultDisplay, "currentDisplay");
        cVar.a(defaultDisplay, point);
        a aVar = a.f4598a;
        if (!aVar.a(activity)) {
            int h10 = h(activity);
            int i10 = rect.bottom;
            if (i10 + h10 == point.y) {
                rect.bottom = i10 + h10;
            } else {
                int i11 = rect.right;
                if (i11 + h10 == point.x) {
                    rect.right = i11 + h10;
                } else if (rect.left == h10) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (g10 = g(defaultDisplay)) != null) {
            int i12 = rect.left;
            d dVar = d.f4601a;
            if (i12 == dVar.b(g10)) {
                rect.left = 0;
            }
            if (point.x - rect.right == dVar.c(g10)) {
                rect.right += dVar.c(g10);
            }
            if (rect.top == dVar.d(g10)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == dVar.a(g10)) {
                rect.bottom += dVar.a(g10);
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect f(Activity activity) {
        m.f(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (NoSuchFieldException unused) {
            return e(activity);
        } catch (NoSuchMethodException unused2) {
            return e(activity);
        } catch (IllegalAccessException unused3) {
            return e(activity);
        } catch (InvocationTargetException unused4) {
            return e(activity);
        }
    }

    public final Point i(Display display) {
        m.f(display, "display");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            c.f4600a.a(display, point);
        } else {
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", new Class[]{Point.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, new Object[]{point});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return point;
    }
}
