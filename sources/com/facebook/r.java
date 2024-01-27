package com.facebook;

import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GraphRequest.GraphJSONObjectCallback f6154a;

    public /* synthetic */ r(GraphRequest.GraphJSONObjectCallback graphJSONObjectCallback) {
        this.f6154a = graphJSONObjectCallback;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        GraphRequest.Companion.m16newMeRequest$lambda0(this.f6154a, graphResponse);
    }
}
