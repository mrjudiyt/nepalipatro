package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.jvm.internal.m;

/* compiled from: DisplayCompatHelper.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4601a = new d();

    private d() {
    }

    public final int a(DisplayCutout displayCutout) {
        m.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        m.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        m.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        m.f(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
