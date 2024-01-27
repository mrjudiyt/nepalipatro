package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import d6.a;
import java.util.List;

/* compiled from: InstallReferrerClientImpl */
class a extends InstallReferrerClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f5543a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5544b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d6.a f5545c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f5546d;

    /* compiled from: InstallReferrerClientImpl */
    private final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final InstallReferrerStateListener f5547a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f5547a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a2.a.a("InstallReferrerClient", "Install Referrer service connected.");
            d6.a unused = a.this.f5545c = a.C0125a.z0(iBinder);
            int unused2 = a.this.f5543a = 2;
            this.f5547a.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            a2.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            d6.a unused = a.this.f5545c = null;
            int unused2 = a.this.f5543a = 0;
            this.f5547a.onInstallReferrerServiceDisconnected();
        }
    }

    public a(Context context) {
        this.f5544b = context.getApplicationContext();
    }

    private boolean g() {
        try {
            if (this.f5544b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void a() {
        this.f5543a = 3;
        if (this.f5546d != null) {
            a2.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f5544b.unbindService(this.f5546d);
            this.f5546d = null;
        }
        this.f5545c = null;
    }

    public ReferrerDetails b() {
        if (h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f5544b.getPackageName());
            try {
                return new ReferrerDetails(this.f5545c.E(bundle));
            } catch (RemoteException e10) {
                a2.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f5543a = 0;
                throw e10;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public void d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (h()) {
            a2.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i10 = this.f5543a;
        if (i10 == 1) {
            a2.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i10 == 3) {
            a2.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            a2.a.a("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f5544b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f5543a = 0;
                a2.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !g()) {
                a2.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f5543a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            b bVar = new b(installReferrerStateListener);
            this.f5546d = bVar;
            try {
                if (this.f5544b.bindService(intent2, bVar, 1)) {
                    a2.a.a("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                a2.a.b("InstallReferrerClient", "Connection to service is blocked.");
                this.f5543a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
            } catch (SecurityException unused) {
                a2.a.b("InstallReferrerClient", "No permission to connect to service.");
                this.f5543a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(4);
            }
        }
    }

    public boolean h() {
        return (this.f5543a != 2 || this.f5545c == null || this.f5546d == null) ? false : true;
    }
}
