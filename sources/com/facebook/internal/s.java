package com.facebook.internal;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements DialogInterface.OnCancelListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ WebDialog f6090h;

    public /* synthetic */ s(WebDialog webDialog) {
        this.f6090h = webDialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WebDialog.m108onCreate$lambda4(this.f6090h, dialogInterface);
    }
}
