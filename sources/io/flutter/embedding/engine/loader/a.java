package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f15034h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f15035i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String[] f15036j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Handler f15037k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Runnable f15038l;

    public /* synthetic */ a(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f15034h = flutterLoader;
        this.f15035i = context;
        this.f15036j = strArr;
        this.f15037k = handler;
        this.f15038l = runnable;
    }

    public final void run() {
        this.f15034h.lambda$ensureInitializationCompleteAsync$1(this.f15035i, this.f15036j, this.f15037k, this.f15038l);
    }
}
