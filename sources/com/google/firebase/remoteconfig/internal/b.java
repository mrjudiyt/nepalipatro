package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigCacheClient f14009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ConfigContainer f14011c;

    public /* synthetic */ b(ConfigCacheClient configCacheClient, boolean z10, ConfigContainer configContainer) {
        this.f14009a = configCacheClient;
        this.f14010b = z10;
        this.f14011c = configContainer;
    }

    public final Task then(Object obj) {
        return this.f14009a.lambda$put$1(this.f14010b, this.f14011c, (Void) obj);
    }
}
