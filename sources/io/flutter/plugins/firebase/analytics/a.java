package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15060a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.f15060a = result;
    }

    public final void onComplete(Task task) {
        FlutterFirebaseAnalyticsPlugin.lambda$onMethodCall$0(this.f15060a, task);
    }
}
