package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.jvm.internal.m;

/* compiled from: ActivityCompatHelper.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4599a = new b();

    private b() {
    }

    public final Rect a(Activity activity) {
        m.f(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        m.e(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect b(Activity activity) {
        m.f(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        m.e(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
