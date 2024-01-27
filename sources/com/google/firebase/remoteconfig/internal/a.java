package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConfigAutoFetch f14004a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f14005b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f14006c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f14007d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f14008e;

    public /* synthetic */ a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j10, int i10) {
        this.f14004a = configAutoFetch;
        this.f14005b = task;
        this.f14006c = task2;
        this.f14007d = j10;
        this.f14008e = i10;
    }

    public final Object then(Task task) {
        return this.f14004a.lambda$fetchLatestConfig$0(this.f14005b, this.f14006c, this.f14007d, this.f14008e, task);
    }
}
