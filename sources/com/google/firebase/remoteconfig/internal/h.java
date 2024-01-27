package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler f14025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f14026b;

    public /* synthetic */ h(ConfigFetchHandler configFetchHandler, Map map) {
        this.f14025a = configFetchHandler;
        this.f14026b = map;
    }

    public final Object then(Task task) {
        return this.f14025a.lambda$fetchNowWithTypeAndAttemptNumber$1(this.f14026b, task);
    }
}
