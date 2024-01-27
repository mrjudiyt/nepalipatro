package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f13944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13945c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Metadata f13946d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GmsRpc f13947e;

    public /* synthetic */ b0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) {
        this.f13943a = context;
        this.f13944b = scheduledExecutorService;
        this.f13945c = firebaseMessaging;
        this.f13946d = metadata;
        this.f13947e = gmsRpc;
    }

    public final Object call() {
        return TopicsSubscriber.lambda$createInstance$0(this.f13943a, this.f13944b, this.f13945c, this.f13946d, this.f13947e);
    }
}
