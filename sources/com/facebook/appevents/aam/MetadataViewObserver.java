package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import f3.b;
import g9.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: MetadataViewObserver.kt */
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final Companion Companion = new Companion((g) null);
    private static final int MAX_TEXT_LENGTH = 100;
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Set<String> processedText;
    private final Handler uiThreadHandler;

    /* compiled from: MetadataViewObserver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String preNormalize(String str, String str2) {
            return m.a("r2", str) ? new f("[^\\d.]").b(str2, "") : str2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
            if (r7.equals("r4") == false) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
            r8 = new g9.f("[^a-z]+").b(r8, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
            if (r7.equals("r5") == false) goto L_0x007d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void putUserData(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L_0x0057;
                    case 3586: goto L_0x0040;
                    case 3587: goto L_0x0037;
                    case 3588: goto L_0x000c;
                    default: goto L_0x000a;
                }
            L_0x000a:
                goto L_0x007d
            L_0x000c:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0016
                goto L_0x007d
            L_0x0016:
                java.lang.String r0 = "-"
                boolean r1 = g9.q.y(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L_0x007d
                g9.f r1 = new g9.f
                r1.<init>((java.lang.String) r0)
                java.util.List r8 = r1.c(r8, r3)
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r8, r0)
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L_0x007d
            L_0x0037:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0049
                goto L_0x007d
            L_0x0040:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0049
                goto L_0x007d
            L_0x0049:
                g9.f r0 = new g9.f
                java.lang.String r1 = "[^a-z]+"
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.b(r8, r1)
                goto L_0x007d
            L_0x0057:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0060
                goto L_0x007d
            L_0x0060:
                java.lang.String r0 = "m"
                boolean r4 = g9.p.v(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L_0x007c
                java.lang.String r4 = "b"
                boolean r4 = g9.p.v(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L_0x007c
                java.lang.String r4 = "ge"
                boolean r8 = g9.p.v(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L_0x0079
                goto L_0x007c
            L_0x0079:
                java.lang.String r8 = "f"
                goto L_0x007d
            L_0x007c:
                r8 = r0
            L_0x007d:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.aam.MetadataViewObserver.Companion.putUserData(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void startTrackingActivity(Activity activity) {
            m.f(activity, "activity");
            int hashCode = activity.hashCode();
            Map access$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = access$getObservers$cp.get(valueOf);
            if (obj == null) {
                obj = new MetadataViewObserver(activity, (g) null);
                access$getObservers$cp.put(valueOf, obj);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) obj);
        }

        public final void stopTrackingActivity(Activity activity) {
            m.f(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver != null) {
                MetadataViewObserver.access$stopTracking(metadataViewObserver);
            }
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            try {
                metadataViewObserver.startTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            }
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            try {
                metadataViewObserver.stopTracking();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            }
        }
    }

    private final void process(View view) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                runOnUIThread(new b(view, this));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: process$lambda-0  reason: not valid java name */
    public static final void m43process$lambda0(View view, MetadataViewObserver metadataViewObserver) {
        if (!CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            try {
                m.f(view, "$view");
                m.f(metadataViewObserver, "this$0");
                if (view instanceof EditText) {
                    metadataViewObserver.processEditText(view);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            }
        }
    }

    private final void processEditText(View view) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                String obj = ((EditText) view).getText().toString();
                if (obj != null) {
                    String obj2 = q.q0(obj).toString();
                    if (obj2 != null) {
                        String lowerCase = obj2.toLowerCase();
                        m.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (!(lowerCase.length() == 0) && !this.processedText.contains(lowerCase)) {
                            if (lowerCase.length() <= 100) {
                                this.processedText.add(lowerCase);
                                HashMap hashMap = new HashMap();
                                MetadataMatcher metadataMatcher = MetadataMatcher.INSTANCE;
                                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                                List<String> list = null;
                                for (MetadataRule next : MetadataRule.Companion.getRules()) {
                                    Companion companion = Companion;
                                    String access$preNormalize = companion.preNormalize(next.getName(), lowerCase);
                                    if (next.getValRule().length() > 0) {
                                        MetadataMatcher metadataMatcher2 = MetadataMatcher.INSTANCE;
                                        if (!MetadataMatcher.matchValue(access$preNormalize, next.getValRule())) {
                                        }
                                    }
                                    MetadataMatcher metadataMatcher3 = MetadataMatcher.INSTANCE;
                                    if (MetadataMatcher.matchIndicator(currentViewIndicators, next.getKeyRules())) {
                                        companion.putUserData(hashMap, next.getName(), access$preNormalize);
                                    } else {
                                        if (list == null) {
                                            list = MetadataMatcher.getAroundViewIndicators(view);
                                        }
                                        if (MetadataMatcher.matchIndicator(list, next.getKeyRules())) {
                                            companion.putUserData(hashMap, next.getName(), access$preNormalize);
                                        }
                                    }
                                }
                                InternalAppEventsLogger.Companion.setInternalUserData(hashMap);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.uiThreadHandler.post(runnable);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
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
                            viewTreeObserver.addOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            try {
                Companion.startTrackingActivity(activity);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
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
                            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(MetadataViewObserver.class)) {
            try {
                Companion.stopTrackingActivity(activity);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MetadataViewObserver.class);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (view != null) {
                try {
                    process(view);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            }
            if (view2 != null) {
                process(view2);
            }
        }
    }
}
