package i1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.z;

/* compiled from: ViewUtils */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f9108a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f9109b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property<View, Rect> f9110c = new b(Rect.class, "clipBounds");

    /* compiled from: ViewUtils */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f10) {
            c0.g(view, f10.floatValue());
        }
    }

    /* compiled from: ViewUtils */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return z.o(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            z.W(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f9108a = new h0();
        } else if (i10 >= 23) {
            f9108a = new g0();
        } else if (i10 >= 22) {
            f9108a = new f0();
        } else if (i10 >= 21) {
            f9108a = new e0();
        } else if (i10 >= 19) {
            f9108a = new d0();
        } else {
            f9108a = new i0();
        }
    }

    static void a(View view) {
        f9108a.a(view);
    }

    static b0 b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new a0(view);
        }
        return z.e(view);
    }

    static float c(View view) {
        return f9108a.c(view);
    }

    static m0 d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new l0(view);
        }
        return new k0(view.getWindowToken());
    }

    static void e(View view) {
        f9108a.d(view);
    }

    static void f(View view, int i10, int i11, int i12, int i13) {
        f9108a.e(view, i10, i11, i12, i13);
    }

    static void g(View view, float f10) {
        f9108a.f(view, f10);
    }

    static void h(View view, int i10) {
        f9108a.g(view, i10);
    }

    static void i(View view, Matrix matrix) {
        f9108a.h(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f9108a.i(view, matrix);
    }
}
