package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import l6.m;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgl {
    private static volatile m<Boolean> zza = m.a();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zza(Context context, Uri uri) {
        boolean z10;
        String authority = uri.getAuthority();
        boolean z11 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder();
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        } else if (zza.c()) {
            return zza.b().booleanValue();
        } else {
            synchronized (zzb) {
                if (zza.c()) {
                    boolean booleanValue = zza.b().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z10 = false;
                        if (z10 && zza(context)) {
                            z11 = true;
                        }
                        zza = m.d(Boolean.valueOf(z11));
                        return zza.b().booleanValue();
                    }
                }
                z10 = true;
                z11 = true;
                zza = m.d(Boolean.valueOf(z11));
                return zza.b().booleanValue();
            }
        }
    }
}
