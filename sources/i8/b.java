package i8;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: MethodCallHandlerImpl.kt */
public final class b implements MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private final PackageManager f14892h;

    /* renamed from: i  reason: collision with root package name */
    private final WindowManager f14893i;

    public b(PackageManager packageManager, WindowManager windowManager) {
        m.f(packageManager, "packageManager");
        m.f(windowManager, "windowManager");
        this.f14892h = packageManager;
        this.f14893i = windowManager;
    }

    private final List<String> a() {
        FeatureInfo[] systemAvailableFeatures = this.f14892h.getSystemAvailableFeatures();
        m.e(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
        ArrayList<FeatureInfo> arrayList = new ArrayList<>();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.l(arrayList, 10));
        for (FeatureInfo featureInfo2 : arrayList) {
            arrayList2.add(featureInfo2.name);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (g9.p.v(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b() {
        /*
            r6 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = g9.p.v(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            kotlin.jvm.internal.m.e(r0, r5)
            boolean r0 = g9.p.v(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
        L_0x001f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            kotlin.jvm.internal.m.e(r0, r5)
            boolean r1 = g9.p.v(r0, r1, r2, r3, r4)
            if (r1 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = g9.p.v(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = g9.q.y(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "Emulator"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = g9.q.y(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = g9.q.y(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = g9.q.y(r0, r5, r2, r3, r4)
            if (r5 != 0) goto L_0x00b5
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = g9.q.y(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L_0x00b6
        L_0x00b5:
            r2 = 1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.b.b():boolean");
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        m.f(methodCall, "call");
        m.f(result, "result");
        if (methodCall.method.equals("getDeviceInfo")) {
            HashMap hashMap = new HashMap();
            String str2 = Build.BOARD;
            m.e(str2, "BOARD");
            hashMap.put("board", str2);
            String str3 = Build.BOOTLOADER;
            m.e(str3, "BOOTLOADER");
            hashMap.put("bootloader", str3);
            String str4 = Build.BRAND;
            m.e(str4, "BRAND");
            hashMap.put("brand", str4);
            String str5 = Build.DEVICE;
            m.e(str5, "DEVICE");
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, str5);
            String str6 = Build.DISPLAY;
            m.e(str6, "DISPLAY");
            hashMap.put("display", str6);
            String str7 = Build.FINGERPRINT;
            m.e(str7, "FINGERPRINT");
            hashMap.put("fingerprint", str7);
            String str8 = Build.HARDWARE;
            m.e(str8, "HARDWARE");
            hashMap.put("hardware", str8);
            String str9 = Build.HOST;
            m.e(str9, "HOST");
            hashMap.put("host", str9);
            String str10 = Build.ID;
            m.e(str10, "ID");
            hashMap.put("id", str10);
            String str11 = Build.MANUFACTURER;
            m.e(str11, "MANUFACTURER");
            hashMap.put("manufacturer", str11);
            String str12 = Build.MODEL;
            m.e(str12, "MODEL");
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, str12);
            String str13 = Build.PRODUCT;
            m.e(str13, "PRODUCT");
            hashMap.put("product", str13);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                m.e(strArr, "SUPPORTED_32_BIT_ABIS");
                hashMap.put("supported32BitAbis", p.g(Arrays.copyOf(strArr, strArr.length)));
                String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                m.e(strArr2, "SUPPORTED_64_BIT_ABIS");
                hashMap.put("supported64BitAbis", p.g(Arrays.copyOf(strArr2, strArr2.length)));
                String[] strArr3 = Build.SUPPORTED_ABIS;
                m.e(strArr3, "SUPPORTED_ABIS");
                hashMap.put("supportedAbis", p.g(Arrays.copyOf(strArr3, strArr3.length)));
            } else {
                hashMap.put("supported32BitAbis", p.e());
                hashMap.put("supported64BitAbis", p.e());
                hashMap.put("supportedAbis", p.e());
            }
            String str14 = Build.TAGS;
            m.e(str14, "TAGS");
            hashMap.put("tags", str14);
            String str15 = Build.TYPE;
            m.e(str15, "TYPE");
            hashMap.put(ShareConstants.MEDIA_TYPE, str15);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
            hashMap.put("systemFeatures", a());
            HashMap hashMap2 = new HashMap();
            if (i10 >= 23) {
                String str16 = Build.VERSION.BASE_OS;
                m.e(str16, "BASE_OS");
                hashMap2.put("baseOS", str16);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                String str17 = Build.VERSION.SECURITY_PATCH;
                m.e(str17, "SECURITY_PATCH");
                hashMap2.put("securityPatch", str17);
            }
            String str18 = Build.VERSION.CODENAME;
            m.e(str18, "CODENAME");
            hashMap2.put("codename", str18);
            String str19 = Build.VERSION.INCREMENTAL;
            m.e(str19, "INCREMENTAL");
            hashMap2.put("incremental", str19);
            String str20 = Build.VERSION.RELEASE;
            m.e(str20, "RELEASE");
            hashMap2.put("release", str20);
            hashMap2.put("sdkInt", Integer.valueOf(i10));
            hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, hashMap2);
            Display defaultDisplay = this.f14893i.getDefaultDisplay();
            m.e(defaultDisplay, "windowManager.defaultDisplay");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (i10 >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("widthPx", Double.valueOf((double) displayMetrics.widthPixels));
            hashMap3.put("heightPx", Double.valueOf((double) displayMetrics.heightPixels));
            hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
            hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
            hashMap.put("displayMetrics", hashMap3);
            if (i10 >= 26) {
                try {
                    str = Build.getSerial();
                } catch (SecurityException unused) {
                    str = "unknown";
                }
                m.e(str, "try {\n                  …UNKNOWN\n                }");
                hashMap.put("serialNumber", str);
            } else {
                String str21 = Build.SERIAL;
                m.e(str21, "SERIAL");
                hashMap.put("serialNumber", str21);
            }
            result.success(hashMap);
            return;
        }
        result.notImplemented();
    }
}
