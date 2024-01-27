package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15148h;

    public /* synthetic */ e(TaskCompletionSource taskCompletionSource) {
        this.f15148h = taskCompletionSource;
    }

    public final void run() {
        this.f15148h.setResult(null);
    }
}
