package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f14023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Date f14024b;

    public /* synthetic */ g(ConfigFetchHandler configFetchHandler, Date date) {
        this.f14023a = configFetchHandler;
        this.f14024b = date;
    }

    public final Object then(Task task) {
        return this.f14023a.lambda$fetchIfCacheExpiredAndNotThrottled$3(this.f14024b, task);
    }
}
