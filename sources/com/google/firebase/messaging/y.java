package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f13985h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f13986i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13987j;

    public /* synthetic */ y(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f13985h = context;
        this.f13986i = z10;
        this.f13987j = taskCompletionSource;
    }

    public final void run() {
        ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(this.f13985h, this.f13986i, this.f13987j);
    }
}
