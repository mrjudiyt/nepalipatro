package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EnhancedIntentService f13940h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Intent f13941i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13942j;

    public /* synthetic */ b(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f13940h = enhancedIntentService;
        this.f13941i = intent;
        this.f13942j = taskCompletionSource;
    }

    public final void run() {
        this.f13940h.lambda$processIntent$0(this.f13941i, this.f13942j);
    }
}
