package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f13949b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f13950c;

    public /* synthetic */ c(Context context, Intent intent, boolean z10) {
        this.f13948a = context;
        this.f13949b = intent;
        this.f13950c = z10;
    }

    public final Object then(Task task) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2(this.f13948a, this.f13949b, this.f13950c, task);
    }
}
