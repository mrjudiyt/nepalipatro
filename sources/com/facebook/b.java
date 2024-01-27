package com.facebook;

import com.facebook.GraphRequest;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f6006a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f6007b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Set f6008c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Set f6009d;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
        this.f6006a = atomicBoolean;
        this.f6007b = set;
        this.f6008c = set2;
        this.f6009d = set3;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        AccessTokenManager.m1refreshCurrentAccessTokenImpl$lambda1(this.f6006a, this.f6007b, this.f6008c, this.f6009d, graphResponse);
    }
}
