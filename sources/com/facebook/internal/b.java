package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements WebDialog.OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FacebookDialogFragment f6062a;

    public /* synthetic */ b(FacebookDialogFragment facebookDialogFragment) {
        this.f6062a = facebookDialogFragment;
    }

    public final void onComplete(Bundle bundle, FacebookException facebookException) {
        FacebookDialogFragment.m90initDialog$lambda0(this.f6062a, bundle, facebookException);
    }
}
