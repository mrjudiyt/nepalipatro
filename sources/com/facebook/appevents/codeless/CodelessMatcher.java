package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;
import com.facebook.appevents.codeless.RCTCodelessLoggingEventListener;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: CodelessMatcher.kt */
public final class CodelessMatcher {
    private static final String CURRENT_CLASS_NAME = ".";
    public static final Companion Companion = new Companion((g) null);
    private static final String PARENT_CLASS_NAME = "..";
    private static final String TAG = CodelessMatcher.class.getCanonicalName();
    private static CodelessMatcher codelessMatcher;
    private final Set<Activity> activitiesSet;
    private final HashMap<Integer, HashSet<String>> activityToListenerMap;
    private HashSet<String> listenerSet;
    private final Handler uiThreadHandler;
    private final Set<ViewMatcher> viewMatchers;

    /* compiled from: CodelessMatcher.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final synchronized CodelessMatcher getInstance() {
            CodelessMatcher access$getCodelessMatcher$cp;
            if (CodelessMatcher.access$getCodelessMatcher$cp() == null) {
                CodelessMatcher.access$setCodelessMatcher$cp(new CodelessMatcher((g) null));
            }
            access$getCodelessMatcher$cp = CodelessMatcher.access$getCodelessMatcher$cp();
            if (access$getCodelessMatcher$cp == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return access$getCodelessMatcher$cp;
        }

        public final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
            List<ParameterComponent> viewParameters;
            List<MatchedView> list;
            m.f(view, "rootView");
            m.f(view2, "hostView");
            Bundle bundle = new Bundle();
            if (!(eventBinding == null || (viewParameters = eventBinding.getViewParameters()) == null)) {
                for (ParameterComponent next : viewParameters) {
                    if (next.getValue() != null) {
                        if (next.getValue().length() > 0) {
                            bundle.putString(next.getName(), next.getValue());
                        }
                    }
                    if (next.getPath().size() > 0) {
                        if (m.a(next.getPathType(), Constants.PATH_TYPE_RELATIVE)) {
                            ViewMatcher.Companion companion = ViewMatcher.Companion;
                            List<PathComponent> path = next.getPath();
                            String simpleName = view2.getClass().getSimpleName();
                            m.e(simpleName, "hostView.javaClass.simpleName");
                            list = companion.findViewByPath(eventBinding, view2, path, 0, -1, simpleName);
                        } else {
                            ViewMatcher.Companion companion2 = ViewMatcher.Companion;
                            List<PathComponent> path2 = next.getPath();
                            String simpleName2 = view.getClass().getSimpleName();
                            m.e(simpleName2, "rootView.javaClass.simpleName");
                            list = companion2.findViewByPath(eventBinding, view, path2, 0, -1, simpleName2);
                        }
                        Iterator<MatchedView> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MatchedView next2 = it.next();
                            if (next2.getView() != null) {
                                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                                String textOfView = ViewHierarchy.getTextOfView(next2.getView());
                                if (textOfView.length() > 0) {
                                    bundle.putString(next.getName(), textOfView);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    public static final class MatchedView {
        private final WeakReference<View> view;
        private final String viewMapKey;

        public MatchedView(View view2, String str) {
            m.f(view2, "view");
            m.f(str, "viewMapKey");
            this.view = new WeakReference<>(view2);
            this.viewMapKey = str;
        }

        public final View getView() {
            WeakReference<View> weakReference = this.view;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final Companion Companion = new Companion((g) null);
        private final String activityName;
        private List<EventBinding> eventBindings;
        private final Handler handler;
        private final HashSet<String> listenerSet;
        private final WeakReference<View> rootView;

        /* compiled from: CodelessMatcher.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private final List<View> findVisibleChildren(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            m.e(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
                if (kotlin.jvm.internal.m.a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L_0x0065;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private final boolean isTheSameView(android.view.View r9, com.facebook.appevents.codeless.internal.PathComponent r10, int r11) {
                /*
                    r8 = this;
                    int r0 = r10.getIndex()
                    r1 = 0
                    r2 = -1
                    if (r0 == r2) goto L_0x000f
                    int r0 = r10.getIndex()
                    if (r11 == r0) goto L_0x000f
                    return r1
                L_0x000f:
                    java.lang.Class r11 = r9.getClass()
                    java.lang.String r11 = r11.getCanonicalName()
                    java.lang.String r0 = r10.getClassName()
                    boolean r11 = kotlin.jvm.internal.m.a(r11, r0)
                    r0 = 1
                    if (r11 != 0) goto L_0x0066
                    java.lang.String r11 = r10.getClassName()
                    g9.f r2 = new g9.f
                    java.lang.String r3 = ".*android\\..*"
                    r2.<init>((java.lang.String) r3)
                    boolean r11 = r2.a(r11)
                    if (r11 == 0) goto L_0x0065
                    java.lang.String r2 = r10.getClassName()
                    java.lang.String r11 = "."
                    java.lang.String[] r3 = new java.lang.String[]{r11}
                    r4 = 0
                    r5 = 0
                    r6 = 6
                    r7 = 0
                    java.util.List r11 = g9.q.c0(r2, r3, r4, r5, r6, r7)
                    boolean r2 = r11.isEmpty()
                    r2 = r2 ^ r0
                    if (r2 == 0) goto L_0x0065
                    int r2 = r11.size()
                    int r2 = r2 - r0
                    java.lang.Object r11 = r11.get(r2)
                    java.lang.String r11 = (java.lang.String) r11
                    java.lang.Class r2 = r9.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    boolean r11 = kotlin.jvm.internal.m.a(r2, r11)
                    if (r11 != 0) goto L_0x0066
                L_0x0065:
                    return r1
                L_0x0066:
                    int r11 = r10.getMatchBitmask()
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID
                    int r2 = r2.getValue()
                    r11 = r11 & r2
                    if (r11 <= 0) goto L_0x007e
                    int r11 = r10.getId()
                    int r2 = r9.getId()
                    if (r11 == r2) goto L_0x007e
                    return r1
                L_0x007e:
                    int r11 = r10.getMatchBitmask()
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r2 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT
                    int r2 = r2.getValue()
                    r11 = r11 & r2
                    java.lang.String r2 = ""
                    if (r11 <= 0) goto L_0x00ae
                    java.lang.String r11 = r10.getText()
                    com.facebook.appevents.codeless.internal.ViewHierarchy r3 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE
                    java.lang.String r3 = com.facebook.appevents.codeless.internal.ViewHierarchy.getTextOfView(r9)
                    com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE
                    java.lang.String r4 = com.facebook.internal.Utility.sha256hash((java.lang.String) r3)
                    java.lang.String r4 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(r4, r2)
                    boolean r3 = kotlin.jvm.internal.m.a(r11, r3)
                    if (r3 != 0) goto L_0x00ae
                    boolean r11 = kotlin.jvm.internal.m.a(r11, r4)
                    if (r11 != 0) goto L_0x00ae
                    return r1
                L_0x00ae:
                    int r11 = r10.getMatchBitmask()
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION
                    int r3 = r3.getValue()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x00e6
                    java.lang.String r11 = r10.getDescription()
                    java.lang.CharSequence r3 = r9.getContentDescription()
                    if (r3 != 0) goto L_0x00c7
                    r3 = r2
                    goto L_0x00cf
                L_0x00c7:
                    java.lang.CharSequence r3 = r9.getContentDescription()
                    java.lang.String r3 = r3.toString()
                L_0x00cf:
                    com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE
                    java.lang.String r4 = com.facebook.internal.Utility.sha256hash((java.lang.String) r3)
                    java.lang.String r4 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(r4, r2)
                    boolean r3 = kotlin.jvm.internal.m.a(r11, r3)
                    if (r3 != 0) goto L_0x00e6
                    boolean r11 = kotlin.jvm.internal.m.a(r11, r4)
                    if (r11 != 0) goto L_0x00e6
                    return r1
                L_0x00e6:
                    int r11 = r10.getMatchBitmask()
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT
                    int r3 = r3.getValue()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x0114
                    java.lang.String r11 = r10.getHint()
                    com.facebook.appevents.codeless.internal.ViewHierarchy r3 = com.facebook.appevents.codeless.internal.ViewHierarchy.INSTANCE
                    java.lang.String r3 = com.facebook.appevents.codeless.internal.ViewHierarchy.getHintOfView(r9)
                    com.facebook.internal.Utility r4 = com.facebook.internal.Utility.INSTANCE
                    java.lang.String r4 = com.facebook.internal.Utility.sha256hash((java.lang.String) r3)
                    java.lang.String r4 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(r4, r2)
                    boolean r3 = kotlin.jvm.internal.m.a(r11, r3)
                    if (r3 != 0) goto L_0x0114
                    boolean r11 = kotlin.jvm.internal.m.a(r11, r4)
                    if (r11 != 0) goto L_0x0114
                    return r1
                L_0x0114:
                    int r11 = r10.getMatchBitmask()
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r3 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG
                    int r3 = r3.getValue()
                    r11 = r11 & r3
                    if (r11 <= 0) goto L_0x014c
                    java.lang.String r10 = r10.getTag()
                    java.lang.Object r11 = r9.getTag()
                    if (r11 != 0) goto L_0x012d
                    r9 = r2
                    goto L_0x0135
                L_0x012d:
                    java.lang.Object r9 = r9.getTag()
                    java.lang.String r9 = r9.toString()
                L_0x0135:
                    com.facebook.internal.Utility r11 = com.facebook.internal.Utility.INSTANCE
                    java.lang.String r11 = com.facebook.internal.Utility.sha256hash((java.lang.String) r9)
                    java.lang.String r11 = com.facebook.internal.Utility.coerceValueIfNullOrEmpty(r11, r2)
                    boolean r9 = kotlin.jvm.internal.m.a(r10, r9)
                    if (r9 != 0) goto L_0x014c
                    boolean r9 = kotlin.jvm.internal.m.a(r10, r11)
                    if (r9 != 0) goto L_0x014c
                    return r1
                L_0x014c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher.Companion.isTheSameView(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
            }

            public final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i10, int i11, String str) {
                List<View> findVisibleChildren;
                int size;
                List<View> findVisibleChildren2;
                int size2;
                m.f(list, "path");
                m.f(str, "mapKey");
                String str2 = str + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i10 >= list.size()) {
                    arrayList.add(new MatchedView(view, str2));
                } else {
                    PathComponent pathComponent = list.get(i10);
                    if (m.a(pathComponent.getClassName(), CodelessMatcher.PARENT_CLASS_NAME)) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size2 = findVisibleChildren2.size()) > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                arrayList.addAll(findViewByPath(eventBinding, (findVisibleChildren2 = findVisibleChildren((ViewGroup) parent)).get(i12), list, i10 + 1, i12, str2));
                                if (i13 >= size2) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                        return arrayList;
                    } else if (m.a(pathComponent.getClassName(), CodelessMatcher.CURRENT_CLASS_NAME)) {
                        arrayList.add(new MatchedView(view, str2));
                        return arrayList;
                    } else if (!isTheSameView(view, pathComponent, i11)) {
                        return arrayList;
                    } else {
                        if (i10 == list.size() - 1) {
                            arrayList.add(new MatchedView(view, str2));
                        }
                    }
                }
                if ((view instanceof ViewGroup) && (size = findVisibleChildren.size()) > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        arrayList.addAll(findViewByPath(eventBinding, (findVisibleChildren = findVisibleChildren((ViewGroup) view)).get(i14), list, i10 + 1, i14, str2));
                        if (i15 >= size) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                return arrayList;
            }
        }

        public ViewMatcher(View view, Handler handler2, HashSet<String> hashSet, String str) {
            m.f(handler2, "handler");
            m.f(hashSet, "listenerSet");
            m.f(str, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler2;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler2.postDelayed(this, 200);
        }

        private final void attachListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            if (eventBinding != null) {
                try {
                    View view2 = matchedView.getView();
                    if (view2 != null) {
                        ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                        View findRCTRootView = ViewHierarchy.findRCTRootView(view2);
                        if (findRCTRootView == null || !viewHierarchy.isRCTButton(view2, findRCTRootView)) {
                            String name = view2.getClass().getName();
                            m.e(name, "view.javaClass.name");
                            if (!p.v(name, "com.facebook.react", false, 2, (Object) null)) {
                                if (!(view2 instanceof AdapterView)) {
                                    attachOnClickListener(matchedView, view, eventBinding);
                                } else if (view2 instanceof ListView) {
                                    attachOnItemClickListener(matchedView, view, eventBinding);
                                }
                            }
                        } else {
                            attachRCTListener(matchedView, view, eventBinding);
                        }
                    }
                } catch (Exception e10) {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd(CodelessMatcher.access$getTAG$cp(), e10);
                }
            }
        }

        private final void attachOnClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z10;
            View view2 = matchedView.getView();
            if (view2 != null) {
                String viewMapKey = matchedView.getViewMapKey();
                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                View.OnClickListener existingOnClickListener = ViewHierarchy.getExistingOnClickListener(view2);
                if (existingOnClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener) {
                    Objects.requireNonNull(existingOnClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    if (((CodelessLoggingEventListener.AutoLoggingOnClickListener) existingOnClickListener).getSupportCodelessLogging()) {
                        z10 = true;
                        if (!this.listenerSet.contains(viewMapKey) && !z10) {
                            CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                            view2.setOnClickListener(CodelessLoggingEventListener.getOnClickListener(eventBinding, view, view2));
                            this.listenerSet.add(viewMapKey);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.listenerSet.contains(viewMapKey)) {
                }
            }
        }

        private final void attachOnItemClickListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z10;
            AdapterView adapterView = (AdapterView) matchedView.getView();
            if (adapterView != null) {
                String viewMapKey = matchedView.getViewMapKey();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener) {
                    Objects.requireNonNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    if (((CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging()) {
                        z10 = true;
                        if (!this.listenerSet.contains(viewMapKey) && !z10) {
                            CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                            adapterView.setOnItemClickListener(CodelessLoggingEventListener.getOnItemClickListener(eventBinding, view, adapterView));
                            this.listenerSet.add(viewMapKey);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.listenerSet.contains(viewMapKey)) {
                }
            }
        }

        private final void attachRCTListener(MatchedView matchedView, View view, EventBinding eventBinding) {
            boolean z10;
            View view2 = matchedView.getView();
            if (view2 != null) {
                String viewMapKey = matchedView.getViewMapKey();
                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                View.OnTouchListener existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
                if (existingOnTouchListener instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) {
                    Objects.requireNonNull(existingOnTouchListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    if (((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) existingOnTouchListener).getSupportCodelessLogging()) {
                        z10 = true;
                        if (!this.listenerSet.contains(viewMapKey) && !z10) {
                            RCTCodelessLoggingEventListener rCTCodelessLoggingEventListener = RCTCodelessLoggingEventListener.INSTANCE;
                            view2.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(eventBinding, view, view2));
                            this.listenerSet.add(viewMapKey);
                            return;
                        }
                    }
                }
                z10 = false;
                if (!this.listenerSet.contains(viewMapKey)) {
                }
            }
        }

        private final void findView(EventBinding eventBinding, View view) {
            if (eventBinding != null && view != null) {
                String activityName2 = eventBinding.getActivityName();
                if ((activityName2 == null || activityName2.length() == 0) || m.a(eventBinding.getActivityName(), this.activityName)) {
                    List<PathComponent> viewPath = eventBinding.getViewPath();
                    if (viewPath.size() <= 25) {
                        for (MatchedView attachListener : Companion.findViewByPath(eventBinding, view, viewPath, 0, -1, this.activityName)) {
                            attachListener(attachListener, view, eventBinding);
                        }
                    }
                }
            }
        }

        public static final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i10, int i11, String str) {
            return Companion.findViewByPath(eventBinding, view, list, i10, i11, str);
        }

        private final void startMatch() {
            List<EventBinding> list = this.eventBindings;
            if (list != null && this.rootView.get() != null) {
                int i10 = 0;
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = i10 + 1;
                        findView(list.get(i10), (View) this.rootView.get());
                        if (i11 <= size) {
                            i10 = i11;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public void onGlobalLayout() {
            startMatch();
        }

        public void onScrollChanged() {
            startMatch();
        }

        public void run() {
            View view;
            if (!CrashShieldHandler.isObjectCrashing(this)) {
                try {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    String applicationId = FacebookSdk.getApplicationId();
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
                    FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
                    if (appSettingsWithoutQuery == null) {
                        return;
                    }
                    if (appSettingsWithoutQuery.getCodelessEventsEnabled()) {
                        List<EventBinding> parseArray = EventBinding.Companion.parseArray(appSettingsWithoutQuery.getEventBindings());
                        this.eventBindings = parseArray;
                        if (parseArray != null && (view = (View) this.rootView.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            startMatch();
                        }
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }
    }

    private CodelessMatcher() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        m.e(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = newSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    public /* synthetic */ CodelessMatcher(g gVar) {
        this();
    }

