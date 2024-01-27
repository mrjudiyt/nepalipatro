package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15120a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.f15120a = result;
    }

    public final void onComplete(Task task) {
        FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(this.f15120a, task);
    }
}
