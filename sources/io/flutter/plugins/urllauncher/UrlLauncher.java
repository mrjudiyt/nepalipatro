package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import io.flutter.plugins.urllauncher.Messages;
import java.util.Collections;
import java.util.Map;

final class UrlLauncher implements Messages.UrlLauncherApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "UrlLauncher";
    private Activity activity;
    private final Context applicationContext;
    private final IntentResolver intentResolver;

    interface IntentResolver {
        String getHandlerComponentName(Intent intent);
    }

    UrlLauncher(Context context, IntentResolver intentResolver2) {
        this.applicationContext = context;
        this.intentResolver = intentResolver2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0008 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean containsRestrictedHeader(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            r4 = 1
            switch(r3) {
                case -1423461112: goto L_0x004a;
                case -1229727188: goto L_0x003f;
                case 785670158: goto L_0x0034;
                case 802785917: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r1 = -1
            goto L_0x0053
        L_0x0029:
            java.lang.String r1 = "accept-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r1 = 3
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "content-type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003d
            goto L_0x0027
        L_0x003d:
            r1 = 2
            goto L_0x0053
        L_0x003f:
            java.lang.String r1 = "content-language"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0048
            goto L_0x0027
        L_0x0048:
            r1 = 1
            goto L_0x0053
        L_0x004a:
            java.lang.String r3 = "accept"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0053
            goto L_0x0027
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0008;
                case 1: goto L_0x0008;
                case 2: goto L_0x0008;
                case 3: goto L_0x0008;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r4
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.urllauncher.UrlLauncher.containsRestrictedHeader(java.util.Map):boolean");
    }

    private void ensureActivity() {
        if (this.activity == null) {
            throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        }
    }

    private static Bundle extractBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean openCustomTab(Context context, Uri uri, Bundle bundle) {
        d b10 = new d.b().b();
        b10.f1357a.putExtra("com.android.browser.headers", bundle);
        try {
            b10.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public Boolean canLaunchUrl(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        String handlerComponentName = this.intentResolver.getHandlerComponentName(intent);
        if (handlerComponentName == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(handlerComponentName));
    }

    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    public Boolean launchUrl(String str, Map<String, String> map) {
        ensureActivity();
        try {
            this.activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", extractBundle(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean openUrlInApp(String str, Boolean bool, Messages.WebViewOptions webViewOptions) {
        ensureActivity();
        Bundle extractBundle = extractBundle(webViewOptions.getHeaders());
        if (bool.booleanValue() && !containsRestrictedHeader(webViewOptions.getHeaders())) {
            if (openCustomTab(this.activity, Uri.parse(str), extractBundle)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.activity.startActivity(WebViewActivity.createIntent(this.activity, str, webViewOptions.getEnableJavaScript().booleanValue(), webViewOptions.getEnableDomStorage().booleanValue(), extractBundle));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    public Boolean supportsCustomTabs() {
        return Boolean.valueOf(c.d(this.applicationContext, Collections.emptyList()) != null);
    }

    UrlLauncher(Context context) {
        this(context, new g(context));
    }
}
