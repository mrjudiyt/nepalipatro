package com.facebook.login;

import android.net.Uri;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginClient;
import e9.i;
import java.util.Collection;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;

/* compiled from: DeviceLoginManager.kt */
public final class DeviceLoginManager extends LoginManager {
    public static final Companion Companion = new Companion((g) null);
    private static final o8.g<DeviceLoginManager> instance$delegate = i.a(DeviceLoginManager$Companion$instance$2.INSTANCE);
    private String deviceAuthTargetUserId;
    private Uri deviceRedirectUri;

    /* compiled from: DeviceLoginManager.kt */
    public static final class Companion {
        static final /* synthetic */ i<Object>[] $$delegatedProperties = {z.e(new s(z.b(Companion.class), "instance", "getInstance()Lcom/facebook/login/DeviceLoginManager;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DeviceLoginManager getInstance() {
            return (DeviceLoginManager) DeviceLoginManager.access$getInstance$delegate$cp().getValue();
        }
    }

    public static final /* synthetic */ o8.g access$getInstance$delegate$cp() {
        Class<DeviceLoginManager> cls = DeviceLoginManager.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return instance$delegate;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public LoginClient.Request createLoginRequest(Collection<String> collection) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LoginClient.Request createLoginRequest = super.createLoginRequest(collection);
            Uri uri = this.deviceRedirectUri;
            if (uri != null) {
                createLoginRequest.setDeviceRedirectUriString(uri.toString());
            }
            String str = this.deviceAuthTargetUserId;
            if (str != null) {
                createLoginRequest.setDeviceAuthTargetUserId(str);
            }
            return createLoginRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final String getDeviceAuthTargetUserId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceAuthTargetUserId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Uri getDeviceRedirectUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceRedirectUri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setDeviceAuthTargetUserId(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.deviceAuthTargetUserId = str;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final void setDeviceRedirectUri(Uri uri) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                this.deviceRedirectUri = uri;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
