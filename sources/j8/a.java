package j8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.dynamiclinks.Constants;
import java.security.MessageDigest;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PackageInfoPlugin.kt */
public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: j  reason: collision with root package name */
    public static final C0255a f15421j = new C0255a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private Context f15422h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f15423i;

    /* renamed from: j8.a$a  reason: collision with other inner class name */
    /* compiled from: PackageInfoPlugin.kt */
    public static final class C0255a {
        private C0255a() {
        }

        public /* synthetic */ C0255a(g gVar) {
            this();
        }
    }

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArr[i10] & 255;
            int i11 = i10 * 2;
            cArr2[i11] = cArr[b10 >>> 4];
            cArr2[i11 + 1] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if ((r5.length == 0) != false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String b(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 28
            if (r1 < r2) goto L_0x005c
            android.content.Context r1 = r4.f15422h     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            kotlin.jvm.internal.m.c(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r5 != 0) goto L_0x001b
            return r0
        L_0x001b:
            boolean r1 = r5.hasMultipleSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p8.k.p(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.e(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x003e:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p8.k.p(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.e(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
        L_0x005a:
            r0 = r5
            goto L_0x00a1
        L_0x005c:
            android.content.Context r1 = r4.f15422h     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            kotlin.jvm.internal.m.c(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0079
            int r3 = r5.length     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r3 != 0) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            if (r3 == 0) goto L_0x007a
        L_0x0079:
            r1 = 1
        L_0x007a:
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "packageInfo.signatures"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r1 = p8.k.p(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 != 0) goto L_0x0088
            goto L_0x00a1
        L_0x0088:
            java.lang.String r1 = "signatures"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p8.k.p(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signatures.first().toByteArray()"
            kotlin.jvm.internal.m.e(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.e(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.a.b(android.content.pm.PackageManager):java.lang.String");
    }

    private final String c() {
        Context context = this.f15422h;
        m.c(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f15422h;
        m.c(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            return packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
        }
        return packageManager.getInstallerPackageName(packageName);
    }

    private final long d(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }

    private final String e(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA1");
        instance.update(bArr);
        byte[] digest = instance.digest();
        m.e(digest, "hashText");
        return a(digest);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        this.f15422h = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f15423i = methodChannel;
        m.c(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        this.f15422h = null;
        MethodChannel methodChannel = this.f15423i;
        m.c(methodChannel);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f15423i = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        try {
            if (m.a(methodCall.method, "getAll")) {
                Context context = this.f15422h;
                m.c(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.f15422h;
                m.c(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                m.e(packageManager, "packageManager");
                String b10 = b(packageManager);
                String c10 = c();
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.APP_NAME, packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context3 = this.f15422h;
                m.c(context3);
                hashMap.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context3.getPackageName());
                hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, packageInfo.versionName);
                m.e(packageInfo, "info");
                hashMap.put("buildNumber", String.valueOf(d(packageInfo)));
                if (b10 != null) {
                    hashMap.put("buildSignature", b10);
                }
                if (c10 != null) {
                    hashMap.put("installerStore", c10);
                }
                result.success(hashMap);
                return;
            }
            result.notImplemented();
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), (Object) null);
        }
    }
}
