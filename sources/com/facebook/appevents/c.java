package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessTokenAppIdPair f5947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GraphRequest f5948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SessionEventsState f5949c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlushStatistics f5950d;

    public /* synthetic */ c(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        this.f5947a = accessTokenAppIdPair;
        this.f5948b = graphRequest;
        this.f5949c = sessionEventsState;
        this.f5950d = flushStatistics;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        AppEventQueue.m26buildRequestForSession$lambda4(this.f5947a, this.f5948b, this.f5949c, this.f5950d, graphResponse);
    }
}
