package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f13957b;

    public /* synthetic */ f(Context context, Intent intent) {
        this.f13956a = context;
        this.f13957b = intent;
    }

    public final Object call() {
        return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(this.f13956a, this.f13957b));
    }
}
