package com.facebook.internal.instrument.crashshield;

import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;

/* compiled from: CrashShieldHandler.kt */
public final class CrashShieldHandler {
    public static final CrashShieldHandler INSTANCE = new CrashShieldHandler();
    private static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());
    private static boolean enabled;

    private CrashShieldHandler() {
    }

    public static final void disable() {
        enabled = false;
    }

    public static final void enable() {
        enabled = true;
    }

    public static final void handleThrowable(Throwable th, Object obj) {
        m.f(obj, "o");
        if (enabled) {
            crashingObjects.add(obj);
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                ExceptionAnalyzer exceptionAnalyzer = ExceptionAnalyzer.INSTANCE;
                ExceptionAnalyzer.execute(th);
                InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                InstrumentData.Builder.build(th, InstrumentData.Type.CrashShield).save();
            }
            scheduleCrashInDebug(th);
        }
    }

    public static final boolean isDebug() {
        return false;
    }

    public static final boolean isObjectCrashing(Object obj) {
        m.f(obj, "o");
        return crashingObjects.contains(obj);
    }

    public static final void methodFinished(Object obj) {
    }

    public static final void reset() {
        resetCrashingObjects();
    }

    public static final void resetCrashingObjects() {
        crashingObjects.clear();
    }

    public static final void scheduleCrashInDebug(Throwable th) {
        if (isDebug()) {
            new Handler(Looper.getMainLooper()).post(new CrashShieldHandler$scheduleCrashInDebug$1(th));
        }
    }
}
