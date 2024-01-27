package com.facebook.login;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6105h;

    public /* synthetic */ b(DeviceAuthDialog deviceAuthDialog) {
        this.f6105h = deviceAuthDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        DeviceAuthDialog.m134presentConfirmation$lambda8(this.f6105h, dialogInterface, i10);
    }
}
