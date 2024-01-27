package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: DisplayCutoutCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final DisplayCutout f2507a;

    /* compiled from: DisplayCutoutCompat */
    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private c(DisplayCutout displayCutout) {
        this.f2507a = displayCutout;
    }

    static c e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new c(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f2507a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f2507a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f2507a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f2507a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.c.a(this.f2507a, ((c) obj).f2507a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2507a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2507a + "}";
    }
}
