package t2;

import a3.k;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.bumptech.glide.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RequestManagerRetriever */
public class l implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    private static final b f11613p = new a();

    /* renamed from: h  reason: collision with root package name */
    private volatile h f11614h;

    /* renamed from: i  reason: collision with root package name */
    final Map<FragmentManager, k> f11615i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    final Map<n, o> f11616j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Handler f11617k;

    /* renamed from: l  reason: collision with root package name */
    private final b f11618l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f11619m = new androidx.collection.a<>();

    /* renamed from: n  reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f11620n = new androidx.collection.a<>();

    /* renamed from: o  reason: collision with root package name */
    private final Bundle f11621o = new Bundle();

    /* compiled from: RequestManagerRetriever */
    class a implements b {
        a() {
        }

        public h a(com.bumptech.glide.b bVar, h hVar, m mVar, Context context) {
            return new h(bVar, hVar, mVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever */
    public interface b {
        h a(com.bumptech.glide.b bVar, h hVar, m mVar, Context context);
    }

    public l(b bVar) {
        this.f11618l = bVar == null ? f11613p : bVar;
        this.f11617k = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private h c(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        k i10 = i(fragmentManager, fragment, z10);
        h e10 = i10.e();
        if (e10 != null) {
            return e10;
        }
        h a10 = this.f11618l.a(com.bumptech.glide.b.c(context), i10.c(), i10.f(), context);
        i10.k(a10);
        return a10;
    }

    private h g(Context context) {
        if (this.f11614h == null) {
            synchronized (this) {
                if (this.f11614h == null) {
                    this.f11614h = this.f11618l.a(com.bumptech.glide.b.c(context.getApplicationContext()), new b(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.f11614h;
    }

    private k i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f11615i.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.j(fragment);
            if (z10) {
                kVar.c().d();
            }
            this.f11615i.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f11617k.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    private o k(n nVar, Fragment fragment, boolean z10) {
        o oVar = (o) nVar.i0("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f11616j.get(nVar)) == null) {
            oVar = new o();
            oVar.k(fragment);
            if (z10) {
                oVar.c().d();
            }
            this.f11616j.put(nVar, oVar);
            nVar.m().d(oVar, "com.bumptech.glide.manager").g();
            this.f11617k.obtainMessage(2, nVar).sendToTarget();
        }
        return oVar;
    }

    private static boolean l(Context context) {
        Activity b10 = b(context);
        return b10 == null || !b10.isFinishing();
    }

    private h m(Context context, n nVar, Fragment fragment, boolean z10) {
        o k10 = k(nVar, fragment, z10);
        h e10 = k10.e();
        if (e10 != null) {
            return e10;
        }
        h a10 = this.f11618l.a(com.bumptech.glide.b.c(context), k10.c(), k10.f(), context);
        k10.l(a10);
        return a10;
    }

    public h d(Activity activity) {
        if (k.p()) {
            return e(activity.getApplicationContext());
        }
        a(activity);
        return c(activity, activity.getFragmentManager(), (android.app.Fragment) null, l(activity));
    }

    public h e(Context context) {
        if (context != null) {
            if (k.q() && !(context instanceof Application)) {
                if (context instanceof e) {
                    return f((e) context);
                }
                if (context instanceof Activity) {
                    return d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return e(contextWrapper.getBaseContext());
                    }
                }
            }
            return g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public h f(e eVar) {
        if (k.p()) {
            return e(eVar.getApplicationContext());
        }
        a(eVar);
        return m(eVar, eVar.getSupportFragmentManager(), (Fragment) null, l(eVar));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public k h(Activity activity) {
        return i(activity.getFragmentManager(), (android.app.Fragment) null, l(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10 = message.what;
        Object obj4 = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f11615i.remove(obj3);
        } else if (i10 != 2) {
            z10 = false;
            obj = null;
            if (z10 && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(obj);
            }
            return z10;
        } else {
            obj3 = (n) message.obj;
            obj2 = this.f11616j.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to remove expected request manager fragment, manager: ");
        sb2.append(obj);
        return z10;
    }

    /* access modifiers changed from: package-private */
    public o j(Context context, n nVar) {
        return k(nVar, (Fragment) null, l(context));
    }
}
