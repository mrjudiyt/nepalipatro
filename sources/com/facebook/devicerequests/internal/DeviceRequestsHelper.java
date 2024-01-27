package com.facebook.devicerequests.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import b7.b;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.d;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: DeviceRequestsHelper.kt */
public final class DeviceRequestsHelper {
    public static final String DEVICE_INFO_DEVICE = "device";
    public static final String DEVICE_INFO_MODEL = "model";
    public static final String DEVICE_INFO_PARAM = "device_info";
    public static final String DEVICE_TARGET_USER_ID = "target_user_id";
    public static final DeviceRequestsHelper INSTANCE = new DeviceRequestsHelper();
    public static final String SDK_FLAVOR = "android";
    public static final String SDK_HEADER = "fbsdk";
    public static final String SERVICE_TYPE = "_fb._tcp.";
    private static final String TAG = DeviceRequestsHelper.class.getCanonicalName();
    private static final HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap<>();

    private DeviceRequestsHelper() {
    }

    public static final void cleanUpAdvertisementService(String str) {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                INSTANCE.cleanUpAdvertisementServiceImpl(str);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    @TargetApi(16)
    private final void cleanUpAdvertisementServiceImpl(String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = deviceRequestsListeners.get(str);
                if (registrationListener != null) {
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
                    if (systemService != null) {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                        deviceRequestsListeners.remove(str);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
            } catch (IllegalArgumentException e10) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, (Exception) e10);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static final Bitmap generateQRCode(String str) {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        Bitmap bitmap = null;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(c.class);
            enumMap.put(c.MARGIN, 2);
            try {
                b a10 = new d().a(str, a.QR_CODE, 200, 200, enumMap);
                int e10 = a10.e();
                int f10 = a10.f();
                int[] iArr = new int[(e10 * f10)];
                if (e10 > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = i10 * f10;
                        if (f10 > 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                iArr[i12 + i13] = a10.d(i13, i10) ? -16777216 : -1;
                                if (i14 >= f10) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        if (i11 >= e10) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(f10, e10, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, f10, 0, 0, f10, e10);
                    return createBitmap;
                } catch (WriterException unused) {
                    bitmap = createBitmap;
                }
            } catch (WriterException unused2) {
                return bitmap;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getDeviceInfo(Map<String, String> map) {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
                return null;
            }
        }
        String str = Build.DEVICE;
        m.e(str, "DEVICE");
        map.put(DEVICE_INFO_DEVICE, str);
        String str2 = Build.MODEL;
        m.e(str2, "MODEL");
        map.put(DEVICE_INFO_MODEL, str2);
        String jSONObject = new JSONObject(map).toString();
        m.e(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return jSONObject;
    }

    public static final boolean isAvailable() {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (Build.VERSION.SDK_INT < 16 || appSettingsWithoutQuery == null || !appSettingsWithoutQuery.getSmartLoginOptions().contains(SmartLoginOption.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    public static final boolean startAdvertisementService(String str) {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return false;
        }
        try {
            DeviceRequestsHelper deviceRequestsHelper = INSTANCE;
            if (isAvailable()) {
                return deviceRequestsHelper.startAdvertisementServiceImpl(str);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return false;
        }
    }

    @TargetApi(16)
    private final boolean startAdvertisementServiceImpl(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = deviceRequestsListeners;
            if (hashMap.containsKey(str)) {
                return true;
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            String str2 = "fbsdk_" + m.o("android-", p.s(FacebookSdk.getSdkVersion(), '.', '|', false, 4, (Object) null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType(SERVICE_TYPE);
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
            if (systemService != null) {
                DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1 deviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1 = new DeviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1(str2, str);
                hashMap.put(str, deviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, deviceRequestsHelper$startAdvertisementServiceImpl$nsdRegistrationListener$1);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final String getDeviceInfo() {
        Class<DeviceRequestsHelper> cls = DeviceRequestsHelper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return getDeviceInfo((Map<String, String>) null);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
