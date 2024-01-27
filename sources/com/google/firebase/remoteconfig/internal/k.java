package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigRealtimeHttpClient f14031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f14032b;

    public /* synthetic */ k(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task) {
        this.f14031a = configRealtimeHttpClient;
        this.f14032b = task;
    }

    public final Object then(Task task) {
        return this.f14031a.lambda$beginRealtimeHttpStream$1(this.f14032b, task);
    }
}
