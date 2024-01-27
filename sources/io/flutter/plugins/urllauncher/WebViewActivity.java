package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.content.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WebViewActivity extends Activity {
    public static final String ACTION_CLOSE = "close action";
    static final String ENABLE_DOM_EXTRA = "enableDomStorage";
    static final String ENABLE_JS_EXTRA = "enableJavaScript";
    static final String URL_EXTRA = "url";
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.ACTION_CLOSE.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    };
    private final IntentFilter closeIntentFilter = new IntentFilter(ACTION_CLOSE);
    private final WebViewClient webViewClient = new WebViewClient() {
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    };
    WebView webview;

    class FlutterWebChromeClient extends WebChromeClient {
        FlutterWebChromeClient() {
        }

        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            AnonymousClass1 r12 = new WebViewClient() {
                @TargetApi(21)
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    WebViewActivity.this.webview.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    WebViewActivity.this.webview.loadUrl(str);
                    return true;
                }
            };
            WebView webView2 = new WebView(WebViewActivity.this.webview.getContext());
            webView2.setWebViewClient(r12);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent createIntent(Context context, String str, boolean z10, boolean z11, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra(ENABLE_JS_EXTRA, z10).putExtra(ENABLE_DOM_EXTRA, z11).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> extractHeaders(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.webview = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra(ENABLE_JS_EXTRA, false);
        boolean booleanExtra2 = intent.getBooleanExtra(ENABLE_DOM_EXTRA, false);
        this.webview.loadUrl(stringExtra, extractHeaders(intent.getBundleExtra("com.android.browser.headers")));
        this.webview.getSettings().setJavaScriptEnabled(booleanExtra);
        this.webview.getSettings().setDomStorageEnabled(booleanExtra2);
        this.webview.setWebViewClient(this.webViewClient);
        this.webview.getSettings().setSupportMultipleWindows(true);
        this.webview.setWebChromeClient(new FlutterWebChromeClient());
        a.l(this, this.broadcastReceiver, this.closeIntentFilter, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.broadcastReceiver);
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !this.webview.canGoBack()) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.webview.goBack();
        return true;
    }
}
