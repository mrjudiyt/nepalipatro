package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ GraphRequest f5952h;

    public /* synthetic */ b(GraphRequest graphRequest) {
        this.f5952h = graphRequest;
    }

    public final void run() {
        AppEventsConversionsAPITransformerWebRequests.m45transformGraphRequestAndSendToCAPIGEndPoint$lambda0(this.f5952h);
    }
}
