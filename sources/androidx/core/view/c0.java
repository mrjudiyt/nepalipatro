package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import y.e;

/* compiled from: ViewGroupCompat */
public final class c0 {

    /* compiled from: ViewGroupCompat */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z10) {
            viewGroup.setTransitionGroup(z10);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(e.f12869d0);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && z.y(viewGroup) == null) ? false : true;
    }
}
