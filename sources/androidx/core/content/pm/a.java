package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* compiled from: PackageInfoCompat */
public final class a {

    /* renamed from: androidx.core.content.pm.a$a  reason: collision with other inner class name */
    /* compiled from: PackageInfoCompat */
    private static class C0030a {
        static Signature[] a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        static Signature[] c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static boolean d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static boolean e(PackageManager packageManager, String str, byte[] bArr, int i10) {
            return packageManager.hasSigningCertificate(str, bArr, i10);
        }
    }

    public static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0030a.b(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }
}
