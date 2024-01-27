package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSDKJSInterface.kt */
public final class FacebookSDKJSInterface {
    public static final Companion Companion = new Companion((g) null);
    private static final String PARAMETER_FBSDK_PIXEL_REFERRAL = "_fb_pixel_referral_id";
    private static final String TAG = FacebookSDKJSInterface.class.getSimpleName();
    private final Context context;
    private final String protocol = "fbmq-0.1";

    /* compiled from: FacebookSDKJSInterface.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Bundle jsonStringToBundle(String str) {
            try {
                return jsonToBundle(new JSONObject(str));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        private final Bundle jsonToBundle(JSONObject jSONObject) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            m.e(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Objects.requireNonNull(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        }

        public final String getTAG() {
            return FacebookSDKJSInterface.access$getTAG$cp();
        }
    }

    public FacebookSDKJSInterface(Context context2) {
        this.context = context2;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        Class<FacebookSDKJSInterface> cls = FacebookSDKJSInterface.class;
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

    @JavascriptInterface
    public final String getProtocol() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.protocol;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(String str, String str2, String str3) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (str == null) {
                try {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    String str4 = TAG;
                    m.e(str4, "TAG");
                    companion.log(loggingBehavior, str4, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } else {
                InternalAppEventsLogger createInstance$default = InternalAppEventsLogger.Companion.createInstance$default(InternalAppEventsLogger.Companion, this.context, (String) null, 2, (Object) null);
                Bundle access$jsonStringToBundle = Companion.jsonStringToBundle(str3);
                access$jsonStringToBundle.putString(PARAMETER_FBSDK_PIXEL_REFERRAL, str);
                createInstance$default.logEvent(str2, access$jsonStringToBundle);
            }
        }
    }
}
