package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.inject.Provider;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13926b;

    public /* synthetic */ b(Context context, String str) {
        this.f13925a = context;
        this.f13926b = str;
    }

    public final Object get() {
        return DefaultHeartBeatController.lambda$new$2(this.f13925a, this.f13926b);
    }
}
