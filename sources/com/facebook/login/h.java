package com.facebook.login;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6119h;

    public /* synthetic */ h(DeviceAuthDialog deviceAuthDialog) {
        this.f6119h = deviceAuthDialog;
    }

    public final void run() {
        DeviceAuthDialog.m135schedulePoll$lambda3(this.f6119h);
    }
}
