package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseMessagingPlugin f15191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f15192b;

    public /* synthetic */ m(FlutterFirebaseMessagingPlugin flutterFirebaseMessagingPlugin, MethodChannel.Result result) {
        this.f15191a = flutterFirebaseMessagingPlugin;
        this.f15192b = result;
    }

    public final void onComplete(Task task) {
        this.f15191a.lambda$onMethodCall$14(this.f15192b, task);
    }
}
