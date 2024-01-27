package com.google.firebase.iid;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    private static ServiceStarter instance;
    private Boolean hasAccessNetworkStatePermission = null;
    private Boolean hasWakeLockPermission = null;

    private ServiceStarter() {
    }

    @KeepForSdk
    public static synchronized ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    /* access modifiers changed from: package-private */
    public boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        boolean booleanValue = this.hasWakeLockPermission.booleanValue();
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        boolean booleanValue = this.hasWakeLockPermission.booleanValue();
        return this.hasWakeLockPermission.booleanValue();
    }
}
