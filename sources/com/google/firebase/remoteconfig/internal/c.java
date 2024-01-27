package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigCacheClient f14012a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f14013b;

    public /* synthetic */ c(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        this.f14012a = configCacheClient;
        this.f14013b = configContainer;
    }

    public final Object call() {
        return this.f14012a.lambda$put$0(this.f14013b);
    }
}
