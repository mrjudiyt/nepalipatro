package io.flutter.plugins.firebase.firebaseremoteconfig;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15156a;

    public /* synthetic */ a(MethodChannel.Result result) {
        this.f15156a = result;
    }

    public final void onComplete(Task task) {
        FirebaseRemoteConfigPlugin.lambda$onMethodCall$2(this.f15156a, task);
    }
}
