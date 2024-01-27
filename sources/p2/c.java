package p2;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource */
final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    static h2.c<Drawable> e(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    public void a() {
    }

    public int b() {
        return Math.max(1, this.f10466h.getIntrinsicWidth() * this.f10466h.getIntrinsicHeight() * 4);
    }

    public Class<Drawable> c() {
        return this.f10466h.getClass();
    }
}
