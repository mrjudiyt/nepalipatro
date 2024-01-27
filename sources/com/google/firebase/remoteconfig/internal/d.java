package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigStorageClient f14014a;

    public /* synthetic */ d(ConfigStorageClient configStorageClient) {
        this.f14014a = configStorageClient;
    }

    public final Object call() {
        return this.f14014a.read();
    }
}
