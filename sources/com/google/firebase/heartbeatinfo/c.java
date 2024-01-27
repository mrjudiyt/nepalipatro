package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f13927a;

    public /* synthetic */ c(DefaultHeartBeatController defaultHeartBeatController) {
        this.f13927a = defaultHeartBeatController;
    }

    public final Object call() {
        return this.f13927a.lambda$registerHeartBeat$0();
    }
}
