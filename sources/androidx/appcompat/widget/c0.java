package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.c;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
/* compiled from: DrawableUtils */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1026a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1027b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1028c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f1029d;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1029d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static boolean a(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i10 < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i10 < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a10 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a10)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof c) {
            return a(((c) drawable).b());
        } else {
            if (drawable instanceof i.c) {
                return a(((i.c) drawable).a());
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1026a);
        } else {
            drawable.setState(f1027b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f1029d != null) {
            try {
                Drawable p10 = a.p(drawable);
                Object invoke = p10.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(p10, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f1029d.getFields()) {
                        String name = field.getName();
                        char c10 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c10 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c10 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c10 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f1028c;
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
