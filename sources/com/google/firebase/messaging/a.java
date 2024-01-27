package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EnhancedIntentService f13937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f13938b;

    public /* synthetic */ a(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f13937a = enhancedIntentService;
        this.f13938b = intent;
    }

    public final void onComplete(Task task) {
        this.f13937a.lambda$onStartCommand$1(this.f13938b, task);
    }
}
