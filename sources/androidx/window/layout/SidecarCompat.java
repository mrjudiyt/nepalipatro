package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.g;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import m1.f;
import m1.h;
import o8.q;

/* compiled from: SidecarCompat.kt */
public final class SidecarCompat implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4579f = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final SidecarInterface f4580a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m f4581b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<IBinder, Activity> f4582c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Activity, ComponentCallbacks> f4583d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public g.a f4584e;

    /* compiled from: SidecarCompat.kt */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        private final m f4585a;

        /* renamed from: b  reason: collision with root package name */
        private final SidecarInterface.SidecarCallback f4586b;

        /* renamed from: c  reason: collision with root package name */
        private final ReentrantLock f4587c = new ReentrantLock();

        /* renamed from: d  reason: collision with root package name */
        private SidecarDeviceState f4588d;

        /* renamed from: e  reason: collision with root package name */
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f4589e = new WeakHashMap<>();

        public DistinctSidecarElementCallback(m mVar, SidecarInterface.SidecarCallback sidecarCallback) {
            m.f(mVar, "sidecarAdapter");
            m.f(sidecarCallback, "callbackInterface");
            this.f4585a = mVar;
            this.f4586b = sidecarCallback;
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            m.f(sidecarDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f4587c;
            reentrantLock.lock();
            try {
                if (!this.f4585a.a(this.f4588d, sidecarDeviceState)) {
                    this.f4588d = sidecarDeviceState;
                    this.f4586b.onDeviceStateChanged(sidecarDeviceState);
                    q qVar = q.f16189a;
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            m.f(iBinder, "token");
            m.f(sidecarWindowLayoutInfo, "newLayout");
            synchronized (this.f4587c) {
                if (!this.f4585a.d(this.f4589e.get(iBinder), sidecarWindowLayoutInfo)) {
                    SidecarWindowLayoutInfo put = this.f4589e.put(iBinder, sidecarWindowLayoutInfo);
                    this.f4586b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SidecarCompat f4590a;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            m.f(sidecarCompat, "this$0");
            this.f4590a = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g10;
            m.f(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = this.f4590a.f4582c.values();
            SidecarCompat sidecarCompat = this.f4590a;
            for (Activity activity : values) {
                IBinder a10 = SidecarCompat.f4579f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(a10 == null || (g10 = sidecarCompat.g()) == null)) {
                    sidecarWindowLayoutInfo = g10.getWindowLayoutInfo(a10);
                }
                g.a d10 = sidecarCompat.f4584e;
                if (d10 != null) {
                    d10.a(activity, sidecarCompat.f4581b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            m.f(iBinder, "windowToken");
            m.f(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) this.f4590a.f4582c.get(iBinder);
            if (activity != null) {
                m e10 = this.f4590a.f4581b;
                SidecarInterface g10 = this.f4590a.g();
                SidecarDeviceState deviceState = g10 == null ? null : g10.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                u e11 = e10.e(sidecarWindowLayoutInfo, deviceState);
                g.a d10 = this.f4590a.f4584e;
                if (d10 != null) {
                    d10.a(activity, e11);
                }
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            m.f(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final h c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return h.f10179m.b(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    private static final class b implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final g.a f4591a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f4592b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        private final WeakHashMap<Activity, u> f4593c = new WeakHashMap<>();

        public b(g.a aVar) {
            m.f(aVar, "callbackInterface");
            this.f4591a = aVar;
        }

        public void a(Activity activity, u uVar) {
            m.f(activity, "activity");
            m.f(uVar, "newLayout");
            ReentrantLock reentrantLock = this.f4592b;
            reentrantLock.lock();
            try {
                if (!m.a(uVar, this.f4593c.get(activity))) {
                    u put = this.f4593c.put(activity, uVar);
                    reentrantLock.unlock();
                    this.f4591a.a(activity, uVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    private static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: h  reason: collision with root package name */
        private final SidecarCompat f4594h;

        /* renamed from: i  reason: collision with root package name */
        private final WeakReference<Activity> f4595i;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            m.f(sidecarCompat, "sidecarCompat");
            m.f(activity, "activity");
            this.f4594h = sidecarCompat;
            this.f4595i = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(View view) {
            m.f(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f4595i.get();
            IBinder a10 = SidecarCompat.f4579f.a(activity);
            if (activity != null && a10 != null) {
                this.f4594h.i(a10, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            m.f(view, "view");
        }
    }

    /* compiled from: SidecarCompat.kt */
    public static final class d implements ComponentCallbacks {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ SidecarCompat f4596h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Activity f4597i;

        d(SidecarCompat sidecarCompat, Activity activity) {
            this.f4596h = sidecarCompat;
            this.f4597i = activity;
        }

        public void onConfigurationChanged(Configuration configuration) {
            m.f(configuration, "newConfig");
            g.a d10 = this.f4596h.f4584e;
            if (d10 != null) {
                Activity activity = this.f4597i;
                d10.a(activity, this.f4596h.h(activity));
            }
        }

        public void onLowMemory() {
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, m mVar) {
        m.f(mVar, "sidecarAdapter");
        this.f4580a = sidecarInterface;
        this.f4581b = mVar;
        this.f4582c = new LinkedHashMap();
        this.f4583d = new LinkedHashMap();
    }

    private final void j(Activity activity) {
        if (this.f4583d.get(activity) == null) {
            d dVar = new d(this, activity);
            this.f4583d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void k(Activity activity) {
        activity.unregisterComponentCallbacks(this.f4583d.get(activity));
        this.f4583d.remove(activity);
    }

    public void a(Activity activity) {
        m.f(activity, "activity");
        IBinder a10 = f4579f.a(activity);
        if (a10 != null) {
            i(a10, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    public void b(g.a aVar) {
        m.f(aVar, "extensionCallback");
        this.f4584e = new b(aVar);
        SidecarInterface sidecarInterface = this.f4580a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f4581b, new TranslatingCallback(this)));
        }
    }

    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        m.f(activity, "activity");
        IBinder a10 = f4579f.a(activity);
        if (a10 != null) {
            SidecarInterface sidecarInterface2 = this.f4580a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(a10);
            }
            k(activity);
            boolean z10 = this.f4582c.size() == 1;
            this.f4582c.remove(a10);
            if (z10 && (sidecarInterface = this.f4580a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final SidecarInterface g() {
        return this.f4580a;
    }

    public final u h(Activity activity) {
        m.f(activity, "activity");
        IBinder a10 = f4579f.a(activity);
        if (a10 == null) {
            return new u(p.e());
        }
        SidecarInterface sidecarInterface = this.f4580a;
        SidecarDeviceState sidecarDeviceState = null;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(a10);
        m mVar = this.f4581b;
        SidecarInterface sidecarInterface2 = this.f4580a;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return mVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        m.f(iBinder, "windowToken");
        m.f(activity, "activity");
        this.f4582c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f4580a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f4582c.size() == 1 && (sidecarInterface = this.f4580a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        g.a aVar = this.f4584e;
        if (aVar != null) {
            aVar.a(activity, h(activity));
        }
        j(activity);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:58|59|60|61|69|70|71|72|73|(2:75|(2:77|96)(2:78|79))(2:80|81)) */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0112 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0152 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016a A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0176 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0182 A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018e A[Catch:{ NoSuchFieldError -> 0x00bf, all -> 0x019a }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            r3 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r3
            goto L_0x001c
        L_0x0009:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r4 = "setSidecarCallback"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r6 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x001c:
            if (r2 != 0) goto L_0x0020
            r2 = r3
            goto L_0x0024
        L_0x0020:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0024:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x018e
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r2.getDeviceState()     // Catch:{ all -> 0x019a }
        L_0x0034:
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r2.onDeviceStateListenersChanged(r0)     // Catch:{ all -> 0x019a }
        L_0x003c:
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0042
        L_0x0040:
            r2 = r3
            goto L_0x0055
        L_0x0042:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0049
            goto L_0x0040
        L_0x0049:
            java.lang.String r4 = "getWindowLayoutInfo"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x0055:
            if (r2 != 0) goto L_0x0059
            r2 = r3
            goto L_0x005d
        L_0x0059:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x005d:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r4 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0182
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x006b
        L_0x0069:
            r2 = r3
            goto L_0x007e
        L_0x006b:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0072
            goto L_0x0069
        L_0x0072:
            java.lang.String r4 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x007e:
            if (r2 != 0) goto L_0x0082
            r2 = r3
            goto L_0x0086
        L_0x0082:
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x0086:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r4 = kotlin.jvm.internal.m.a(r2, r4)     // Catch:{ all -> 0x019a }
            if (r4 == 0) goto L_0x0176
            androidx.window.sidecar.SidecarInterface r2 = r8.f4580a     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x0094
        L_0x0092:
            r2 = r3
            goto L_0x00a7
        L_0x0094:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x019a }
            if (r2 != 0) goto L_0x009b
            goto L_0x0092
        L_0x009b:
            java.lang.String r4 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x019a }
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            java.lang.Class r3 = r2.getReturnType()     // Catch:{ all -> 0x019a }
        L_0x00ae:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x019a }
            boolean r2 = kotlin.jvm.internal.m.a(r3, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x016a
            androidx.window.sidecar.SidecarDeviceState r2 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            r3 = 3
            r2.posture = r3     // Catch:{ NoSuchFieldError -> 0x00bf }
            goto L_0x00f2
        L_0x00bf:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x019a }
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019a }
            r5[r1] = r6     // Catch:{ all -> 0x019a }
            r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r4.invoke(r2, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0162
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x019a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x019a }
            if (r2 != r3) goto L_0x015a
        L_0x00f2:
            androidx.window.sidecar.SidecarDisplayFeature r2 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x019a }
            r2.<init>()     // Catch:{ all -> 0x019a }
            android.graphics.Rect r3 = r2.getRect()     // Catch:{ all -> 0x019a }
            java.lang.String r4 = "displayFeature.rect"
            kotlin.jvm.internal.m.e(r3, r4)     // Catch:{ all -> 0x019a }
            r2.setRect(r3)     // Catch:{ all -> 0x019a }
            r2.getType()     // Catch:{ all -> 0x019a }
            r2.setType(r0)     // Catch:{ all -> 0x019a }
            androidx.window.sidecar.SidecarWindowLayoutInfo r3 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x019a }
            r3.<init>()     // Catch:{ all -> 0x019a }
            java.util.List r1 = r3.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0112 }
            goto L_0x019b
        L_0x0112:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x019a }
            r4.<init>()     // Catch:{ all -> 0x019a }
            r4.add(r2)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x019a }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r1] = r7     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x019a }
            r5[r1] = r4     // Catch:{ all -> 0x019a }
            r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x019a }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x019a }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x019a }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x0152
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x019a }
            boolean r2 = kotlin.jvm.internal.m.a(r4, r2)     // Catch:{ all -> 0x019a }
            if (r2 == 0) goto L_0x014a
            goto L_0x019b
        L_0x014a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid display feature getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0152:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x015a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Invalid device posture getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0162:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x016a:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = kotlin.jvm.internal.m.o(r2, r3)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0176:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = kotlin.jvm.internal.m.o(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0182:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r2 = kotlin.jvm.internal.m.o(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x018e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x019a }
            java.lang.String r3 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r2 = kotlin.jvm.internal.m.o(r3, r2)     // Catch:{ all -> 0x019a }
            r0.<init>(r2)     // Catch:{ all -> 0x019a }
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r0 = 0
        L_0x019b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.l():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f4579f.b(context), new m((f.b) null, 1, (kotlin.jvm.internal.g) null));
        m.f(context, "context");
    }
}
