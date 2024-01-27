package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b4 implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.Result f15252a;

    public /* synthetic */ b4(GeneratedAndroidWebView.Result result) {
        this.f15252a = result;
    }

    public final void onReceiveValue(Object obj) {
        this.f15252a.success((String) obj);
    }
}
