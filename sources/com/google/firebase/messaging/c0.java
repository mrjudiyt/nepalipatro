package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f13951a;

    public /* synthetic */ c0(Intent intent) {
        this.f13951a = intent;
    }

    public final void onComplete(Task task) {
        WakeLockHolder.completeWakefulIntent(this.f13951a);
    }
}
