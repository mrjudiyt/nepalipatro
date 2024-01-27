package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener */
public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: h  reason: collision with root package name */
    private final View f2583h;

    /* renamed from: i  reason: collision with root package name */
    private ViewTreeObserver f2584i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f2585j;

    private v(View view, Runnable runnable) {
        this.f2583h = view;
        this.f2584i = view.getViewTreeObserver();
        this.f2585j = runnable;
    }

    public static v a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    public void b() {
        if (this.f2584i.isAlive()) {
            this.f2584i.removeOnPreDrawListener(this);
        } else {
            this.f2583h.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2583h.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f2585j.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2584i = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
