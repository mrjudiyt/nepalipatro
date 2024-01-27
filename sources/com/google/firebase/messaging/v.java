package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class v implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GmsRpc f13981a;

    public /* synthetic */ v(GmsRpc gmsRpc) {
        this.f13981a = gmsRpc;
    }

    public final Object then(Task task) {
        return this.f13981a.lambda$extractResponseWhenComplete$0(task);
    }
}
