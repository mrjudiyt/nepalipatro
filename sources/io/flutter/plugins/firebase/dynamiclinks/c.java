package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseDynamicLinksPlugin f15146a;

    public /* synthetic */ c(FlutterFirebaseDynamicLinksPlugin flutterFirebaseDynamicLinksPlugin) {
        this.f15146a = flutterFirebaseDynamicLinksPlugin;
    }

    public final void onSuccess(Object obj) {
        this.f15146a.lambda$onNewIntent$0((PendingDynamicLinkData) obj);
    }
}
