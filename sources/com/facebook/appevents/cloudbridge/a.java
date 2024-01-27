package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f5951a = new a();

    private /* synthetic */ a() {
    }

    public final void onCompleted(GraphResponse graphResponse) {
        AppEventsCAPIManager.m44enable$lambda0(graphResponse);
    }
}
