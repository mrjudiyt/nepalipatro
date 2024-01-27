package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator */
final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f2090a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f2091b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f2092c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f2093d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f2094e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f2095f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f2096g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C0024d f2097h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f2098i;

        a(C0024d dVar, Object obj) {
            this.f2097h = dVar;
            this.f2098i = obj;
        }

        public void run() {
            this.f2097h.f2103h = this.f2098i;
        }
    }

    /* compiled from: ActivityRecreator */
    class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Application f2099h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C0024d f2100i;

        b(Application application, C0024d dVar) {
            this.f2099h = application;
            this.f2100i = dVar;
        }

        public void run() {
            this.f2099h.unregisterActivityLifecycleCallbacks(this.f2100i);
        }
    }

    /* compiled from: ActivityRecreator */
    class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f2101h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f2102i;

        c(Object obj, Object obj2) {
            this.f2101h = obj;
            this.f2102i = obj2;
        }

        public void run() {
            try {
                Method method = d.f2093d;
                if (method != null) {
                    method.invoke(this.f2101h, new Object[]{this.f2102i, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f2094e.invoke(this.f2101h, new Object[]{this.f2102i, Boolean.FALSE});
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    private static final class C0024d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: h  reason: collision with root package name */
        Object f2103h;

        /* renamed from: i  reason: collision with root package name */
        private Activity f2104i;

        /* renamed from: j  reason: collision with root package name */
        private final int f2105j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2106k = false;

        /* renamed from: l  reason: collision with root package name */
        private boolean f2107l = false;

        /* renamed from: m  reason: collision with root package name */
        private boolean f2108m = false;

        C0024d(Activity activity) {
            this.f2104i = activity;
            this.f2105j = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2104i == activity) {
                this.f2104i = null;
                this.f2107l = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2107l && !this.f2108m && !this.f2106k && d.h(this.f2103h, this.f2105j, activity)) {
                this.f2108m = true;
                this.f2103h = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2104i == activity) {
                this.f2106k = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f2090a = a10;
        f2093d = d(a10);
        f2094e = c(a10);
        f2095f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2092c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f2096g.postAtFrontOfQueue(new c(f2091b.get(activity), obj2));
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0024d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f2095f == null) {
            return false;
        } else {
            if (f2094e == null && f2093d == null) {
                return false;
            }
            try {
                Object obj2 = f2092c.get(activity);
                if (obj2 == null || (obj = f2091b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0024d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f2096g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f2095f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
