package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w2 implements GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f15347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ValueCallback f15348b;

    public /* synthetic */ w2(boolean z10, ValueCallback valueCallback) {
        this.f15347a = z10;
        this.f15348b = valueCallback;
    }

    public final void reply(Object obj) {
        WebChromeClientHostApiImpl.WebChromeClientImpl.lambda$onShowFileChooser$3(this.f15347a, this.f15348b, (List) obj);
    }
}
