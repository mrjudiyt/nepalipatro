package i1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18 */
class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f9080a;

    a0(View view) {
        this.f9080a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f9080a.add(drawable);
    }

    public void b(Drawable drawable) {
        this.f9080a.remove(drawable);
    }
}
