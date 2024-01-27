package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

public class JavaScriptChannel {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    final String javaScriptChannelName;
    private final Handler platformThreadHandler;

    public JavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$postMessage$0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.flutterApi.postMessage(this, str, p2.f15314a);
    }

    @JavascriptInterface
    public void postMessage(String str) {
        q2 q2Var = new q2(this, str);
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            q2Var.run();
        } else {
            this.platformThreadHandler.post(q2Var);
        }
    }
}
