package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookException;
import e.a;
import kotlin.jvm.internal.m;

/* compiled from: FacebookDialogBase.kt */
public final class FacebookDialogBase$createActivityResultContractForShowingDialog$1 extends a<CONTENT, CallbackManager.ActivityResultParameters> {
    final /* synthetic */ CallbackManager $callbackManager;
    final /* synthetic */ Object $mode;
    final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

    FacebookDialogBase$createActivityResultContractForShowingDialog$1(FacebookDialogBase<CONTENT, RESULT> facebookDialogBase, Object obj, CallbackManager callbackManager) {
        this.this$0 = facebookDialogBase;
        this.$mode = obj;
        this.$callbackManager = callbackManager;
    }

    public Intent createIntent(Context context, CONTENT content) {
        Intent intent;
        m.f(context, "context");
        AppCall access$createAppCallForMode = this.this$0.createAppCallForMode(content, this.$mode);
        if (access$createAppCallForMode == null) {
            intent = null;
        } else {
            intent = access$createAppCallForMode.getRequestIntent();
        }
        if (intent != null) {
            access$createAppCallForMode.setPending();
            return intent;
        }
        throw new FacebookException("Content " + content + " is not supported");
    }

    public CallbackManager.ActivityResultParameters parseResult(int i10, Intent intent) {
        CallbackManager callbackManager = this.$callbackManager;
        if (callbackManager != null) {
            callbackManager.onActivityResult(this.this$0.getRequestCode(), i10, intent);
        }
        return new CallbackManager.ActivityResultParameters(this.this$0.getRequestCode(), i10, intent);
    }
}
