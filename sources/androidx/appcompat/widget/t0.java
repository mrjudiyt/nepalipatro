package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
class t0 extends l0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1231b;

    public t0(Context context, Resources resources) {
        super(resources);
        this.f1231b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) {
        Drawable drawable = super.getDrawable(i10);
        Context context = (Context) this.f1231b.get();
        if (!(drawable == null || context == null)) {
            k0.h().x(context, i10, drawable);
        }
        return drawable;
    }
}
