package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;
import kotlin.jvm.internal.m;

/* compiled from: DeviceLoginButton.kt */
public final class DeviceLoginButton extends LoginButton {
    private Uri deviceRedirectUri;

    /* compiled from: DeviceLoginButton.kt */
    private final class DeviceLoginClickListener extends LoginButton.LoginClickListener {
        final /* synthetic */ DeviceLoginButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceLoginClickListener(DeviceLoginButton deviceLoginButton) {
            super(deviceLoginButton);
            m.f(deviceLoginButton, "this$0");
            this.this$0 = deviceLoginButton;
        }

        /* access modifiers changed from: protected */
        public LoginManager getLoginManager() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                DeviceLoginManager instance = DeviceLoginManager.Companion.getInstance();
                instance.setDefaultAudience(this.this$0.getDefaultAudience());
                instance.setLoginBehavior(LoginBehavior.DEVICE_AUTH);
                instance.setDeviceRedirectUri(this.this$0.getDeviceRedirectUri());
                return instance;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.f(context, "context");
        m.f(attributeSet, "attrs");
    }

    public final Uri getDeviceRedirectUri() {
        return this.deviceRedirectUri;
    }

    /* access modifiers changed from: protected */
    public LoginButton.LoginClickListener getNewLoginClickListener() {
        return new DeviceLoginClickListener(this);
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.deviceRedirectUri = uri;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        m.f(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context) {
        super(context);
        m.f(context, "context");
    }
}
