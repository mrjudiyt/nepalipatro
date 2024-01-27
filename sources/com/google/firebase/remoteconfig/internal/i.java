package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigFetchHandler.FetchResponse f14027a;

    public /* synthetic */ i(ConfigFetchHandler.FetchResponse fetchResponse) {
        this.f14027a = fetchResponse;
    }

    public final Task then(Object obj) {
        return Tasks.forResult(this.f14027a);
    }
}
