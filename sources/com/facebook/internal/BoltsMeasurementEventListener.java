package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import g9.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q0.a;

/* compiled from: BoltsMeasurementEventListener.kt */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
    public static final Companion Companion = new Companion((g) null);
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private static BoltsMeasurementEventListener singleton;
    private final Context applicationContext;

    /* compiled from: BoltsMeasurementEventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release$annotations() {
        }

        public final BoltsMeasurementEventListener getInstance(Context context) {
            m.f(context, "context");
            if (BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, (g) null);
            BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.access$getSingleton$cp();
        }

        public final String getMEASUREMENT_EVENT_NOTIFICATION_NAME$facebook_core_release() {
            return BoltsMeasurementEventListener.access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp();
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext2 = context.getApplicationContext();
        m.e(applicationContext2, "context.applicationContext");
        this.applicationContext = applicationContext2;
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, g gVar) {
        this(context);
    }

    public static final /* synthetic */ String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener access$getSingleton$cp() {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (!CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            try {
                boltsMeasurementEventListener.open();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            }
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (!CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            try {
                singleton = boltsMeasurementEventListener;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            }
        }
    }

    private final void close() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                a b10 = a.b(this.applicationContext);
                m.e(b10, "getInstance(applicationContext)");
                b10.e(this);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final BoltsMeasurementEventListener getInstance(Context context) {
        if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return Companion.getInstance(context);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    private final void open() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                a b10 = a.b(this.applicationContext);
                m.e(b10, "getInstance(applicationContext)");
                b10.c(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void finalize() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                close();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
                Set<String> set = null;
                if (intent == null) {
                    str = null;
                } else {
                    str = intent.getStringExtra(MEASUREMENT_EVENT_NAME_KEY);
                }
                String o10 = m.o(BOLTS_MEASUREMENT_EVENT_PREFIX, str);
                if (intent == null) {
                    bundle = null;
                } else {
                    bundle = intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY);
                }
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    set = bundle.keySet();
                }
                if (set != null) {
                    for (String str2 : set) {
                        m.e(str2, Constants.KEY);
                        bundle2.putString(new f("[ -]*$").b(new f("^[ -]*").b(new f("[^0-9a-zA-Z _-]").b(str2, "-"), ""), ""), (String) bundle.get(str2));
                    }
                }
                internalAppEventsLogger.logEvent(o10, bundle2);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
