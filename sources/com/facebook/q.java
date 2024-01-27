package com.facebook;

import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GraphRequest.GraphJSONArrayCallback f6153a;

    public /* synthetic */ q(GraphRequest.GraphJSONArrayCallback graphJSONArrayCallback) {
        this.f6153a = graphJSONArrayCallback;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        GraphRequest.Companion.m17newPlacesSearchRequest$lambda1(this.f6153a, graphResponse);
    }
}
