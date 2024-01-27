package androidx.core.view;

import android.os.Build;
import android.view.View;

/* compiled from: SoftwareKeyboardControllerCompat */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final c f2586a;

    /* compiled from: SoftwareKeyboardControllerCompat */
    private static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final View f2587a;

        a(View view) {
            this.f2587a = view;
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat */
    private static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private View f2588b;

        b(View view) {
            super(view);
            this.f2588b = view;
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat */
    private static class c {
        c() {
        }
    }

    public w(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f2586a = new b(view);
        } else if (i10 >= 20) {
            this.f2586a = new a(view);
        } else {
            this.f2586a = new c();
        }
    }
}
