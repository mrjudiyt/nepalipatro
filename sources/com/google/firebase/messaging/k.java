package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13967a;

    public /* synthetic */ k(String str) {
        this.f13967a = str;
    }

    public final Task then(Object obj) {
        return ((TopicsSubscriber) obj).unsubscribeFromTopic(this.f13967a);
    }
}
