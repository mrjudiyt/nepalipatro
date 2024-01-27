package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog.kt */
public final class FacebookWebFallbackDialog extends WebDialog {
    public static final Companion Companion = new Companion((g) null);
    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private static final String TAG = FacebookWebFallbackDialog.class.getName();
    private boolean waitingForDialogToClose;

    /* compiled from: FacebookWebFallbackDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final FacebookWebFallbackDialog newInstance(Context context, String str, String str2) {
            m.f(context, "context");
            m.f(str, "url");
            m.f(str2, "expectedRedirectUrl");
            WebDialog.Companion companion = WebDialog.Companion;
            WebDialog.initDefaultTheme(context);
            return new FacebookWebFallbackDialog(context, str, str2, (g) null);
        }
    }

    private FacebookWebFallbackDialog(Context context, String str, String str2) {
        super(context, str);
        setExpectedRedirectUrl(str2);
    }

    public /* synthetic */ FacebookWebFallbackDialog(Context context, String str, String str2, g gVar) {
        this(context, str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: cancel$lambda-0  reason: not valid java name */
    public static final void m92cancel$lambda0(FacebookWebFallbackDialog facebookWebFallbackDialog) {
        m.f(facebookWebFallbackDialog, "this$0");
        super.cancel();
    }

    public static final FacebookWebFallbackDialog newInstance(Context context, String str, String str2) {
        return Companion.newInstance(context, str, str2);
    }

    public void cancel() {
        WebView webView = getWebView();
        if (!isPageFinished() || isListenerCalled() || webView == null || !webView.isShown()) {
            super.cancel();
        } else if (!this.waitingForDialogToClose) {
            this.waitingForDialogToClose = true;
            webView.loadUrl(m.o("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new d(this), 1500);
        }
    }

    public Bundle parseResponseUri(String str) {
        Uri parse = Uri.parse(str);
        Utility utility = Utility.INSTANCE;
        Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
        String string = parseUrlQueryString.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        parseUrlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_BRIDGE_ARGS);
        if (!Utility.isNullOrEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                BundleJSONConverter bundleJSONConverter = BundleJSONConverter.INSTANCE;
                parseUrlQueryString.putBundle(NativeProtocol.EXTRA_PROTOCOL_BRIDGE_ARGS, BundleJSONConverter.convertToBundle(jSONObject));
            } catch (JSONException e10) {
                Utility utility2 = Utility.INSTANCE;
                Utility.logd(TAG, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = parseUrlQueryString.getString(ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        parseUrlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_METHOD_RESULTS);
        Utility utility3 = Utility.INSTANCE;
        if (!Utility.isNullOrEmpty(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                BundleJSONConverter bundleJSONConverter2 = BundleJSONConverter.INSTANCE;
                parseUrlQueryString.putBundle(NativeProtocol.EXTRA_PROTOCOL_METHOD_RESULTS, BundleJSONConverter.convertToBundle(jSONObject2));
            } catch (JSONException e11) {
                Utility utility4 = Utility.INSTANCE;
                Utility.logd(TAG, "Unable to parse bridge_args JSON", e11);
            }
        }
        parseUrlQueryString.remove(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        parseUrlQueryString.putInt(NativeProtocol.EXTRA_PROTOCOL_VERSION, NativeProtocol.getLatestKnownVersion());
        return parseUrlQueryString;
    }
}
