package com.facebook.appevents.codeless;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.ViewIndexer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f5965a = new g();

    private /* synthetic */ g() {
    }

    public final void onCompleted(GraphResponse graphResponse) {
        ViewIndexer.Companion.m53buildAppIndexingRequest$lambda0(graphResponse);
    }
}
