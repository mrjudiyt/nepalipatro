package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigRealtimeHttpClient f14033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f14034b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f14035c;

    public /* synthetic */ l(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) {
        this.f14033a = configRealtimeHttpClient;
        this.f14034b = task;
        this.f14035c = task2;
    }

    public final Object then(Task task) {
        return this.f14033a.lambda$createRealtimeConnection$0(this.f14034b, this.f14035c, task);
    }
}
