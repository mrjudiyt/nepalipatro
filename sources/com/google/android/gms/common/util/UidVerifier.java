package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    public static boolean isGooglePlayServicesUid(Context context, int i10) {
        if (!uidHasPackageName(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @TargetApi(19)
    @KeepForSdk
    public static boolean uidHasPackageName(Context context, int i10, String str) {
        return Wrappers.packageManager(context).zza(i10, str);
    }
}
