package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import kotlin.jvm.internal.m;

/* compiled from: DisplayCompatHelper.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4600a = new c();

    private c() {
    }

    public final void a(Display display, Point point) {
        m.f(display, "display");
        m.f(point, "point");
        display.getRealSize(point);
    }
}
