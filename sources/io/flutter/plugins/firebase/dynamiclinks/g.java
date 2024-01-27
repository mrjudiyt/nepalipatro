package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseDynamicLinksPlugin f15153h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map f15154i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15155j;

    public /* synthetic */ g(FlutterFirebaseDynamicLinksPlugin flutterFirebaseDynamicLinksPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f15153h = flutterFirebaseDynamicLinksPlugin;
        this.f15154i = map;
        this.f15155j = taskCompletionSource;
    }

    public final void run() {
        this.f15153h.lambda$buildShortLink$3(this.f15154i, this.f15155j);
    }
}
