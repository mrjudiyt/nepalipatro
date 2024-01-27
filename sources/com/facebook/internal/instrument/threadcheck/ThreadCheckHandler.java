package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: ThreadCheckHandler.kt */
public final class ThreadCheckHandler {
    public static final ThreadCheckHandler INSTANCE = new ThreadCheckHandler();
    private static final String TAG = ThreadCheckHandler.class.getCanonicalName();
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    public static final void enable() {
        enabled = true;
    }

    private final void log(String str, Class<?> cls, String str2, String str3) {
        if (enabled) {
            b0 b0Var = b0.f15559a;
            m.e(String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", Arrays.copyOf(new Object[]{str, cls.getName(), str2, str3, Looper.myLooper(), Looper.getMainLooper()}, 6)), "java.lang.String.format(locale, format, *args)");
            Exception exc = new Exception();
            InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
            InstrumentData.Builder.build((Throwable) exc, InstrumentData.Type.ThreadCheck).save();
        }
    }

    public static final void uiThreadViolationDetected(Class<?> cls, String str, String str2) {
        m.f(cls, "clazz");
        m.f(str, "methodName");
        m.f(str2, "methodDesc");
        INSTANCE.log("@UiThread", cls, str, str2);
    }

    public static final void workerThreadViolationDetected(Class<?> cls, String str, String str2) {
        m.f(cls, "clazz");
        m.f(str, "methodName");
        m.f(str2, "methodDesc");
        INSTANCE.log("@WorkerThread", cls, str, str2);
    }
}