    public static final /* synthetic */ CodelessMatcher access$getCodelessMatcher$cp() {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return codelessMatcher;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCodelessMatcher$cp(CodelessMatcher codelessMatcher2) {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                codelessMatcher = codelessMatcher2;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final synchronized CodelessMatcher getInstance() {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        synchronized (cls) {
            if (CrashShieldHandler.isObjectCrashing(cls)) {
                return null;
            }
            try {
                CodelessMatcher instance = Companion.getInstance();
                return instance;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return null;
            }
        }
    }

    public static final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return Companion.getParameters(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final void matchViews() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                for (Activity next : this.activitiesSet) {
                    if (next != null) {
                        AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                        View rootView = AppEventUtility.getRootView(next);
                        String simpleName = next.getClass().getSimpleName();
                        Handler handler = this.uiThreadHandler;
                        HashSet<String> hashSet = this.listenerSet;
                        m.e(simpleName, "activityName");
                        this.viewMatchers.add(new ViewMatcher(rootView, handler, hashSet, simpleName));
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void startTracking() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    matchViews();
                } else {
                    this.uiThreadHandler.post(new d(this));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startTracking$lambda-1  reason: not valid java name */
    public static final void m50startTracking$lambda1(CodelessMatcher codelessMatcher2) {
        Class<CodelessMatcher> cls = CodelessMatcher.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(codelessMatcher2, "this$0");
                codelessMatcher2.matchViews();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public final void add(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(activity, "activity");
                InternalSettings internalSettings = InternalSettings.INSTANCE;
                if (!InternalSettings.isUnityApp()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.activitiesSet.add(activity);
                        this.listenerSet.clear();
                        HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
                        if (hashSet != null) {
                            this.listenerSet = hashSet;
                        }
                        startTracking();
                        return;
                    }
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void destroy(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(activity, "activity");
                this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void remove(Activity activity) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(activity, "activity");
                InternalSettings internalSettings = InternalSettings.INSTANCE;
                if (!InternalSettings.isUnityApp()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.activitiesSet.remove(activity);
                        this.viewMatchers.clear();
                        this.activityToListenerMap.put(Integer.valueOf(activity.hashCode()), (HashSet) this.listenerSet.clone());
                        this.listenerSet.clear();
                        return;
                    }
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
