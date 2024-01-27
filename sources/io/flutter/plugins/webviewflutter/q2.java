package io.flutter.plugins.webviewflutter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ JavaScriptChannel f15319h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f15320i;

    public /* synthetic */ q2(JavaScriptChannel javaScriptChannel, String str) {
        this.f15319h = javaScriptChannel;
        this.f15320i = str;
    }

    public final void run() {
        this.f15319h.lambda$postMessage$1(this.f15320i);
    }
}
