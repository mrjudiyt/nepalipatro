package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseDynamicLinksPlugin f15149h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f15150i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FirebaseDynamicLinks f15151j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15152k;

    public /* synthetic */ f(FlutterFirebaseDynamicLinksPlugin flutterFirebaseDynamicLinksPlugin, String str, FirebaseDynamicLinks firebaseDynamicLinks, TaskCompletionSource taskCompletionSource) {
        this.f15149h = flutterFirebaseDynamicLinksPlugin;
        this.f15150i = str;
        this.f15151j = firebaseDynamicLinks;
        this.f15152k = taskCompletionSource;
    }

    public final void run() {
        this.f15149h.lambda$getDynamicLink$4(this.f15150i, this.f15151j, this.f15152k);
    }
}
