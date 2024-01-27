package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseDynamicLinksPlugin f15145a;

    public /* synthetic */ b(FlutterFirebaseDynamicLinksPlugin flutterFirebaseDynamicLinksPlugin) {
        this.f15145a = flutterFirebaseDynamicLinksPlugin;
    }

    public final void onFailure(Exception exc) {
        this.f15145a.lambda$onNewIntent$1(exc);
    }
}
