package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.codeless.internal.SensitiveUserDataUtils;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import h3.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ViewObserver.kt */
public final class ViewObserver implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_TEXT_LENGTH = 300;
    private static final Map<Integer, ViewObserver> observers = new HashMap();
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Handler uiThreadHandler;

    /* compiled from: ViewObserver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void startTrackingActivity(Activity activity) {
            m.f(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = ViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new ViewObserver(activity, (g) null);
                access$getObservers$cp.put(valueOf, obj);
            }
            ViewObserver.access$startTracking((ViewObserver) obj);
        }

        public final void stopTrackingActivity(Activity activity) {
            m.f(activity, "activity");
            ViewObserver viewObserver = (ViewObserver) ViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (viewObserver != null) {
                ViewObserver.access$stopTracking(viewObserver);
            }
        }
    }

    private ViewObserver(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewObserver(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(ViewObserver viewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            try {
                viewObserver.startTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            }
        }
    }

    public static final /* synthetic */ void access$stopTracking(ViewObserver viewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            try {
                viewObserver.stopTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            }
        }
    }

    private final void process() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                b bVar = new b(this);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    bVar.run();
                } else {
                    this.uiThreadHandler.post(bVar);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: process$lambda-0  reason: not valid java name */
    public static final void m72process$lambda0(ViewObserver viewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            try {
                m.f(viewObserver, "this$0");
                try {
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    View rootView = AppEventUtility.getRootView((Activity) viewObserver.activityWeakReference.get());
                    Activity activity = (Activity) viewObserver.activityWeakReference.get();
                    if (rootView == null) {
                        return;
                    }
                    if (activity != null) {
                        SuggestedEventViewHierarchy suggestedEventViewHierarchy = SuggestedEventViewHierarchy.INSTANCE;
                        for (View next : SuggestedEventViewHierarchy.getAllClickableViews(rootView)) {
                            SensitiveUserDataUtils sensitiveUserDataUtils = SensitiveUserDataUtils.INSTANCE;
                            if (!SensitiveUserDataUtils.isSensitiveUserData(next)) {
                                SuggestedEventViewHierarchy suggestedEventViewHierarchy2 = SuggestedEventViewHierarchy.INSTANCE;
                                String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(next);
                                if ((textOfViewRecursively.length() > 0) && textOfViewRecursively.length() <= MAX_TEXT_LENGTH) {
                                    ViewOnClickListener.Companion companion = ViewOnClickListener.Companion;
                                    String localClassName = activity.getLocalClassName();
                                    m.e(localClassName, "activity.localClassName");
                                    companion.attachListener$facebook_core_release(next, rootView, localClassName);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            }
        }
    }

    private final void startTracking() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (!this.isTracking.getAndSet(true)) {
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    View rootView = AppEventUtility.getRootView((Activity) this.activityWeakReference.get());
                    if (rootView != null) {
                        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            process();
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            try {
                Companion.startTrackingActivity(activity);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            }
        }
    }

    private final void stopTracking() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (this.isTracking.getAndSet(false)) {
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    View rootView = AppEventUtility.getRootView((Activity) this.activityWeakReference.get());
                    if (rootView != null) {
                        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(ViewObserver.class)) {
            try {
                Companion.stopTrackingActivity(activity);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewObserver.class);
            }
        }
    }

    public void onGlobalLayout() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                process();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
