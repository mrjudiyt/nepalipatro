package i1;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
class d0 extends i0 {

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9115e = true;

    d0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f9115e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f9115e = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    @SuppressLint({"NewApi"})
    public void f(View view, float f10) {
        if (f9115e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f9115e = false;
            }
        }
        view.setAlpha(f10);
    }
}
