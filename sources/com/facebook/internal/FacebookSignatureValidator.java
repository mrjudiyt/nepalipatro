package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import kotlin.jvm.internal.m;

/* compiled from: FacebookSignatureValidator.kt */
public final class FacebookSignatureValidator {
    private static final String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";
    private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    private static final String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";
    private static final String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";
    private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    private static final String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";
    public static final FacebookSignatureValidator INSTANCE = new FacebookSignatureValidator();
    private static final String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";
    private static final HashSet<String> validAppSignatureHashes = m0.c(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    public static final boolean validateSignature(Context context, String str) {
        m.f(context, "context");
        m.f(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        String str2 = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        m.e(str2, "brand");
        if (p.v(str2, "generic", false, 2, (Object) null) && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            m.e(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            m.e(signatureArr2, "packageInfo.signatures");
            for (Signature byteArray : signatureArr2) {
                HashSet<String> hashSet = validAppSignatureHashes;
                Utility utility = Utility.INSTANCE;
                byte[] byteArray2 = byteArray.toByteArray();
                m.e(byteArray2, "it.toByteArray()");
                if (!x.q(hashSet, Utility.sha1hash(byteArray2))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
