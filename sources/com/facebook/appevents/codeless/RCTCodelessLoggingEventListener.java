package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* compiled from: RCTCodelessLoggingEventListener.kt */
public final class RCTCodelessLoggingEventListener {
    public static final RCTCodelessLoggingEventListener INSTANCE = new RCTCodelessLoggingEventListener();

    /* compiled from: RCTCodelessLoggingEventListener.kt */
    public static final class AutoLoggingOnTouchListener implements View.OnTouchListener {
        private final View.OnTouchListener existingOnTouchListener;
        private final WeakReference<View> hostView;
        private final EventBinding mapping;
        private final WeakReference<View> rootView;
        private boolean supportCodelessLogging = true;

        public AutoLoggingOnTouchListener(EventBinding eventBinding, View view, View view2) {
            m.f(eventBinding, "mapping");
            m.f(view, "rootView");
            m.f(view2, "hostView");
            this.mapping = eventBinding;
            this.hostView = new WeakReference<>(view2);
            this.rootView = new WeakReference<>(view);
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            this.existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view2);
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            m.f(view, "view");
            m.f(motionEvent, "motionEvent");
            View view2 = (View) this.rootView.get();
            View view3 = (View) this.hostView.get();
            if (!(view2 == null || view3 == null || motionEvent.getAction() != 1)) {
                CodelessLoggingEventListener codelessLoggingEventListener = CodelessLoggingEventListener.INSTANCE;
                CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        public final void setSupportCodelessLogging(boolean z10) {
            this.supportCodelessLogging = z10;
        }
    }

    private RCTCodelessLoggingEventListener() {
    }

    public static final AutoLoggingOnTouchListener getOnTouchListener(EventBinding eventBinding, View view, View view2) {
        Class<RCTCodelessLoggingEventListener> cls = RCTCodelessLoggingEventListener.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(eventBinding, "mapping");
            m.f(view, "rootView");
            m.f(view2, "hostView");
            return new AutoLoggingOnTouchListener(eventBinding, view, view2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
