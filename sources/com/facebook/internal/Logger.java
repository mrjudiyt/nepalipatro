package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: Logger.kt */
public final class Logger {
    public static final Companion Companion = new Companion((g) null);
    public static final String LOG_TAG_BASE = "FacebookSDK.";
    /* access modifiers changed from: private */
    public static final HashMap<String, String> stringsToReplace = new HashMap<>();
    private final LoggingBehavior behavior;
    private StringBuilder contents;
    private int priority = 3;
    private final String tag;

    /* compiled from: Logger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                str2 = p.t(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }

        public final void log(LoggingBehavior loggingBehavior, String str, String str2) {
            m.f(loggingBehavior, "behavior");
            m.f(str, ViewHierarchyConstants.TAG_KEY);
            m.f(str2, "string");
            log(loggingBehavior, 3, str, str2);
        }

        public final synchronized void registerAccessToken(String str) {
            m.f(str, "accessToken");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void registerStringToReplace(String str, String str2) {
            m.f(str, "original");
            m.f(str2, "replace");
            Logger.stringsToReplace.put(str, str2);
        }

        public final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            m.f(loggingBehavior, "behavior");
            m.f(str, ViewHierarchyConstants.TAG_KEY);
            m.f(str2, "format");
            m.f(objArr, "args");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                b0 b0Var = b0.f15559a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                m.e(format, "java.lang.String.format(format, *args)");
                log(loggingBehavior, 3, str, format);
            }
        }

        public final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2, Object... objArr) {
            m.f(loggingBehavior, "behavior");
            m.f(str, ViewHierarchyConstants.TAG_KEY);
            m.f(str2, "format");
            m.f(objArr, "args");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                b0 b0Var = b0.f15559a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
                m.e(format, "java.lang.String.format(format, *args)");
                log(loggingBehavior, i10, str, format);
            }
        }

        public final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2) {
            m.f(loggingBehavior, "behavior");
            m.f(str, ViewHierarchyConstants.TAG_KEY);
            m.f(str2, "string");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                String replaceStrings = replaceStrings(str2);
                if (!p.v(str, Logger.LOG_TAG_BASE, false, 2, (Object) null)) {
                    str = m.o(Logger.LOG_TAG_BASE, str);
                }
                Log.println(i10, str, replaceStrings);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(LoggingBehavior loggingBehavior, String str) {
        m.f(loggingBehavior, "behavior");
        m.f(str, ViewHierarchyConstants.TAG_KEY);
        this.behavior = loggingBehavior;
        Validate validate = Validate.INSTANCE;
        this.tag = m.o(LOG_TAG_BASE, Validate.notNullOrEmpty(str, ViewHierarchyConstants.TAG_KEY));
        this.contents = new StringBuilder();
    }

    public static final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2) {
        Companion.log(loggingBehavior, i10, str, str2);
    }

    public static final void log(LoggingBehavior loggingBehavior, int i10, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, i10, str, str2, objArr);
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    public static final synchronized void registerAccessToken(String str) {
        synchronized (Logger.class) {
            Companion.registerAccessToken(str);
        }
    }

    public static final synchronized void registerStringToReplace(String str, String str2) {
        synchronized (Logger.class) {
            Companion.registerStringToReplace(str, str2);
        }
    }

    private final boolean shouldLog() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(StringBuilder sb) {
        m.f(sb, "stringBuilder");
        if (shouldLog()) {
            this.contents.append(sb);
        }
    }

    public final void appendKeyValue(String str, Object obj) {
        m.f(str, Constants.KEY);
        m.f(obj, "value");
        append("  %s:\t%s\n", str, obj);
    }

    public final String getContents() {
        Companion companion = Companion;
        String sb = this.contents.toString();
        m.e(sb, "contents.toString()");
        return companion.replaceStrings(sb);
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void log() {
        String sb = this.contents.toString();
        m.e(sb, "contents.toString()");
        logString(sb);
        this.contents = new StringBuilder();
    }

    public final void logString(String str) {
        m.f(str, "string");
        Companion.log(this.behavior, this.priority, this.tag, str);
    }

    public final void setPriority(int i10) {
        Validate validate = Validate.INSTANCE;
        Validate.oneOf(Integer.valueOf(i10), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i10);
    }

    public final void append(String str) {
        m.f(str, "string");
        if (shouldLog()) {
            this.contents.append(str);
        }
    }

    public final void append(String str, Object... objArr) {
        m.f(str, "format");
        m.f(objArr, "args");
        if (shouldLog()) {
            StringBuilder sb = this.contents;
            b0 b0Var = b0.f15559a;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            m.e(format, "java.lang.String.format(format, *args)");
            sb.append(format);
        }
    }
}
