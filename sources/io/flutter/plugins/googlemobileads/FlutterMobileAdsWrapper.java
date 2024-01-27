package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.webviewflutter.x3;

public class FlutterMobileAdsWrapper {
    private static final String TAG = "FlutterMobileAdsWrapper";

    public void disableMediationInitialization(Context context) {
        MobileAds.disableMediationAdapterInitialization(context);
    }

    public RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public String getVersionString() {
        return MobileAds.getVersion().toString();
    }

    public void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        MobileAds.initialize(context, onInitializationCompleteListener);
    }

    public void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        MobileAds.openAdInspector(context, onAdInspectorClosedListener);
    }

    public void openDebugMenu(Context context, String str) {
        MobileAds.openDebugMenu(context, str);
    }

    public void registerWebView(int i10, FlutterEngine flutterEngine) {
        WebView a10 = x3.a(flutterEngine, (long) i10);
        if (Build.VERSION.SDK_INT >= 21) {
            if (a10 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MobileAds.registerWebView unable to find webView with id: ");
                sb.append(i10);
                return;
            }
            MobileAds.registerWebView(a10);
        }
    }

    public void setAppMuted(boolean z10) {
        MobileAds.setAppMuted(z10);
    }

    public void setAppVolume(double d10) {
        MobileAds.setAppVolume((float) d10);
    }
}
