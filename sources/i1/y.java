package i1;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14 */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f9218a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f9219b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f9220c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f9221d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9222e;

    /* compiled from: ViewGroupUtilsApi14 */
    class a extends LayoutTransition {
        a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    private static void a(LayoutTransition layoutTransition) {
        if (!f9222e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f9221d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f9222e = true;
        }
        Method method = f9221d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z10) {
        boolean z11 = false;
        if (f9218a == null) {
            a aVar = new a();
            f9218a = aVar;
            aVar.setAnimator(2, (Animator) null);
            f9218a.setAnimator(0, (Animator) null);
            f9218a.setAnimator(1, (Animator) null);
            f9218a.setAnimator(3, (Animator) null);
            f9218a.setAnimator(4, (Animator) null);
        }
        if (z10) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != f9218a) {
                    viewGroup.setTag(j.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f9218a);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition) null);
        if (!f9220c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f9219b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f9220c = true;
        }
        Field field = f9219b;
        if (field != null) {
            try {
                boolean z12 = field.getBoolean(viewGroup);
                if (z12) {
                    try {
                        f9219b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z11 = z12;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z11) {
            viewGroup.requestLayout();
        }
        int i10 = j.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i10);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i10, (Object) null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
