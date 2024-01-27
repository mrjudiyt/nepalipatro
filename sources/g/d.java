package g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class d {

    /* renamed from: h  reason: collision with root package name */
    private static int f8535h = -100;

    /* renamed from: i  reason: collision with root package name */
    private static final b<WeakReference<d>> f8536i = new b<>();

    /* renamed from: j  reason: collision with root package name */
    private static final Object f8537j = new Object();

    d() {
    }

    static void c(d dVar) {
        synchronized (f8537j) {
            y(dVar);
            f8536i.add(new WeakReference(dVar));
        }
    }

    public static d g(Activity activity, c cVar) {
        return new e(activity, cVar);
    }

    public static d h(Dialog dialog, c cVar) {
        return new e(dialog, cVar);
    }

    public static int j() {
        return f8535h;
    }

    static void x(d dVar) {
        synchronized (f8537j) {
            y(dVar);
        }
    }

    private static void y(d dVar) {
        synchronized (f8537j) {
            Iterator<WeakReference<d>> it = f8536i.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i10);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public void D(int i10) {
    }

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i10);

    public int k() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i10);
}
