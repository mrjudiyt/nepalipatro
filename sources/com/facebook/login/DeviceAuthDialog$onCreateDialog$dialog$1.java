package com.facebook.login;

import android.app.Dialog;
import androidx.fragment.app.e;

/* compiled from: DeviceAuthDialog.kt */
public final class DeviceAuthDialog$onCreateDialog$dialog$1 extends Dialog {
    final /* synthetic */ DeviceAuthDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeviceAuthDialog$onCreateDialog$dialog$1(DeviceAuthDialog deviceAuthDialog, e eVar, int i10) {
        super(eVar, i10);
        this.this$0 = deviceAuthDialog;
    }

    public void onBackPressed() {
        if (this.this$0.onBackButtonPressed()) {
            super.onBackPressed();
        }
    }
}
