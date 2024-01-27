package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: BoltsExecutors.kt */
public final class BoltsExecutors {
    public static final Companion Companion = new Companion((g) null);
    /* access modifiers changed from: private */
    public static final BoltsExecutors INSTANCE = new BoltsExecutors();
    /* access modifiers changed from: private */
    public final ExecutorService background;
    /* access modifiers changed from: private */
    public final Executor immediate;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService scheduled;

    /* compiled from: BoltsExecutors.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale locale = Locale.US;
            m.e(locale, "US");
            String lowerCase = property.toLowerCase(locale);
            m.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return q.y(lowerCase, "android", false, 2, (Object) null);
        }

        public final ExecutorService background() {
            return BoltsExecutors.INSTANCE.background;
        }

        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.immediate;
        }

        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.scheduled;
        }
    }

    /* compiled from: BoltsExecutors.kt */
    private static final class ImmediateExecutor implements Executor {
        public static final Companion Companion = new Companion((g) null);
        private static final int MAX_DEPTH = 15;
        private final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        /* compiled from: BoltsExecutors.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        private final int decrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.executionDepth.remove();
            } else {
                this.executionDepth.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private final int incrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            m.f(runnable, "command");
            if (incrementDepth() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    decrementDepth();
                    throw th;
                }
            } else {
                BoltsExecutors.Companion.background().execute(runnable);
            }
            decrementDepth();
        }
    }

    private BoltsExecutors() {
        ExecutorService executorService;
        if (!Companion.isAndroidRuntime()) {
            executorService = Executors.newCachedThreadPool();
            m.e(executorService, "newCachedThreadPool()");
        } else {
            executorService = AndroidExecutors.Companion.newCachedThreadPool();
        }
        this.background = executorService;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        m.e(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = newSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }

    public static final ExecutorService background() {
        return Companion.background();
    }

    public static final Executor immediate$facebook_bolts_release() {
        return Companion.immediate$facebook_bolts_release();
    }

    public static final ScheduledExecutorService scheduled$facebook_bolts_release() {
        return Companion.scheduled$facebook_bolts_release();
    }
}
