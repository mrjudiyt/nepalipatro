package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzhap extends zzhau {
    final String zza;

    public zzhap(String str) {
        this.zza = str;
    }

    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str);
    }
}
