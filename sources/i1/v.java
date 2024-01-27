package i1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18 */
class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f9216a;

    v(ViewGroup viewGroup) {
        this.f9216a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f9216a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f9216a.remove(drawable);
    }

    public void c(View view) {
        this.f9216a.add(view);
    }

    public void d(View view) {
        this.f9216a.remove(view);
    }
}
