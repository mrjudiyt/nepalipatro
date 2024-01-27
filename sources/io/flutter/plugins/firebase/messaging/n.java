package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements ErrorCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15193a;

    public /* synthetic */ n(TaskCompletionSource taskCompletionSource) {
        this.f15193a = taskCompletionSource;
    }

    public final void onError(String str) {
        this.f15193a.setException(new Exception(str));
    }
}
