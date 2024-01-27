package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6113a;

    public /* synthetic */ e(DeviceAuthDialog deviceAuthDialog) {
        this.f6113a = deviceAuthDialog;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        DeviceAuthDialog.m136startLogin$lambda1(this.f6113a, graphResponse);
    }
}
