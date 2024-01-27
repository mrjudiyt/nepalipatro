package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class r0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1216c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<r0>> f1217d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1218a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1219b;

    private r0(Context context) {
        super(context);
        if (z0.b()) {
            z0 z0Var = new z0(this, context.getResources());
            this.f1218a = z0Var;
            Resources.Theme newTheme = z0Var.newTheme();
            this.f1219b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1218a = new t0(this, context.getResources());
        this.f1219b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof r0) || (context.getResources() instanceof t0) || (context.getResources() instanceof z0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || z0.b()) {
            return true;
        }
        return false;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1216c) {
            ArrayList<WeakReference<r0>> arrayList = f1217d;
            if (arrayList == null) {
                f1217d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1217d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1217d.remove(size);
                    }
                }
                for (int size2 = f1217d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1217d.get(size2);
                    r0 r0Var = weakReference2 != null ? (r0) weakReference2.get() : null;
                    if (r0Var != null && r0Var.getBaseContext() == context) {
                        return r0Var;
                    }
                }
            }
            r0 r0Var2 = new r0(context);
            f1217d.add(new WeakReference(r0Var2));
            return r0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1218a.getAssets();
    }

    public Resources getResources() {
        return this.f1218a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1219b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f1219b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
