package i1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
class e0 extends d0 {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f9134f = true;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f9135g = true;

    e0() {
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f9134f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f9134f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f9135g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f9135g = false;
            }
        }
    }
}
