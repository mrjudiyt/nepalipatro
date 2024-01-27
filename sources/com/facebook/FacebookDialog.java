package com.facebook;

import com.facebook.CallbackManager;
import e.a;

/* compiled from: FacebookDialog.kt */
public interface FacebookDialog<CONTENT, RESULT> {
    boolean canShow(CONTENT content);

    a<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(CallbackManager callbackManager);

    void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback);

    void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> facebookCallback, int i10);

    void show(CONTENT content);
}
