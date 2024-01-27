package p2;

import a3.j;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import h2.c;

/* compiled from: DrawableResource */
public abstract class b<T extends Drawable> implements c<T>, h2.b {

    /* renamed from: h  reason: collision with root package name */
    protected final T f10466h;

    public b(T t10) {
        this.f10466h = (Drawable) j.d(t10);
    }

    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f10466h.getConstantState();
        if (constantState == null) {
            return this.f10466h;
        }
        return constantState.newDrawable();
    }

    public void initialize() {
        T t10 = this.f10466h;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof r2.c) {
            ((r2.c) t10).e().prepareToDraw();
        }
    }
}
