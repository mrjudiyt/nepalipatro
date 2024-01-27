package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.model.ShareContent;

/* compiled from: ShareDialog.kt */
public final class ShareDialog$CameraEffectHandler$createAppCall$1 implements DialogPresenter.ParameterProvider {
    final /* synthetic */ AppCall $appCall;
    final /* synthetic */ ShareContent<?, ?> $content;
    final /* synthetic */ boolean $shouldFailOnDataError;

    ShareDialog$CameraEffectHandler$createAppCall$1(AppCall appCall, ShareContent<?, ?> shareContent, boolean z10) {
        this.$appCall = appCall;
        this.$content = shareContent;
        this.$shouldFailOnDataError = z10;
    }

    public Bundle getLegacyParameters() {
        LegacyNativeDialogParameters legacyNativeDialogParameters = LegacyNativeDialogParameters.INSTANCE;
        return LegacyNativeDialogParameters.create(this.$appCall.getCallId(), this.$content, this.$shouldFailOnDataError);
    }

    public Bundle getParameters() {
        NativeDialogParameters nativeDialogParameters = NativeDialogParameters.INSTANCE;
        return NativeDialogParameters.create(this.$appCall.getCallId(), this.$content, this.$shouldFailOnDataError);
    }
}
