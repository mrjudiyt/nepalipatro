package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f6106h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f6107i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog.PermissionsLists f6108j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f6109k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Date f6110l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Date f6111m;

    public /* synthetic */ c(DeviceAuthDialog deviceAuthDialog, String str, DeviceAuthDialog.PermissionsLists permissionsLists, String str2, Date date, Date date2) {
        this.f6106h = deviceAuthDialog;
        this.f6107i = str;
        this.f6108j = permissionsLists;
        this.f6109k = str2;
        this.f6110l = date;
        this.f6111m = date2;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        DeviceAuthDialog.m133presentConfirmation$lambda6(this.f6106h, this.f6107i, this.f6108j, this.f6109k, this.f6110l, this.f6111m, dialogInterface, i10);
    }
}
