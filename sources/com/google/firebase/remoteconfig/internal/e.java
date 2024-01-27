package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f14015a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f14016b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f14017c;

    public /* synthetic */ e(ConfigFetchHandler configFetchHandler, long j10, Map map) {
        this.f14015a = configFetchHandler;
        this.f14016b = j10;
        this.f14017c = map;
    }

    public final Object then(Task task) {
        return this.f14015a.lambda$fetch$0(this.f14016b, this.f14017c, task);
    }
}
