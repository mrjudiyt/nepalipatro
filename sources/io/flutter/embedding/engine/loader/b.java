package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterLoader f15039h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f15040i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String[] f15041j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Handler f15042k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Runnable f15043l;

    public /* synthetic */ b(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f15039h = flutterLoader;
        this.f15040i = context;
        this.f15041j = strArr;
        this.f15042k = handler;
        this.f15043l = runnable;
    }

    public final void run() {
        this.f15039h.lambda$ensureInitializationCompleteAsync$0(this.f15040i, this.f15041j, this.f15042k, this.f15043l);
    }
}
