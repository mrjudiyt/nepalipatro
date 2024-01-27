package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.m;

/* compiled from: InstallReferrerUtil.kt */
public final class InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1 implements InstallReferrerStateListener {
    final /* synthetic */ InstallReferrerUtil.Callback $callback;
    final /* synthetic */ InstallReferrerClient $referrerClient;

    InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1(InstallReferrerClient installReferrerClient, InstallReferrerUtil.Callback callback) {
        this.$referrerClient = installReferrerClient;
        this.$callback = callback;
    }

    public void onInstallReferrerServiceDisconnected() {
    }

    public void onInstallReferrerSetupFinished(int i10) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            if (i10 == 0) {
                try {
                    ReferrerDetails b10 = this.$referrerClient.b();
                    m.e(b10, "{\n                      referrerClient.installReferrer\n                    }");
                    String a10 = b10.a();
                    if (a10 != null && (q.y(a10, "fb", false, 2, (Object) null) || q.y(a10, AccessToken.DEFAULT_GRAPH_DOMAIN, false, 2, (Object) null))) {
                        this.$callback.onReceiveReferrerUrl(a10);
                    }
                    InstallReferrerUtil.INSTANCE.updateReferrer();
                } catch (RemoteException unused) {
                    return;
                }
            } else if (i10 == 2) {
                try {
                    InstallReferrerUtil.INSTANCE.updateReferrer();
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                    return;
                }
            }
            try {
                this.$referrerClient.a();
            } catch (Exception unused2) {
            }
        }
    }
}
