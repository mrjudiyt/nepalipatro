package com.facebook.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements GraphRequest.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6116b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Date f6117c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f6118d;

    public /* synthetic */ g(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2) {
        this.f6115a = deviceAuthDialog;
        this.f6116b = str;
        this.f6117c = date;
        this.f6118d = date2;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        DeviceAuthDialog.m132onSuccess$lambda10(this.f6115a, this.f6116b, this.f6117c, this.f6118d, graphResponse);
    }
}
