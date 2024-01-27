package io.flutter.plugins.webviewflutter;

import android.webkit.ValueCallback;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeneratedAndroidWebView.Result f15241a;

    public /* synthetic */ a(GeneratedAndroidWebView.Result result) {
        this.f15241a = result;
    }

    public final void onReceiveValue(Object obj) {
        this.f15241a.success((Boolean) obj);
    }
}
