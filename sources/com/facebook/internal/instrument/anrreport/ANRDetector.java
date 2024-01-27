package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import j3.a;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;

/* compiled from: ANRDetector.kt */
public final class ANRDetector {
    private static final int DETECTION_INTERVAL_IN_MS = 500;
    public static final ANRDetector INSTANCE = new ANRDetector();
    private static final Runnable anrDetectorRunnable = a.f15364h;
    private static final int myUid = Process.myUid();
    private static String previousStackTrace = "";
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    private ANRDetector() {
    }

    /* access modifiers changed from: private */
    /* renamed from: anrDetectorRunnable$lambda-0  reason: not valid java name */
    public static final void m120anrDetectorRunnable$lambda0() {
        Class<ANRDetector> cls = ANRDetector.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                Object systemService = FacebookSdk.getApplicationContext().getSystemService("activity");
                if (systemService != null) {
                    checkProcessError((ActivityManager) systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void checkProcessError(ActivityManager activityManager) {
        Class<ANRDetector> cls = ANRDetector.class;
        if (!CrashShieldHandler.isObjectCrashing(cls) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                            Thread thread = Looper.getMainLooper().getThread();
                            m.e(thread, "getMainLooper().thread");
                            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
                            String stackTrace = InstrumentUtility.getStackTrace(thread);
                            if (!m.a(stackTrace, previousStackTrace)) {
                                if (InstrumentUtility.isSDKRelatedThread(thread)) {
                                    previousStackTrace = stackTrace;
                                    InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                                    InstrumentData.Builder.build(processErrorStateInfo.shortMsg, stackTrace).save();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void start() {
        Class<ANRDetector> cls = ANRDetector.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                scheduledExecutorService.scheduleAtFixedRate(anrDetectorRunnable, 0, (long) 500, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
