package com.facebook;

import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GraphRequest.Callback f6152a;

    public /* synthetic */ p(GraphRequest.Callback callback) {
        this.f6152a = callback;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        GraphRequest.m15_set_callback_$lambda0(this.f6152a, graphResponse);
    }
}
