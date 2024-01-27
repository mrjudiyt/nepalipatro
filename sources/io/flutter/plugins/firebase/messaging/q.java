package io.flutter.plugins.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15197h;

    public /* synthetic */ q(TaskCompletionSource taskCompletionSource) {
        this.f15197h = taskCompletionSource;
    }

    public final void run() {
        this.f15197h.setResult(null);
    }
}
