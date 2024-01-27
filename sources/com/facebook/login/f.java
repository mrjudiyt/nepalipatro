package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6114a;

    public /* synthetic */ f(DeviceAuthDialog deviceAuthDialog) {
        this.f6114a = deviceAuthDialog;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        DeviceAuthDialog.m130_get_pollRequest_$lambda5(this.f6114a, graphResponse);
    }
}
