package com.facebook.internal.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.m;

/* compiled from: CertificateUtil.kt */
public final class CertificateUtil {
    public static final String DELIMITER = ":";
    public static final CertificateUtil INSTANCE = new CertificateUtil();

    private CertificateUtil() {
    }

    public static final String getCertificateHash(Context context) {
        m.f(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            m.e(signatureArr, "signatures");
            int length = signatureArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatureArr[i10];
                i10++;
                instance.update(signature.toByteArray());
                sb.append(Base64.encodeToString(instance.digest(), 0));
                sb.append(DELIMITER);
            }
            if (sb.length() > 0) {
                z10 = true;
            }
            if (z10) {
                sb.setLength(sb.length() - 1);
            }
            String sb2 = sb.toString();
            m.e(sb2, "sb.toString()");
            return sb2;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static /* synthetic */ void getDELIMITER$facebook_core_release$annotations() {
    }
}
