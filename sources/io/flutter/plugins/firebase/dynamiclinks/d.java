package io.flutter.plugins.firebase.dynamiclinks;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15147h;

    public /* synthetic */ d(TaskCompletionSource taskCompletionSource) {
        this.f15147h = taskCompletionSource;
    }

    public final void run() {
        this.f15147h.setResult(null);
    }
}
