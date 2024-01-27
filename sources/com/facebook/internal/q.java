package com.facebook.internal;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Utility.GraphMeRequestWithCacheCallback f6087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6088b;

    public /* synthetic */ q(Utility.GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, String str) {
        this.f6087a = graphMeRequestWithCacheCallback;
        this.f6088b = str;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        Utility.m105getGraphMeRequestWithCacheAsync$lambda3(this.f6087a, this.f6088b, graphResponse);
    }
}
