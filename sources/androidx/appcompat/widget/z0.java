package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources */
public class z0 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1339b = false;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f1340a;

    public z0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1340a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1339b;
    }

    public static boolean b() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    public final Drawable c(int i10) {
        return super.getDrawable(i10);
    }

    public Drawable getDrawable(int i10) {
        Context context = (Context) this.f1340a.get();
        if (context != null) {
            return k0.h().t(context, this, i10);
        }
        return super.getDrawable(i10);
    }
}
