package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements WebDialog.OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FacebookDialogFragment f6063a;

    public /* synthetic */ c(FacebookDialogFragment facebookDialogFragment) {
        this.f6063a = facebookDialogFragment;
    }

    public final void onComplete(Bundle bundle, FacebookException facebookException) {
        FacebookDialogFragment.m91initDialog$lambda1(this.f6063a, bundle, facebookException);
    }
}
