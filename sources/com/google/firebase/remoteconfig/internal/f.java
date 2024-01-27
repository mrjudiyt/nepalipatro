package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f14018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f14019b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f14020c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f14021d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f14022e;

    public /* synthetic */ f(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map) {
        this.f14018a = configFetchHandler;
        this.f14019b = task;
        this.f14020c = task2;
        this.f14021d = date;
        this.f14022e = map;
    }

    public final Object then(Task task) {
        return this.f14018a.lambda$fetchIfCacheExpiredAndNotThrottled$2(this.f14019b, this.f14020c, this.f14021d, this.f14022e, task);
    }
}
