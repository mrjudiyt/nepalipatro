package com.facebook.devicerequests.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.m;

/* compiled from: DeviceRequestsHelper.kt */
public final class DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1 implements NsdManager.RegistrationListener {
    final /* synthetic */ String $nsdServiceName;
    final /* synthetic */ String $userCode;

    DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1(String str, String str2) {
        this.$nsdServiceName = str;
        this.$userCode = str2;
    }

    public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
        m.f(nsdServiceInfo, "serviceInfo");
        DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
        DeviceRequestsHelper.cleanUpAdvertisementService(this.$userCode);
    }

    public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        m.f(nsdServiceInfo, "NsdServiceInfo");
        if (!m.a(this.$nsdServiceName, nsdServiceInfo.getServiceName())) {
            DeviceRequestsHelper deviceRequestsHelper = DeviceRequestsHelper.INSTANCE;
            DeviceRequestsHelper.cleanUpAdvertisementService(this.$userCode);
        }
    }

    public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        m.f(nsdServiceInfo, "serviceInfo");
    }

    public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i10) {
        m.f(nsdServiceInfo, "serviceInfo");
    }
}
