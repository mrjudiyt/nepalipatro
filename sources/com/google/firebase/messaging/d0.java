package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WithinAppServiceConnection.BindRequest f13953a;

    public /* synthetic */ d0(WithinAppServiceConnection.BindRequest bindRequest) {
        this.f13953a = bindRequest;
    }

    public final void onComplete(Task task) {
        this.f13953a.finish();
    }
}
