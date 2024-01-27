package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.Sharer;
import kotlin.jvm.internal.m;

/* compiled from: ShareInternalUtility.kt */
public final class ShareInternalUtility$getShareResultProcessor$1 extends ResultProcessor {
    final /* synthetic */ FacebookCallback<Sharer.Result> $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareInternalUtility$getShareResultProcessor$1(FacebookCallback<Sharer.Result> facebookCallback) {
        super(facebookCallback);
        this.$callback = facebookCallback;
    }

    public void onCancel(AppCall appCall) {
        m.f(appCall, "appCall");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.invokeOnCancelCallback(this.$callback);
    }

    public void onError(AppCall appCall, FacebookException facebookException) {
        m.f(appCall, "appCall");
        m.f(facebookException, "error");
        ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
        ShareInternalUtility.invokeOnErrorCallback(this.$callback, facebookException);
    }

    public void onSuccess(AppCall appCall, Bundle bundle) {
        m.f(appCall, "appCall");
        if (bundle != null) {
            ShareInternalUtility shareInternalUtility = ShareInternalUtility.INSTANCE;
            String nativeDialogCompletionGesture = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
            if (nativeDialogCompletionGesture == null || p.m("post", nativeDialogCompletionGesture, true)) {
                ShareInternalUtility.invokeOnSuccessCallback(this.$callback, ShareInternalUtility.getShareDialogPostId(bundle));
            } else if (p.m("cancel", nativeDialogCompletionGesture, true)) {
                ShareInternalUtility.invokeOnCancelCallback(this.$callback);
            } else {
                ShareInternalUtility.invokeOnErrorCallback(this.$callback, new FacebookException(NativeProtocol.ERROR_UNKNOWN_ERROR));
            }
        }
    }
}
