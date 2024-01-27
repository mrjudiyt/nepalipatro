package i1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
class g0 extends f0 {

    /* renamed from: i  reason: collision with root package name */
    private static boolean f9137i = true;

    g0() {
    }

    @SuppressLint({"NewApi"})
    public void g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i10);
        } else if (f9137i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f9137i = false;
            }
        }
    }
}
